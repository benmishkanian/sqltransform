package antlrsqlite;
import antlrsqlite.*;
import antlrsqlite.SQLiteParser.*;

public class Visitor extends SQLiteBaseVisitor<Integer> {

	String fullText;

	@Override
	public Integer visitWhere_expr(Where_exprContext ctx) {
		int startpos = ctx.start.getCharPositionInLine();
		//System.out.println(fullText.substring(startpos, startpos+10));

		super.visitWhere_expr(ctx);

		return 0;
	}//visitWhere_expr

	@Override
	public Integer visitExpr(ExprContext ctx) {

		System.out.println(ctx.getParent().getText());
	
		super.visitExpr(ctx);

		return 0;
	}//visitExpr
}
