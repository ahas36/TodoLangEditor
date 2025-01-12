// Generated from d:\Projects\SNA\V2\Frontend\TodoLangEditor\TodoLangGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TodoLangGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POW=1, MUL=2, DIV=3, ADD=4, SUB=5, NUMBER=6, ID=7, WHITESPACE=8, LPAREN=9, 
		COMMA=10, RPAREN=11;
	public static final int
		RULE_todoExpressions = 0, RULE_expression = 1, RULE_variable = 2, RULE_function = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"todoExpressions", "expression", "variable", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'*'", "'/'", "'+'", "'-'", null, null, null, "'('", "','", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POW", "MUL", "DIV", "ADD", "SUB", "NUMBER", "ID", "WHITESPACE", 
			"LPAREN", "COMMA", "RPAREN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TodoLangGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TodoLangGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TodoExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TodoExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todoExpressions; }
	}

	public final TodoExpressionsContext todoExpressions() throws RecognitionException {
		TodoExpressionsContext _localctx = new TodoExpressionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_todoExpressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expression(0);
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
	public static class VariablesContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionOrSubtractionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TodoLangGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TodoLangGrammarParser.SUB, 0); }
		public AdditionOrSubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationOrDivisionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TodoLangGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TodoLangGrammarParser.DIV, 0); }
		public MultiplicationOrDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesesContext extends ExpressionContext {
		public ExpressionContext inner;
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PowerContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(TodoLangGrammarParser.POW, 0); }
		public PowerContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				{
				_localctx = new VariablesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				variable();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(LPAREN);
				setState(13);
				((ParenthesesContext)_localctx).inner = expression(0);
				setState(14);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(18);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(19);
						((PowerContext)_localctx).operator = match(POW);
						setState(20);
						((PowerContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationOrDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationOrDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(21);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(22);
						((MultiplicationOrDivisionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MultiplicationOrDivisionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(23);
						((MultiplicationOrDivisionContext)_localctx).right = expression(3);
						}
						break;
					case 3:
						{
						_localctx = new AdditionOrSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionOrSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(24);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(25);
						((AdditionOrSubtractionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditionOrSubtractionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(26);
						((AdditionOrSubtractionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TodoLangGrammarParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TodoLangGrammarParser.ID, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				function();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TodoLangGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(TodoLangGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TodoLangGrammarParser.RPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TodoLangGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TodoLangGrammarParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
			setState(38);
			match(LPAREN);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==ID) {
				{
				setState(39);
				variable();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(40);
					match(COMMA);
					setState(41);
					variable();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(49);
			match(RPAREN);
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4\5"+
		"\4&\n\4\3\5\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\5\5\62\n\5\3\5\3"+
		"\5\3\5\2\3\4\6\2\4\6\b\2\4\3\2\4\5\3\2\6\7\29\2\n\3\2\2\2\4\22\3\2\2\2"+
		"\6%\3\2\2\2\b\'\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\b\3\1\2\r\23\5\6"+
		"\4\2\16\17\7\13\2\2\17\20\5\4\3\2\20\21\7\r\2\2\21\23\3\2\2\2\22\f\3\2"+
		"\2\2\22\16\3\2\2\2\23\37\3\2\2\2\24\25\f\5\2\2\25\26\7\3\2\2\26\36\5\4"+
		"\3\6\27\30\f\4\2\2\30\31\t\2\2\2\31\36\5\4\3\5\32\33\f\3\2\2\33\34\t\3"+
		"\2\2\34\36\5\4\3\4\35\24\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36!\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"&\7\b\2\2#&\7\t\2"+
		"\2$&\5\b\5\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\'(\7\t\2\2(\61"+
		"\7\13\2\2).\5\6\4\2*+\7\f\2\2+-\5\6\4\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61)\3\2\2\2\61\62\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\7\r\2\2\64\t\3\2\2\2\b\22\35\37%.\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}