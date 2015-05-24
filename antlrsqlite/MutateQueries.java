import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class MutateQueries {
    public static void main(String args[]) {
        System.out.println("Starting transformation...");
        ByteArrayInputStream istr = new ByteArrayInputStream("SELECT * FROM tab".getBytes(StandardCharsets.UTF_8));
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
        ParserRuleContext tree = parser.simple_select_stmt();
        System.out.println(tree.toStringTree(parser));
    }
}
