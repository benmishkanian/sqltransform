package antlrsqlite;
import antlrsqlite.*;

import java.io.*;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.NullPointerException;
import java.lang.System;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

public class Main {
    public static void main(String args[]) {
        //take input from file in command line, else use stdin
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream istr = System.in;
        try {
            istr = new FileInputStream(inputFile);
        }catch (java.io.FileNotFoundException e){
            System.err.println("File not found");
        }catch (NullPointerException e){
            System.err.println("Null pointer on input");
        }
        ANTLRInputStream in = null;
		try {
			in = new ANTLRInputStream(istr);
		} catch (IOException e) {
            System.err.println("Input stream error");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        SQLiteLexer lex = new SQLiteLexer(in);
        CommonTokenStream stream = new CommonTokenStream(lex);
        SQLiteParser parser = new SQLiteParser(stream);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.parse();
        String fullText = tree.getStart().getInputStream().getText(
				new Interval(tree.start.getStartIndex(), tree.stop.getStopIndex())
			);
		Visitor v = new Visitor();
		v.fullText = fullText;
		v.visit(tree);

    }
}
