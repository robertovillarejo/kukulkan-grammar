package mx.infotec.dads.kukulkan.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mx.infotec.dads.kukulkan.services.KukulkanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKukulkanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENTITY_KEYWORD", "RULE_ID", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_COMMA", "RULE_RBRACE", "RULE_SEMICOLON", "RULE_STRING_KEYWORD", "RULE_INTEGER", "RULE_LONG", "RULE_BIG_DECIMAL", "RULE_FLOAT", "RULE_DOUBLE", "RULE_BOOLEAN_TYPE", "RULE_LOCAL_DATE", "RULE_ZONED_DATETIME", "RULE_INSTANT", "RULE_BLOB", "RULE_ANY_BLOB", "RULE_IMAGE_BLOB", "RULE_TEXT_BLOB", "RULE_REQUIRED", "RULE_PATTERN", "RULE_PATTERN_VALUE", "RULE_MIN", "RULE_INT", "RULE_MAX", "RULE_ONE_TO_MANY", "RULE_MANY_TO_ONE", "RULE_ONE_TO_ONE", "RULE_MANY_TO_MANY", "RULE_NULL_LITERAL", "RULE_LBRACK", "RULE_RBRACK", "RULE_SEMI", "RULE_DOT", "RULE_ELLIPSIS", "RULE_AT", "RULE_COLONCOLON", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ANY_BLOB=23;
    public static final int RULE_ENTITY_KEYWORD=4;
    public static final int RULE_LPAREN=6;
    public static final int RULE_MANY_TO_ONE=33;
    public static final int RULE_BLOB=22;
    public static final int RULE_ID=5;
    public static final int RULE_COMMA=9;
    public static final int RULE_LOCAL_DATE=19;
    public static final int RULE_BOOLEAN_TYPE=18;
    public static final int RULE_ONE_TO_ONE=34;
    public static final int RULE_ONE_TO_MANY=32;
    public static final int RULE_ZONED_DATETIME=20;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=45;
    public static final int RULE_MAX=31;
    public static final int RULE_SEMICOLON=11;
    public static final int RULE_COLONCOLON=43;
    public static final int RULE_REQUIRED=26;
    public static final int RULE_TEXT_BLOB=25;
    public static final int RULE_STRING=44;
    public static final int RULE_AT=42;
    public static final int RULE_SL_COMMENT=46;
    public static final int RULE_DOUBLE=17;
    public static final int RULE_MIN=29;
    public static final int RULE_ELLIPSIS=41;
    public static final int RULE_DOT=40;
    public static final int EOF=-1;
    public static final int RULE_BIG_DECIMAL=15;
    public static final int RULE_STRING_KEYWORD=12;
    public static final int RULE_INSTANT=21;
    public static final int RULE_RBRACK=38;
    public static final int RULE_LBRACE=8;
    public static final int RULE_PATTERN=27;
    public static final int RULE_WS=47;
    public static final int RULE_ANY_OTHER=48;
    public static final int RULE_RBRACE=10;
    public static final int RULE_NULL_LITERAL=36;
    public static final int RULE_RPAREN=7;
    public static final int RULE_IMAGE_BLOB=24;
    public static final int RULE_MANY_TO_MANY=35;
    public static final int RULE_FLOAT=16;
    public static final int RULE_SEMI=39;
    public static final int RULE_LONG=14;
    public static final int RULE_INTEGER=13;
    public static final int RULE_LBRACK=37;
    public static final int RULE_PATTERN_VALUE=28;

    // delegates
    // delegators


        public InternalKukulkanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKukulkanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKukulkanParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKukulkan.g"; }



     	private KukulkanGrammarAccess grammarAccess;

        public InternalKukulkanParser(TokenStream input, KukulkanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "domainModel";
       	}

       	@Override
       	protected KukulkanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuledomainModel"
    // InternalKukulkan.g:64:1: entryRuledomainModel returns [EObject current=null] : iv_ruledomainModel= ruledomainModel EOF ;
    public final EObject entryRuledomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledomainModel = null;


        try {
            // InternalKukulkan.g:64:52: (iv_ruledomainModel= ruledomainModel EOF )
            // InternalKukulkan.g:65:2: iv_ruledomainModel= ruledomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledomainModel=ruledomainModel();

            state._fsp--;

             current =iv_ruledomainModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledomainModel"


    // $ANTLR start "ruledomainModel"
    // InternalKukulkan.g:71:1: ruledomainModel returns [EObject current=null] : ( (lv_entities_0_0= ruleentity ) )+ ;
    public final EObject ruledomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:77:2: ( ( (lv_entities_0_0= ruleentity ) )+ )
            // InternalKukulkan.g:78:2: ( (lv_entities_0_0= ruleentity ) )+
            {
            // InternalKukulkan.g:78:2: ( (lv_entities_0_0= ruleentity ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENTITY_KEYWORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKukulkan.g:79:3: (lv_entities_0_0= ruleentity )
            	    {
            	    // InternalKukulkan.g:79:3: (lv_entities_0_0= ruleentity )
            	    // InternalKukulkan.g:80:4: lv_entities_0_0= ruleentity
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleentity();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entities",
            	    					lv_entities_0_0,
            	    					"mx.infotec.dads.kukulkan.Kukulkan.entity");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledomainModel"


    // $ANTLR start "entryRuleentity"
    // InternalKukulkan.g:100:1: entryRuleentity returns [EObject current=null] : iv_ruleentity= ruleentity EOF ;
    public final EObject entryRuleentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentity = null;


        try {
            // InternalKukulkan.g:100:47: (iv_ruleentity= ruleentity EOF )
            // InternalKukulkan.g:101:2: iv_ruleentity= ruleentity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleentity=ruleentity();

            state._fsp--;

             current =iv_ruleentity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleentity"


    // $ANTLR start "ruleentity"
    // InternalKukulkan.g:107:1: ruleentity returns [EObject current=null] : (this_ENTITY_KEYWORD_0= RULE_ENTITY_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )? (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )? ) ;
    public final EObject ruleentity() throws RecognitionException {
        EObject current = null;

        Token this_ENTITY_KEYWORD_0=null;
        Token lv_name_1_0=null;
        Token this_LPAREN_2=null;
        Token lv_tableName_3_0=null;
        Token this_RPAREN_4=null;
        Token this_LBRACE_5=null;
        Token this_COMMA_7=null;
        Token this_RBRACE_9=null;
        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:113:2: ( (this_ENTITY_KEYWORD_0= RULE_ENTITY_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )? (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )? ) )
            // InternalKukulkan.g:114:2: (this_ENTITY_KEYWORD_0= RULE_ENTITY_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )? (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )? )
            {
            // InternalKukulkan.g:114:2: (this_ENTITY_KEYWORD_0= RULE_ENTITY_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )? (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )? )
            // InternalKukulkan.g:115:3: this_ENTITY_KEYWORD_0= RULE_ENTITY_KEYWORD ( (lv_name_1_0= RULE_ID ) ) (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )? (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )?
            {
            this_ENTITY_KEYWORD_0=(Token)match(input,RULE_ENTITY_KEYWORD,FOLLOW_4); 

            			newLeafNode(this_ENTITY_KEYWORD_0, grammarAccess.getEntityAccess().getENTITY_KEYWORDTerminalRuleCall_0());
            		
            // InternalKukulkan.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKukulkan.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKukulkan.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalKukulkan.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKukulkan.g:137:3: (this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LPAREN) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKukulkan.g:138:4: this_LPAREN_2= RULE_LPAREN ( (lv_tableName_3_0= RULE_ID ) ) this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_4); 

                    				newLeafNode(this_LPAREN_2, grammarAccess.getEntityAccess().getLPARENTerminalRuleCall_2_0());
                    			
                    // InternalKukulkan.g:142:4: ( (lv_tableName_3_0= RULE_ID ) )
                    // InternalKukulkan.g:143:5: (lv_tableName_3_0= RULE_ID )
                    {
                    // InternalKukulkan.g:143:5: (lv_tableName_3_0= RULE_ID )
                    // InternalKukulkan.g:144:6: lv_tableName_3_0= RULE_ID
                    {
                    lv_tableName_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_tableName_3_0, grammarAccess.getEntityAccess().getTableNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tableName",
                    							lv_tableName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_7); 

                    				newLeafNode(this_RPAREN_4, grammarAccess.getEntityAccess().getRPARENTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalKukulkan.g:165:3: (this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_LBRACE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKukulkan.g:166:4: this_LBRACE_5= RULE_LBRACE ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )? this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_5=(Token)match(input,RULE_LBRACE,FOLLOW_8); 

                    				newLeafNode(this_LBRACE_5, grammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0());
                    			
                    // InternalKukulkan.g:170:4: ( ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||(LA4_0>=RULE_ONE_TO_MANY && LA4_0<=RULE_MANY_TO_MANY)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalKukulkan.g:171:5: ( (lv_fields_6_0= ruleentityField ) ) (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )*
                            {
                            // InternalKukulkan.g:171:5: ( (lv_fields_6_0= ruleentityField ) )
                            // InternalKukulkan.g:172:6: (lv_fields_6_0= ruleentityField )
                            {
                            // InternalKukulkan.g:172:6: (lv_fields_6_0= ruleentityField )
                            // InternalKukulkan.g:173:7: lv_fields_6_0= ruleentityField
                            {

                            							newCompositeNode(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_fields_6_0=ruleentityField();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntityRule());
                            							}
                            							add(
                            								current,
                            								"fields",
                            								lv_fields_6_0,
                            								"mx.infotec.dads.kukulkan.Kukulkan.entityField");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalKukulkan.g:190:5: (this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==RULE_COMMA) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalKukulkan.g:191:6: this_COMMA_7= RULE_COMMA ( (lv_fields_8_0= ruleentityField ) )
                            	    {
                            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_10); 

                            	    						newLeafNode(this_COMMA_7, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_3_1_1_0());
                            	    					
                            	    // InternalKukulkan.g:195:6: ( (lv_fields_8_0= ruleentityField ) )
                            	    // InternalKukulkan.g:196:7: (lv_fields_8_0= ruleentityField )
                            	    {
                            	    // InternalKukulkan.g:196:7: (lv_fields_8_0= ruleentityField )
                            	    // InternalKukulkan.g:197:8: lv_fields_8_0= ruleentityField
                            	    {

                            	    								newCompositeNode(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_fields_8_0=ruleentityField();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEntityRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"fields",
                            	    									lv_fields_8_0,
                            	    									"mx.infotec.dads.kukulkan.Kukulkan.entityField");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_2); 

                    				newLeafNode(this_RBRACE_9, grammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentity"


    // $ANTLR start "entryRuleentityField"
    // InternalKukulkan.g:225:1: entryRuleentityField returns [EObject current=null] : iv_ruleentityField= ruleentityField EOF ;
    public final EObject entryRuleentityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentityField = null;


        try {
            // InternalKukulkan.g:225:52: (iv_ruleentityField= ruleentityField EOF )
            // InternalKukulkan.g:226:2: iv_ruleentityField= ruleentityField EOF
            {
             newCompositeNode(grammarAccess.getEntityFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleentityField=ruleentityField();

            state._fsp--;

             current =iv_ruleentityField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleentityField"


    // $ANTLR start "ruleentityField"
    // InternalKukulkan.g:232:1: ruleentityField returns [EObject current=null] : (this_primitiveField_0= ruleprimitiveField | this_associationField_1= ruleassociationField ) ;
    public final EObject ruleentityField() throws RecognitionException {
        EObject current = null;

        EObject this_primitiveField_0 = null;

        EObject this_associationField_1 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:238:2: ( (this_primitiveField_0= ruleprimitiveField | this_associationField_1= ruleassociationField ) )
            // InternalKukulkan.g:239:2: (this_primitiveField_0= ruleprimitiveField | this_associationField_1= ruleassociationField )
            {
            // InternalKukulkan.g:239:2: (this_primitiveField_0= ruleprimitiveField | this_associationField_1= ruleassociationField )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ONE_TO_MANY && LA6_0<=RULE_MANY_TO_MANY)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKukulkan.g:240:3: this_primitiveField_0= ruleprimitiveField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getPrimitiveFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_primitiveField_0=ruleprimitiveField();

                    state._fsp--;


                    			current = this_primitiveField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:249:3: this_associationField_1= ruleassociationField
                    {

                    			newCompositeNode(grammarAccess.getEntityFieldAccess().getAssociationFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_associationField_1=ruleassociationField();

                    state._fsp--;


                    			current = this_associationField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentityField"


    // $ANTLR start "entryRuleprimitiveField"
    // InternalKukulkan.g:261:1: entryRuleprimitiveField returns [EObject current=null] : iv_ruleprimitiveField= ruleprimitiveField EOF ;
    public final EObject entryRuleprimitiveField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimitiveField = null;


        try {
            // InternalKukulkan.g:261:55: (iv_ruleprimitiveField= ruleprimitiveField EOF )
            // InternalKukulkan.g:262:2: iv_ruleprimitiveField= ruleprimitiveField EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimitiveField=ruleprimitiveField();

            state._fsp--;

             current =iv_ruleprimitiveField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimitiveField"


    // $ANTLR start "ruleprimitiveField"
    // InternalKukulkan.g:268:1: ruleprimitiveField returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_type_2_0= rulefieldType ) ) ) ;
    public final EObject ruleprimitiveField() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token this_SEMICOLON_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:274:2: ( ( ( (lv_id_0_0= RULE_ID ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_type_2_0= rulefieldType ) ) ) )
            // InternalKukulkan.g:275:2: ( ( (lv_id_0_0= RULE_ID ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_type_2_0= rulefieldType ) ) )
            {
            // InternalKukulkan.g:275:2: ( ( (lv_id_0_0= RULE_ID ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_type_2_0= rulefieldType ) ) )
            // InternalKukulkan.g:276:3: ( (lv_id_0_0= RULE_ID ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_type_2_0= rulefieldType ) )
            {
            // InternalKukulkan.g:276:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalKukulkan.g:277:4: (lv_id_0_0= RULE_ID )
            {
            // InternalKukulkan.g:277:4: (lv_id_0_0= RULE_ID )
            // InternalKukulkan.g:278:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_id_0_0, grammarAccess.getPrimitiveFieldAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_12); 

            			newLeafNode(this_SEMICOLON_1, grammarAccess.getPrimitiveFieldAccess().getSEMICOLONTerminalRuleCall_1());
            		
            // InternalKukulkan.g:298:3: ( (lv_type_2_0= rulefieldType ) )
            // InternalKukulkan.g:299:4: (lv_type_2_0= rulefieldType )
            {
            // InternalKukulkan.g:299:4: (lv_type_2_0= rulefieldType )
            // InternalKukulkan.g:300:5: lv_type_2_0= rulefieldType
            {

            					newCompositeNode(grammarAccess.getPrimitiveFieldAccess().getTypeFieldTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=rulefieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.fieldType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimitiveField"


    // $ANTLR start "entryRulefieldType"
    // InternalKukulkan.g:321:1: entryRulefieldType returns [EObject current=null] : iv_rulefieldType= rulefieldType EOF ;
    public final EObject entryRulefieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefieldType = null;


        try {
            // InternalKukulkan.g:321:50: (iv_rulefieldType= rulefieldType EOF )
            // InternalKukulkan.g:322:2: iv_rulefieldType= rulefieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefieldType=rulefieldType();

            state._fsp--;

             current =iv_rulefieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefieldType"


    // $ANTLR start "rulefieldType"
    // InternalKukulkan.g:328:1: rulefieldType returns [EObject current=null] : (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType ) ;
    public final EObject rulefieldType() throws RecognitionException {
        EObject current = null;

        EObject this_stringFieldType_0 = null;

        EObject this_numericFieldType_1 = null;

        EObject this_booleanFieldType_2 = null;

        EObject this_dateFieldType_3 = null;

        EObject this_blobFieldType_4 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:334:2: ( (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType ) )
            // InternalKukulkan.g:335:2: (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType )
            {
            // InternalKukulkan.g:335:2: (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_STRING_KEYWORD:
                {
                alt7=1;
                }
                break;
            case RULE_INTEGER:
            case RULE_LONG:
            case RULE_BIG_DECIMAL:
            case RULE_FLOAT:
            case RULE_DOUBLE:
                {
                alt7=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt7=3;
                }
                break;
            case RULE_LOCAL_DATE:
            case RULE_ZONED_DATETIME:
            case RULE_INSTANT:
                {
                alt7=4;
                }
                break;
            case RULE_BLOB:
            case RULE_ANY_BLOB:
            case RULE_IMAGE_BLOB:
            case RULE_TEXT_BLOB:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKukulkan.g:336:3: this_stringFieldType_0= rulestringFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getStringFieldTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_stringFieldType_0=rulestringFieldType();

                    state._fsp--;


                    			current = this_stringFieldType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:345:3: this_numericFieldType_1= rulenumericFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getNumericFieldTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_numericFieldType_1=rulenumericFieldType();

                    state._fsp--;


                    			current = this_numericFieldType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:354:3: this_booleanFieldType_2= rulebooleanFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getBooleanFieldTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_booleanFieldType_2=rulebooleanFieldType();

                    state._fsp--;


                    			current = this_booleanFieldType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:363:3: this_dateFieldType_3= ruledateFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getDateFieldTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_dateFieldType_3=ruledateFieldType();

                    state._fsp--;


                    			current = this_dateFieldType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:372:3: this_blobFieldType_4= ruleblobFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_blobFieldType_4=ruleblobFieldType();

                    state._fsp--;


                    			current = this_blobFieldType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefieldType"


    // $ANTLR start "entryRuleassociationField"
    // InternalKukulkan.g:384:1: entryRuleassociationField returns [EObject current=null] : iv_ruleassociationField= ruleassociationField EOF ;
    public final EObject entryRuleassociationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassociationField = null;


        try {
            // InternalKukulkan.g:384:57: (iv_ruleassociationField= ruleassociationField EOF )
            // InternalKukulkan.g:385:2: iv_ruleassociationField= ruleassociationField EOF
            {
             newCompositeNode(grammarAccess.getAssociationFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassociationField=ruleassociationField();

            state._fsp--;

             current =iv_ruleassociationField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassociationField"


    // $ANTLR start "ruleassociationField"
    // InternalKukulkan.g:391:1: ruleassociationField returns [EObject current=null] : ( ( (lv_type_0_0= rulecardinality ) ) (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )? ( (lv_id_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleassociationField() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_1=null;
        Token lv_toSourcePropertyName_2_0=null;
        Token this_RPAREN_3=null;
        Token lv_id_4_0=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:397:2: ( ( ( (lv_type_0_0= rulecardinality ) ) (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )? ( (lv_id_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (otherlv_6= RULE_ID ) ) ) )
            // InternalKukulkan.g:398:2: ( ( (lv_type_0_0= rulecardinality ) ) (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )? ( (lv_id_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalKukulkan.g:398:2: ( ( (lv_type_0_0= rulecardinality ) ) (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )? ( (lv_id_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (otherlv_6= RULE_ID ) ) )
            // InternalKukulkan.g:399:3: ( (lv_type_0_0= rulecardinality ) ) (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )? ( (lv_id_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ( (otherlv_6= RULE_ID ) )
            {
            // InternalKukulkan.g:399:3: ( (lv_type_0_0= rulecardinality ) )
            // InternalKukulkan.g:400:4: (lv_type_0_0= rulecardinality )
            {
            // InternalKukulkan.g:400:4: (lv_type_0_0= rulecardinality )
            // InternalKukulkan.g:401:5: lv_type_0_0= rulecardinality
            {

            					newCompositeNode(grammarAccess.getAssociationFieldAccess().getTypeCardinalityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_0_0=rulecardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:418:3: (this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LPAREN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKukulkan.g:419:4: this_LPAREN_1= RULE_LPAREN ( (lv_toSourcePropertyName_2_0= RULE_ID ) ) this_RPAREN_3= RULE_RPAREN
                    {
                    this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_4); 

                    				newLeafNode(this_LPAREN_1, grammarAccess.getAssociationFieldAccess().getLPARENTerminalRuleCall_1_0());
                    			
                    // InternalKukulkan.g:423:4: ( (lv_toSourcePropertyName_2_0= RULE_ID ) )
                    // InternalKukulkan.g:424:5: (lv_toSourcePropertyName_2_0= RULE_ID )
                    {
                    // InternalKukulkan.g:424:5: (lv_toSourcePropertyName_2_0= RULE_ID )
                    // InternalKukulkan.g:425:6: lv_toSourcePropertyName_2_0= RULE_ID
                    {
                    lv_toSourcePropertyName_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_toSourcePropertyName_2_0, grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"toSourcePropertyName",
                    							lv_toSourcePropertyName_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_4); 

                    				newLeafNode(this_RPAREN_3, grammarAccess.getAssociationFieldAccess().getRPARENTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalKukulkan.g:446:3: ( (lv_id_4_0= RULE_ID ) )
            // InternalKukulkan.g:447:4: (lv_id_4_0= RULE_ID )
            {
            // InternalKukulkan.g:447:4: (lv_id_4_0= RULE_ID )
            // InternalKukulkan.g:448:5: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_id_4_0, grammarAccess.getAssociationFieldAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getAssociationFieldAccess().getSEMICOLONTerminalRuleCall_3());
            		
            // InternalKukulkan.g:468:3: ( (otherlv_6= RULE_ID ) )
            // InternalKukulkan.g:469:4: (otherlv_6= RULE_ID )
            {
            // InternalKukulkan.g:469:4: (otherlv_6= RULE_ID )
            // InternalKukulkan.g:470:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationFieldRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getAssociationFieldAccess().getTargetEntityEntityCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassociationField"


    // $ANTLR start "entryRulestringFieldType"
    // InternalKukulkan.g:485:1: entryRulestringFieldType returns [EObject current=null] : iv_rulestringFieldType= rulestringFieldType EOF ;
    public final EObject entryRulestringFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringFieldType = null;


        try {
            // InternalKukulkan.g:485:56: (iv_rulestringFieldType= rulestringFieldType EOF )
            // InternalKukulkan.g:486:2: iv_rulestringFieldType= rulestringFieldType EOF
            {
             newCompositeNode(grammarAccess.getStringFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringFieldType=rulestringFieldType();

            state._fsp--;

             current =iv_rulestringFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringFieldType"


    // $ANTLR start "rulestringFieldType"
    // InternalKukulkan.g:492:1: rulestringFieldType returns [EObject current=null] : ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* ) ;
    public final EObject rulestringFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:498:2: ( ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* ) )
            // InternalKukulkan.g:499:2: ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* )
            {
            // InternalKukulkan.g:499:2: ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* )
            // InternalKukulkan.g:500:3: ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )*
            {
            // InternalKukulkan.g:500:3: ( (lv_name_0_0= rulestringType ) )
            // InternalKukulkan.g:501:4: (lv_name_0_0= rulestringType )
            {
            // InternalKukulkan.g:501:4: (lv_name_0_0= rulestringType )
            // InternalKukulkan.g:502:5: lv_name_0_0= rulestringType
            {

            					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getNameStringTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=rulestringType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringFieldTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.stringType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:519:3: ( (lv_constraints_1_0= rulestringValidators ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_REQUIRED && LA9_0<=RULE_PATTERN)||LA9_0==RULE_MIN||LA9_0==RULE_MAX) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKukulkan.g:520:4: (lv_constraints_1_0= rulestringValidators )
            	    {
            	    // InternalKukulkan.g:520:4: (lv_constraints_1_0= rulestringValidators )
            	    // InternalKukulkan.g:521:5: lv_constraints_1_0= rulestringValidators
            	    {

            	    					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getConstraintsStringValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_constraints_1_0=rulestringValidators();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStringFieldTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"mx.infotec.dads.kukulkan.Kukulkan.stringValidators");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringFieldType"


    // $ANTLR start "entryRulestringType"
    // InternalKukulkan.g:542:1: entryRulestringType returns [String current=null] : iv_rulestringType= rulestringType EOF ;
    public final String entryRulestringType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestringType = null;


        try {
            // InternalKukulkan.g:542:50: (iv_rulestringType= rulestringType EOF )
            // InternalKukulkan.g:543:2: iv_rulestringType= rulestringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringType=rulestringType();

            state._fsp--;

             current =iv_rulestringType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringType"


    // $ANTLR start "rulestringType"
    // InternalKukulkan.g:549:1: rulestringType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_KEYWORD_0= RULE_STRING_KEYWORD ;
    public final AntlrDatatypeRuleToken rulestringType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_KEYWORD_0=null;


        	enterRule();

        try {
            // InternalKukulkan.g:555:2: (this_STRING_KEYWORD_0= RULE_STRING_KEYWORD )
            // InternalKukulkan.g:556:2: this_STRING_KEYWORD_0= RULE_STRING_KEYWORD
            {
            this_STRING_KEYWORD_0=(Token)match(input,RULE_STRING_KEYWORD,FOLLOW_2); 

            		current.merge(this_STRING_KEYWORD_0);
            	

            		newLeafNode(this_STRING_KEYWORD_0, grammarAccess.getStringTypeAccess().getSTRING_KEYWORDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringType"


    // $ANTLR start "entryRulenumericFieldType"
    // InternalKukulkan.g:566:1: entryRulenumericFieldType returns [EObject current=null] : iv_rulenumericFieldType= rulenumericFieldType EOF ;
    public final EObject entryRulenumericFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumericFieldType = null;


        try {
            // InternalKukulkan.g:566:57: (iv_rulenumericFieldType= rulenumericFieldType EOF )
            // InternalKukulkan.g:567:2: iv_rulenumericFieldType= rulenumericFieldType EOF
            {
             newCompositeNode(grammarAccess.getNumericFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumericFieldType=rulenumericFieldType();

            state._fsp--;

             current =iv_rulenumericFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumericFieldType"


    // $ANTLR start "rulenumericFieldType"
    // InternalKukulkan.g:573:1: rulenumericFieldType returns [EObject current=null] : ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* ) ;
    public final EObject rulenumericFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:579:2: ( ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* ) )
            // InternalKukulkan.g:580:2: ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* )
            {
            // InternalKukulkan.g:580:2: ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* )
            // InternalKukulkan.g:581:3: ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )*
            {
            // InternalKukulkan.g:581:3: ( (lv_name_0_0= rulenumericTypes ) )
            // InternalKukulkan.g:582:4: (lv_name_0_0= rulenumericTypes )
            {
            // InternalKukulkan.g:582:4: (lv_name_0_0= rulenumericTypes )
            // InternalKukulkan.g:583:5: lv_name_0_0= rulenumericTypes
            {

            					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getNameNumericTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_0_0=rulenumericTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericFieldTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.numericTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:600:3: ( (lv_constraints_1_0= rulenumericValidators ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_REQUIRED||LA10_0==RULE_MIN||LA10_0==RULE_MAX) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKukulkan.g:601:4: (lv_constraints_1_0= rulenumericValidators )
            	    {
            	    // InternalKukulkan.g:601:4: (lv_constraints_1_0= rulenumericValidators )
            	    // InternalKukulkan.g:602:5: lv_constraints_1_0= rulenumericValidators
            	    {

            	    					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getConstraintsNumericValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_constraints_1_0=rulenumericValidators();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNumericFieldTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"mx.infotec.dads.kukulkan.Kukulkan.numericValidators");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumericFieldType"


    // $ANTLR start "entryRulenumericTypes"
    // InternalKukulkan.g:623:1: entryRulenumericTypes returns [String current=null] : iv_rulenumericTypes= rulenumericTypes EOF ;
    public final String entryRulenumericTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumericTypes = null;


        try {
            // InternalKukulkan.g:623:52: (iv_rulenumericTypes= rulenumericTypes EOF )
            // InternalKukulkan.g:624:2: iv_rulenumericTypes= rulenumericTypes EOF
            {
             newCompositeNode(grammarAccess.getNumericTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumericTypes=rulenumericTypes();

            state._fsp--;

             current =iv_rulenumericTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumericTypes"


    // $ANTLR start "rulenumericTypes"
    // InternalKukulkan.g:630:1: rulenumericTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_LONG_1= RULE_LONG | this_BIG_DECIMAL_2= RULE_BIG_DECIMAL | this_FLOAT_3= RULE_FLOAT | this_DOUBLE_4= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken rulenumericTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_LONG_1=null;
        Token this_BIG_DECIMAL_2=null;
        Token this_FLOAT_3=null;
        Token this_DOUBLE_4=null;


        	enterRule();

        try {
            // InternalKukulkan.g:636:2: ( (this_INTEGER_0= RULE_INTEGER | this_LONG_1= RULE_LONG | this_BIG_DECIMAL_2= RULE_BIG_DECIMAL | this_FLOAT_3= RULE_FLOAT | this_DOUBLE_4= RULE_DOUBLE ) )
            // InternalKukulkan.g:637:2: (this_INTEGER_0= RULE_INTEGER | this_LONG_1= RULE_LONG | this_BIG_DECIMAL_2= RULE_BIG_DECIMAL | this_FLOAT_3= RULE_FLOAT | this_DOUBLE_4= RULE_DOUBLE )
            {
            // InternalKukulkan.g:637:2: (this_INTEGER_0= RULE_INTEGER | this_LONG_1= RULE_LONG | this_BIG_DECIMAL_2= RULE_BIG_DECIMAL | this_FLOAT_3= RULE_FLOAT | this_DOUBLE_4= RULE_DOUBLE )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt11=1;
                }
                break;
            case RULE_LONG:
                {
                alt11=2;
                }
                break;
            case RULE_BIG_DECIMAL:
                {
                alt11=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt11=4;
                }
                break;
            case RULE_DOUBLE:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKukulkan.g:638:3: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_0);
                    		

                    			newLeafNode(this_INTEGER_0, grammarAccess.getNumericTypesAccess().getINTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:646:3: this_LONG_1= RULE_LONG
                    {
                    this_LONG_1=(Token)match(input,RULE_LONG,FOLLOW_2); 

                    			current.merge(this_LONG_1);
                    		

                    			newLeafNode(this_LONG_1, grammarAccess.getNumericTypesAccess().getLONGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:654:3: this_BIG_DECIMAL_2= RULE_BIG_DECIMAL
                    {
                    this_BIG_DECIMAL_2=(Token)match(input,RULE_BIG_DECIMAL,FOLLOW_2); 

                    			current.merge(this_BIG_DECIMAL_2);
                    		

                    			newLeafNode(this_BIG_DECIMAL_2, grammarAccess.getNumericTypesAccess().getBIG_DECIMALTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:662:3: this_FLOAT_3= RULE_FLOAT
                    {
                    this_FLOAT_3=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_3);
                    		

                    			newLeafNode(this_FLOAT_3, grammarAccess.getNumericTypesAccess().getFLOATTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:670:3: this_DOUBLE_4= RULE_DOUBLE
                    {
                    this_DOUBLE_4=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_4);
                    		

                    			newLeafNode(this_DOUBLE_4, grammarAccess.getNumericTypesAccess().getDOUBLETerminalRuleCall_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumericTypes"


    // $ANTLR start "entryRulebooleanFieldType"
    // InternalKukulkan.g:681:1: entryRulebooleanFieldType returns [EObject current=null] : iv_rulebooleanFieldType= rulebooleanFieldType EOF ;
    public final EObject entryRulebooleanFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebooleanFieldType = null;


        try {
            // InternalKukulkan.g:681:57: (iv_rulebooleanFieldType= rulebooleanFieldType EOF )
            // InternalKukulkan.g:682:2: iv_rulebooleanFieldType= rulebooleanFieldType EOF
            {
             newCompositeNode(grammarAccess.getBooleanFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebooleanFieldType=rulebooleanFieldType();

            state._fsp--;

             current =iv_rulebooleanFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleanFieldType"


    // $ANTLR start "rulebooleanFieldType"
    // InternalKukulkan.g:688:1: rulebooleanFieldType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) ;
    public final EObject rulebooleanFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_required_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:694:2: ( ( ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) )
            // InternalKukulkan.g:695:2: ( ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            {
            // InternalKukulkan.g:695:2: ( ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            // InternalKukulkan.g:696:3: ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )?
            {
            // InternalKukulkan.g:696:3: ( (lv_name_0_0= RULE_BOOLEAN_TYPE ) )
            // InternalKukulkan.g:697:4: (lv_name_0_0= RULE_BOOLEAN_TYPE )
            {
            // InternalKukulkan.g:697:4: (lv_name_0_0= RULE_BOOLEAN_TYPE )
            // InternalKukulkan.g:698:5: lv_name_0_0= RULE_BOOLEAN_TYPE
            {
            lv_name_0_0=(Token)match(input,RULE_BOOLEAN_TYPE,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanFieldTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.BOOLEAN_TYPE");
            				

            }


            }

            // InternalKukulkan.g:714:3: ( (lv_required_1_0= rulerequiredValidator ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_REQUIRED) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKukulkan.g:715:4: (lv_required_1_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:715:4: (lv_required_1_0= rulerequiredValidator )
                    // InternalKukulkan.g:716:5: lv_required_1_0= rulerequiredValidator
                    {

                    					newCompositeNode(grammarAccess.getBooleanFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_required_1_0=rulerequiredValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanFieldTypeRule());
                    					}
                    					set(
                    						current,
                    						"required",
                    						lv_required_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebooleanFieldType"


    // $ANTLR start "entryRuledateFieldType"
    // InternalKukulkan.g:737:1: entryRuledateFieldType returns [EObject current=null] : iv_ruledateFieldType= ruledateFieldType EOF ;
    public final EObject entryRuledateFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledateFieldType = null;


        try {
            // InternalKukulkan.g:737:54: (iv_ruledateFieldType= ruledateFieldType EOF )
            // InternalKukulkan.g:738:2: iv_ruledateFieldType= ruledateFieldType EOF
            {
             newCompositeNode(grammarAccess.getDateFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledateFieldType=ruledateFieldType();

            state._fsp--;

             current =iv_ruledateFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledateFieldType"


    // $ANTLR start "ruledateFieldType"
    // InternalKukulkan.g:744:1: ruledateFieldType returns [EObject current=null] : ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) ;
    public final EObject ruledateFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_required_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:750:2: ( ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) )
            // InternalKukulkan.g:751:2: ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            {
            // InternalKukulkan.g:751:2: ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            // InternalKukulkan.g:752:3: ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )?
            {
            // InternalKukulkan.g:752:3: ( (lv_type_0_0= ruledateTypes ) )
            // InternalKukulkan.g:753:4: (lv_type_0_0= ruledateTypes )
            {
            // InternalKukulkan.g:753:4: (lv_type_0_0= ruledateTypes )
            // InternalKukulkan.g:754:5: lv_type_0_0= ruledateTypes
            {

            					newCompositeNode(grammarAccess.getDateFieldTypeAccess().getTypeDateTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_0_0=ruledateTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateFieldTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.dateTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:771:3: ( (lv_required_1_0= rulerequiredValidator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_REQUIRED) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKukulkan.g:772:4: (lv_required_1_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:772:4: (lv_required_1_0= rulerequiredValidator )
                    // InternalKukulkan.g:773:5: lv_required_1_0= rulerequiredValidator
                    {

                    					newCompositeNode(grammarAccess.getDateFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_required_1_0=rulerequiredValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateFieldTypeRule());
                    					}
                    					set(
                    						current,
                    						"required",
                    						lv_required_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledateFieldType"


    // $ANTLR start "entryRuledateTypes"
    // InternalKukulkan.g:794:1: entryRuledateTypes returns [String current=null] : iv_ruledateTypes= ruledateTypes EOF ;
    public final String entryRuledateTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledateTypes = null;


        try {
            // InternalKukulkan.g:794:49: (iv_ruledateTypes= ruledateTypes EOF )
            // InternalKukulkan.g:795:2: iv_ruledateTypes= ruledateTypes EOF
            {
             newCompositeNode(grammarAccess.getDateTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledateTypes=ruledateTypes();

            state._fsp--;

             current =iv_ruledateTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledateTypes"


    // $ANTLR start "ruledateTypes"
    // InternalKukulkan.g:801:1: ruledateTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LOCAL_DATE_0= RULE_LOCAL_DATE | this_ZONED_DATETIME_1= RULE_ZONED_DATETIME | this_INSTANT_2= RULE_INSTANT ) ;
    public final AntlrDatatypeRuleToken ruledateTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LOCAL_DATE_0=null;
        Token this_ZONED_DATETIME_1=null;
        Token this_INSTANT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:807:2: ( (this_LOCAL_DATE_0= RULE_LOCAL_DATE | this_ZONED_DATETIME_1= RULE_ZONED_DATETIME | this_INSTANT_2= RULE_INSTANT ) )
            // InternalKukulkan.g:808:2: (this_LOCAL_DATE_0= RULE_LOCAL_DATE | this_ZONED_DATETIME_1= RULE_ZONED_DATETIME | this_INSTANT_2= RULE_INSTANT )
            {
            // InternalKukulkan.g:808:2: (this_LOCAL_DATE_0= RULE_LOCAL_DATE | this_ZONED_DATETIME_1= RULE_ZONED_DATETIME | this_INSTANT_2= RULE_INSTANT )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_LOCAL_DATE:
                {
                alt14=1;
                }
                break;
            case RULE_ZONED_DATETIME:
                {
                alt14=2;
                }
                break;
            case RULE_INSTANT:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKukulkan.g:809:3: this_LOCAL_DATE_0= RULE_LOCAL_DATE
                    {
                    this_LOCAL_DATE_0=(Token)match(input,RULE_LOCAL_DATE,FOLLOW_2); 

                    			current.merge(this_LOCAL_DATE_0);
                    		

                    			newLeafNode(this_LOCAL_DATE_0, grammarAccess.getDateTypesAccess().getLOCAL_DATETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:817:3: this_ZONED_DATETIME_1= RULE_ZONED_DATETIME
                    {
                    this_ZONED_DATETIME_1=(Token)match(input,RULE_ZONED_DATETIME,FOLLOW_2); 

                    			current.merge(this_ZONED_DATETIME_1);
                    		

                    			newLeafNode(this_ZONED_DATETIME_1, grammarAccess.getDateTypesAccess().getZONED_DATETIMETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:825:3: this_INSTANT_2= RULE_INSTANT
                    {
                    this_INSTANT_2=(Token)match(input,RULE_INSTANT,FOLLOW_2); 

                    			current.merge(this_INSTANT_2);
                    		

                    			newLeafNode(this_INSTANT_2, grammarAccess.getDateTypesAccess().getINSTANTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledateTypes"


    // $ANTLR start "entryRuleblobFieldType"
    // InternalKukulkan.g:836:1: entryRuleblobFieldType returns [EObject current=null] : iv_ruleblobFieldType= ruleblobFieldType EOF ;
    public final EObject entryRuleblobFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblobFieldType = null;


        try {
            // InternalKukulkan.g:836:54: (iv_ruleblobFieldType= ruleblobFieldType EOF )
            // InternalKukulkan.g:837:2: iv_ruleblobFieldType= ruleblobFieldType EOF
            {
             newCompositeNode(grammarAccess.getBlobFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblobFieldType=ruleblobFieldType();

            state._fsp--;

             current =iv_ruleblobFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblobFieldType"


    // $ANTLR start "ruleblobFieldType"
    // InternalKukulkan.g:843:1: ruleblobFieldType returns [EObject current=null] : ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* ) ;
    public final EObject ruleblobFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:849:2: ( ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* ) )
            // InternalKukulkan.g:850:2: ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* )
            {
            // InternalKukulkan.g:850:2: ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* )
            // InternalKukulkan.g:851:3: ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )*
            {
            // InternalKukulkan.g:851:3: ( (lv_name_0_0= ruleblobTypes ) )
            // InternalKukulkan.g:852:4: (lv_name_0_0= ruleblobTypes )
            {
            // InternalKukulkan.g:852:4: (lv_name_0_0= ruleblobTypes )
            // InternalKukulkan.g:853:5: lv_name_0_0= ruleblobTypes
            {

            					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getNameBlobTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleblobTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlobFieldTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.blobTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:870:3: ( (lv_constraints_1_0= ruleblobValidators ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_REQUIRED||LA15_0==RULE_MIN||LA15_0==RULE_MAX) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKukulkan.g:871:4: (lv_constraints_1_0= ruleblobValidators )
            	    {
            	    // InternalKukulkan.g:871:4: (lv_constraints_1_0= ruleblobValidators )
            	    // InternalKukulkan.g:872:5: lv_constraints_1_0= ruleblobValidators
            	    {

            	    					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getConstraintsBlobValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_constraints_1_0=ruleblobValidators();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlobFieldTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"mx.infotec.dads.kukulkan.Kukulkan.blobValidators");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblobFieldType"


    // $ANTLR start "entryRuleblobTypes"
    // InternalKukulkan.g:893:1: entryRuleblobTypes returns [String current=null] : iv_ruleblobTypes= ruleblobTypes EOF ;
    public final String entryRuleblobTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblobTypes = null;


        try {
            // InternalKukulkan.g:893:49: (iv_ruleblobTypes= ruleblobTypes EOF )
            // InternalKukulkan.g:894:2: iv_ruleblobTypes= ruleblobTypes EOF
            {
             newCompositeNode(grammarAccess.getBlobTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblobTypes=ruleblobTypes();

            state._fsp--;

             current =iv_ruleblobTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblobTypes"


    // $ANTLR start "ruleblobTypes"
    // InternalKukulkan.g:900:1: ruleblobTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BLOB_0= RULE_BLOB | this_ANY_BLOB_1= RULE_ANY_BLOB | this_IMAGE_BLOB_2= RULE_IMAGE_BLOB | this_TEXT_BLOB_3= RULE_TEXT_BLOB ) ;
    public final AntlrDatatypeRuleToken ruleblobTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BLOB_0=null;
        Token this_ANY_BLOB_1=null;
        Token this_IMAGE_BLOB_2=null;
        Token this_TEXT_BLOB_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:906:2: ( (this_BLOB_0= RULE_BLOB | this_ANY_BLOB_1= RULE_ANY_BLOB | this_IMAGE_BLOB_2= RULE_IMAGE_BLOB | this_TEXT_BLOB_3= RULE_TEXT_BLOB ) )
            // InternalKukulkan.g:907:2: (this_BLOB_0= RULE_BLOB | this_ANY_BLOB_1= RULE_ANY_BLOB | this_IMAGE_BLOB_2= RULE_IMAGE_BLOB | this_TEXT_BLOB_3= RULE_TEXT_BLOB )
            {
            // InternalKukulkan.g:907:2: (this_BLOB_0= RULE_BLOB | this_ANY_BLOB_1= RULE_ANY_BLOB | this_IMAGE_BLOB_2= RULE_IMAGE_BLOB | this_TEXT_BLOB_3= RULE_TEXT_BLOB )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_BLOB:
                {
                alt16=1;
                }
                break;
            case RULE_ANY_BLOB:
                {
                alt16=2;
                }
                break;
            case RULE_IMAGE_BLOB:
                {
                alt16=3;
                }
                break;
            case RULE_TEXT_BLOB:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKukulkan.g:908:3: this_BLOB_0= RULE_BLOB
                    {
                    this_BLOB_0=(Token)match(input,RULE_BLOB,FOLLOW_2); 

                    			current.merge(this_BLOB_0);
                    		

                    			newLeafNode(this_BLOB_0, grammarAccess.getBlobTypesAccess().getBLOBTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:916:3: this_ANY_BLOB_1= RULE_ANY_BLOB
                    {
                    this_ANY_BLOB_1=(Token)match(input,RULE_ANY_BLOB,FOLLOW_2); 

                    			current.merge(this_ANY_BLOB_1);
                    		

                    			newLeafNode(this_ANY_BLOB_1, grammarAccess.getBlobTypesAccess().getANY_BLOBTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:924:3: this_IMAGE_BLOB_2= RULE_IMAGE_BLOB
                    {
                    this_IMAGE_BLOB_2=(Token)match(input,RULE_IMAGE_BLOB,FOLLOW_2); 

                    			current.merge(this_IMAGE_BLOB_2);
                    		

                    			newLeafNode(this_IMAGE_BLOB_2, grammarAccess.getBlobTypesAccess().getIMAGE_BLOBTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:932:3: this_TEXT_BLOB_3= RULE_TEXT_BLOB
                    {
                    this_TEXT_BLOB_3=(Token)match(input,RULE_TEXT_BLOB,FOLLOW_2); 

                    			current.merge(this_TEXT_BLOB_3);
                    		

                    			newLeafNode(this_TEXT_BLOB_3, grammarAccess.getBlobTypesAccess().getTEXT_BLOBTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblobTypes"


    // $ANTLR start "entryRulestringValidators"
    // InternalKukulkan.g:943:1: entryRulestringValidators returns [EObject current=null] : iv_rulestringValidators= rulestringValidators EOF ;
    public final EObject entryRulestringValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringValidators = null;


        try {
            // InternalKukulkan.g:943:57: (iv_rulestringValidators= rulestringValidators EOF )
            // InternalKukulkan.g:944:2: iv_rulestringValidators= rulestringValidators EOF
            {
             newCompositeNode(grammarAccess.getStringValidatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringValidators=rulestringValidators();

            state._fsp--;

             current =iv_rulestringValidators; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringValidators"


    // $ANTLR start "rulestringValidators"
    // InternalKukulkan.g:950:1: rulestringValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminValidator ) ) | ( (lv_maxLenght_2_0= rulemaxValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) ) ;
    public final EObject rulestringValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minLenght_1_0 = null;

        AntlrDatatypeRuleToken lv_maxLenght_2_0 = null;

        AntlrDatatypeRuleToken lv_pattern_3_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:956:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminValidator ) ) | ( (lv_maxLenght_2_0= rulemaxValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) ) )
            // InternalKukulkan.g:957:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminValidator ) ) | ( (lv_maxLenght_2_0= rulemaxValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) )
            {
            // InternalKukulkan.g:957:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminValidator ) ) | ( (lv_maxLenght_2_0= rulemaxValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt17=1;
                }
                break;
            case RULE_MIN:
                {
                alt17=2;
                }
                break;
            case RULE_MAX:
                {
                alt17=3;
                }
                break;
            case RULE_PATTERN:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalKukulkan.g:958:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:958:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:959:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:959:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:960:5: lv_required_0_0= rulerequiredValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_required_0_0=rulerequiredValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"required",
                    						lv_required_0_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:978:3: ( (lv_minLenght_1_0= ruleminValidator ) )
                    {
                    // InternalKukulkan.g:978:3: ( (lv_minLenght_1_0= ruleminValidator ) )
                    // InternalKukulkan.g:979:4: (lv_minLenght_1_0= ruleminValidator )
                    {
                    // InternalKukulkan.g:979:4: (lv_minLenght_1_0= ruleminValidator )
                    // InternalKukulkan.g:980:5: lv_minLenght_1_0= ruleminValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMinLenghtMinValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minLenght_1_0=ruleminValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"minLenght",
                    						lv_minLenght_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:998:3: ( (lv_maxLenght_2_0= rulemaxValidator ) )
                    {
                    // InternalKukulkan.g:998:3: ( (lv_maxLenght_2_0= rulemaxValidator ) )
                    // InternalKukulkan.g:999:4: (lv_maxLenght_2_0= rulemaxValidator )
                    {
                    // InternalKukulkan.g:999:4: (lv_maxLenght_2_0= rulemaxValidator )
                    // InternalKukulkan.g:1000:5: lv_maxLenght_2_0= rulemaxValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxValidatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maxLenght_2_0=rulemaxValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"maxLenght",
                    						lv_maxLenght_2_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1018:3: ( (lv_pattern_3_0= rulepatternValidator ) )
                    {
                    // InternalKukulkan.g:1018:3: ( (lv_pattern_3_0= rulepatternValidator ) )
                    // InternalKukulkan.g:1019:4: (lv_pattern_3_0= rulepatternValidator )
                    {
                    // InternalKukulkan.g:1019:4: (lv_pattern_3_0= rulepatternValidator )
                    // InternalKukulkan.g:1020:5: lv_pattern_3_0= rulepatternValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getPatternPatternValidatorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pattern_3_0=rulepatternValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"pattern",
                    						lv_pattern_3_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.patternValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringValidators"


    // $ANTLR start "entryRulenumericValidators"
    // InternalKukulkan.g:1041:1: entryRulenumericValidators returns [EObject current=null] : iv_rulenumericValidators= rulenumericValidators EOF ;
    public final EObject entryRulenumericValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumericValidators = null;


        try {
            // InternalKukulkan.g:1041:58: (iv_rulenumericValidators= rulenumericValidators EOF )
            // InternalKukulkan.g:1042:2: iv_rulenumericValidators= rulenumericValidators EOF
            {
             newCompositeNode(grammarAccess.getNumericValidatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumericValidators=rulenumericValidators();

            state._fsp--;

             current =iv_rulenumericValidators; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumericValidators"


    // $ANTLR start "rulenumericValidators"
    // InternalKukulkan.g:1048:1: rulenumericValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) ) ;
    public final EObject rulenumericValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minValue_1_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_2_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1054:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) ) )
            // InternalKukulkan.g:1055:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) )
            {
            // InternalKukulkan.g:1055:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt18=1;
                }
                break;
            case RULE_MIN:
                {
                alt18=2;
                }
                break;
            case RULE_MAX:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalKukulkan.g:1056:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:1056:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:1057:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:1057:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:1058:5: lv_required_0_0= rulerequiredValidator
                    {

                    					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_required_0_0=rulerequiredValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"required",
                    						lv_required_0_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1076:3: ( (lv_minValue_1_0= ruleminValidator ) )
                    {
                    // InternalKukulkan.g:1076:3: ( (lv_minValue_1_0= ruleminValidator ) )
                    // InternalKukulkan.g:1077:4: (lv_minValue_1_0= ruleminValidator )
                    {
                    // InternalKukulkan.g:1077:4: (lv_minValue_1_0= ruleminValidator )
                    // InternalKukulkan.g:1078:5: lv_minValue_1_0= ruleminValidator
                    {

                    					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getMinValueMinValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minValue_1_0=ruleminValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"minValue",
                    						lv_minValue_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1096:3: ( (lv_maxValue_2_0= rulemaxValidator ) )
                    {
                    // InternalKukulkan.g:1096:3: ( (lv_maxValue_2_0= rulemaxValidator ) )
                    // InternalKukulkan.g:1097:4: (lv_maxValue_2_0= rulemaxValidator )
                    {
                    // InternalKukulkan.g:1097:4: (lv_maxValue_2_0= rulemaxValidator )
                    // InternalKukulkan.g:1098:5: lv_maxValue_2_0= rulemaxValidator
                    {

                    					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getMaxValueMaxValidatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maxValue_2_0=rulemaxValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"maxValue",
                    						lv_maxValue_2_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumericValidators"


    // $ANTLR start "entryRuleblobValidators"
    // InternalKukulkan.g:1119:1: entryRuleblobValidators returns [EObject current=null] : iv_ruleblobValidators= ruleblobValidators EOF ;
    public final EObject entryRuleblobValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblobValidators = null;


        try {
            // InternalKukulkan.g:1119:55: (iv_ruleblobValidators= ruleblobValidators EOF )
            // InternalKukulkan.g:1120:2: iv_ruleblobValidators= ruleblobValidators EOF
            {
             newCompositeNode(grammarAccess.getBlobValidatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblobValidators=ruleblobValidators();

            state._fsp--;

             current =iv_ruleblobValidators; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblobValidators"


    // $ANTLR start "ruleblobValidators"
    // InternalKukulkan.g:1126:1: ruleblobValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxValidator ) ) ) ;
    public final EObject ruleblobValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minBytesValue_1_0 = null;

        AntlrDatatypeRuleToken lv_maxBytesValue_2_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1132:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxValidator ) ) ) )
            // InternalKukulkan.g:1133:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxValidator ) ) )
            {
            // InternalKukulkan.g:1133:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxValidator ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt19=1;
                }
                break;
            case RULE_MIN:
                {
                alt19=2;
                }
                break;
            case RULE_MAX:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalKukulkan.g:1134:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:1134:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:1135:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:1135:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:1136:5: lv_required_0_0= rulerequiredValidator
                    {

                    					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_required_0_0=rulerequiredValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"required",
                    						lv_required_0_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1154:3: ( (lv_minBytesValue_1_0= ruleminValidator ) )
                    {
                    // InternalKukulkan.g:1154:3: ( (lv_minBytesValue_1_0= ruleminValidator ) )
                    // InternalKukulkan.g:1155:4: (lv_minBytesValue_1_0= ruleminValidator )
                    {
                    // InternalKukulkan.g:1155:4: (lv_minBytesValue_1_0= ruleminValidator )
                    // InternalKukulkan.g:1156:5: lv_minBytesValue_1_0= ruleminValidator
                    {

                    					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minBytesValue_1_0=ruleminValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"minBytesValue",
                    						lv_minBytesValue_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1174:3: ( (lv_maxBytesValue_2_0= rulemaxValidator ) )
                    {
                    // InternalKukulkan.g:1174:3: ( (lv_maxBytesValue_2_0= rulemaxValidator ) )
                    // InternalKukulkan.g:1175:4: (lv_maxBytesValue_2_0= rulemaxValidator )
                    {
                    // InternalKukulkan.g:1175:4: (lv_maxBytesValue_2_0= rulemaxValidator )
                    // InternalKukulkan.g:1176:5: lv_maxBytesValue_2_0= rulemaxValidator
                    {

                    					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxValidatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maxBytesValue_2_0=rulemaxValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"maxBytesValue",
                    						lv_maxBytesValue_2_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblobValidators"


    // $ANTLR start "entryRulerequiredValidator"
    // InternalKukulkan.g:1197:1: entryRulerequiredValidator returns [String current=null] : iv_rulerequiredValidator= rulerequiredValidator EOF ;
    public final String entryRulerequiredValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerequiredValidator = null;


        try {
            // InternalKukulkan.g:1197:57: (iv_rulerequiredValidator= rulerequiredValidator EOF )
            // InternalKukulkan.g:1198:2: iv_rulerequiredValidator= rulerequiredValidator EOF
            {
             newCompositeNode(grammarAccess.getRequiredValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerequiredValidator=rulerequiredValidator();

            state._fsp--;

             current =iv_rulerequiredValidator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerequiredValidator"


    // $ANTLR start "rulerequiredValidator"
    // InternalKukulkan.g:1204:1: rulerequiredValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REQUIRED_0= RULE_REQUIRED ;
    public final AntlrDatatypeRuleToken rulerequiredValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REQUIRED_0=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1210:2: (this_REQUIRED_0= RULE_REQUIRED )
            // InternalKukulkan.g:1211:2: this_REQUIRED_0= RULE_REQUIRED
            {
            this_REQUIRED_0=(Token)match(input,RULE_REQUIRED,FOLLOW_2); 

            		current.merge(this_REQUIRED_0);
            	

            		newLeafNode(this_REQUIRED_0, grammarAccess.getRequiredValidatorAccess().getREQUIREDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerequiredValidator"


    // $ANTLR start "entryRulepatternValidator"
    // InternalKukulkan.g:1221:1: entryRulepatternValidator returns [String current=null] : iv_rulepatternValidator= rulepatternValidator EOF ;
    public final String entryRulepatternValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepatternValidator = null;


        try {
            // InternalKukulkan.g:1221:56: (iv_rulepatternValidator= rulepatternValidator EOF )
            // InternalKukulkan.g:1222:2: iv_rulepatternValidator= rulepatternValidator EOF
            {
             newCompositeNode(grammarAccess.getPatternValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepatternValidator=rulepatternValidator();

            state._fsp--;

             current =iv_rulepatternValidator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepatternValidator"


    // $ANTLR start "rulepatternValidator"
    // InternalKukulkan.g:1228:1: rulepatternValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PATTERN_0= RULE_PATTERN this_LPAREN_1= RULE_LPAREN this_PATTERN_VALUE_2= RULE_PATTERN_VALUE this_RPAREN_3= RULE_RPAREN ) ;
    public final AntlrDatatypeRuleToken rulepatternValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PATTERN_0=null;
        Token this_LPAREN_1=null;
        Token this_PATTERN_VALUE_2=null;
        Token this_RPAREN_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1234:2: ( (this_PATTERN_0= RULE_PATTERN this_LPAREN_1= RULE_LPAREN this_PATTERN_VALUE_2= RULE_PATTERN_VALUE this_RPAREN_3= RULE_RPAREN ) )
            // InternalKukulkan.g:1235:2: (this_PATTERN_0= RULE_PATTERN this_LPAREN_1= RULE_LPAREN this_PATTERN_VALUE_2= RULE_PATTERN_VALUE this_RPAREN_3= RULE_RPAREN )
            {
            // InternalKukulkan.g:1235:2: (this_PATTERN_0= RULE_PATTERN this_LPAREN_1= RULE_LPAREN this_PATTERN_VALUE_2= RULE_PATTERN_VALUE this_RPAREN_3= RULE_RPAREN )
            // InternalKukulkan.g:1236:3: this_PATTERN_0= RULE_PATTERN this_LPAREN_1= RULE_LPAREN this_PATTERN_VALUE_2= RULE_PATTERN_VALUE this_RPAREN_3= RULE_RPAREN
            {
            this_PATTERN_0=(Token)match(input,RULE_PATTERN,FOLLOW_17); 

            			current.merge(this_PATTERN_0);
            		

            			newLeafNode(this_PATTERN_0, grammarAccess.getPatternValidatorAccess().getPATTERNTerminalRuleCall_0());
            		
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_18); 

            			current.merge(this_LPAREN_1);
            		

            			newLeafNode(this_LPAREN_1, grammarAccess.getPatternValidatorAccess().getLPARENTerminalRuleCall_1());
            		
            this_PATTERN_VALUE_2=(Token)match(input,RULE_PATTERN_VALUE,FOLLOW_6); 

            			current.merge(this_PATTERN_VALUE_2);
            		

            			newLeafNode(this_PATTERN_VALUE_2, grammarAccess.getPatternValidatorAccess().getPATTERN_VALUETerminalRuleCall_2());
            		
            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

            			current.merge(this_RPAREN_3);
            		

            			newLeafNode(this_RPAREN_3, grammarAccess.getPatternValidatorAccess().getRPARENTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepatternValidator"


    // $ANTLR start "entryRuleminValidator"
    // InternalKukulkan.g:1268:1: entryRuleminValidator returns [String current=null] : iv_ruleminValidator= ruleminValidator EOF ;
    public final String entryRuleminValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleminValidator = null;


        try {
            // InternalKukulkan.g:1268:52: (iv_ruleminValidator= ruleminValidator EOF )
            // InternalKukulkan.g:1269:2: iv_ruleminValidator= ruleminValidator EOF
            {
             newCompositeNode(grammarAccess.getMinValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleminValidator=ruleminValidator();

            state._fsp--;

             current =iv_ruleminValidator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleminValidator"


    // $ANTLR start "ruleminValidator"
    // InternalKukulkan.g:1275:1: ruleminValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIN_0= RULE_MIN this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN ) ;
    public final AntlrDatatypeRuleToken ruleminValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIN_0=null;
        Token this_LPAREN_1=null;
        Token this_INT_2=null;
        Token this_RPAREN_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1281:2: ( (this_MIN_0= RULE_MIN this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN ) )
            // InternalKukulkan.g:1282:2: (this_MIN_0= RULE_MIN this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN )
            {
            // InternalKukulkan.g:1282:2: (this_MIN_0= RULE_MIN this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN )
            // InternalKukulkan.g:1283:3: this_MIN_0= RULE_MIN this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN
            {
            this_MIN_0=(Token)match(input,RULE_MIN,FOLLOW_17); 

            			current.merge(this_MIN_0);
            		

            			newLeafNode(this_MIN_0, grammarAccess.getMinValidatorAccess().getMINTerminalRuleCall_0());
            		
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_19); 

            			current.merge(this_LPAREN_1);
            		

            			newLeafNode(this_LPAREN_1, grammarAccess.getMinValidatorAccess().getLPARENTerminalRuleCall_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMinValidatorAccess().getINTTerminalRuleCall_2());
            		
            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

            			current.merge(this_RPAREN_3);
            		

            			newLeafNode(this_RPAREN_3, grammarAccess.getMinValidatorAccess().getRPARENTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleminValidator"


    // $ANTLR start "entryRulemaxValidator"
    // InternalKukulkan.g:1315:1: entryRulemaxValidator returns [String current=null] : iv_rulemaxValidator= rulemaxValidator EOF ;
    public final String entryRulemaxValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemaxValidator = null;


        try {
            // InternalKukulkan.g:1315:52: (iv_rulemaxValidator= rulemaxValidator EOF )
            // InternalKukulkan.g:1316:2: iv_rulemaxValidator= rulemaxValidator EOF
            {
             newCompositeNode(grammarAccess.getMaxValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemaxValidator=rulemaxValidator();

            state._fsp--;

             current =iv_rulemaxValidator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemaxValidator"


    // $ANTLR start "rulemaxValidator"
    // InternalKukulkan.g:1322:1: rulemaxValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAX_0= RULE_MAX this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN ) ;
    public final AntlrDatatypeRuleToken rulemaxValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAX_0=null;
        Token this_LPAREN_1=null;
        Token this_INT_2=null;
        Token this_RPAREN_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1328:2: ( (this_MAX_0= RULE_MAX this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN ) )
            // InternalKukulkan.g:1329:2: (this_MAX_0= RULE_MAX this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN )
            {
            // InternalKukulkan.g:1329:2: (this_MAX_0= RULE_MAX this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN )
            // InternalKukulkan.g:1330:3: this_MAX_0= RULE_MAX this_LPAREN_1= RULE_LPAREN this_INT_2= RULE_INT this_RPAREN_3= RULE_RPAREN
            {
            this_MAX_0=(Token)match(input,RULE_MAX,FOLLOW_17); 

            			current.merge(this_MAX_0);
            		

            			newLeafNode(this_MAX_0, grammarAccess.getMaxValidatorAccess().getMAXTerminalRuleCall_0());
            		
            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_19); 

            			current.merge(this_LPAREN_1);
            		

            			newLeafNode(this_LPAREN_1, grammarAccess.getMaxValidatorAccess().getLPARENTerminalRuleCall_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMaxValidatorAccess().getINTTerminalRuleCall_2());
            		
            this_RPAREN_3=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

            			current.merge(this_RPAREN_3);
            		

            			newLeafNode(this_RPAREN_3, grammarAccess.getMaxValidatorAccess().getRPARENTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemaxValidator"


    // $ANTLR start "entryRulecardinality"
    // InternalKukulkan.g:1362:1: entryRulecardinality returns [String current=null] : iv_rulecardinality= rulecardinality EOF ;
    public final String entryRulecardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecardinality = null;


        try {
            // InternalKukulkan.g:1362:51: (iv_rulecardinality= rulecardinality EOF )
            // InternalKukulkan.g:1363:2: iv_rulecardinality= rulecardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecardinality=rulecardinality();

            state._fsp--;

             current =iv_rulecardinality.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecardinality"


    // $ANTLR start "rulecardinality"
    // InternalKukulkan.g:1369:1: rulecardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ONE_TO_MANY_0= RULE_ONE_TO_MANY | this_MANY_TO_ONE_1= RULE_MANY_TO_ONE | this_ONE_TO_ONE_2= RULE_ONE_TO_ONE | this_MANY_TO_MANY_3= RULE_MANY_TO_MANY ) ;
    public final AntlrDatatypeRuleToken rulecardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ONE_TO_MANY_0=null;
        Token this_MANY_TO_ONE_1=null;
        Token this_ONE_TO_ONE_2=null;
        Token this_MANY_TO_MANY_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1375:2: ( (this_ONE_TO_MANY_0= RULE_ONE_TO_MANY | this_MANY_TO_ONE_1= RULE_MANY_TO_ONE | this_ONE_TO_ONE_2= RULE_ONE_TO_ONE | this_MANY_TO_MANY_3= RULE_MANY_TO_MANY ) )
            // InternalKukulkan.g:1376:2: (this_ONE_TO_MANY_0= RULE_ONE_TO_MANY | this_MANY_TO_ONE_1= RULE_MANY_TO_ONE | this_ONE_TO_ONE_2= RULE_ONE_TO_ONE | this_MANY_TO_MANY_3= RULE_MANY_TO_MANY )
            {
            // InternalKukulkan.g:1376:2: (this_ONE_TO_MANY_0= RULE_ONE_TO_MANY | this_MANY_TO_ONE_1= RULE_MANY_TO_ONE | this_ONE_TO_ONE_2= RULE_ONE_TO_ONE | this_MANY_TO_MANY_3= RULE_MANY_TO_MANY )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_ONE_TO_MANY:
                {
                alt20=1;
                }
                break;
            case RULE_MANY_TO_ONE:
                {
                alt20=2;
                }
                break;
            case RULE_ONE_TO_ONE:
                {
                alt20=3;
                }
                break;
            case RULE_MANY_TO_MANY:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalKukulkan.g:1377:3: this_ONE_TO_MANY_0= RULE_ONE_TO_MANY
                    {
                    this_ONE_TO_MANY_0=(Token)match(input,RULE_ONE_TO_MANY,FOLLOW_2); 

                    			current.merge(this_ONE_TO_MANY_0);
                    		

                    			newLeafNode(this_ONE_TO_MANY_0, grammarAccess.getCardinalityAccess().getONE_TO_MANYTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1385:3: this_MANY_TO_ONE_1= RULE_MANY_TO_ONE
                    {
                    this_MANY_TO_ONE_1=(Token)match(input,RULE_MANY_TO_ONE,FOLLOW_2); 

                    			current.merge(this_MANY_TO_ONE_1);
                    		

                    			newLeafNode(this_MANY_TO_ONE_1, grammarAccess.getCardinalityAccess().getMANY_TO_ONETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1393:3: this_ONE_TO_ONE_2= RULE_ONE_TO_ONE
                    {
                    this_ONE_TO_ONE_2=(Token)match(input,RULE_ONE_TO_ONE,FOLLOW_2); 

                    			current.merge(this_ONE_TO_ONE_2);
                    		

                    			newLeafNode(this_ONE_TO_ONE_2, grammarAccess.getCardinalityAccess().getONE_TO_ONETerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1401:3: this_MANY_TO_MANY_3= RULE_MANY_TO_MANY
                    {
                    this_MANY_TO_MANY_3=(Token)match(input,RULE_MANY_TO_MANY,FOLLOW_2); 

                    			current.merge(this_MANY_TO_MANY_3);
                    		

                    			newLeafNode(this_MANY_TO_MANY_3, grammarAccess.getCardinalityAccess().getMANY_TO_MANYTerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecardinality"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000142L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000F00000420L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000F00000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003FFF000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000AC000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000A4000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});

}