// Generated from d:\Projects\SNA\V2\Frontend\TodoLangEditor\ExpressionGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POW=1, MUL=2, DIV=3, ADD=4, SUB=5, NUMBER=6, ID=7, WHITESPACE=8, LPAREN=9, 
		COMMA=10, RPAREN=11;
	public static final int
		RULE_expression = 0, RULE_exp = 1, RULE_variable = 2, RULE_function = 3, 
		RULE_functionName = 4, RULE_parameter = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "exp", "variable", "function", "functionName", "parameter"
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
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressionGrammarParser.EOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			exp(0);
			setState(13);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablesContext extends ExpContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionOrSubtractionContext extends ExpContext {
		public ExpContext left;
		public Token operator;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExpressionGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExpressionGrammarParser.SUB, 0); }
		public AdditionOrSubtractionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationOrDivisionContext extends ExpContext {
		public ExpContext left;
		public Token operator;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExpressionGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExpressionGrammarParser.DIV, 0); }
		public MultiplicationOrDivisionContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesesContext extends ExpContext {
		public ExpContext inner;
		public TerminalNode LPAREN() { return getToken(ExpressionGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExpressionGrammarParser.RPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenthesesContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class PowerContext extends ExpContext {
		public ExpContext left;
		public Token operator;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(ExpressionGrammarParser.POW, 0); }
		public PowerContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				{
				_localctx = new VariablesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16);
				variable();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(LPAREN);
				setState(18);
				((ParenthesesContext)_localctx).inner = exp(0);
				setState(19);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(23);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(24);
						((PowerContext)_localctx).operator = match(POW);
						setState(25);
						((PowerContext)_localctx).right = exp(4);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationOrDivisionContext(new ExpContext(_parentctx, _parentState));
						((MultiplicationOrDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
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
						setState(28);
						((MultiplicationOrDivisionContext)_localctx).right = exp(3);
						}
						break;
					case 3:
						{
						_localctx = new AdditionOrSubtractionContext(new ExpContext(_parentctx, _parentState));
						((AdditionOrSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(29);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(30);
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
						setState(31);
						((AdditionOrSubtractionContext)_localctx).right = exp(2);
						}
						break;
					}
					} 
				}
				setState(36);
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
		public TerminalNode NUMBER() { return getToken(ExpressionGrammarParser.NUMBER, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
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
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ExpressionGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExpressionGrammarParser.RPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpressionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionGrammarParser.COMMA, i);
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
			setState(42);
			functionName();
			setState(43);
			match(LPAREN);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==ID) {
				{
				setState(44);
				variable();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(45);
					match(COMMA);
					setState(46);
					variable();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(54);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5\65\13"+
		"\5\5\5\67\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\3\4\b\2\4\6\b\n\f\2\4\3\2"+
		"\4\5\3\2\6\7\2@\2\16\3\2\2\2\4\27\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n:\3\2"+
		"\2\2\f<\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\b\3\1\2"+
		"\22\30\5\6\4\2\23\24\7\13\2\2\24\25\5\4\3\2\25\26\7\r\2\2\26\30\3\2\2"+
		"\2\27\21\3\2\2\2\27\23\3\2\2\2\30$\3\2\2\2\31\32\f\5\2\2\32\33\7\3\2\2"+
		"\33#\5\4\3\6\34\35\f\4\2\2\35\36\t\2\2\2\36#\5\4\3\5\37 \f\3\2\2 !\t\3"+
		"\2\2!#\5\4\3\4\"\31\3\2\2\2\"\34\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'+\7\b\2\2(+\5\f\7\2)+\5\b\5\2*\'"+
		"\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\7\3\2\2\2,-\5\n\6\2-\66\7\13\2\2.\63\5\6"+
		"\4\2/\60\7\f\2\2\60\62\5\6\4\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\66.\3\2\2\2\66\67\3\2\2\2\67"+
		"8\3\2\2\289\7\r\2\29\t\3\2\2\2:;\7\t\2\2;\13\3\2\2\2<=\7\t\2\2=\r\3\2"+
		"\2\2\b\27\"$*\63\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}