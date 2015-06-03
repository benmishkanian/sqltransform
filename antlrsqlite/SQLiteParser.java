// Generated from SQLite.g4 by ANTLR 4.5
package antlrsqlite;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SINGLE_LINE_COMMENT=154, 
		MULTILINE_COMMENT=155, SPACES=156, UNEXPECTED_CHAR=157;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_select_stmt = 4, RULE_select_or_values = 5, RULE_where_expr = 6, 
		RULE_column_def = 7, RULE_type_name = 8, RULE_column_constraint = 9, RULE_conflict_clause = 10, 
		RULE_expr = 11, RULE_foreign_key_clause = 12, RULE_raise_function = 13, 
		RULE_indexed_column = 14, RULE_table_constraint = 15, RULE_with_clause = 16, 
		RULE_qualified_table_name = 17, RULE_ordering_term = 18, RULE_pragma_value = 19, 
		RULE_common_table_expression = 20, RULE_result_column = 21, RULE_table_or_subquery = 22, 
		RULE_join_clause = 23, RULE_join_operator = 24, RULE_join_constraint = 25, 
		RULE_select_core = 26, RULE_compound_operator = 27, RULE_cte_table_name = 28, 
		RULE_signed_number = 29, RULE_literal_value = 30, RULE_unary_operator = 31, 
		RULE_error_message = 32, RULE_module_argument = 33, RULE_column_alias = 34, 
		RULE_keyword = 35, RULE_name = 36, RULE_function_name = 37, RULE_database_name = 38, 
		RULE_table_name = 39, RULE_table_or_index_name = 40, RULE_new_table_name = 41, 
		RULE_column_name = 42, RULE_collation_name = 43, RULE_foreign_table = 44, 
		RULE_index_name = 45, RULE_trigger_name = 46, RULE_view_name = 47, RULE_module_name = 48, 
		RULE_pragma_name = 49, RULE_savepoint_name = 50, RULE_table_alias = 51, 
		RULE_transaction_name = 52, RULE_any_name = 53;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "select_stmt", "select_or_values", 
		"where_expr", "column_def", "type_name", "column_constraint", "conflict_clause", 
		"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "compound_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"error_message", "module_argument", "column_alias", "keyword", "name", 
		"function_name", "database_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL || _la==K_EXPLAIN || _la==K_SELECT || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_VALUES - 142)) | (1L << (K_WITH - 142)) | (1L << (UNEXPECTED_CHAR - 142)))) != 0)) {
				{
				setState(110);
				switch (_input.LA(1)) {
				case SCOL:
				case K_EXPLAIN:
				case K_SELECT:
				case K_VALUES:
				case K_WITH:
					{
					setState(108);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(109);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(120);
				match(SCOL);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			sql_stmt();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(127);
						match(SCOL);
						}
						}
						setState(130); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(132);
					sql_stmt();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(SCOL);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(144);
				match(K_EXPLAIN);
				setState(147);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(145);
					match(K_QUERY);
					setState(146);
					match(K_PLAN);
					}
				}

				}
			}

			{
			setState(151);
			select_stmt();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(153);
				match(K_WITH);
				setState(155);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(154);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(157);
				common_table_expression();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					common_table_expression();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			select_or_values();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(168);
				compound_operator();
				setState(169);
				select_or_values();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(176);
				match(K_ORDER);
				setState(177);
				match(K_BY);
				setState(178);
				ordering_term();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					ordering_term();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(194);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(188);
				match(K_LIMIT);
				setState(189);
				expr(0);
				setState(192);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(190);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(191);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Where_exprContext where_expr() {
			return getRuleContext(Where_exprContext.class,0);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_or_values);
		int _la;
		try {
			setState(269);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(K_SELECT);
				setState(198);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(200);
				result_column();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(201);
					match(COMMA);
					setState(202);
					result_column();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(208);
					match(K_FROM);
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(209);
						table_or_subquery();
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(210);
							match(COMMA);
							setState(211);
							table_or_subquery();
							}
							}
							setState(216);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(217);
						join_clause();
						}
						break;
					}
					}
				}

				setState(223);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(222);
					where_expr();
					}
				}

				setState(239);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(225);
					match(K_GROUP);
					setState(226);
					match(K_BY);
					setState(227);
					expr(0);
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(228);
						match(COMMA);
						setState(229);
						expr(0);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(237);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(235);
						match(K_HAVING);
						setState(236);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(K_VALUES);
				setState(242);
				match(OPEN_PAR);
				setState(243);
				expr(0);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					expr(0);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(CLOSE_PAR);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					match(OPEN_PAR);
					setState(254);
					expr(0);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(255);
						match(COMMA);
						setState(256);
						expr(0);
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(262);
					match(CLOSE_PAR);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_exprContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWhere_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWhere_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWhere_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_exprContext where_expr() throws RecognitionException {
		Where_exprContext _localctx = new Where_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_where_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(K_WHERE);
			setState(272);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			column_name();
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(275);
				type_name();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(278);
				column_constraint();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(284);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(289);
				match(OPEN_PAR);
				setState(290);
				signed_number();
				setState(291);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(293);
				match(OPEN_PAR);
				setState(294);
				signed_number();
				setState(295);
				match(COMMA);
				setState(296);
				signed_number();
				setState(297);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(301);
				match(K_CONSTRAINT);
				setState(302);
				name();
				}
			}

			setState(338);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(305);
				match(K_PRIMARY);
				setState(306);
				match(K_KEY);
				setState(308);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(307);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(310);
				conflict_clause();
				setState(312);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(311);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(315);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(314);
					match(K_NOT);
					}
				}

				setState(317);
				match(K_NULL);
				setState(318);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(319);
				match(K_UNIQUE);
				setState(320);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(321);
				match(K_CHECK);
				setState(322);
				match(OPEN_PAR);
				setState(323);
				expr(0);
				setState(324);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(326);
				match(K_DEFAULT);
				setState(333);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(327);
					signed_number();
					}
					break;
				case 2:
					{
					setState(328);
					literal_value();
					}
					break;
				case 3:
					{
					setState(329);
					match(OPEN_PAR);
					setState(330);
					expr(0);
					setState(331);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(335);
				match(K_COLLATE);
				setState(336);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(337);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(340);
				match(K_ON);
				setState(341);
				match(K_CONFLICT);
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(346);
				unary_operator();
				setState(347);
				expr(21);
				}
				break;
			case 2:
				{
				setState(349);
				literal_value();
				}
				break;
			case 3:
				{
				setState(350);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(359);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(354);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(351);
						database_name();
						setState(352);
						match(DOT);
						}
						break;
					}
					setState(356);
					table_name();
					setState(357);
					match(DOT);
					}
					break;
				}
				setState(361);
				column_name();
				}
				break;
			case 5:
				{
				setState(362);
				function_name();
				setState(363);
				match(OPEN_PAR);
				setState(376);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(365);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(364);
						match(K_DISTINCT);
						}
						break;
					}
					setState(367);
					expr(0);
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(368);
						match(COMMA);
						setState(369);
						expr(0);
						}
						}
						setState(374);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(375);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(378);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(380);
				match(OPEN_PAR);
				setState(381);
				expr(0);
				setState(382);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(384);
				match(K_CAST);
				setState(385);
				match(OPEN_PAR);
				setState(386);
				expr(0);
				setState(387);
				match(K_AS);
				setState(388);
				type_name();
				setState(389);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(395);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(392);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(391);
						match(K_NOT);
						}
					}

					setState(394);
					match(K_EXISTS);
					}
				}

				setState(397);
				match(OPEN_PAR);
				setState(398);
				select_stmt();
				setState(399);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(401);
				match(K_CASE);
				setState(403);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(402);
					expr(0);
					}
					break;
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					match(K_WHEN);
					setState(406);
					expr(0);
					setState(407);
					match(K_THEN);
					setState(408);
					expr(0);
					}
					}
					setState(412); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(416);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(414);
					match(K_ELSE);
					setState(415);
					expr(0);
					}
				}

				setState(418);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(420);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(423);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(424);
						match(PIPE2);
						setState(425);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(426);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(427);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(428);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(429);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(431);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(432);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(433);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(434);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(435);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(436);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(437);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(438);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(451);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(439);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(440);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(441);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(442);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(443);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(444);
							match(K_IS);
							setState(445);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(446);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(447);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(448);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(449);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(450);
							match(K_REGEXP);
							}
							break;
						}
						setState(453);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(454);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(455);
						match(K_AND);
						setState(456);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(457);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(458);
						match(K_OR);
						setState(459);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(460);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(461);
						match(K_IS);
						setState(463);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(462);
							match(K_NOT);
							}
							break;
						}
						setState(465);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(466);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(468);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(467);
							match(K_NOT);
							}
						}

						setState(470);
						match(K_BETWEEN);
						setState(471);
						expr(0);
						setState(472);
						match(K_AND);
						setState(473);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(475);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(476);
						match(K_COLLATE);
						setState(477);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(478);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(480);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(479);
							match(K_NOT);
							}
						}

						setState(482);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(483);
						expr(0);
						setState(486);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(484);
							match(K_ESCAPE);
							setState(485);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(488);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(493);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(489);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(490);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(491);
							match(K_NOT);
							setState(492);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(495);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(497);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(496);
							match(K_NOT);
							}
						}

						setState(499);
						match(K_IN);
						setState(519);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(500);
							match(OPEN_PAR);
							setState(510);
							switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
							case 1:
								{
								setState(501);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(502);
								expr(0);
								setState(507);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(503);
									match(COMMA);
									setState(504);
									expr(0);
									}
									}
									setState(509);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(512);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(516);
							switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
							case 1:
								{
								setState(513);
								database_name();
								setState(514);
								match(DOT);
								}
								break;
							}
							setState(518);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(K_REFERENCES);
			setState(527);
			foreign_table();
			setState(539);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(528);
				match(OPEN_PAR);
				setState(529);
				column_name();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(530);
					match(COMMA);
					setState(531);
					column_name();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CLOSE_PAR);
				}
			}

			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(555);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(541);
					match(K_ON);
					setState(542);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(551);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(543);
						match(K_SET);
						setState(544);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(545);
						match(K_SET);
						setState(546);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(547);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(548);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(549);
						match(K_NO);
						setState(550);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(553);
					match(K_MATCH);
					setState(554);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(563);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(562);
					match(K_NOT);
					}
				}

				setState(565);
				match(K_DEFERRABLE);
				setState(570);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(566);
					match(K_INITIALLY);
					setState(567);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(568);
					match(K_INITIALLY);
					setState(569);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(K_RAISE);
			setState(575);
			match(OPEN_PAR);
			setState(580);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(576);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(577);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(578);
				match(COMMA);
				setState(579);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(582);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			column_name();
			setState(587);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(585);
				match(K_COLLATE);
				setState(586);
				collation_name();
				}
			}

			setState(590);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(589);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(592);
				match(K_CONSTRAINT);
				setState(593);
				name();
				}
			}

			setState(632);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(599);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(596);
					match(K_PRIMARY);
					setState(597);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(598);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601);
				match(OPEN_PAR);
				setState(602);
				indexed_column();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(603);
					match(COMMA);
					setState(604);
					indexed_column();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(CLOSE_PAR);
				setState(611);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(613);
				match(K_CHECK);
				setState(614);
				match(OPEN_PAR);
				setState(615);
				expr(0);
				setState(616);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(618);
				match(K_FOREIGN);
				setState(619);
				match(K_KEY);
				setState(620);
				match(OPEN_PAR);
				setState(621);
				column_name();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(622);
					match(COMMA);
					setState(623);
					column_name();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(629);
				match(CLOSE_PAR);
				setState(630);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(K_WITH);
			setState(636);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(635);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(638);
			cte_table_name();
			setState(639);
			match(K_AS);
			setState(640);
			match(OPEN_PAR);
			setState(641);
			select_stmt();
			setState(642);
			match(CLOSE_PAR);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(643);
				match(COMMA);
				setState(644);
				cte_table_name();
				setState(645);
				match(K_AS);
				setState(646);
				match(OPEN_PAR);
				setState(647);
				select_stmt();
				setState(648);
				match(CLOSE_PAR);
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(655);
				database_name();
				setState(656);
				match(DOT);
				}
				break;
			}
			setState(660);
			table_name();
			setState(666);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(661);
				match(K_INDEXED);
				setState(662);
				match(K_BY);
				setState(663);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(664);
				match(K_NOT);
				setState(665);
				match(K_INDEXED);
				}
				break;
			case EOF:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			expr(0);
			setState(671);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(669);
				match(K_COLLATE);
				setState(670);
				collation_name();
				}
			}

			setState(674);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pragma_value);
		try {
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			table_name();
			setState(693);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(682);
				match(OPEN_PAR);
				setState(683);
				column_name();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(684);
					match(COMMA);
					setState(685);
					column_name();
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(691);
				match(CLOSE_PAR);
				}
			}

			setState(695);
			match(K_AS);
			setState(696);
			match(OPEN_PAR);
			setState(697);
			select_stmt();
			setState(698);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_result_column);
		int _la;
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				table_name();
				setState(702);
				match(DOT);
				setState(703);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				expr(0);
				setState(710);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(707);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(706);
						match(K_AS);
						}
					}

					setState(709);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_or_subquery);
		int _la;
		try {
			setState(761);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(714);
					database_name();
					setState(715);
					match(DOT);
					}
					break;
				}
				setState(719);
				table_name();
				setState(724);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(721);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(720);
						match(K_AS);
						}
						break;
					}
					setState(723);
					table_alias();
					}
					break;
				}
				setState(731);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(726);
					match(K_INDEXED);
					setState(727);
					match(K_BY);
					setState(728);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(729);
					match(K_NOT);
					setState(730);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_CROSS:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UNION:
				case K_USING:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				match(OPEN_PAR);
				setState(743);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(734);
					table_or_subquery();
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(735);
						match(COMMA);
						setState(736);
						table_or_subquery();
						}
						}
						setState(741);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(742);
					join_clause();
					}
					break;
				}
				setState(745);
				match(CLOSE_PAR);
				setState(750);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(747);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						setState(746);
						match(K_AS);
						}
						break;
					}
					setState(749);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				match(OPEN_PAR);
				setState(753);
				select_stmt();
				setState(754);
				match(CLOSE_PAR);
				setState(759);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(756);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(755);
						match(K_AS);
						}
						break;
					}
					setState(758);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			table_or_subquery();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(764);
				join_operator();
				setState(765);
				table_or_subquery();
				setState(766);
				join_constraint();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_join_operator);
		int _la;
		try {
			setState(786);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(774);
					match(K_NATURAL);
					}
				}

				setState(783);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(777);
					match(K_LEFT);
					setState(779);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(778);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(781);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(782);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(785);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(788);
				match(K_ON);
				setState(789);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(790);
				match(K_USING);
				setState(791);
				match(OPEN_PAR);
				setState(792);
				column_name();
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(793);
					match(COMMA);
					setState(794);
					column_name();
					}
					}
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(800);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_CROSS:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_SELECT:
			case K_UNION:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_select_core);
		int _la;
		try {
			setState(878);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(K_SELECT);
				setState(806);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(805);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(808);
				result_column();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(809);
					match(COMMA);
					setState(810);
					result_column();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(828);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(816);
					match(K_FROM);
					setState(826);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(817);
						table_or_subquery();
						setState(822);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(818);
							match(COMMA);
							setState(819);
							table_or_subquery();
							}
							}
							setState(824);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(825);
						join_clause();
						}
						break;
					}
					}
				}

				setState(832);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(830);
					match(K_WHERE);
					setState(831);
					expr(0);
					}
				}

				setState(848);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(834);
					match(K_GROUP);
					setState(835);
					match(K_BY);
					setState(836);
					expr(0);
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(837);
						match(COMMA);
						setState(838);
						expr(0);
						}
						}
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(846);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(844);
						match(K_HAVING);
						setState(845);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(K_VALUES);
				setState(851);
				match(OPEN_PAR);
				setState(852);
				expr(0);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(853);
					match(COMMA);
					setState(854);
					expr(0);
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				match(CLOSE_PAR);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(861);
					match(COMMA);
					setState(862);
					match(OPEN_PAR);
					setState(863);
					expr(0);
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(864);
						match(COMMA);
						setState(865);
						expr(0);
						}
						}
						setState(870);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(871);
					match(CLOSE_PAR);
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compound_operator);
		try {
			setState(885);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(K_UNION);
				setState(882);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(884);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			table_name();
			setState(899);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(888);
				match(OPEN_PAR);
				setState(889);
				column_name();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(890);
					match(COMMA);
					setState(891);
					column_name();
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(901);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(904);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_module_argument);
		try {
			setState(914);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_any_name);
		try {
			setState(961);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(956);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(957);
				match(OPEN_PAR);
				setState(958);
				any_name();
				setState(959);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u03c6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\6\4\u0083\n\4"+
		"\r\4\16\4\u0084\3\4\7\4\u0088\n\4\f\4\16\4\u008b\13\4\3\4\7\4\u008e\n"+
		"\4\f\4\16\4\u0091\13\4\3\5\3\5\3\5\5\5\u0096\n\5\5\5\u0098\n\5\3\5\3\5"+
		"\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6\7\6\u00a3\n\6\f\6\16\6\u00a6\13\6\5"+
		"\6\u00a8\n\6\3\6\3\6\3\6\3\6\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u00b8\n\6\f\6\16\6\u00bb\13\6\5\6\u00bd\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00c3\n\6\5\6\u00c5\n\6\3\7\3\7\5\7\u00c9\n\7\3\7\3\7\3\7\7"+
		"\7\u00ce\n\7\f\7\16\7\u00d1\13\7\3\7\3\7\3\7\3\7\7\7\u00d7\n\7\f\7\16"+
		"\7\u00da\13\7\3\7\5\7\u00dd\n\7\5\7\u00df\n\7\3\7\5\7\u00e2\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00e9\n\7\f\7\16\7\u00ec\13\7\3\7\3\7\5\7\u00f0\n\7"+
		"\5\7\u00f2\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f9\n\7\f\7\16\7\u00fc\13\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u0104\n\7\f\7\16\7\u0107\13\7\3\7\3\7\7\7\u010b"+
		"\n\7\f\7\16\7\u010e\13\7\5\7\u0110\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u0117\n"+
		"\t\3\t\7\t\u011a\n\t\f\t\16\t\u011d\13\t\3\n\6\n\u0120\n\n\r\n\16\n\u0121"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u012e\n\n\3\13\3\13\5\13"+
		"\u0132\n\13\3\13\3\13\3\13\5\13\u0137\n\13\3\13\3\13\5\13\u013b\n\13\3"+
		"\13\5\13\u013e\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0150\n\13\3\13\3\13\3\13\5\13\u0155"+
		"\n\13\3\f\3\f\3\f\5\f\u015a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0165\n\r\3\r\3\r\3\r\5\r\u016a\n\r\3\r\3\r\3\r\3\r\5\r\u0170\n\r\3"+
		"\r\3\r\3\r\7\r\u0175\n\r\f\r\16\r\u0178\13\r\3\r\5\r\u017b\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u018b\n\r\3\r\5\r"+
		"\u018e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0196\n\r\3\r\3\r\3\r\3\r\3\r\6"+
		"\r\u019d\n\r\r\r\16\r\u019e\3\r\3\r\5\r\u01a3\n\r\3\r\3\r\3\r\5\r\u01a8"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01c6\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d2\n\r\3\r\3\r\3\r\5\r\u01d7\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01e3\n\r\3\r\3\r\3\r\3\r"+
		"\5\r\u01e9\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u01f0\n\r\3\r\3\r\5\r\u01f4\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01fc\n\r\f\r\16\r\u01ff\13\r\5\r\u0201\n"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0207\n\r\3\r\5\r\u020a\n\r\7\r\u020c\n\r\f\r\16"+
		"\r\u020f\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0217\n\16\f\16\16\16"+
		"\u021a\13\16\3\16\3\16\5\16\u021e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u022a\n\16\3\16\3\16\5\16\u022e\n\16\7\16\u0230"+
		"\n\16\f\16\16\16\u0233\13\16\3\16\5\16\u0236\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u023d\n\16\5\16\u023f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0247\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u024e\n\20\3\20\5\20\u0251"+
		"\n\20\3\21\3\21\5\21\u0255\n\21\3\21\3\21\3\21\5\21\u025a\n\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0260\n\21\f\21\16\21\u0263\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0273\n\21"+
		"\f\21\16\21\u0276\13\21\3\21\3\21\3\21\5\21\u027b\n\21\3\22\3\22\5\22"+
		"\u027f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u028d\n\22\f\22\16\22\u0290\13\22\3\23\3\23\3\23\5\23\u0295\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u029d\n\23\3\24\3\24\3\24\5\24\u02a2"+
		"\n\24\3\24\5\24\u02a5\n\24\3\25\3\25\3\25\5\25\u02aa\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u02b1\n\26\f\26\16\26\u02b4\13\26\3\26\3\26\5\26\u02b8"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u02c6\n\27\3\27\5\27\u02c9\n\27\5\27\u02cb\n\27\3\30\3\30\3\30\5\30\u02d0"+
		"\n\30\3\30\3\30\5\30\u02d4\n\30\3\30\5\30\u02d7\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u02de\n\30\3\30\3\30\3\30\3\30\7\30\u02e4\n\30\f\30\16\30"+
		"\u02e7\13\30\3\30\5\30\u02ea\n\30\3\30\3\30\5\30\u02ee\n\30\3\30\5\30"+
		"\u02f1\n\30\3\30\3\30\3\30\3\30\5\30\u02f7\n\30\3\30\5\30\u02fa\n\30\5"+
		"\30\u02fc\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0303\n\31\f\31\16\31\u0306"+
		"\13\31\3\32\3\32\5\32\u030a\n\32\3\32\3\32\5\32\u030e\n\32\3\32\3\32\5"+
		"\32\u0312\n\32\3\32\5\32\u0315\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u031e\n\33\f\33\16\33\u0321\13\33\3\33\3\33\5\33\u0325\n\33\3\34"+
		"\3\34\5\34\u0329\n\34\3\34\3\34\3\34\7\34\u032e\n\34\f\34\16\34\u0331"+
		"\13\34\3\34\3\34\3\34\3\34\7\34\u0337\n\34\f\34\16\34\u033a\13\34\3\34"+
		"\5\34\u033d\n\34\5\34\u033f\n\34\3\34\3\34\5\34\u0343\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u034a\n\34\f\34\16\34\u034d\13\34\3\34\3\34\5\34\u0351"+
		"\n\34\5\34\u0353\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u035a\n\34\f\34\16"+
		"\34\u035d\13\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0365\n\34\f\34\16"+
		"\34\u0368\13\34\3\34\3\34\7\34\u036c\n\34\f\34\16\34\u036f\13\34\5\34"+
		"\u0371\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0378\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u037f\n\36\f\36\16\36\u0382\13\36\3\36\3\36\5\36\u0386\n"+
		"\36\3\37\5\37\u0389\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u0395"+
		"\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03c4\n\67\3\67\2\3\30"+
		"8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjl\2\21\4\2\7\7ll\4\2\37\37@@\4\2$$>>\7\2\33\33JJSS"+
		"||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2OOcceexx\4\2"+
		"==\u008d\u008d\5\2\33\33JJ\177\177\6\2\668jj\u0098\u0098\u009a\u009b\4"+
		"\2\n\fhh\4\2\u0097\u0097\u009a\u009a\3\2\33\u0096\u0448\2r\3\2\2\2\4w"+
		"\3\2\2\2\6}\3\2\2\2\b\u0097\3\2\2\2\n\u00a7\3\2\2\2\f\u010f\3\2\2\2\16"+
		"\u0111\3\2\2\2\20\u0114\3\2\2\2\22\u011f\3\2\2\2\24\u0131\3\2\2\2\26\u0159"+
		"\3\2\2\2\30\u01a7\3\2\2\2\32\u0210\3\2\2\2\34\u0240\3\2\2\2\36\u024a\3"+
		"\2\2\2 \u0254\3\2\2\2\"\u027c\3\2\2\2$\u0294\3\2\2\2&\u029e\3\2\2\2(\u02a9"+
		"\3\2\2\2*\u02ab\3\2\2\2,\u02ca\3\2\2\2.\u02fb\3\2\2\2\60\u02fd\3\2\2\2"+
		"\62\u0314\3\2\2\2\64\u0324\3\2\2\2\66\u0370\3\2\2\28\u0377\3\2\2\2:\u0379"+
		"\3\2\2\2<\u0388\3\2\2\2>\u038c\3\2\2\2@\u038e\3\2\2\2B\u0390\3\2\2\2D"+
		"\u0394\3\2\2\2F\u0396\3\2\2\2H\u0398\3\2\2\2J\u039a\3\2\2\2L\u039c\3\2"+
		"\2\2N\u039e\3\2\2\2P\u03a0\3\2\2\2R\u03a2\3\2\2\2T\u03a4\3\2\2\2V\u03a6"+
		"\3\2\2\2X\u03a8\3\2\2\2Z\u03aa\3\2\2\2\\\u03ac\3\2\2\2^\u03ae\3\2\2\2"+
		"`\u03b0\3\2\2\2b\u03b2\3\2\2\2d\u03b4\3\2\2\2f\u03b6\3\2\2\2h\u03b8\3"+
		"\2\2\2j\u03ba\3\2\2\2l\u03c3\3\2\2\2nq\5\6\4\2oq\5\4\3\2pn\3\2\2\2po\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\2\2\3v\3"+
		"\3\2\2\2wx\7\u009f\2\2xy\b\3\1\2y\5\3\2\2\2z|\7\3\2\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0089\5\b"+
		"\5\2\u0081\u0083\7\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\5\b"+
		"\5\2\u0087\u0082\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008f\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\7\3"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\7\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0095\7I\2\2"+
		"\u0093\u0094\7t\2\2\u0094\u0096\7q\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\5\n\6\2\u009a\t\3\2\2\2\u009b\u009d\7\u0095"+
		"\2\2\u009c\u009e\7v\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a4\5*\26\2\u00a0\u00a1\7\7\2\2\u00a1\u00a3\5*"+
		"\26\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009b\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00af\5\f\7\2\u00aa"+
		"\u00ab\58\35\2\u00ab\u00ac\5\f\7\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00bc\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7*\2"+
		"\2\u00b4\u00b9\5&\24\2\u00b5\u00b6\7\7\2\2\u00b6\u00b8\5&\24\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00c4\3\2\2\2\u00be\u00bf\7d\2\2\u00bf\u00c2\5\30\r\2\u00c0"+
		"\u00c1\t\2\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\13\3\2\2\2\u00c6\u00c8\7\u0082\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cf\5,\27\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc\u00ce\5,\27\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00de\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00dc\7M\2\2\u00d3\u00d8\5.\30\2\u00d4\u00d5\7\7"+
		"\2\2\u00d5\u00d7\5.\30\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dd\5\60\31\2\u00dc\u00d3\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00e2\5\16\b\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00f1\3\2\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\7*\2\2\u00e5\u00ea\5\30"+
		"\r\2\u00e6\u00e7\7\7\2\2\u00e7\u00e9\5\30\r\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00f0\5\30\r\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e3\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0110\3\2\2\2\u00f3\u00f4\7\u0090\2\2\u00f4"+
		"\u00f5\7\5\2\2\u00f5\u00fa\5\30\r\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\5"+
		"\30\r\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u010c\7\6"+
		"\2\2\u00fe\u00ff\7\7\2\2\u00ff\u0100\7\5\2\2\u0100\u0105\5\30\r\2\u0101"+
		"\u0102\7\7\2\2\u0102\u0104\5\30\r\2\u0103\u0101\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7\6\2\2\u0109\u010b\3\2\2\2\u010a\u00fe\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u00c6\3\2\2\2\u010f\u00f3\3\2"+
		"\2\2\u0110\r\3\2\2\2\u0111\u0112\7\u0094\2\2\u0112\u0113\5\30\r\2\u0113"+
		"\17\3\2\2\2\u0114\u0116\5V,\2\u0115\u0117\5\22\n\2\u0116\u0115\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u011b\3\2\2\2\u0118\u011a\5\24\13\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\21\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5J&\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012d"+
		"\3\2\2\2\u0123\u0124\7\5\2\2\u0124\u0125\5<\37\2\u0125\u0126\7\6\2\2\u0126"+
		"\u012e\3\2\2\2\u0127\u0128\7\5\2\2\u0128\u0129\5<\37\2\u0129\u012a\7\7"+
		"\2\2\u012a\u012b\5<\37\2\u012b\u012c\7\6\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u0123\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012e\3\2\2\2\u012e\23\3\2\2"+
		"\2\u012f\u0130\7\63\2\2\u0130\u0132\5J&\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0154\3\2\2\2\u0133\u0134\7s\2\2\u0134\u0136\7a\2\2\u0135"+
		"\u0137\t\4\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\5\26\f\2\u0139\u013b\7&\2\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0155\3\2\2\2\u013c\u013e\7h\2\2\u013d\u013c\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7j\2\2\u0140"+
		"\u0155\5\26\f\2\u0141\u0142\7\u008c\2\2\u0142\u0155\5\26\f\2\u0143\u0144"+
		"\7.\2\2\u0144\u0145\7\5\2\2\u0145\u0146\5\30\r\2\u0146\u0147\7\6\2\2\u0147"+
		"\u0155\3\2\2\2\u0148\u014f\7:\2\2\u0149\u0150\5<\37\2\u014a\u0150\5> "+
		"\2\u014b\u014c\7\5\2\2\u014c\u014d\5\30\r\2\u014d\u014e\7\6\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u0150\u0155\3\2\2\2\u0151\u0152\7/\2\2\u0152\u0155\5X-\2\u0153\u0155"+
		"\5\32\16\2\u0154\u0133\3\2\2\2\u0154\u013d\3\2\2\2\u0154\u0141\3\2\2\2"+
		"\u0154\u0143\3\2\2\2\u0154\u0148\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\25\3\2\2\2\u0156\u0157\7m\2\2\u0157\u0158\7\62\2\2\u0158"+
		"\u015a\t\5\2\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a\27\3\2\2"+
		"\2\u015b\u015c\b\r\1\2\u015c\u015d\5@!\2\u015d\u015e\5\30\r\27\u015e\u01a8"+
		"\3\2\2\2\u015f\u01a8\5> \2\u0160\u01a8\7\u0099\2\2\u0161\u0162\5N(\2\u0162"+
		"\u0163\7\4\2\2\u0163\u0165\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5P)\2\u0167\u0168\7\4\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u01a8\5V,\2\u016c\u016d\5L\'\2\u016d\u017a\7\5\2\2\u016e\u0170\7@\2\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0176"+
		"\5\30\r\2\u0172\u0173\7\7\2\2\u0173\u0175\5\30\r\2\u0174\u0172\3\2\2\2"+
		"\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017b"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7\t\2\2\u017a\u016f\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\6"+
		"\2\2\u017d\u01a8\3\2\2\2\u017e\u017f\7\5\2\2\u017f\u0180\5\30\r\2\u0180"+
		"\u0181\7\6\2\2\u0181\u01a8\3\2\2\2\u0182\u0183\7-\2\2\u0183\u0184\7\5"+
		"\2\2\u0184\u0185\5\30\r\2\u0185\u0186\7#\2\2\u0186\u0187\5\22\n\2\u0187"+
		"\u0188\7\6\2\2\u0188\u01a8\3\2\2\2\u0189\u018b\7h\2\2\u018a\u0189\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\7H\2\2\u018d"+
		"\u018a\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\5"+
		"\2\2\u0190\u0191\5\n\6\2\u0191\u0192\7\6\2\2\u0192\u01a8\3\2\2\2\u0193"+
		"\u0195\7,\2\2\u0194\u0196\5\30\r\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u019c\3\2\2\2\u0197\u0198\7\u0093\2\2\u0198\u0199\5\30\r\2"+
		"\u0199\u019a\7\u0087\2\2\u019a\u019b\5\30\r\2\u019b\u019d\3\2\2\2\u019c"+
		"\u0197\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\7C\2\2\u01a1\u01a3\5\30\r\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7D"+
		"\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a8\5\34\17\2\u01a7\u015b\3\2\2\2\u01a7"+
		"\u015f\3\2\2\2\u01a7\u0160\3\2\2\2\u01a7\u0169\3\2\2\2\u01a7\u016c\3\2"+
		"\2\2\u01a7\u017e\3\2\2\2\u01a7\u0182\3\2\2\2\u01a7\u018d\3\2\2\2\u01a7"+
		"\u0193\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u020d\3\2\2\2\u01a9\u01aa\f\26"+
		"\2\2\u01aa\u01ab\7\r\2\2\u01ab\u020c\5\30\r\27\u01ac\u01ad\f\25\2\2\u01ad"+
		"\u01ae\t\6\2\2\u01ae\u020c\5\30\r\26\u01af\u01b0\f\24\2\2\u01b0\u01b1"+
		"\t\7\2\2\u01b1\u020c\5\30\r\25\u01b2\u01b3\f\23\2\2\u01b3\u01b4\t\b\2"+
		"\2\u01b4\u020c\5\30\r\24\u01b5\u01b6\f\22\2\2\u01b6\u01b7\t\t\2\2\u01b7"+
		"\u020c\5\30\r\23\u01b8\u01c5\f\21\2\2\u01b9\u01c6\7\b\2\2\u01ba\u01c6"+
		"\7\30\2\2\u01bb\u01c6\7\31\2\2\u01bc\u01c6\7\32\2\2\u01bd\u01c6\7^\2\2"+
		"\u01be\u01bf\7^\2\2\u01bf\u01c6\7h\2\2\u01c0\u01c6\7U\2\2\u01c1\u01c6"+
		"\7c\2\2\u01c2\u01c6\7O\2\2\u01c3\u01c6\7e\2\2\u01c4\u01c6\7x\2\2\u01c5"+
		"\u01b9\3\2\2\2\u01c5\u01ba\3\2\2\2\u01c5\u01bb\3\2\2\2\u01c5\u01bc\3\2"+
		"\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01be\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u020c\5\30\r\22\u01c8\u01c9\f\20\2\2\u01c9"+
		"\u01ca\7\"\2\2\u01ca\u020c\5\30\r\21\u01cb\u01cc\f\17\2\2\u01cc\u01cd"+
		"\7n\2\2\u01cd\u020c\5\30\r\20\u01ce\u01cf\f\b\2\2\u01cf\u01d1\7^\2\2\u01d0"+
		"\u01d2\7h\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u020c\5\30\r\t\u01d4\u01d6\f\7\2\2\u01d5\u01d7\7h\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7)"+
		"\2\2\u01d9\u01da\5\30\r\2\u01da\u01db\7\"\2\2\u01db\u01dc\5\30\r\b\u01dc"+
		"\u020c\3\2\2\2\u01dd\u01de\f\13\2\2\u01de\u01df\7/\2\2\u01df\u020c\5X"+
		"-\2\u01e0\u01e2\f\n\2\2\u01e1\u01e3\7h\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\t\n\2\2\u01e5\u01e8\5\30\r\2"+
		"\u01e6\u01e7\7E\2\2\u01e7\u01e9\5\30\r\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u020c\3\2\2\2\u01ea\u01ef\f\t\2\2\u01eb\u01f0\7_\2\2\u01ec"+
		"\u01f0\7i\2\2\u01ed\u01ee\7h\2\2\u01ee\u01f0\7j\2\2\u01ef\u01eb\3\2\2"+
		"\2\u01ef\u01ec\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u020c\3\2\2\2\u01f1\u01f3"+
		"\f\6\2\2\u01f2\u01f4\7h\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u0209\7U\2\2\u01f6\u0200\7\5\2\2\u01f7\u0201\5\n"+
		"\6\2\u01f8\u01fd\5\30\r\2\u01f9\u01fa\7\7\2\2\u01fa\u01fc\5\30\r\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u01f7\3\2\2\2\u0200"+
		"\u01f8\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u020a\7\6"+
		"\2\2\u0203\u0204\5N(\2\u0204\u0205\7\4\2\2\u0205\u0207\3\2\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\5P)\2\u0209"+
		"\u01f6\3\2\2\2\u0209\u0206\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u01a9\3\2"+
		"\2\2\u020b\u01ac\3\2\2\2\u020b\u01af\3\2\2\2\u020b\u01b2\3\2\2\2\u020b"+
		"\u01b5\3\2\2\2\u020b\u01b8\3\2\2\2\u020b\u01c8\3\2\2\2\u020b\u01cb\3\2"+
		"\2\2\u020b\u01ce\3\2\2\2\u020b\u01d4\3\2\2\2\u020b\u01dd\3\2\2\2\u020b"+
		"\u01e0\3\2\2\2\u020b\u01ea\3\2\2\2\u020b\u01f1\3\2\2\2\u020c\u020f\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\31\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u0210\u0211\7w\2\2\u0211\u021d\5Z.\2\u0212\u0213\7\5\2\2\u0213"+
		"\u0218\5V,\2\u0214\u0215\7\7\2\2\u0215\u0217\5V,\2\u0216\u0214\3\2\2\2"+
		"\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\6\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u0212\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0231\3\2\2\2\u021f\u0220\7m"+
		"\2\2\u0220\u0229\t\13\2\2\u0221\u0222\7\u0083\2\2\u0222\u022a\7j\2\2\u0223"+
		"\u0224\7\u0083\2\2\u0224\u022a\7:\2\2\u0225\u022a\7+\2\2\u0226\u022a\7"+
		"}\2\2\u0227\u0228\7g\2\2\u0228\u022a\7\34\2\2\u0229\u0221\3\2\2\2\u0229"+
		"\u0223\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022e\3\2\2\2\u022b\u022c\7e\2\2\u022c\u022e\5J&\2\u022d\u021f"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u023e\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0234\u0236\7h\2\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023c\7;\2\2\u0238\u0239\7X\2"+
		"\2\u0239\u023d\7<\2\2\u023a\u023b\7X\2\2\u023b\u023d\7T\2\2\u023c\u0238"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u0235\3\2\2\2\u023e\u023f\3\2\2\2\u023f\33\3\2\2\2\u0240\u0241\7u\2\2"+
		"\u0241\u0246\7\5\2\2\u0242\u0247\7S\2\2\u0243\u0244\t\f\2\2\u0244\u0245"+
		"\7\7\2\2\u0245\u0247\5B\"\2\u0246\u0242\3\2\2\2\u0246\u0243\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\7\6\2\2\u0249\35\3\2\2\2\u024a\u024d\5V,\2"+
		"\u024b\u024c\7/\2\2\u024c\u024e\5X-\2\u024d\u024b\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\t\4\2\2\u0250\u024f\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\37\3\2\2\2\u0252\u0253\7\63\2\2\u0253\u0255\5J&\2"+
		"\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u027a\3\2\2\2\u0256\u0257"+
		"\7s\2\2\u0257\u025a\7a\2\2\u0258\u025a\7\u008c\2\2\u0259\u0256\3\2\2\2"+
		"\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\7\5\2\2\u025c\u0261"+
		"\5\36\20\2\u025d\u025e\7\7\2\2\u025e\u0260\5\36\20\2\u025f\u025d\3\2\2"+
		"\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264"+
		"\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\7\6\2\2\u0265\u0266\5\26\f\2"+
		"\u0266\u027b\3\2\2\2\u0267\u0268\7.\2\2\u0268\u0269\7\5\2\2\u0269\u026a"+
		"\5\30\r\2\u026a\u026b\7\6\2\2\u026b\u027b\3\2\2\2\u026c\u026d\7L\2\2\u026d"+
		"\u026e\7a\2\2\u026e\u026f\7\5\2\2\u026f\u0274\5V,\2\u0270\u0271\7\7\2"+
		"\2\u0271\u0273\5V,\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"\u0278\7\6\2\2\u0278\u0279\5\32\16\2\u0279\u027b\3\2\2\2\u027a\u0259\3"+
		"\2\2\2\u027a\u0267\3\2\2\2\u027a\u026c\3\2\2\2\u027b!\3\2\2\2\u027c\u027e"+
		"\7\u0095\2\2\u027d\u027f\7v\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u0281\5:\36\2\u0281\u0282\7#\2\2\u0282\u0283"+
		"\7\5\2\2\u0283\u0284\5\n\6\2\u0284\u028e\7\6\2\2\u0285\u0286\7\7\2\2\u0286"+
		"\u0287\5:\36\2\u0287\u0288\7#\2\2\u0288\u0289\7\5\2\2\u0289\u028a\5\n"+
		"\6\2\u028a\u028b\7\6\2\2\u028b\u028d\3\2\2\2\u028c\u0285\3\2\2\2\u028d"+
		"\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f#\3\2\2\2"+
		"\u0290\u028e\3\2\2\2\u0291\u0292\5N(\2\u0292\u0293\7\4\2\2\u0293\u0295"+
		"\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u029c\5P)\2\u0297\u0298\7W\2\2\u0298\u0299\7*\2\2\u0299\u029d\5\\/\2"+
		"\u029a\u029b\7h\2\2\u029b\u029d\7W\2\2\u029c\u0297\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d%\3\2\2\2\u029e\u02a1\5\30\r\2\u029f"+
		"\u02a0\7/\2\2\u02a0\u02a2\5X-\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2"+
		"\2\u02a2\u02a4\3\2\2\2\u02a3\u02a5\t\4\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5\'\3\2\2\2\u02a6\u02aa\5<\37\2\u02a7\u02aa\5J&\2\u02a8\u02aa"+
		"\7\u009a\2\2\u02a9\u02a6\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2"+
		"\2\u02aa)\3\2\2\2\u02ab\u02b7\5P)\2\u02ac\u02ad\7\5\2\2\u02ad\u02b2\5"+
		"V,\2\u02ae\u02af\7\7\2\2\u02af\u02b1\5V,\2\u02b0\u02ae\3\2\2\2\u02b1\u02b4"+
		"\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b5\u02b6\7\6\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02ac\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7#\2\2\u02ba"+
		"\u02bb\7\5\2\2\u02bb\u02bc\5\n\6\2\u02bc\u02bd\7\6\2\2\u02bd+\3\2\2\2"+
		"\u02be\u02cb\7\t\2\2\u02bf\u02c0\5P)\2\u02c0\u02c1\7\4\2\2\u02c1\u02c2"+
		"\7\t\2\2\u02c2\u02cb\3\2\2\2\u02c3\u02c8\5\30\r\2\u02c4\u02c6\7#\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\5F"+
		"$\2\u02c8\u02c5\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca"+
		"\u02be\3\2\2\2\u02ca\u02bf\3\2\2\2\u02ca\u02c3\3\2\2\2\u02cb-\3\2\2\2"+
		"\u02cc\u02cd\5N(\2\u02cd\u02ce\7\4\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cc"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d6\5P)\2\u02d2"+
		"\u02d4\7#\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d7\5h\65\2\u02d6\u02d3\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02dd\3\2\2\2\u02d8\u02d9\7W\2\2\u02d9\u02da\7*\2\2\u02da\u02de\5\\/"+
		"\2\u02db\u02dc\7h\2\2\u02dc\u02de\7W\2\2\u02dd\u02d8\3\2\2\2\u02dd\u02db"+
		"\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02fc\3\2\2\2\u02df\u02e9\7\5\2\2\u02e0"+
		"\u02e5\5.\30\2\u02e1\u02e2\7\7\2\2\u02e2\u02e4\5.\30\2\u02e3\u02e1\3\2"+
		"\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02ea\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea\5\60\31\2\u02e9\u02e0\3"+
		"\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f0\7\6\2\2\u02ec"+
		"\u02ee\7#\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f1\5h\65\2\u02f0\u02ed\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02fc\3\2\2\2\u02f2\u02f3\7\5\2\2\u02f3\u02f4\5\n\6\2\u02f4\u02f9\7\6"+
		"\2\2\u02f5\u02f7\7#\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\5h\65\2\u02f9\u02f6\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02cf\3\2\2\2\u02fb\u02df\3\2\2\2\u02fb"+
		"\u02f2\3\2\2\2\u02fc/\3\2\2\2\u02fd\u0304\5.\30\2\u02fe\u02ff\5\62\32"+
		"\2\u02ff\u0300\5.\30\2\u0300\u0301\5\64\33\2\u0301\u0303\3\2\2\2\u0302"+
		"\u02fe\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\61\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0315\7\7\2\2\u0308\u030a"+
		"\7f\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0311\3\2\2\2\u030b"+
		"\u030d\7b\2\2\u030c\u030e\7p\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u0312\3\2\2\2\u030f\u0312\7Y\2\2\u0310\u0312\7\65\2\2\u0311\u030b"+
		"\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0315\7`\2\2\u0314\u0307\3\2\2\2\u0314\u0309\3\2"+
		"\2\2\u0315\63\3\2\2\2\u0316\u0317\7m\2\2\u0317\u0325\5\30\r\2\u0318\u0319"+
		"\7\u008e\2\2\u0319\u031a\7\5\2\2\u031a\u031f\5V,\2\u031b\u031c\7\7\2\2"+
		"\u031c\u031e\5V,\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0323\7\6\2\2\u0323\u0325\3\2\2\2\u0324\u0316\3\2\2\2\u0324\u0318\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\65\3\2\2\2\u0326\u0328\7\u0082\2\2\u0327"+
		"\u0329\t\3\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032f\5,\27\2\u032b\u032c\7\7\2\2\u032c\u032e\5,\27\2\u032d"+
		"\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u033e\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u033c\7M\2\2\u0333"+
		"\u0338\5.\30\2\u0334\u0335\7\7\2\2\u0335\u0337\5.\30\2\u0336\u0334\3\2"+
		"\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033d\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033d\5\60\31\2\u033c\u0333\3"+
		"\2\2\2\u033c\u033b\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0332\3\2\2\2\u033e"+
		"\u033f\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u0341\7\u0094\2\2\u0341\u0343"+
		"\5\30\r\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0352\3\2\2\2"+
		"\u0344\u0345\7P\2\2\u0345\u0346\7*\2\2\u0346\u034b\5\30\r\2\u0347\u0348"+
		"\7\7\2\2\u0348\u034a\5\30\r\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2"+
		"\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0350\3\2\2\2\u034d\u034b"+
		"\3\2\2\2\u034e\u034f\7Q\2\2\u034f\u0351\5\30\r\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0344\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0371\3\2\2\2\u0354\u0355\7\u0090\2\2\u0355\u0356\7\5\2\2\u0356"+
		"\u035b\5\30\r\2\u0357\u0358\7\7\2\2\u0358\u035a\5\30\r\2\u0359\u0357\3"+
		"\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u036d\7\6\2\2\u035f\u0360\7\7"+
		"\2\2\u0360\u0361\7\5\2\2\u0361\u0366\5\30\r\2\u0362\u0363\7\7\2\2\u0363"+
		"\u0365\5\30\r\2\u0364\u0362\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3"+
		"\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369"+
		"\u036a\7\6\2\2\u036a\u036c\3\2\2\2\u036b\u035f\3\2\2\2\u036c\u036f\3\2"+
		"\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0326\3\2\2\2\u0370\u0354\3\2\2\2\u0371\67\3\2\2"+
		"\2\u0372\u0378\7\u008b\2\2\u0373\u0374\7\u008b\2\2\u0374\u0378\7\37\2"+
		"\2\u0375\u0378\7\\\2\2\u0376\u0378\7F\2\2\u0377\u0372\3\2\2\2\u0377\u0373"+
		"\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u03789\3\2\2\2\u0379"+
		"\u0385\5P)\2\u037a\u037b\7\5\2\2\u037b\u0380\5V,\2\u037c\u037d\7\7\2\2"+
		"\u037d\u037f\5V,\2\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0384\7\6\2\2\u0384\u0386\3\2\2\2\u0385\u037a\3\2\2\2\u0385\u0386\3\2"+
		"\2\2\u0386;\3\2\2\2\u0387\u0389\t\7\2\2\u0388\u0387\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7\u0098\2\2\u038b=\3\2\2\2\u038c"+
		"\u038d\t\r\2\2\u038d?\3\2\2\2\u038e\u038f\t\16\2\2\u038fA\3\2\2\2\u0390"+
		"\u0391\7\u009a\2\2\u0391C\3\2\2\2\u0392\u0395\5\30\r\2\u0393\u0395\5\20"+
		"\t\2\u0394\u0392\3\2\2\2\u0394\u0393\3\2\2\2\u0395E\3\2\2\2\u0396\u0397"+
		"\t\17\2\2\u0397G\3\2\2\2\u0398\u0399\t\20\2\2\u0399I\3\2\2\2\u039a\u039b"+
		"\5l\67\2\u039bK\3\2\2\2\u039c\u039d\5l\67\2\u039dM\3\2\2\2\u039e\u039f"+
		"\5l\67\2\u039fO\3\2\2\2\u03a0\u03a1\5l\67\2\u03a1Q\3\2\2\2\u03a2\u03a3"+
		"\5l\67\2\u03a3S\3\2\2\2\u03a4\u03a5\5l\67\2\u03a5U\3\2\2\2\u03a6\u03a7"+
		"\5l\67\2\u03a7W\3\2\2\2\u03a8\u03a9\5l\67\2\u03a9Y\3\2\2\2\u03aa\u03ab"+
		"\5l\67\2\u03ab[\3\2\2\2\u03ac\u03ad\5l\67\2\u03ad]\3\2\2\2\u03ae\u03af"+
		"\5l\67\2\u03af_\3\2\2\2\u03b0\u03b1\5l\67\2\u03b1a\3\2\2\2\u03b2\u03b3"+
		"\5l\67\2\u03b3c\3\2\2\2\u03b4\u03b5\5l\67\2\u03b5e\3\2\2\2\u03b6\u03b7"+
		"\5l\67\2\u03b7g\3\2\2\2\u03b8\u03b9\5l\67\2\u03b9i\3\2\2\2\u03ba\u03bb"+
		"\5l\67\2\u03bbk\3\2\2\2\u03bc\u03c4\7\u0097\2\2\u03bd\u03c4\5H%\2\u03be"+
		"\u03c4\7\u009a\2\2\u03bf\u03c0\7\5\2\2\u03c0\u03c1\5l\67\2\u03c1\u03c2"+
		"\7\6\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03bc\3\2\2\2\u03c3\u03bd\3\2\2\2\u03c3"+
		"\u03be\3\2\2\2\u03c3\u03bf\3\2\2\2\u03c4m\3\2\2\2\u0083pr}\u0084\u0089"+
		"\u008f\u0095\u0097\u009d\u00a4\u00a7\u00af\u00b9\u00bc\u00c2\u00c4\u00c8"+
		"\u00cf\u00d8\u00dc\u00de\u00e1\u00ea\u00ef\u00f1\u00fa\u0105\u010c\u010f"+
		"\u0116\u011b\u0121\u012d\u0131\u0136\u013a\u013d\u014f\u0154\u0159\u0164"+
		"\u0169\u016f\u0176\u017a\u018a\u018d\u0195\u019e\u01a2\u01a7\u01c5\u01d1"+
		"\u01d6\u01e2\u01e8\u01ef\u01f3\u01fd\u0200\u0206\u0209\u020b\u020d\u0218"+
		"\u021d\u0229\u022d\u0231\u0235\u023c\u023e\u0246\u024d\u0250\u0254\u0259"+
		"\u0261\u0274\u027a\u027e\u028e\u0294\u029c\u02a1\u02a4\u02a9\u02b2\u02b7"+
		"\u02c5\u02c8\u02ca\u02cf\u02d3\u02d6\u02dd\u02e5\u02e9\u02ed\u02f0\u02f6"+
		"\u02f9\u02fb\u0304\u0309\u030d\u0311\u0314\u031f\u0324\u0328\u032f\u0338"+
		"\u033c\u033e\u0342\u034b\u0350\u0352\u035b\u0366\u036d\u0370\u0377\u0380"+
		"\u0385\u0388\u0394\u03c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}