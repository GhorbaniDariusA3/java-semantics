// Generated from /home/alex/work/Alk/script/../src/grammar/parts/alk.g4 by ANTLR 4.7.1

    package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, IF=4, ELSE=5, WHILE=6, DO=7, FOR=8, FORALL=9, 
		IN=10, OUT=11, CHOOSE=12, RETURN=13, SUCCESS=14, FAILURE=15, EMPTYSET=16, 
		EMPTYLIST=17, XOR=18, AT=19, BELONGSTO=20, DELETE=21, EMPTY=22, END=23, 
		FIRST=24, INSERT=25, PRINT=26, POPBACK=27, POPFRONT=28, PUSHBACK=29, PUSHFRONT=30, 
		REMOVE=31, REMOVEALLEQTO=32, REMOVEAT=33, SINGLETONSET=34, SIZE=35, TOPBACK=36, 
		TOPFRONT=37, UPDATE=38, RANDOM=39, ARROW=40, UNION=41, INTERSECT=42, SUBTRACT=43, 
		INT=44, DOUBLE=45, BOOL=46, ID=47, PLUSPLUS=48, MINUSMINUS=49, BITWISE_AND=50, 
		PLUSMOD=51, MINUSMOD=52, PLUSPLUSMOD=53, MINUSMINUSMOD=54, LOWER=55, GREATER=56, 
		LOWEREQ=57, GREATEREQ=58, ISEQUAL=59, NOTEQUAL=60, ASSIGNMENT_OPERATOR=61, 
		MINUS=62, PLUS=63, MUL=64, DIV=65, MOD=66, LPAR=67, RPAR=68, LEFTSHIFT=69, 
		RIGHTSHIFT=70, OR=71, AND=72, NOT=73, SEMICOLON=74, DPOINT=75, VBAR=76, 
		LCB=77, RCB=78, COMMA=79, POINT=80, LBRA=81, RBRA=82, QUOTE=83, QUESTION=84, 
		STRING=85;
	public static final int
		RULE_main = 0, RULE_statement_sequence = 1, RULE_statement = 2, RULE_statement_block = 3, 
		RULE_choose = 4, RULE_increase_decrease = 5, RULE_assignment = 6, RULE_while_struct = 7, 
		RULE_do_while_struct = 8, RULE_if_struct = 9, RULE_for_struct = 10, RULE_start_assignment = 11, 
		RULE_forall_struct = 12, RULE_function_decl = 13, RULE_param = 14, RULE_expression = 15, 
		RULE_logical_or_expression = 16, RULE_logical_and_expression = 17, RULE_in_expression = 18, 
		RULE_equality_expression = 19, RULE_relational_expression = 20, RULE_set_expression = 21, 
		RULE_bitwise_or = 22, RULE_bitwise_and = 23, RULE_shift_expression = 24, 
		RULE_additive_expression = 25, RULE_multiplicative_expression = 26, RULE_unary_expression = 27, 
		RULE_postfix_expression = 28, RULE_factor = 29, RULE_value = 30, RULE_scalar_value = 31, 
		RULE_ref_name = 32, RULE_ref_name_chunk = 33, RULE_data_structure = 34, 
		RULE_interval = 35, RULE_spec = 36, RULE_array = 37, RULE_list = 38, RULE_structure = 39, 
		RULE_component = 40, RULE_set = 41, RULE_function_call = 42, RULE_builtin_method = 43, 
		RULE_method_name = 44;
	public static final String[] ruleNames = {
		"main", "statement_sequence", "statement", "statement_block", "choose", 
		"increase_decrease", "assignment", "while_struct", "do_while_struct", 
		"if_struct", "for_struct", "start_assignment", "forall_struct", "function_decl", 
		"param", "expression", "logical_or_expression", "logical_and_expression", 
		"in_expression", "equality_expression", "relational_expression", "set_expression", 
		"bitwise_or", "bitwise_and", "shift_expression", "additive_expression", 
		"multiplicative_expression", "unary_expression", "postfix_expression", 
		"factor", "value", "scalar_value", "ref_name", "ref_name_chunk", "data_structure", 
		"interval", "spec", "array", "list", "structure", "component", "set", 
		"function_call", "builtin_method", "method_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'forall'", "'in'", "'out'", "'choose'", "'return'", "'success'", "'failure'", 
		"'emptySet'", "'emptyList'", "'xor'", "'at'", "'belongsTo'", "'delete'", 
		"'empty'", "'end'", "'first'", "'insert'", "'print'", "'popBack'", "'popFront'", 
		"'pushBack'", "'pushFront'", "'remove'", "'removeAllEqTo'", "'removeAt'", 
		"'singletonSet'", "'size'", "'topBack'", "'topFront'", "'update'", "'random'", 
		"'->'", "'U'", "'^'", "'\\'", null, null, null, null, "'++'", "'--'", 
		"'&'", "'+%'", "'-%'", "'++%'", "'--%'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", null, "'-'", "'+'", "'*'", "'/'", "'%'", "'('", "')'", 
		"'<<'", "'>>'", "'||'", "'&&'", "'!'", "';'", "':'", "'|'", "'{'", "'}'", 
		"','", "'.'", "'['", "']'", "'\"'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "WHILE", "DO", "FOR", 
		"FORALL", "IN", "OUT", "CHOOSE", "RETURN", "SUCCESS", "FAILURE", "EMPTYSET", 
		"EMPTYLIST", "XOR", "AT", "BELONGSTO", "DELETE", "EMPTY", "END", "FIRST", 
		"INSERT", "PRINT", "POPBACK", "POPFRONT", "PUSHBACK", "PUSHFRONT", "REMOVE", 
		"REMOVEALLEQTO", "REMOVEAT", "SINGLETONSET", "SIZE", "TOPBACK", "TOPFRONT", 
		"UPDATE", "RANDOM", "ARROW", "UNION", "INTERSECT", "SUBTRACT", "INT", 
		"DOUBLE", "BOOL", "ID", "PLUSPLUS", "MINUSMINUS", "BITWISE_AND", "PLUSMOD", 
		"MINUSMOD", "PLUSPLUSMOD", "MINUSMINUSMOD", "LOWER", "GREATER", "LOWEREQ", 
		"GREATEREQ", "ISEQUAL", "NOTEQUAL", "ASSIGNMENT_OPERATOR", "MINUS", "PLUS", 
		"MUL", "DIV", "MOD", "LPAR", "RPAR", "LEFTSHIFT", "RIGHTSHIFT", "OR", 
		"AND", "NOT", "SEMICOLON", "DPOINT", "VBAR", "LCB", "RCB", "COMMA", "POINT", 
		"LBRA", "RBRA", "QUOTE", "QUESTION", "STRING"
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
	public String getGrammarFileName() { return "alk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(alkParser.EOF, 0); }
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << FORALL) | (1L << CHOOSE) | (1L << RETURN) | (1L << SUCCESS) | (1L << FAILURE) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD))) != 0) || _la==LCB) {
				{
				setState(90);
				statement_sequence();
				}
			}

			setState(93);
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

	public static class Statement_sequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public Statement_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_sequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStatement_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_sequenceContext statement_sequence() throws RecognitionException {
		Statement_sequenceContext _localctx = new Statement_sequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_sequence);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				statement();
				setState(97);
				statement_sequence();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(alkParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToWhileContext extends StatementContext {
		public While_structContext while_struct() {
			return getRuleContext(While_structContext.class,0);
		}
		public ToWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToDoWhileContext extends StatementContext {
		public Do_while_structContext do_while_struct() {
			return getRuleContext(Do_while_structContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToDoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToForAllContext extends StatementContext {
		public Forall_structContext forall_struct() {
			return getRuleContext(Forall_structContext.class,0);
		}
		public ToForAllContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends StatementContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public TerminalNode POINT() { return getToken(alkParser.POINT, 0); }
		public TerminalNode ARROW() { return getToken(alkParser.ARROW, 0); }
		public MethodCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuccessContext extends StatementContext {
		public TerminalNode SUCCESS() { return getToken(alkParser.SUCCESS, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public SuccessContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSuccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChooseStmContext extends StatementContext {
		public ChooseContext choose() {
			return getRuleContext(ChooseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ChooseStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitChooseStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIncreaseDecreaseContext extends StatementContext {
		public Increase_decreaseContext increase_decrease() {
			return getRuleContext(Increase_decreaseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToIncreaseDecreaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToIncreaseDecrease(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToFunContext extends StatementContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToFunContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToBlockContext extends StatementContext {
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public ToBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToForContext extends StatementContext {
		public For_structContext for_struct() {
			return getRuleContext(For_structContext.class,0);
		}
		public ToForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TOFDContext extends StatementContext {
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public TOFDContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitTOFD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailureContext extends StatementContext {
		public TerminalNode FAILURE() { return getToken(alkParser.FAILURE, 0); }
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public FailureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFailure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(alkParser.SEMICOLON, 0); }
		public ToAssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToIfContext extends StatementContext {
		public If_structContext if_struct() {
			return getRuleContext(If_structContext.class,0);
		}
		public ToIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				ref_name();
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==ARROW || _la==POINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				function_call();
				setState(104);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ToFunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				function_call();
				setState(107);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new TOFDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				function_decl();
				}
				break;
			case 4:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(RETURN);
				setState(111);
				expression();
				setState(112);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new ChooseStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				choose();
				setState(115);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new SuccessContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(SUCCESS);
				setState(118);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new FailureContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(FAILURE);
				setState(120);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ToAssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				assignment();
				setState(122);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ToIncreaseDecreaseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				increase_decrease();
				setState(125);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ToBlockContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
				statement_block();
				}
				break;
			case 11:
				_localctx = new ToWhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(128);
				while_struct();
				}
				break;
			case 12:
				_localctx = new ToDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(129);
				do_while_struct();
				setState(130);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ToIfContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(132);
				if_struct();
				}
				break;
			case 14:
				_localctx = new ToForContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(133);
				for_struct();
				}
				break;
			case 15:
				_localctx = new ToForAllContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(134);
				forall_struct();
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

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	 
		public Statement_blockContext() { }
		public void copyFrom(Statement_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockContext extends Statement_blockContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public BlockContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement_block);
		try {
			_localctx = new BlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(LCB);
			setState(138);
			statement_sequence();
			setState(139);
			match(RCB);
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

	public static class ChooseContext extends ParserRuleContext {
		public TerminalNode CHOOSE() { return getToken(alkParser.CHOOSE, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChooseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitChoose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseContext choose() throws RecognitionException {
		ChooseContext _localctx = new ChooseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_choose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CHOOSE);
			setState(142);
			match(ID);
			setState(143);
			match(IN);
			setState(144);
			expression();
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

	public static class Increase_decreaseContext extends ParserRuleContext {
		public Increase_decreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_decrease; }
	 
		public Increase_decreaseContext() { }
		public void copyFrom(Increase_decreaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtMinusMinusContext extends Increase_decreaseContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public StmtMinusMinusContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStmtMinusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusStmtContext extends Increase_decreaseContext {
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public PlusPlusStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPlusPlusStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusPlusModStmtContext extends Increase_decreaseContext {
		public TerminalNode PLUSPLUSMOD() { return getToken(alkParser.PLUSPLUSMOD, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public PlusPlusModStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPlusPlusModStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusMinusStmtContext extends Increase_decreaseContext {
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public MinusMinusStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMinusMinusStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPlusPlusContext extends Increase_decreaseContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public StmtPlusPlusContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStmtPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusMinusModStmtContext extends Increase_decreaseContext {
		public TerminalNode MINUSMINUSMOD() { return getToken(alkParser.MINUSMINUSMOD, 0); }
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public MinusMinusModStmtContext(Increase_decreaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMinusMinusModStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_decreaseContext increase_decrease() throws RecognitionException {
		Increase_decreaseContext _localctx = new Increase_decreaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_increase_decrease);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PlusPlusStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(PLUSPLUS);
				setState(147);
				ref_name();
				}
				break;
			case 2:
				_localctx = new StmtPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				ref_name();
				setState(149);
				match(PLUSPLUS);
				}
				break;
			case 3:
				_localctx = new MinusMinusStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(MINUSMINUS);
				setState(152);
				ref_name();
				}
				break;
			case 4:
				_localctx = new StmtMinusMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				ref_name();
				setState(154);
				match(MINUSMINUS);
				}
				break;
			case 5:
				_localctx = new PlusPlusModStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(PLUSPLUSMOD);
				setState(157);
				ref_name();
				}
				break;
			case 6:
				_localctx = new MinusMinusModStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(MINUSMINUSMOD);
				setState(159);
				ref_name();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentStmtContext extends AssignmentContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(alkParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			_localctx = new AssignmentStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			ref_name();
			setState(163);
			match(ASSIGNMENT_OPERATOR);
			setState(164);
			expression();
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

	public static class While_structContext extends ParserRuleContext {
		public While_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_struct; }
	 
		public While_structContext() { }
		public void copyFrom(While_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStructureContext extends While_structContext {
		public TerminalNode WHILE() { return getToken(alkParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStructureContext(While_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitWhileStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_structContext while_struct() throws RecognitionException {
		While_structContext _localctx = new While_structContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_struct);
		try {
			_localctx = new WhileStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE);
			setState(167);
			match(LPAR);
			setState(168);
			expression();
			setState(169);
			match(RPAR);
			setState(170);
			statement();
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

	public static class Do_while_structContext extends ParserRuleContext {
		public Do_while_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_struct; }
	 
		public Do_while_structContext() { }
		public void copyFrom(Do_while_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhileStructureContext extends Do_while_structContext {
		public TerminalNode DO() { return getToken(alkParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(alkParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public DoWhileStructureContext(Do_while_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDoWhileStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_structContext do_while_struct() throws RecognitionException {
		Do_while_structContext _localctx = new Do_while_structContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while_struct);
		try {
			_localctx = new DoWhileStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DO);
			setState(173);
			statement();
			setState(174);
			match(WHILE);
			setState(175);
			match(LPAR);
			setState(176);
			expression();
			setState(177);
			match(RPAR);
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

	public static class If_structContext extends ParserRuleContext {
		public If_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_struct; }
	 
		public If_structContext() { }
		public void copyFrom(If_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStructureContext extends If_structContext {
		public TerminalNode IF() { return getToken(alkParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(alkParser.ELSE, 0); }
		public IfStructureContext(If_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIfStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structContext if_struct() throws RecognitionException {
		If_structContext _localctx = new If_structContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_struct);
		try {
			_localctx = new IfStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IF);
			setState(180);
			match(LPAR);
			setState(181);
			expression();
			setState(182);
			match(RPAR);
			setState(183);
			statement();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(184);
				match(ELSE);
				setState(185);
				statement();
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

	public static class For_structContext extends ParserRuleContext {
		public For_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_struct; }
	 
		public For_structContext() { }
		public void copyFrom(For_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStructureContext extends For_structContext {
		public TerminalNode FOR() { return getToken(alkParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(alkParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(alkParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Increase_decreaseContext increase_decrease() {
			return getRuleContext(Increase_decreaseContext.class,0);
		}
		public Start_assignmentContext start_assignment() {
			return getRuleContext(Start_assignmentContext.class,0);
		}
		public ForStructureContext(For_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_structContext for_struct() throws RecognitionException {
		For_structContext _localctx = new For_structContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_struct);
		int _la;
		try {
			_localctx = new ForStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FOR);
			setState(189);
			match(LPAR);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << ID))) != 0)) {
				{
				setState(190);
				start_assignment();
				}
			}

			setState(193);
			match(SEMICOLON);
			setState(194);
			expression();
			setState(195);
			match(SEMICOLON);
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(196);
				assignment();
				}
				break;
			case 2:
				{
				setState(197);
				increase_decrease();
				}
				break;
			}
			setState(200);
			match(RPAR);
			setState(201);
			statement();
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

	public static class Start_assignmentContext extends ParserRuleContext {
		public Start_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_assignment; }
	 
		public Start_assignmentContext() { }
		public void copyFrom(Start_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStartContext extends Start_assignmentContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForStartContext(Start_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_assignmentContext start_assignment() throws RecognitionException {
		Start_assignmentContext _localctx = new Start_assignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_assignment);
		try {
			_localctx = new ForStartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			assignment();
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

	public static class Forall_structContext extends ParserRuleContext {
		public Forall_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forall_struct; }
	 
		public Forall_structContext() { }
		public void copyFrom(Forall_structContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForAllStructureContext extends Forall_structContext {
		public TerminalNode FORALL() { return getToken(alkParser.FORALL, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForAllStructureContext(Forall_structContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitForAllStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forall_structContext forall_struct() throws RecognitionException {
		Forall_structContext _localctx = new Forall_structContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forall_struct);
		try {
			_localctx = new ForAllStructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(FORALL);
			setState(206);
			match(ID);
			setState(207);
			match(IN);
			setState(208);
			expression();
			setState(209);
			statement();
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

	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			setState(212);
			match(LPAR);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==ID) {
				{
				setState(213);
				param();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					param();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(223);
			match(RPAR);
			setState(224);
			statement();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode OUT() { return getToken(alkParser.OUT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT) {
				{
				setState(226);
				match(OUT);
				}
			}

			setState(229);
			match(ID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(alkParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DPOINT() { return getToken(alkParser.DPOINT, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			_localctx = new ConditionalExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			logical_or_expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(232);
				match(QUESTION);
				setState(233);
				expression();
				setState(234);
				match(DPOINT);
				setState(235);
				expression();
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	 
		public Logical_or_expressionContext() { }
		public void copyFrom(Logical_or_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpressionContext extends Logical_or_expressionContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(alkParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(alkParser.OR, i);
		}
		public LogicalOrExpressionContext(Logical_or_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical_or_expression);
		int _la;
		try {
			_localctx = new LogicalOrExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			logical_and_expression();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(240);
				match(OR);
				setState(241);
				logical_and_expression();
				}
				}
				setState(246);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	 
		public Logical_and_expressionContext() { }
		public void copyFrom(Logical_and_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpressionContext extends Logical_and_expressionContext {
		public List<In_expressionContext> in_expression() {
			return getRuleContexts(In_expressionContext.class);
		}
		public In_expressionContext in_expression(int i) {
			return getRuleContext(In_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(alkParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(alkParser.AND, i);
		}
		public LogicalAndExpressionContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logical_and_expression);
		int _la;
		try {
			_localctx = new LogicalAndExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			in_expression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(248);
				match(AND);
				setState(249);
				in_expression();
				}
				}
				setState(254);
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

	public static class In_expressionContext extends ParserRuleContext {
		public In_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_expression; }
	 
		public In_expressionContext() { }
		public void copyFrom(In_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InExpressionContext extends In_expressionContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(alkParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(alkParser.IN, i);
		}
		public InExpressionContext(In_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_expressionContext in_expression() throws RecognitionException {
		In_expressionContext _localctx = new In_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_in_expression);
		int _la;
		try {
			_localctx = new InExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			equality_expression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(256);
				match(IN);
				setState(257);
				equality_expression();
				}
				}
				setState(262);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	 
		public Equality_expressionContext() { }
		public void copyFrom(Equality_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpressionContext extends Equality_expressionContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> ISEQUAL() { return getTokens(alkParser.ISEQUAL); }
		public TerminalNode ISEQUAL(int i) {
			return getToken(alkParser.ISEQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(alkParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(alkParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(Equality_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equality_expression);
		int _la;
		try {
			_localctx = new EqualityExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			relational_expression();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ISEQUAL || _la==NOTEQUAL) {
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==ISEQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				relational_expression();
				}
				}
				setState(270);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	 
		public Relational_expressionContext() { }
		public void copyFrom(Relational_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpressionContext extends Relational_expressionContext {
		public List<Set_expressionContext> set_expression() {
			return getRuleContexts(Set_expressionContext.class);
		}
		public Set_expressionContext set_expression(int i) {
			return getRuleContext(Set_expressionContext.class,i);
		}
		public List<TerminalNode> LOWER() { return getTokens(alkParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(alkParser.LOWER, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(alkParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(alkParser.GREATER, i);
		}
		public List<TerminalNode> LOWEREQ() { return getTokens(alkParser.LOWEREQ); }
		public TerminalNode LOWEREQ(int i) {
			return getToken(alkParser.LOWEREQ, i);
		}
		public List<TerminalNode> GREATEREQ() { return getTokens(alkParser.GREATEREQ); }
		public TerminalNode GREATEREQ(int i) {
			return getToken(alkParser.GREATEREQ, i);
		}
		public RelationalExpressionContext(Relational_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			_localctx = new RelationalExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			set_expression();
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOWER) | (1L << GREATER) | (1L << LOWEREQ) | (1L << GREATEREQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(273);
					set_expression();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Set_expressionContext extends ParserRuleContext {
		public Set_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_expression; }
	 
		public Set_expressionContext() { }
		public void copyFrom(Set_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetExpressionContext extends Set_expressionContext {
		public List<Bitwise_orContext> bitwise_or() {
			return getRuleContexts(Bitwise_orContext.class);
		}
		public Bitwise_orContext bitwise_or(int i) {
			return getRuleContext(Bitwise_orContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(alkParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(alkParser.UNION, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(alkParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(alkParser.INTERSECT, i);
		}
		public List<TerminalNode> SUBTRACT() { return getTokens(alkParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(alkParser.SUBTRACT, i);
		}
		public SetExpressionContext(Set_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_expressionContext set_expression() throws RecognitionException {
		Set_expressionContext _localctx = new Set_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_set_expression);
		int _la;
		try {
			_localctx = new SetExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			bitwise_or();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << SUBTRACT))) != 0)) {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNION) | (1L << INTERSECT) | (1L << SUBTRACT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				bitwise_or();
				}
				}
				setState(286);
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

	public static class Bitwise_orContext extends ParserRuleContext {
		public Bitwise_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or; }
	 
		public Bitwise_orContext() { }
		public void copyFrom(Bitwise_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitwiseOrExpressionContext extends Bitwise_orContext {
		public List<Bitwise_andContext> bitwise_and() {
			return getRuleContexts(Bitwise_andContext.class);
		}
		public Bitwise_andContext bitwise_and(int i) {
			return getRuleContext(Bitwise_andContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(alkParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(alkParser.VBAR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(alkParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(alkParser.XOR, i);
		}
		public BitwiseOrExpressionContext(Bitwise_orContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_orContext bitwise_or() throws RecognitionException {
		Bitwise_orContext _localctx = new Bitwise_orContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitwise_or);
		int _la;
		try {
			int _alt;
			_localctx = new BitwiseOrExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			bitwise_and();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					_la = _input.LA(1);
					if ( !(_la==XOR || _la==VBAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(289);
					bitwise_and();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Bitwise_andContext extends ParserRuleContext {
		public Bitwise_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and; }
	 
		public Bitwise_andContext() { }
		public void copyFrom(Bitwise_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BitwiseAndExpressionContext extends Bitwise_andContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_AND() { return getTokens(alkParser.BITWISE_AND); }
		public TerminalNode BITWISE_AND(int i) {
			return getToken(alkParser.BITWISE_AND, i);
		}
		public BitwiseAndExpressionContext(Bitwise_andContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bitwise_andContext bitwise_and() throws RecognitionException {
		Bitwise_andContext _localctx = new Bitwise_andContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bitwise_and);
		int _la;
		try {
			_localctx = new BitwiseAndExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			shift_expression();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITWISE_AND) {
				{
				{
				setState(296);
				match(BITWISE_AND);
				setState(297);
				shift_expression();
				}
				}
				setState(302);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	 
		public Shift_expressionContext() { }
		public void copyFrom(Shift_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpressionContext extends Shift_expressionContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> LEFTSHIFT() { return getTokens(alkParser.LEFTSHIFT); }
		public TerminalNode LEFTSHIFT(int i) {
			return getToken(alkParser.LEFTSHIFT, i);
		}
		public List<TerminalNode> RIGHTSHIFT() { return getTokens(alkParser.RIGHTSHIFT); }
		public TerminalNode RIGHTSHIFT(int i) {
			return getToken(alkParser.RIGHTSHIFT, i);
		}
		public ShiftExpressionContext(Shift_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shift_expression);
		int _la;
		try {
			_localctx = new ShiftExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			additive_expression();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTSHIFT || _la==RIGHTSHIFT) {
				{
				{
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				additive_expression();
				}
				}
				setState(310);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	 
		public Additive_expressionContext() { }
		public void copyFrom(Additive_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpressionContext extends Additive_expressionContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(alkParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(alkParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(alkParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(alkParser.MINUS, i);
		}
		public List<TerminalNode> PLUSMOD() { return getTokens(alkParser.PLUSMOD); }
		public TerminalNode PLUSMOD(int i) {
			return getToken(alkParser.PLUSMOD, i);
		}
		public List<TerminalNode> MINUSMOD() { return getTokens(alkParser.MINUSMOD); }
		public TerminalNode MINUSMOD(int i) {
			return getToken(alkParser.MINUSMOD, i);
		}
		public AdditiveExpressionContext(Additive_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_additive_expression);
		int _la;
		try {
			_localctx = new AdditiveExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			multiplicative_expression();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSMOD) | (1L << MINUSMOD) | (1L << MINUS) | (1L << PLUS))) != 0)) {
				{
				{
				setState(312);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSMOD) | (1L << MINUSMOD) | (1L << MINUS) | (1L << PLUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				multiplicative_expression();
				}
				}
				setState(318);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	 
		public Multiplicative_expressionContext() { }
		public void copyFrom(Multiplicative_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpressionContext extends Multiplicative_expressionContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(alkParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(alkParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(alkParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(alkParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(alkParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(alkParser.MOD, i);
		}
		public MultiplicativeExpressionContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiplicative_expression);
		int _la;
		try {
			_localctx = new MultiplicativeExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			unary_expression();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (MOD - 64)))) != 0)) {
				{
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (DIV - 64)) | (1L << (MOD - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				unary_expression();
				}
				}
				setState(326);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToPostfixExpressionContext extends Unary_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ToPostfixExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitToPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(alkParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(alkParser.MINUSMINUS, 0); }
		public TerminalNode PLUSPLUSMOD() { return getToken(alkParser.PLUSPLUSMOD, 0); }
		public TerminalNode MINUSMINUSMOD() { return getToken(alkParser.MINUSMINUSMOD, 0); }
		public PrefixExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(alkParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(alkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(alkParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(alkParser.NOT, 0); }
		public UnaryExpressionContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary_expression);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSPLUS:
			case MINUSMINUS:
			case PLUSPLUSMOD:
			case MINUSMINUSMOD:
				_localctx = new PrefixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				unary_expression();
				}
				break;
			case MINUS:
			case PLUS:
			case MUL:
			case NOT:
				_localctx = new UnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MINUS - 62)) | (1L << (PLUS - 62)) | (1L << (MUL - 62)) | (1L << (NOT - 62)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				unary_expression();
				}
				break;
			case EMPTYSET:
			case EMPTYLIST:
			case AT:
			case DELETE:
			case END:
			case FIRST:
			case INSERT:
			case PRINT:
			case POPBACK:
			case POPFRONT:
			case PUSHBACK:
			case PUSHFRONT:
			case REMOVE:
			case REMOVEALLEQTO:
			case REMOVEAT:
			case SINGLETONSET:
			case SIZE:
			case TOPBACK:
			case TOPFRONT:
			case UPDATE:
			case INT:
			case DOUBLE:
			case BOOL:
			case ID:
			case LOWER:
			case LPAR:
			case LCB:
			case LBRA:
			case STRING:
				_localctx = new ToPostfixExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				postfix_expression();
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpressionContext extends Postfix_expressionContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<TerminalNode> PLUSPLUS() { return getTokens(alkParser.PLUSPLUS); }
		public TerminalNode PLUSPLUS(int i) {
			return getToken(alkParser.PLUSPLUS, i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(alkParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(alkParser.MINUSMINUS, i);
		}
		public PostfixExpressionContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			_localctx = new PostfixExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			factor();
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					_la = _input.LA(1);
					if ( !(_la==PLUSPLUS || _la==MINUSMINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallFactorContext extends FactorContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionCallFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefNameFactorContext extends FactorContext {
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public RefNameFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRefNameFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesFactorContext extends FactorContext {
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public ParanthesesFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitParanthesesFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueFactorContext extends FactorContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueFactorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitValueFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new FunctionCallFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				function_call();
				}
				break;
			case 2:
				_localctx = new RefNameFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				ref_name();
				}
				break;
			case 3:
				_localctx = new ValueFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				value();
				}
				break;
			case 4:
				_localctx = new ParanthesesFactorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(LPAR);
				setState(345);
				expression();
				setState(346);
				match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public Scalar_valueContext scalar_value() {
			return getRuleContext(Scalar_valueContext.class,0);
		}
		public Data_structureContext data_structure() {
			return getRuleContext(Data_structureContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case BOOL:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				scalar_value();
				}
				break;
			case EMPTYSET:
			case EMPTYLIST:
			case LOWER:
			case LCB:
			case LBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				data_structure();
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

	public static class Scalar_valueContext extends ParserRuleContext {
		public Scalar_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_value; }
	 
		public Scalar_valueContext() { }
		public void copyFrom(Scalar_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleValueContext extends Scalar_valueContext {
		public TerminalNode DOUBLE() { return getToken(alkParser.DOUBLE, 0); }
		public DoubleValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitDoubleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends Scalar_valueContext {
		public TerminalNode BOOL() { return getToken(alkParser.BOOL, 0); }
		public BoolValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValueContext extends Scalar_valueContext {
		public TerminalNode STRING() { return getToken(alkParser.STRING, 0); }
		public StringValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValueContext extends Scalar_valueContext {
		public TerminalNode INT() { return getToken(alkParser.INT, 0); }
		public IntValueContext(Scalar_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_valueContext scalar_value() throws RecognitionException {
		Scalar_valueContext _localctx = new Scalar_valueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scalar_value);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(DOUBLE);
				}
				break;
			case BOOL:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(STRING);
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

	public static class Ref_nameContext extends ParserRuleContext {
		public Ref_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_name; }
	 
		public Ref_nameContext() { }
		public void copyFrom(Ref_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RefNameContext extends Ref_nameContext {
		public List<Ref_name_chunkContext> ref_name_chunk() {
			return getRuleContexts(Ref_name_chunkContext.class);
		}
		public Ref_name_chunkContext ref_name_chunk(int i) {
			return getRuleContext(Ref_name_chunkContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(alkParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(alkParser.POINT, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(alkParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(alkParser.ARROW, i);
		}
		public RefNameContext(Ref_nameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitRefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_nameContext ref_name() throws RecognitionException {
		Ref_nameContext _localctx = new Ref_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ref_name);
		int _la;
		try {
			int _alt;
			_localctx = new RefNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			ref_name_chunk();
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					_la = _input.LA(1);
					if ( !(_la==ARROW || _la==POINT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(362);
					ref_name_chunk();
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Ref_name_chunkContext extends ParserRuleContext {
		public Ref_name_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_name_chunk; }
	 
		public Ref_name_chunkContext() { }
		public void copyFrom(Ref_name_chunkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionChunkContext extends Ref_name_chunkContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<TerminalNode> LBRA() { return getTokens(alkParser.LBRA); }
		public TerminalNode LBRA(int i) {
			return getToken(alkParser.LBRA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRA() { return getTokens(alkParser.RBRA); }
		public TerminalNode RBRA(int i) {
			return getToken(alkParser.RBRA, i);
		}
		public FunctionChunkContext(Ref_name_chunkContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunctionChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDChunkContext extends Ref_name_chunkContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public List<TerminalNode> LBRA() { return getTokens(alkParser.LBRA); }
		public TerminalNode LBRA(int i) {
			return getToken(alkParser.LBRA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRA() { return getTokens(alkParser.RBRA); }
		public TerminalNode RBRA(int i) {
			return getToken(alkParser.RBRA, i);
		}
		public IDChunkContext(Ref_name_chunkContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIDChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_name_chunkContext ref_name_chunk() throws RecognitionException {
		Ref_name_chunkContext _localctx = new Ref_name_chunkContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ref_name_chunk);
		int _la;
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new FunctionChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				function_call();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRA) {
					{
					{
					setState(369);
					match(LBRA);
					setState(370);
					expression();
					setState(371);
					match(RBRA);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IDChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(ID);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRA) {
					{
					{
					setState(379);
					match(LBRA);
					setState(380);
					expression();
					setState(381);
					match(RBRA);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Data_structureContext extends ParserRuleContext {
		public Data_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_structure; }
	 
		public Data_structureContext() { }
		public void copyFrom(Data_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListValueContext extends Data_structureContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureValueContext extends Data_structureContext {
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public StructureValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStructureValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayValueContext extends Data_structureContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetValueContext extends Data_structureContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public SetValueContext(Data_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_structureContext data_structure() throws RecognitionException {
		Data_structureContext _localctx = new Data_structureContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_data_structure);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				array();
				}
				break;
			case 2:
				_localctx = new ListValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				list();
				}
				break;
			case 3:
				_localctx = new SetValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				set();
				}
				break;
			case 4:
				_localctx = new StructureValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				structure();
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

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntervalDefinitionContext extends IntervalContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(alkParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(alkParser.POINT, i);
		}
		public IntervalDefinitionContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitIntervalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interval);
		try {
			_localctx = new IntervalDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			expression();
			setState(397);
			match(POINT);
			setState(398);
			match(POINT);
			setState(399);
			expression();
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

	public static class SpecContext extends ParserRuleContext {
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
	 
		public SpecContext() { }
		public void copyFrom(SpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecDefinitionContext extends SpecContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(alkParser.VBAR, 0); }
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode IN() { return getToken(alkParser.IN, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public SpecDefinitionContext(SpecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSpecDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_spec);
		try {
			_localctx = new SpecDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expression();
			setState(402);
			match(VBAR);
			setState(403);
			match(ID);
			setState(404);
			match(IN);
			setState(405);
			interval();
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayWithSpecContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public ArrayWithSpecContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayWithExpressionsContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public ArrayWithExpressionsContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayWithIntervalContext extends ArrayContext {
		public TerminalNode LBRA() { return getToken(alkParser.LBRA, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(alkParser.RBRA, 0); }
		public ArrayWithIntervalContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitArrayWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ArrayWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(LBRA);
				setState(408);
				spec();
				setState(409);
				match(RBRA);
				}
				break;
			case 2:
				_localctx = new ArrayWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(LBRA);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << INT) | (1L << DOUBLE) | (1L << BOOL) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD) | (1L << LOWER) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (LPAR - 64)) | (1L << (NOT - 64)) | (1L << (LCB - 64)) | (1L << (LBRA - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(412);
					expression();
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(413);
						match(COMMA);
						setState(414);
						expression();
						}
						}
						setState(419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(422);
				match(RBRA);
				}
				break;
			case 3:
				_localctx = new ArrayWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(LBRA);
				setState(424);
				interval();
				setState(425);
				match(RBRA);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyListContext extends ListContext {
		public TerminalNode EMPTYLIST() { return getToken(alkParser.EMPTYLIST, 0); }
		public EmptyListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithIntervalContext extends ListContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ListWithIntervalContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithExpressionsContext extends ListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public ListWithExpressionsContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListWithSpecContext extends ListContext {
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public ListWithSpecContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitListWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new EmptyListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(EMPTYLIST);
				}
				break;
			case 2:
				_localctx = new ListWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(LOWER);
				setState(431);
				spec();
				setState(432);
				match(GREATER);
				}
				break;
			case 3:
				_localctx = new ListWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(LOWER);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << INT) | (1L << DOUBLE) | (1L << BOOL) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD) | (1L << LOWER) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (LPAR - 64)) | (1L << (NOT - 64)) | (1L << (LCB - 64)) | (1L << (LBRA - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(435);
					expression();
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(436);
						match(COMMA);
						setState(437);
						expression();
						}
						}
						setState(442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(445);
				match(GREATER);
				}
				break;
			case 4:
				_localctx = new ListWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(LOWER);
				setState(447);
				interval();
				setState(448);
				match(GREATER);
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

	public static class StructureContext extends ParserRuleContext {
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
	 
		public StructureContext() { }
		public void copyFrom(StructureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructureWithComponentsContext extends StructureContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public StructureWithComponentsContext(StructureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitStructureWithComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structure);
		int _la;
		try {
			_localctx = new StructureWithComponentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(LCB);
			setState(454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(453);
				component();
				}
				}
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(458);
			match(RCB);
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

	public static class ComponentContext extends ParserRuleContext {
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
	 
		public ComponentContext() { }
		public void copyFrom(ComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComponentDefinitionContext extends ComponentContext {
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(alkParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComponentDefinitionContext(ComponentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_component);
		try {
			_localctx = new ComponentDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ID);
			setState(461);
			match(ARROW);
			setState(462);
			expression();
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

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	 
		public SetContext() { }
		public void copyFrom(SetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetWithIntervalContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public SetWithIntervalContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptySetContext extends SetContext {
		public TerminalNode EMPTYSET() { return getToken(alkParser.EMPTYSET, 0); }
		public EmptySetContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitEmptySet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetWithSpecContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public SetWithSpecContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithSpec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetWithExpressionsContext extends SetContext {
		public TerminalNode LCB() { return getToken(alkParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(alkParser.RCB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public SetWithExpressionsContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitSetWithExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_set);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new EmptySetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(EMPTYSET);
				}
				break;
			case 2:
				_localctx = new SetWithSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LCB);
				setState(466);
				spec();
				setState(467);
				match(RCB);
				}
				break;
			case 3:
				_localctx = new SetWithExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(LCB);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << INT) | (1L << DOUBLE) | (1L << BOOL) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD) | (1L << LOWER) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (LPAR - 64)) | (1L << (NOT - 64)) | (1L << (LCB - 64)) | (1L << (LBRA - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(470);
					expression();
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(471);
						match(COMMA);
						setState(472);
						expression();
						}
						}
						setState(477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(480);
				match(RCB);
				}
				break;
			case 4:
				_localctx = new SetWithIntervalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(LCB);
				setState(482);
				interval();
				setState(483);
				match(RCB);
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

	public static class Function_callContext extends ParserRuleContext {
		public Builtin_methodContext builtin_method() {
			return getRuleContext(Builtin_methodContext.class,0);
		}
		public TerminalNode ID() { return getToken(alkParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_call);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case DELETE:
			case END:
			case FIRST:
			case INSERT:
			case PRINT:
			case POPBACK:
			case POPFRONT:
			case PUSHBACK:
			case PUSHFRONT:
			case REMOVE:
			case REMOVEALLEQTO:
			case REMOVEAT:
			case SINGLETONSET:
			case SIZE:
			case TOPBACK:
			case TOPFRONT:
			case UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				builtin_method();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(ID);
				setState(489);
				match(LPAR);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << INT) | (1L << DOUBLE) | (1L << BOOL) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD) | (1L << LOWER) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (LPAR - 64)) | (1L << (NOT - 64)) | (1L << (LCB - 64)) | (1L << (LBRA - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(490);
					expression();
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(491);
						match(COMMA);
						setState(492);
						expression();
						}
						}
						setState(497);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(500);
				match(RPAR);
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

	public static class Builtin_methodContext extends ParserRuleContext {
		public Builtin_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_method; }
	 
		public Builtin_methodContext() { }
		public void copyFrom(Builtin_methodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuiltinMethodContext extends Builtin_methodContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(alkParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(alkParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alkParser.COMMA, i);
		}
		public BuiltinMethodContext(Builtin_methodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitBuiltinMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_methodContext builtin_method() throws RecognitionException {
		Builtin_methodContext _localctx = new Builtin_methodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_builtin_method);
		int _la;
		try {
			_localctx = new BuiltinMethodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			method_name();
			setState(504);
			match(LPAR);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTYSET) | (1L << EMPTYLIST) | (1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE) | (1L << INT) | (1L << DOUBLE) | (1L << BOOL) | (1L << ID) | (1L << PLUSPLUS) | (1L << MINUSMINUS) | (1L << PLUSPLUSMOD) | (1L << MINUSMINUSMOD) | (1L << LOWER) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MUL - 64)) | (1L << (LPAR - 64)) | (1L << (NOT - 64)) | (1L << (LCB - 64)) | (1L << (LBRA - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(505);
				expression();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(506);
					match(COMMA);
					setState(507);
					expression();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(515);
			match(RPAR);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(alkParser.AT, 0); }
		public TerminalNode DELETE() { return getToken(alkParser.DELETE, 0); }
		public TerminalNode END() { return getToken(alkParser.END, 0); }
		public TerminalNode FIRST() { return getToken(alkParser.FIRST, 0); }
		public TerminalNode INSERT() { return getToken(alkParser.INSERT, 0); }
		public TerminalNode PRINT() { return getToken(alkParser.PRINT, 0); }
		public TerminalNode POPBACK() { return getToken(alkParser.POPBACK, 0); }
		public TerminalNode POPFRONT() { return getToken(alkParser.POPFRONT, 0); }
		public TerminalNode PUSHBACK() { return getToken(alkParser.PUSHBACK, 0); }
		public TerminalNode PUSHFRONT() { return getToken(alkParser.PUSHFRONT, 0); }
		public TerminalNode REMOVE() { return getToken(alkParser.REMOVE, 0); }
		public TerminalNode REMOVEALLEQTO() { return getToken(alkParser.REMOVEALLEQTO, 0); }
		public TerminalNode REMOVEAT() { return getToken(alkParser.REMOVEAT, 0); }
		public TerminalNode SINGLETONSET() { return getToken(alkParser.SINGLETONSET, 0); }
		public TerminalNode SIZE() { return getToken(alkParser.SIZE, 0); }
		public TerminalNode TOPFRONT() { return getToken(alkParser.TOPFRONT, 0); }
		public TerminalNode TOPBACK() { return getToken(alkParser.TOPBACK, 0); }
		public TerminalNode UPDATE() { return getToken(alkParser.UPDATE, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alkVisitor ) return ((alkVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_method_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << DELETE) | (1L << END) | (1L << FIRST) | (1L << INSERT) | (1L << PRINT) | (1L << POPBACK) | (1L << POPFRONT) | (1L << PUSHBACK) | (1L << PUSHFRONT) | (1L << REMOVE) | (1L << REMOVEALLEQTO) | (1L << REMOVEAT) | (1L << SINGLETONSET) | (1L << SIZE) | (1L << TOPBACK) | (1L << TOPFRONT) | (1L << UPDATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u020a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\5\2^\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3f\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008a\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00bd\n\13\3\f\3\f\3\f\5\f\u00c2\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c9"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13\17\5\17\u00e0\n\17\3\17"+
		"\3\17\3\17\3\20\5\20\u00e6\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00f0\n\21\3\22\3\22\3\22\7\22\u00f5\n\22\f\22\16\22\u00f8\13\22"+
		"\3\23\3\23\3\23\7\23\u00fd\n\23\f\23\16\23\u0100\13\23\3\24\3\24\3\24"+
		"\7\24\u0105\n\24\f\24\16\24\u0108\13\24\3\25\3\25\3\25\7\25\u010d\n\25"+
		"\f\25\16\25\u0110\13\25\3\26\3\26\3\26\7\26\u0115\n\26\f\26\16\26\u0118"+
		"\13\26\3\27\3\27\3\27\7\27\u011d\n\27\f\27\16\27\u0120\13\27\3\30\3\30"+
		"\3\30\7\30\u0125\n\30\f\30\16\30\u0128\13\30\3\31\3\31\3\31\7\31\u012d"+
		"\n\31\f\31\16\31\u0130\13\31\3\32\3\32\3\32\7\32\u0135\n\32\f\32\16\32"+
		"\u0138\13\32\3\33\3\33\3\33\7\33\u013d\n\33\f\33\16\33\u0140\13\33\3\34"+
		"\3\34\3\34\7\34\u0145\n\34\f\34\16\34\u0148\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u014f\n\35\3\36\3\36\7\36\u0153\n\36\f\36\16\36\u0156\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015f\n\37\3 \3 \5 \u0163\n "+
		"\3!\3!\3!\3!\5!\u0169\n!\3\"\3\"\3\"\7\"\u016e\n\"\f\"\16\"\u0171\13\""+
		"\3#\3#\3#\3#\3#\7#\u0178\n#\f#\16#\u017b\13#\3#\3#\3#\3#\3#\7#\u0182\n"+
		"#\f#\16#\u0185\13#\5#\u0187\n#\3$\3$\3$\3$\5$\u018d\n$\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01a2\n\'\f\'\16"+
		"\'\u01a5\13\'\5\'\u01a7\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ae\n\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\7(\u01b9\n(\f(\16(\u01bc\13(\5(\u01be\n(\3(\3(\3("+
		"\3(\3(\5(\u01c5\n(\3)\3)\6)\u01c9\n)\r)\16)\u01ca\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u01dc\n+\f+\16+\u01df\13+\5+\u01e1\n+\3+"+
		"\3+\3+\3+\3+\5+\u01e8\n+\3,\3,\3,\3,\3,\3,\7,\u01f0\n,\f,\16,\u01f3\13"+
		",\5,\u01f5\n,\3,\5,\u01f8\n,\3-\3-\3-\3-\3-\7-\u01ff\n-\f-\16-\u0202\13"+
		"-\5-\u0204\n-\3-\3-\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\16\4\2**RR\3\2=>\3\29<\3"+
		"\2+-\4\2\24\24NN\3\2GH\4\2\65\66@A\3\2BD\4\2\62\63\678\4\2@BKK\3\2\62"+
		"\63\5\2\25\25\27\27\31(\2\u0228\2]\3\2\2\2\4e\3\2\2\2\6\u0089\3\2\2\2"+
		"\b\u008b\3\2\2\2\n\u008f\3\2\2\2\f\u00a2\3\2\2\2\16\u00a4\3\2\2\2\20\u00a8"+
		"\3\2\2\2\22\u00ae\3\2\2\2\24\u00b5\3\2\2\2\26\u00be\3\2\2\2\30\u00cd\3"+
		"\2\2\2\32\u00cf\3\2\2\2\34\u00d5\3\2\2\2\36\u00e5\3\2\2\2 \u00e9\3\2\2"+
		"\2\"\u00f1\3\2\2\2$\u00f9\3\2\2\2&\u0101\3\2\2\2(\u0109\3\2\2\2*\u0111"+
		"\3\2\2\2,\u0119\3\2\2\2.\u0121\3\2\2\2\60\u0129\3\2\2\2\62\u0131\3\2\2"+
		"\2\64\u0139\3\2\2\2\66\u0141\3\2\2\28\u014e\3\2\2\2:\u0150\3\2\2\2<\u015e"+
		"\3\2\2\2>\u0162\3\2\2\2@\u0168\3\2\2\2B\u016a\3\2\2\2D\u0186\3\2\2\2F"+
		"\u018c\3\2\2\2H\u018e\3\2\2\2J\u0193\3\2\2\2L\u01ad\3\2\2\2N\u01c4\3\2"+
		"\2\2P\u01c6\3\2\2\2R\u01ce\3\2\2\2T\u01e7\3\2\2\2V\u01f7\3\2\2\2X\u01f9"+
		"\3\2\2\2Z\u0207\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7"+
		"\2\2\3`\3\3\2\2\2af\5\6\4\2bc\5\6\4\2cd\5\4\3\2df\3\2\2\2ea\3\2\2\2eb"+
		"\3\2\2\2f\5\3\2\2\2gh\5B\"\2hi\t\2\2\2ij\5V,\2jk\7L\2\2k\u008a\3\2\2\2"+
		"lm\5V,\2mn\7L\2\2n\u008a\3\2\2\2o\u008a\5\34\17\2pq\7\17\2\2qr\5 \21\2"+
		"rs\7L\2\2s\u008a\3\2\2\2tu\5\n\6\2uv\7L\2\2v\u008a\3\2\2\2wx\7\20\2\2"+
		"x\u008a\7L\2\2yz\7\21\2\2z\u008a\7L\2\2{|\5\16\b\2|}\7L\2\2}\u008a\3\2"+
		"\2\2~\177\5\f\7\2\177\u0080\7L\2\2\u0080\u008a\3\2\2\2\u0081\u008a\5\b"+
		"\5\2\u0082\u008a\5\20\t\2\u0083\u0084\5\22\n\2\u0084\u0085\7L\2\2\u0085"+
		"\u008a\3\2\2\2\u0086\u008a\5\24\13\2\u0087\u008a\5\26\f\2\u0088\u008a"+
		"\5\32\16\2\u0089g\3\2\2\2\u0089l\3\2\2\2\u0089o\3\2\2\2\u0089p\3\2\2\2"+
		"\u0089t\3\2\2\2\u0089w\3\2\2\2\u0089y\3\2\2\2\u0089{\3\2\2\2\u0089~\3"+
		"\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2"+
		"\u008b\u008c\7O\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7P\2\2\u008e\t\3\2"+
		"\2\2\u008f\u0090\7\16\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\f\2\2\u0092"+
		"\u0093\5 \21\2\u0093\13\3\2\2\2\u0094\u0095\7\62\2\2\u0095\u00a3\5B\""+
		"\2\u0096\u0097\5B\"\2\u0097\u0098\7\62\2\2\u0098\u00a3\3\2\2\2\u0099\u009a"+
		"\7\63\2\2\u009a\u00a3\5B\"\2\u009b\u009c\5B\"\2\u009c\u009d\7\63\2\2\u009d"+
		"\u00a3\3\2\2\2\u009e\u009f\7\67\2\2\u009f\u00a3\5B\"\2\u00a0\u00a1\78"+
		"\2\2\u00a1\u00a3\5B\"\2\u00a2\u0094\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2"+
		"\u0099\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\5B\"\2\u00a5\u00a6\7?\2\2\u00a6\u00a7"+
		"\5 \21\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7E\2\2\u00aa"+
		"\u00ab\5 \21\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\5\6\4\2\u00ad\21\3\2\2\2"+
		"\u00ae\u00af\7\t\2\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2"+
		"\7E\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7F\2\2\u00b4\23\3\2\2\2\u00b5"+
		"\u00b6\7\6\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7F\2"+
		"\2\u00b9\u00bc\5\6\4\2\u00ba\u00bb\7\7\2\2\u00bb\u00bd\5\6\4\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf"+
		"\u00c1\7E\2\2\u00c0\u00c2\5\30\r\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7L\2\2\u00c4\u00c5\5 \21\2\u00c5"+
		"\u00c8\7L\2\2\u00c6\u00c9\5\16\b\2\u00c7\u00c9\5\f\7\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7F\2\2\u00cb"+
		"\u00cc\5\6\4\2\u00cc\27\3\2\2\2\u00cd\u00ce\5\16\b\2\u00ce\31\3\2\2\2"+
		"\u00cf\u00d0\7\13\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3"+
		"\5 \21\2\u00d3\u00d4\5\6\4\2\u00d4\33\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		"\u00df\7E\2\2\u00d7\u00dc\5\36\20\2\u00d8\u00d9\7Q\2\2\u00d9\u00db\5\36"+
		"\20\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7F\2\2\u00e2"+
		"\u00e3\5\6\4\2\u00e3\35\3\2\2\2\u00e4\u00e6\7\r\2\2\u00e5\u00e4\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8"+
		"\37\3\2\2\2\u00e9\u00ef\5\"\22\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\5 \21"+
		"\2\u00ec\u00ed\7M\2\2\u00ed\u00ee\5 \21\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0!\3\2\2\2\u00f1\u00f6\5$\23\2\u00f2"+
		"\u00f3\7I\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fe\5&\24\2\u00fa\u00fb\7J\2\2\u00fb\u00fd\5&\24\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff%\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0106\5(\25\2\u0102\u0103"+
		"\7\f\2\2\u0103\u0105\5(\25\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\'\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010e\5*\26\2\u010a\u010b\t\3\2\2\u010b\u010d\5*\26\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		")\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0116\5,\27\2\u0112\u0113\t\4\2\2"+
		"\u0113\u0115\5,\27\2\u0114\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117+\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011e\5.\30\2\u011a\u011b\t\5\2\2\u011b\u011d\5.\30\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"-\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\5\60\31\2\u0122\u0123\t\6\2"+
		"\2\u0123\u0125\5\60\31\2\u0124\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127/\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012e\5\62\32\2\u012a\u012b\7\64\2\2\u012b\u012d\5\62\32\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\61\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0136\5\64\33\2\u0132"+
		"\u0133\t\7\2\2\u0133\u0135\5\64\33\2\u0134\u0132\3\2\2\2\u0135\u0138\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\63\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013e\5\66\34\2\u013a\u013b\t\b\2\2\u013b\u013d\5"+
		"\66\34\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\65\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0146\58\35"+
		"\2\u0142\u0143\t\t\2\2\u0143\u0145\58\35\2\u0144\u0142\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\67\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\t\n\2\2\u014a\u014f\58\35\2\u014b\u014c\t\13"+
		"\2\2\u014c\u014f\58\35\2\u014d\u014f\5:\36\2\u014e\u0149\3\2\2\2\u014e"+
		"\u014b\3\2\2\2\u014e\u014d\3\2\2\2\u014f9\3\2\2\2\u0150\u0154\5<\37\2"+
		"\u0151\u0153\t\f\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155;\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u015f\5V,\2\u0158\u015f\5B\"\2\u0159\u015f\5> \2\u015a\u015b\7E\2\2\u015b"+
		"\u015c\5 \21\2\u015c\u015d\7F\2\2\u015d\u015f\3\2\2\2\u015e\u0157\3\2"+
		"\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015f"+
		"=\3\2\2\2\u0160\u0163\5@!\2\u0161\u0163\5F$\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163?\3\2\2\2\u0164\u0169\7.\2\2\u0165\u0169\7/\2\2\u0166"+
		"\u0169\7\60\2\2\u0167\u0169\7W\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169A\3\2\2\2\u016a\u016f"+
		"\5D#\2\u016b\u016c\t\2\2\2\u016c\u016e\5D#\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170C\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0172\u0179\5V,\2\u0173\u0174\7S\2\2\u0174\u0175"+
		"\5 \21\2\u0175\u0176\7T\2\2\u0176\u0178\3\2\2\2\u0177\u0173\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0187\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\u0183\7\61\2\2\u017d\u017e\7S\2\2\u017e"+
		"\u017f\5 \21\2\u017f\u0180\7T\2\2\u0180\u0182\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0172\3\2\2\2\u0186\u017c\3\2"+
		"\2\2\u0187E\3\2\2\2\u0188\u018d\5L\'\2\u0189\u018d\5N(\2\u018a\u018d\5"+
		"T+\2\u018b\u018d\5P)\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018b\3\2\2\2\u018dG\3\2\2\2\u018e\u018f\5 \21\2\u018f"+
		"\u0190\7R\2\2\u0190\u0191\7R\2\2\u0191\u0192\5 \21\2\u0192I\3\2\2\2\u0193"+
		"\u0194\5 \21\2\u0194\u0195\7N\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7\f"+
		"\2\2\u0197\u0198\5H%\2\u0198K\3\2\2\2\u0199\u019a\7S\2\2\u019a\u019b\5"+
		"J&\2\u019b\u019c\7T\2\2\u019c\u01ae\3\2\2\2\u019d\u01a6\7S\2\2\u019e\u01a3"+
		"\5 \21\2\u019f\u01a0\7Q\2\2\u01a0\u01a2\5 \21\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01ae\7T\2\2\u01a9\u01aa\7S\2\2\u01aa\u01ab\5H%\2"+
		"\u01ab\u01ac\7T\2\2\u01ac\u01ae\3\2\2\2\u01ad\u0199\3\2\2\2\u01ad\u019d"+
		"\3\2\2\2\u01ad\u01a9\3\2\2\2\u01aeM\3\2\2\2\u01af\u01c5\7\23\2\2\u01b0"+
		"\u01b1\79\2\2\u01b1\u01b2\5J&\2\u01b2\u01b3\7:\2\2\u01b3\u01c5\3\2\2\2"+
		"\u01b4\u01bd\79\2\2\u01b5\u01ba\5 \21\2\u01b6\u01b7\7Q\2\2\u01b7\u01b9"+
		"\5 \21\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01b5\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c5\7:\2\2\u01c0"+
		"\u01c1\79\2\2\u01c1\u01c2\5H%\2\u01c2\u01c3\7:\2\2\u01c3\u01c5\3\2\2\2"+
		"\u01c4\u01af\3\2\2\2\u01c4\u01b0\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01c0"+
		"\3\2\2\2\u01c5O\3\2\2\2\u01c6\u01c8\7O\2\2\u01c7\u01c9\5R*\2\u01c8\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\7P\2\2\u01cdQ\3\2\2\2\u01ce\u01cf\7\61\2\2"+
		"\u01cf\u01d0\7*\2\2\u01d0\u01d1\5 \21\2\u01d1S\3\2\2\2\u01d2\u01e8\7\22"+
		"\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d5\5J&\2\u01d5\u01d6\7P\2\2\u01d6\u01e8"+
		"\3\2\2\2\u01d7\u01e0\7O\2\2\u01d8\u01dd\5 \21\2\u01d9\u01da\7Q\2\2\u01da"+
		"\u01dc\5 \21\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01d8\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e8\7P"+
		"\2\2\u01e3\u01e4\7O\2\2\u01e4\u01e5\5H%\2\u01e5\u01e6\7P\2\2\u01e6\u01e8"+
		"\3\2\2\2\u01e7\u01d2\3\2\2\2\u01e7\u01d3\3\2\2\2\u01e7\u01d7\3\2\2\2\u01e7"+
		"\u01e3\3\2\2\2\u01e8U\3\2\2\2\u01e9\u01f8\5X-\2\u01ea\u01eb\7\61\2\2\u01eb"+
		"\u01f4\7E\2\2\u01ec\u01f1\5 \21\2\u01ed\u01ee\7Q\2\2\u01ee\u01f0\5 \21"+
		"\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\7F\2\2\u01f7\u01e9\3\2"+
		"\2\2\u01f7\u01ea\3\2\2\2\u01f8W\3\2\2\2\u01f9\u01fa\5Z.\2\u01fa\u0203"+
		"\7E\2\2\u01fb\u0200\5 \21\2\u01fc\u01fd\7Q\2\2\u01fd\u01ff\5 \21\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u01fb\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7F\2\2\u0206Y\3\2\2\2\u0207"+
		"\u0208\t\r\2\2\u0208[\3\2\2\2\61]e\u0089\u00a2\u00bc\u00c1\u00c8\u00dc"+
		"\u00df\u00e5\u00ef\u00f6\u00fe\u0106\u010e\u0116\u011e\u0126\u012e\u0136"+
		"\u013e\u0146\u014e\u0154\u015e\u0162\u0168\u016f\u0179\u0183\u0186\u018c"+
		"\u01a3\u01a6\u01ad\u01ba\u01bd\u01c4\u01ca\u01dd\u01e0\u01e7\u01f1\u01f4"+
		"\u01f7\u0200\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}