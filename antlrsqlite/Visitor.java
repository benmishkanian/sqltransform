package antlrsqlite;
import antlrsqlite.*;
import antlrsqlite.SQLiteParser.*;

import java.util.ArrayList;

public class Visitor extends SQLiteBaseVisitor<Integer> {

	String fullText;
	ArrayList<Integer> hooks = new ArrayList<Integer>();

	@Override
	public Integer visitWhere_expr(Where_exprContext ctx) {
		int startPos = ctx.start.getCharPositionInLine();
		addToHooks(startPos, "WHERE");
		System.out.println(hooks.get(0));

		super.visitWhere_expr(ctx);

		return 0;
	}//visitWhere_expr

	@Override
	public Integer visitExpr(ExprContext ctx) {
	
		super.visitExpr(ctx);

		return 0;
	}//visitExpr
	
	void addToHooks(int index, String nextToken) {
		hooks.add(index + nextToken.length() + 1);
	}//addToHooks
}
