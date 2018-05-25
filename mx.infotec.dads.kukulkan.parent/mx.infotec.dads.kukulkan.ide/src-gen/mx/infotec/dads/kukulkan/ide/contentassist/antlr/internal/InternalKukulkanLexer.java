package mx.infotec.dads.kukulkan.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKukulkanLexer extends Lexer {
    public static final int RULE_ANY_BLOB=15;
    public static final int RULE_ENTITY_KEYWORD=22;
    public static final int RULE_LPAREN=23;
    public static final int RULE_MANY_TO_ONE=19;
    public static final int RULE_BLOB=14;
    public static final int RULE_ID=34;
    public static final int RULE_COMMA=27;
    public static final int RULE_LOCAL_DATE=11;
    public static final int RULE_BOOLEAN_TYPE=35;
    public static final int RULE_ONE_TO_ONE=20;
    public static final int RULE_ONE_TO_MANY=18;
    public static final int RULE_ZONED_DATETIME=12;
    public static final int RULE_INT=32;
    public static final int RULE_ML_COMMENT=45;
    public static final int RULE_MAX=33;
    public static final int RULE_SEMICOLON=28;
    public static final int RULE_COLONCOLON=43;
    public static final int RULE_REQUIRED=5;
    public static final int RULE_TEXT_BLOB=17;
    public static final int RULE_STRING=44;
    public static final int RULE_AT=42;
    public static final int RULE_SL_COMMENT=46;
    public static final int RULE_DOUBLE=10;
    public static final int RULE_MIN=31;
    public static final int RULE_ELLIPSIS=41;
    public static final int RULE_DOT=40;
    public static final int EOF=-1;
    public static final int RULE_BIG_DECIMAL=8;
    public static final int RULE_STRING_KEYWORD=4;
    public static final int RULE_INSTANT=13;
    public static final int RULE_RBRACK=38;
    public static final int RULE_LBRACE=25;
    public static final int RULE_PATTERN=29;
    public static final int RULE_WS=47;
    public static final int RULE_ANY_OTHER=48;
    public static final int RULE_RBRACE=26;
    public static final int RULE_NULL_LITERAL=36;
    public static final int RULE_RPAREN=24;
    public static final int RULE_IMAGE_BLOB=16;
    public static final int RULE_MANY_TO_MANY=21;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SEMI=39;
    public static final int RULE_LONG=7;
    public static final int RULE_INTEGER=6;
    public static final int RULE_LBRACK=37;
    public static final int RULE_PATTERN_VALUE=30;

    // delegates
    // delegators

    public InternalKukulkanLexer() {;} 
    public InternalKukulkanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKukulkanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKukulkan.g"; }

    // $ANTLR start "RULE_ENTITY_KEYWORD"
    public final void mRULE_ENTITY_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ENTITY_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2651:21: ( 'entity' )
            // InternalKukulkan.g:2651:23: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTITY_KEYWORD"

    // $ANTLR start "RULE_STRING_KEYWORD"
    public final void mRULE_STRING_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_STRING_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2653:21: ( 'String' )
            // InternalKukulkan.g:2653:23: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_KEYWORD"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2655:14: ( 'Integer' )
            // InternalKukulkan.g:2655:16: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2657:11: ( 'Long' )
            // InternalKukulkan.g:2657:13: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_BIG_DECIMAL"
    public final void mRULE_BIG_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_BIG_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2659:18: ( 'BigDecimal' )
            // InternalKukulkan.g:2659:20: 'BigDecimal'
            {
            match("BigDecimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIG_DECIMAL"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2661:12: ( 'Float' )
            // InternalKukulkan.g:2661:14: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2663:13: ( 'Double' )
            // InternalKukulkan.g:2663:15: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN_TYPE"
    public final void mRULE_BOOLEAN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2665:19: ( 'Boolean' )
            // InternalKukulkan.g:2665:21: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_TYPE"

    // $ANTLR start "RULE_LOCAL_DATE"
    public final void mRULE_LOCAL_DATE() throws RecognitionException {
        try {
            int _type = RULE_LOCAL_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2667:17: ( 'LocalDate' )
            // InternalKukulkan.g:2667:19: 'LocalDate'
            {
            match("LocalDate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOCAL_DATE"

    // $ANTLR start "RULE_ZONED_DATETIME"
    public final void mRULE_ZONED_DATETIME() throws RecognitionException {
        try {
            int _type = RULE_ZONED_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2669:21: ( 'ZonedDateTime' )
            // InternalKukulkan.g:2669:23: 'ZonedDateTime'
            {
            match("ZonedDateTime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZONED_DATETIME"

    // $ANTLR start "RULE_INSTANT"
    public final void mRULE_INSTANT() throws RecognitionException {
        try {
            int _type = RULE_INSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2671:14: ( 'Instant' )
            // InternalKukulkan.g:2671:16: 'Instant'
            {
            match("Instant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANT"

    // $ANTLR start "RULE_BLOB"
    public final void mRULE_BLOB() throws RecognitionException {
        try {
            int _type = RULE_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2673:11: ( 'Blob' )
            // InternalKukulkan.g:2673:13: 'Blob'
            {
            match("Blob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOB"

    // $ANTLR start "RULE_ANY_BLOB"
    public final void mRULE_ANY_BLOB() throws RecognitionException {
        try {
            int _type = RULE_ANY_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2675:15: ( 'AnyBlob' )
            // InternalKukulkan.g:2675:17: 'AnyBlob'
            {
            match("AnyBlob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_BLOB"

    // $ANTLR start "RULE_IMAGE_BLOB"
    public final void mRULE_IMAGE_BLOB() throws RecognitionException {
        try {
            int _type = RULE_IMAGE_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2677:17: ( 'ImageBlob' )
            // InternalKukulkan.g:2677:19: 'ImageBlob'
            {
            match("ImageBlob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMAGE_BLOB"

    // $ANTLR start "RULE_TEXT_BLOB"
    public final void mRULE_TEXT_BLOB() throws RecognitionException {
        try {
            int _type = RULE_TEXT_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2679:16: ( 'TextBlob' )
            // InternalKukulkan.g:2679:18: 'TextBlob'
            {
            match("TextBlob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_BLOB"

    // $ANTLR start "RULE_ONE_TO_MANY"
    public final void mRULE_ONE_TO_MANY() throws RecognitionException {
        try {
            int _type = RULE_ONE_TO_MANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2681:18: ( 'OneToMany' )
            // InternalKukulkan.g:2681:20: 'OneToMany'
            {
            match("OneToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_TO_MANY"

    // $ANTLR start "RULE_MANY_TO_ONE"
    public final void mRULE_MANY_TO_ONE() throws RecognitionException {
        try {
            int _type = RULE_MANY_TO_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2683:18: ( 'ManyToOne' )
            // InternalKukulkan.g:2683:20: 'ManyToOne'
            {
            match("ManyToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MANY_TO_ONE"

    // $ANTLR start "RULE_ONE_TO_ONE"
    public final void mRULE_ONE_TO_ONE() throws RecognitionException {
        try {
            int _type = RULE_ONE_TO_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2685:17: ( 'OneToOne' )
            // InternalKukulkan.g:2685:19: 'OneToOne'
            {
            match("OneToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ONE_TO_ONE"

    // $ANTLR start "RULE_MANY_TO_MANY"
    public final void mRULE_MANY_TO_MANY() throws RecognitionException {
        try {
            int _type = RULE_MANY_TO_MANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2687:19: ( 'ManyToMany' )
            // InternalKukulkan.g:2687:21: 'ManyToMany'
            {
            match("ManyToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MANY_TO_MANY"

    // $ANTLR start "RULE_PATTERN_VALUE"
    public final void mRULE_PATTERN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_PATTERN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2689:20: ( '\"' ( . )* '\"' )
            // InternalKukulkan.g:2689:22: '\"' ( . )* '\"'
            {
            match('\"'); 
            // InternalKukulkan.g:2689:26: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKukulkan.g:2689:26: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN_VALUE"

    // $ANTLR start "RULE_MIN"
    public final void mRULE_MIN() throws RecognitionException {
        try {
            int _type = RULE_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2691:10: ( 'min' )
            // InternalKukulkan.g:2691:12: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN"

    // $ANTLR start "RULE_MAX"
    public final void mRULE_MAX() throws RecognitionException {
        try {
            int _type = RULE_MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2693:10: ( 'max' )
            // InternalKukulkan.g:2693:12: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAX"

    // $ANTLR start "RULE_NULL_LITERAL"
    public final void mRULE_NULL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_NULL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2695:19: ( 'null' )
            // InternalKukulkan.g:2695:21: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL_LITERAL"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2697:13: ( '(' )
            // InternalKukulkan.g:2697:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2699:13: ( ')' )
            // InternalKukulkan.g:2699:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2701:13: ( '{' )
            // InternalKukulkan.g:2701:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2703:13: ( '}' )
            // InternalKukulkan.g:2703:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACK"
    public final void mRULE_LBRACK() throws RecognitionException {
        try {
            int _type = RULE_LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2705:13: ( '[' )
            // InternalKukulkan.g:2705:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACK"

    // $ANTLR start "RULE_RBRACK"
    public final void mRULE_RBRACK() throws RecognitionException {
        try {
            int _type = RULE_RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2707:13: ( ']' )
            // InternalKukulkan.g:2707:15: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACK"

    // $ANTLR start "RULE_SEMI"
    public final void mRULE_SEMI() throws RecognitionException {
        try {
            int _type = RULE_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2709:11: ( ';' )
            // InternalKukulkan.g:2709:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2711:12: ( ',' )
            // InternalKukulkan.g:2711:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2713:10: ( '.' )
            // InternalKukulkan.g:2713:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2715:15: ( '...' )
            // InternalKukulkan.g:2715:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2717:9: ( '@' )
            // InternalKukulkan.g:2717:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_COLONCOLON"
    public final void mRULE_COLONCOLON() throws RecognitionException {
        try {
            int _type = RULE_COLONCOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2719:17: ( '::' )
            // InternalKukulkan.g:2719:19: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLONCOLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2721:16: ( ':' )
            // InternalKukulkan.g:2721:18: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_REQUIRED"
    public final void mRULE_REQUIRED() throws RecognitionException {
        try {
            int _type = RULE_REQUIRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2723:15: ( 'required' )
            // InternalKukulkan.g:2723:17: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REQUIRED"

    // $ANTLR start "RULE_PATTERN"
    public final void mRULE_PATTERN() throws RecognitionException {
        try {
            int _type = RULE_PATTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2725:14: ( 'pattern' )
            // InternalKukulkan.g:2725:16: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2727:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKukulkan.g:2727:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKukulkan.g:2727:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKukulkan.g:2727:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKukulkan.g:2727:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKukulkan.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2729:10: ( ( '0' .. '9' )+ )
            // InternalKukulkan.g:2729:12: ( '0' .. '9' )+
            {
            // InternalKukulkan.g:2729:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKukulkan.g:2729:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2731:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKukulkan.g:2731:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKukulkan.g:2731:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKukulkan.g:2731:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKukulkan.g:2731:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKukulkan.g:2731:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKukulkan.g:2731:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:2731:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKukulkan.g:2731:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKukulkan.g:2731:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKukulkan.g:2731:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2733:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKukulkan.g:2733:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKukulkan.g:2733:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKukulkan.g:2733:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2735:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKukulkan.g:2735:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKukulkan.g:2735:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKukulkan.g:2735:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalKukulkan.g:2735:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKukulkan.g:2735:41: ( '\\r' )? '\\n'
                    {
                    // InternalKukulkan.g:2735:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKukulkan.g:2735:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2737:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKukulkan.g:2737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKukulkan.g:2737:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKukulkan.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKukulkan.g:2739:16: ( . )
            // InternalKukulkan.g:2739:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKukulkan.g:1:8: ( RULE_ENTITY_KEYWORD | RULE_STRING_KEYWORD | RULE_INTEGER | RULE_LONG | RULE_BIG_DECIMAL | RULE_FLOAT | RULE_DOUBLE | RULE_BOOLEAN_TYPE | RULE_LOCAL_DATE | RULE_ZONED_DATETIME | RULE_INSTANT | RULE_BLOB | RULE_ANY_BLOB | RULE_IMAGE_BLOB | RULE_TEXT_BLOB | RULE_ONE_TO_MANY | RULE_MANY_TO_ONE | RULE_ONE_TO_ONE | RULE_MANY_TO_MANY | RULE_PATTERN_VALUE | RULE_MIN | RULE_MAX | RULE_NULL_LITERAL | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACK | RULE_RBRACK | RULE_SEMI | RULE_COMMA | RULE_DOT | RULE_ELLIPSIS | RULE_AT | RULE_COLONCOLON | RULE_SEMICOLON | RULE_REQUIRED | RULE_PATTERN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=45;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalKukulkan.g:1:10: RULE_ENTITY_KEYWORD
                {
                mRULE_ENTITY_KEYWORD(); 

                }
                break;
            case 2 :
                // InternalKukulkan.g:1:30: RULE_STRING_KEYWORD
                {
                mRULE_STRING_KEYWORD(); 

                }
                break;
            case 3 :
                // InternalKukulkan.g:1:50: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 4 :
                // InternalKukulkan.g:1:63: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 5 :
                // InternalKukulkan.g:1:73: RULE_BIG_DECIMAL
                {
                mRULE_BIG_DECIMAL(); 

                }
                break;
            case 6 :
                // InternalKukulkan.g:1:90: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 7 :
                // InternalKukulkan.g:1:101: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 8 :
                // InternalKukulkan.g:1:113: RULE_BOOLEAN_TYPE
                {
                mRULE_BOOLEAN_TYPE(); 

                }
                break;
            case 9 :
                // InternalKukulkan.g:1:131: RULE_LOCAL_DATE
                {
                mRULE_LOCAL_DATE(); 

                }
                break;
            case 10 :
                // InternalKukulkan.g:1:147: RULE_ZONED_DATETIME
                {
                mRULE_ZONED_DATETIME(); 

                }
                break;
            case 11 :
                // InternalKukulkan.g:1:167: RULE_INSTANT
                {
                mRULE_INSTANT(); 

                }
                break;
            case 12 :
                // InternalKukulkan.g:1:180: RULE_BLOB
                {
                mRULE_BLOB(); 

                }
                break;
            case 13 :
                // InternalKukulkan.g:1:190: RULE_ANY_BLOB
                {
                mRULE_ANY_BLOB(); 

                }
                break;
            case 14 :
                // InternalKukulkan.g:1:204: RULE_IMAGE_BLOB
                {
                mRULE_IMAGE_BLOB(); 

                }
                break;
            case 15 :
                // InternalKukulkan.g:1:220: RULE_TEXT_BLOB
                {
                mRULE_TEXT_BLOB(); 

                }
                break;
            case 16 :
                // InternalKukulkan.g:1:235: RULE_ONE_TO_MANY
                {
                mRULE_ONE_TO_MANY(); 

                }
                break;
            case 17 :
                // InternalKukulkan.g:1:252: RULE_MANY_TO_ONE
                {
                mRULE_MANY_TO_ONE(); 

                }
                break;
            case 18 :
                // InternalKukulkan.g:1:269: RULE_ONE_TO_ONE
                {
                mRULE_ONE_TO_ONE(); 

                }
                break;
            case 19 :
                // InternalKukulkan.g:1:285: RULE_MANY_TO_MANY
                {
                mRULE_MANY_TO_MANY(); 

                }
                break;
            case 20 :
                // InternalKukulkan.g:1:303: RULE_PATTERN_VALUE
                {
                mRULE_PATTERN_VALUE(); 

                }
                break;
            case 21 :
                // InternalKukulkan.g:1:322: RULE_MIN
                {
                mRULE_MIN(); 

                }
                break;
            case 22 :
                // InternalKukulkan.g:1:331: RULE_MAX
                {
                mRULE_MAX(); 

                }
                break;
            case 23 :
                // InternalKukulkan.g:1:340: RULE_NULL_LITERAL
                {
                mRULE_NULL_LITERAL(); 

                }
                break;
            case 24 :
                // InternalKukulkan.g:1:358: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 25 :
                // InternalKukulkan.g:1:370: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 26 :
                // InternalKukulkan.g:1:382: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 27 :
                // InternalKukulkan.g:1:394: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 28 :
                // InternalKukulkan.g:1:406: RULE_LBRACK
                {
                mRULE_LBRACK(); 

                }
                break;
            case 29 :
                // InternalKukulkan.g:1:418: RULE_RBRACK
                {
                mRULE_RBRACK(); 

                }
                break;
            case 30 :
                // InternalKukulkan.g:1:430: RULE_SEMI
                {
                mRULE_SEMI(); 

                }
                break;
            case 31 :
                // InternalKukulkan.g:1:440: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 32 :
                // InternalKukulkan.g:1:451: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 33 :
                // InternalKukulkan.g:1:460: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 34 :
                // InternalKukulkan.g:1:474: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 35 :
                // InternalKukulkan.g:1:482: RULE_COLONCOLON
                {
                mRULE_COLONCOLON(); 

                }
                break;
            case 36 :
                // InternalKukulkan.g:1:498: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 37 :
                // InternalKukulkan.g:1:513: RULE_REQUIRED
                {
                mRULE_REQUIRED(); 

                }
                break;
            case 38 :
                // InternalKukulkan.g:1:527: RULE_PATTERN
                {
                mRULE_PATTERN(); 

                }
                break;
            case 39 :
                // InternalKukulkan.g:1:540: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // InternalKukulkan.g:1:548: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalKukulkan.g:1:557: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalKukulkan.g:1:569: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalKukulkan.g:1:585: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalKukulkan.g:1:601: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // InternalKukulkan.g:1:609: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\14\45\1\43\2\45\10\uffff\1\103\1\uffff\1\106\2\45\1\43\2\uffff\2\43\2\uffff\1\45\1\uffff\16\45\3\uffff\3\45\15\uffff\2\45\5\uffff\21\45\1\141\2\uffff\1\170\1\171\10\45\1\u0082\3\45\1\u0086\7\45\2\uffff\1\u008e\7\45\1\uffff\3\45\1\uffff\1\u0099\6\45\1\uffff\2\45\1\u00a3\1\u00a4\6\45\1\uffff\1\u00ab\10\45\2\uffff\1\u00b5\1\u00b6\3\45\1\u00ba\1\uffff\1\45\1\u00bc\6\45\1\u00c3\2\uffff\3\45\1\uffff\1\45\1\uffff\1\u00c8\1\45\1\u00ca\2\45\1\u00cd\1\uffff\1\u00ce\1\u00cf\2\45\1\uffff\1\u00d2\1\uffff\1\u00d3\1\45\3\uffff\1\u00d5\1\45\2\uffff\1\u00d7\1\uffff\1\45\1\uffff\1\45\1\u00da\1\uffff";
    static final String DFA13_eofS =
        "\u00db\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\1\164\1\155\1\157\1\151\1\154\2\157\1\156\1\145\1\156\1\141\1\0\1\141\1\165\10\uffff\1\56\1\uffff\1\72\1\145\1\141\1\101\2\uffff\1\0\1\52\2\uffff\1\164\1\uffff\1\162\1\163\1\141\1\143\1\147\3\157\1\165\1\156\1\171\1\170\1\145\1\156\2\0\1\uffff\1\156\1\170\1\154\15\uffff\1\161\1\164\5\uffff\2\151\1\145\1\164\2\147\1\141\1\104\1\154\1\142\1\141\1\142\1\145\1\102\1\164\1\124\1\171\2\0\1\uffff\2\60\1\154\1\165\2\164\1\156\1\147\1\141\1\145\1\60\1\154\2\145\1\60\1\164\1\154\1\144\1\154\1\102\1\157\1\124\2\uffff\1\60\1\151\1\145\1\171\1\147\1\145\1\156\1\102\1\uffff\1\104\1\143\1\141\1\uffff\1\60\1\145\1\104\1\157\1\154\1\115\1\157\1\uffff\2\162\2\60\1\162\1\164\1\154\1\141\1\151\1\156\1\uffff\1\60\1\141\1\142\1\157\1\141\1\156\1\115\1\145\1\156\2\uffff\2\60\1\157\1\164\1\155\1\60\1\uffff\1\164\1\60\1\142\1\156\1\145\1\156\1\141\1\144\1\60\2\uffff\1\142\1\145\1\141\1\uffff\1\145\1\uffff\1\60\1\171\1\60\1\145\1\156\1\60\1\uffff\2\60\1\154\1\124\1\uffff\1\60\1\uffff\1\60\1\171\3\uffff\1\60\1\151\2\uffff\1\60\1\uffff\1\155\1\uffff\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\156\1\164\1\156\2\157\1\154\2\157\1\156\1\145\1\156\1\141\1\uffff\1\151\1\165\10\uffff\1\56\1\uffff\1\72\1\145\1\141\1\172\2\uffff\1\uffff\1\57\2\uffff\1\164\1\uffff\1\162\1\164\1\141\1\156\1\147\3\157\1\165\1\156\1\171\1\170\1\145\1\156\2\uffff\1\uffff\1\156\1\170\1\154\15\uffff\1\161\1\164\5\uffff\2\151\1\145\1\164\2\147\1\141\1\104\1\154\1\142\1\141\1\142\1\145\1\102\1\164\1\124\1\171\2\uffff\1\uffff\2\172\1\154\1\165\2\164\1\156\1\147\1\141\1\145\1\172\1\154\2\145\1\172\1\164\1\154\1\144\1\154\1\102\1\157\1\124\2\uffff\1\172\1\151\1\145\1\171\1\147\1\145\1\156\1\102\1\uffff\1\104\1\143\1\141\1\uffff\1\172\1\145\1\104\1\157\1\154\1\117\1\157\1\uffff\2\162\2\172\1\162\1\164\1\154\1\141\1\151\1\156\1\uffff\1\172\1\141\1\142\1\157\1\141\1\156\1\117\1\145\1\156\2\uffff\2\172\1\157\1\164\1\155\1\172\1\uffff\1\164\1\172\1\142\1\156\1\145\1\156\1\141\1\144\1\172\2\uffff\1\142\1\145\1\141\1\uffff\1\145\1\uffff\1\172\1\171\1\172\1\145\1\156\1\172\1\uffff\2\172\1\154\1\124\1\uffff\1\172\1\uffff\1\172\1\171\3\uffff\1\172\1\151\2\uffff\1\172\1\uffff\1\155\1\uffff\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\20\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff\1\42\4\uffff\1\47\1\50\2\uffff\1\54\1\55\1\uffff\1\47\20\uffff\1\24\3\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\40\1\42\1\43\1\44\2\uffff\1\50\1\51\1\52\1\53\1\54\23\uffff\1\24\26\uffff\1\25\1\26\10\uffff\1\4\3\uffff\1\14\7\uffff\1\27\12\uffff\1\6\11\uffff\1\1\1\2\6\uffff\1\7\11\uffff\1\3\1\13\3\uffff\1\10\1\uffff\1\15\6\uffff\1\46\4\uffff\1\17\1\uffff\1\22\2\uffff\1\45\1\16\1\11\2\uffff\1\20\1\21\1\uffff\1\5\1\uffff\1\23\2\uffff\1\12";
    static final String DFA13_specialS =
        "\1\4\14\uffff\1\1\22\uffff\1\6\23\uffff\1\0\1\3\51\uffff\1\5\1\2\172\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\15\4\43\1\40\1\20\1\21\2\43\1\27\1\43\1\30\1\41\12\37\1\32\1\26\4\43\1\31\1\11\1\5\1\36\1\7\1\36\1\6\2\36\1\3\2\36\1\4\1\14\1\36\1\13\3\36\1\2\1\12\5\36\1\10\1\24\1\43\1\25\1\35\1\36\1\43\4\36\1\1\7\36\1\16\1\17\1\36\1\34\1\36\1\33\10\36\1\22\1\43\1\23\uff82\43",
            "\1\44",
            "\1\46",
            "\1\50\1\47",
            "\1\51",
            "\1\52\2\uffff\1\54\2\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\42\65\1\66\71\65\1\64\uffa3\65",
            "\1\70\7\uffff\1\67",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "",
            "\1\105",
            "\1\107",
            "\1\110",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\112",
            "\1\113\4\uffff\1\114",
            "",
            "",
            "\1\116",
            "",
            "\1\117",
            "\1\121\1\120",
            "\1\122",
            "\1\124\12\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\42\140\1\137\uffdd\140",
            "\42\65\1\66\71\65\1\64\uffa3\65",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\42\65\1\66\71\65\1\64\uffa3\65",
            "\42\65\1\66\71\65\1\64\uffa3\65",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\1\uffff\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\1\uffff\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00bb",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00cb",
            "\1\u00cc",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d4",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d6",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ENTITY_KEYWORD | RULE_STRING_KEYWORD | RULE_INTEGER | RULE_LONG | RULE_BIG_DECIMAL | RULE_FLOAT | RULE_DOUBLE | RULE_BOOLEAN_TYPE | RULE_LOCAL_DATE | RULE_ZONED_DATETIME | RULE_INSTANT | RULE_BLOB | RULE_ANY_BLOB | RULE_IMAGE_BLOB | RULE_TEXT_BLOB | RULE_ONE_TO_MANY | RULE_MANY_TO_ONE | RULE_ONE_TO_ONE | RULE_MANY_TO_MANY | RULE_PATTERN_VALUE | RULE_MIN | RULE_MAX | RULE_NULL_LITERAL | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACK | RULE_RBRACK | RULE_SEMI | RULE_COMMA | RULE_DOT | RULE_ELLIPSIS | RULE_AT | RULE_COLONCOLON | RULE_SEMICOLON | RULE_REQUIRED | RULE_PATTERN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( (LA13_52=='\"') ) {s = 95;}

                        else if ( ((LA13_52>='\u0000' && LA13_52<='!')||(LA13_52>='#' && LA13_52<='\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( (LA13_13=='\\') ) {s = 52;}

                        else if ( ((LA13_13>='\u0000' && LA13_13<='!')||(LA13_13>='#' && LA13_13<='[')||(LA13_13>=']' && LA13_13<='\uFFFF')) ) {s = 53;}

                        else if ( (LA13_13=='\"') ) {s = 54;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_96 = input.LA(1);

                        s = -1;
                        if ( (LA13_96=='\"') ) {s = 54;}

                        else if ( (LA13_96=='\\') ) {s = 52;}

                        else if ( ((LA13_96>='\u0000' && LA13_96<='!')||(LA13_96>='#' && LA13_96<='[')||(LA13_96>=']' && LA13_96<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_53 = input.LA(1);

                        s = -1;
                        if ( (LA13_53=='\"') ) {s = 54;}

                        else if ( (LA13_53=='\\') ) {s = 52;}

                        else if ( ((LA13_53>='\u0000' && LA13_53<='!')||(LA13_53>='#' && LA13_53<='[')||(LA13_53>=']' && LA13_53<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='e') ) {s = 1;}

                        else if ( (LA13_0=='S') ) {s = 2;}

                        else if ( (LA13_0=='I') ) {s = 3;}

                        else if ( (LA13_0=='L') ) {s = 4;}

                        else if ( (LA13_0=='B') ) {s = 5;}

                        else if ( (LA13_0=='F') ) {s = 6;}

                        else if ( (LA13_0=='D') ) {s = 7;}

                        else if ( (LA13_0=='Z') ) {s = 8;}

                        else if ( (LA13_0=='A') ) {s = 9;}

                        else if ( (LA13_0=='T') ) {s = 10;}

                        else if ( (LA13_0=='O') ) {s = 11;}

                        else if ( (LA13_0=='M') ) {s = 12;}

                        else if ( (LA13_0=='\"') ) {s = 13;}

                        else if ( (LA13_0=='m') ) {s = 14;}

                        else if ( (LA13_0=='n') ) {s = 15;}

                        else if ( (LA13_0=='(') ) {s = 16;}

                        else if ( (LA13_0==')') ) {s = 17;}

                        else if ( (LA13_0=='{') ) {s = 18;}

                        else if ( (LA13_0=='}') ) {s = 19;}

                        else if ( (LA13_0=='[') ) {s = 20;}

                        else if ( (LA13_0==']') ) {s = 21;}

                        else if ( (LA13_0==';') ) {s = 22;}

                        else if ( (LA13_0==',') ) {s = 23;}

                        else if ( (LA13_0=='.') ) {s = 24;}

                        else if ( (LA13_0=='@') ) {s = 25;}

                        else if ( (LA13_0==':') ) {s = 26;}

                        else if ( (LA13_0=='r') ) {s = 27;}

                        else if ( (LA13_0=='p') ) {s = 28;}

                        else if ( (LA13_0=='^') ) {s = 29;}

                        else if ( (LA13_0=='C'||LA13_0=='E'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='N'||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Y')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='f' && LA13_0<='l')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='s' && LA13_0<='z')) ) {s = 30;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 31;}

                        else if ( (LA13_0=='\'') ) {s = 32;}

                        else if ( (LA13_0=='/') ) {s = 33;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 34;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>='<' && LA13_0<='?')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_95 = input.LA(1);

                        s = -1;
                        if ( (LA13_95=='\"') ) {s = 54;}

                        else if ( (LA13_95=='\\') ) {s = 52;}

                        else if ( ((LA13_95>='\u0000' && LA13_95<='!')||(LA13_95>='#' && LA13_95<='[')||(LA13_95>=']' && LA13_95<='\uFFFF')) ) {s = 53;}

                        else s = 97;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}