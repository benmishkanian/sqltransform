package antlrsqlite;
import java.io.IOException;

import antlrsqlite.*;
import antlrsqlite.SQLiteParser.*;

public class Visitor extends SQLiteBaseVisitor<Integer> {

	String fullText;

	@Override
	public Integer visitWhere_expr(Where_exprContext ctx) {
		int startpos = ctx.start.getCharPositionInLine();
		//System.out.println(fullText.substring(startpos, startpos+10));
		//System.out.println("In visitWhere_expr: " + ctx.getParent().getText());
		super.visitWhere_expr(ctx);

		return 0;
	}//visitWhere_expr

	@Override
	public Integer visitExpr(ExprContext ctx) {

		//System.out.println("In visitExpr: " + ctx.getParent().getText());
		String clause = ctx.getParent().getText();
		if (clause.contains("WHERE")) {
			try {
				String textBefore = fullText.substring(0, ctx.getParent().start.getCharPositionInLine());
				String originalClause = fullText.substring(ctx.getParent().start.getCharPositionInLine(), ctx.getParent().stop.getStopIndex()+1);
				InvariantFinder invFinder = new InvariantFinder("invariants.txt");
				String outerQuery = ctx.getParent().getParent().getText();
				char dbTableName = outerQuery.charAt(outerQuery.indexOf("FROM") + 4);
				if (dbTableName == '`') {
					dbTableName = outerQuery.charAt(outerQuery.indexOf("FROM") + 5);
				}
				String invariantPredicate = invFinder.getRandomInvariant(dbTableName);
				String textAfter = fullText.substring(ctx.getParent().stop.getStopIndex(), fullText.length());
				System.out.println(textBefore + originalClause + " AND " + invariantPredicate + textAfter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.visitExpr(ctx);

		return 0;
	}//visitExpr
}
