package antlrsqlite;
import java.io.IOException;

import antlrsqlite.*;
import antlrsqlite.SQLiteParser.*;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Visitor extends SQLiteBaseVisitor<Integer> {

	String fullText, table;
	ArrayList<Integer> hooks = new ArrayList<Integer>();

	@Override
	public Integer visitParse(ParseContext ctx) {

		super.visitParse(ctx);

		try {
			InvariantFinder invFinder = new InvariantFinder("invariants.txt");
			for(int i=hooks.size()-1; i>=0; i--) {				
				String invariantPredicate = "\n" +
					" 1 AND " +	//1 is true in SQLite
					invFinder.getRandomInvariant(table) + " AND " +
					invFinder.getRandomInvariant(table) + " AND " +
					invFinder.getRandomInvariant(table) + " AND " +
					"\n" ;

				StringBuilder newText = new StringBuilder(fullText);
				newText.insert(hooks.get(i), invariantPredicate);
				fullText = newText.toString();
			}//for
		} catch (IOException e) {
			e.printStackTrace();
		}//catch IOException

		System.out.println(fullText);
		return 0;
	}//visitParse

	@Override
	public Integer visitWhere_expr(Where_exprContext ctx) {
		int startPos = ctx.start.getCharPositionInLine();
		addToHooks(startPos, "WHERE");

		super.visitWhere_expr(ctx);

		return 0;
	}//visitWhere_expr

	@Override
	public Integer visitTable_or_subquery(Table_or_subqueryContext ctx) {
		if( ctx.stop.getText().equals("X") && ctx.getText().contains("AS") ) {
			table = ctx.start.getText();
			table = table.substring(1, table.length()-1);
		}//if

		super.visitTable_or_subquery(ctx);

		return 0;
	}//visitTable_or_subquery

	@Override
	public Integer visitExpr(ExprContext ctx) {

		super.visitExpr(ctx);

		return 0;
	}//visitExpr
	
	void addToHooks(int index, String nextToken) {
		hooks.add(index + nextToken.length() + 1);
	}//addToHooks
}//Visitor
