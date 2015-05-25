import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

public class MutateQueries {
    public static void main(String args[]) {
        System.out.println("Starting transformation...");
        ByteArrayInputStream istr = new ByteArrayInputStream("SELECT * FROM tab WHERE id=3".getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream in = null;
		try {
			in = new ANTLRInputStream(istr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        SQLiteLexer lex = new SQLiteLexer(in);
        CommonTokenStream stream = new CommonTokenStream(lex);
        SQLiteParser parser = new SQLiteParser(stream);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.select_stmt();
        Interval before = new Interval(tree.start.getStartIndex(), tree.stop.getStopIndex());
        System.out.println(in.getText(before));
        System.out.println(tree.toStringTree(parser));
    }
}
