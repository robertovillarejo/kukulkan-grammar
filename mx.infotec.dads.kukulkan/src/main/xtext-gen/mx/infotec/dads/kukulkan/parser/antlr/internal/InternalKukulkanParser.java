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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'('", "')'", "'{'", "','", "'}'", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Boolean'", "'Date'", "'LocalDate'", "'ZonedDateTime'", "'Instant'", "'Blob'", "'AnyBlob'", "'ImageBlob'", "'TextBlob'", "'required'", "'minlength'", "'maxlength'", "'pattern'", "'min'", "'max'", "'minbytes'", "'maxbytes'", "'dto'", "'\"'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalKukulkan.g:71:1: ruledomainModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleentity ) )+ | ( (lv_settings_1_0= ruleoption ) ) ) ;
    public final EObject ruledomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_settings_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:77:2: ( ( ( (lv_entities_0_0= ruleentity ) )+ | ( (lv_settings_1_0= ruleoption ) ) ) )
            // InternalKukulkan.g:78:2: ( ( (lv_entities_0_0= ruleentity ) )+ | ( (lv_settings_1_0= ruleoption ) ) )
            {
            // InternalKukulkan.g:78:2: ( ( (lv_entities_0_0= ruleentity ) )+ | ( (lv_settings_1_0= ruleoption ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==40) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKukulkan.g:79:3: ( (lv_entities_0_0= ruleentity ) )+
                    {
                    // InternalKukulkan.g:79:3: ( (lv_entities_0_0= ruleentity ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalKukulkan.g:80:4: (lv_entities_0_0= ruleentity )
                    	    {
                    	    // InternalKukulkan.g:80:4: (lv_entities_0_0= ruleentity )
                    	    // InternalKukulkan.g:81:5: lv_entities_0_0= ruleentity
                    	    {

                    	    					newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0_0());
                    	    				
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
                    break;
                case 2 :
                    // InternalKukulkan.g:99:3: ( (lv_settings_1_0= ruleoption ) )
                    {
                    // InternalKukulkan.g:99:3: ( (lv_settings_1_0= ruleoption ) )
                    // InternalKukulkan.g:100:4: (lv_settings_1_0= ruleoption )
                    {
                    // InternalKukulkan.g:100:4: (lv_settings_1_0= ruleoption )
                    // InternalKukulkan.g:101:5: lv_settings_1_0= ruleoption
                    {

                    					newCompositeNode(grammarAccess.getDomainModelAccess().getSettingsOptionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_settings_1_0=ruleoption();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    					}
                    					add(
                    						current,
                    						"settings",
                    						lv_settings_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.option");
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
    // $ANTLR end "ruledomainModel"


    // $ANTLR start "entryRuleentity"
    // InternalKukulkan.g:122:1: entryRuleentity returns [EObject current=null] : iv_ruleentity= ruleentity EOF ;
    public final EObject entryRuleentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentity = null;


        try {
            // InternalKukulkan.g:122:47: (iv_ruleentity= ruleentity EOF )
            // InternalKukulkan.g:123:2: iv_ruleentity= ruleentity EOF
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
    // InternalKukulkan.g:129:1: ruleentity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )? ) ;
    public final EObject ruleentity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_tableName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:135:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )? ) )
            // InternalKukulkan.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )? )
            {
            // InternalKukulkan.g:136:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )? )
            // InternalKukulkan.g:137:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )? (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalKukulkan.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKukulkan.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKukulkan.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalKukulkan.g:143:5: lv_name_1_0= RULE_ID
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

            // InternalKukulkan.g:159:3: (otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKukulkan.g:160:4: otherlv_2= '(' ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalKukulkan.g:164:4: ( (lv_tableName_3_0= RULE_ID ) )
                    // InternalKukulkan.g:165:5: (lv_tableName_3_0= RULE_ID )
                    {
                    // InternalKukulkan.g:165:5: (lv_tableName_3_0= RULE_ID )
                    // InternalKukulkan.g:166:6: lv_tableName_3_0= RULE_ID
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

                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalKukulkan.g:187:3: (otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKukulkan.g:188:4: otherlv_5= '{' ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )? otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalKukulkan.g:192:4: ( ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalKukulkan.g:193:5: ( (lv_fields_6_0= ruleentityField ) ) ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )*
                            {
                            // InternalKukulkan.g:193:5: ( (lv_fields_6_0= ruleentityField ) )
                            // InternalKukulkan.g:194:6: (lv_fields_6_0= ruleentityField )
                            {
                            // InternalKukulkan.g:194:6: (lv_fields_6_0= ruleentityField )
                            // InternalKukulkan.g:195:7: lv_fields_6_0= ruleentityField
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

                            // InternalKukulkan.g:212:5: ( (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_ID||LA5_0==15) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalKukulkan.g:213:6: (otherlv_7= ',' )? ( (lv_fields_8_0= ruleentityField ) )
                            	    {
                            	    // InternalKukulkan.g:213:6: (otherlv_7= ',' )?
                            	    int alt4=2;
                            	    int LA4_0 = input.LA(1);

                            	    if ( (LA4_0==15) ) {
                            	        alt4=1;
                            	    }
                            	    switch (alt4) {
                            	        case 1 :
                            	            // InternalKukulkan.g:214:7: otherlv_7= ','
                            	            {
                            	            otherlv_7=(Token)match(input,15,FOLLOW_4); 

                            	            							newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_3_1_1_0());
                            	            						

                            	            }
                            	            break;

                            	    }

                            	    // InternalKukulkan.g:219:6: ( (lv_fields_8_0= ruleentityField ) )
                            	    // InternalKukulkan.g:220:7: (lv_fields_8_0= ruleentityField )
                            	    {
                            	    // InternalKukulkan.g:220:7: (lv_fields_8_0= ruleentityField )
                            	    // InternalKukulkan.g:221:8: lv_fields_8_0= ruleentityField
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
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // InternalKukulkan.g:249:1: entryRuleentityField returns [EObject current=null] : iv_ruleentityField= ruleentityField EOF ;
    public final EObject entryRuleentityField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentityField = null;


        try {
            // InternalKukulkan.g:249:52: (iv_ruleentityField= ruleentityField EOF )
            // InternalKukulkan.g:250:2: iv_ruleentityField= ruleentityField EOF
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
    // InternalKukulkan.g:256:1: ruleentityField returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= rulefieldType ) ) ) ;
    public final EObject ruleentityField() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:262:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= rulefieldType ) ) ) )
            // InternalKukulkan.g:263:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= rulefieldType ) ) )
            {
            // InternalKukulkan.g:263:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= rulefieldType ) ) )
            // InternalKukulkan.g:264:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= rulefieldType ) )
            {
            // InternalKukulkan.g:264:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalKukulkan.g:265:4: (lv_id_0_0= RULE_ID )
            {
            // InternalKukulkan.g:265:4: (lv_id_0_0= RULE_ID )
            // InternalKukulkan.g:266:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_id_0_0, grammarAccess.getEntityFieldAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKukulkan.g:282:3: ( (lv_type_1_0= rulefieldType ) )
            // InternalKukulkan.g:283:4: (lv_type_1_0= rulefieldType )
            {
            // InternalKukulkan.g:283:4: (lv_type_1_0= rulefieldType )
            // InternalKukulkan.g:284:5: lv_type_1_0= rulefieldType
            {

            					newCompositeNode(grammarAccess.getEntityFieldAccess().getTypeFieldTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=rulefieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
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
    // $ANTLR end "ruleentityField"


    // $ANTLR start "entryRulefieldType"
    // InternalKukulkan.g:305:1: entryRulefieldType returns [EObject current=null] : iv_rulefieldType= rulefieldType EOF ;
    public final EObject entryRulefieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefieldType = null;


        try {
            // InternalKukulkan.g:305:50: (iv_rulefieldType= rulefieldType EOF )
            // InternalKukulkan.g:306:2: iv_rulefieldType= rulefieldType EOF
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
    // InternalKukulkan.g:312:1: rulefieldType returns [EObject current=null] : (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType | this_entityType_5= ruleentityType ) ;
    public final EObject rulefieldType() throws RecognitionException {
        EObject current = null;

        EObject this_stringFieldType_0 = null;

        EObject this_numericFieldType_1 = null;

        EObject this_booleanFieldType_2 = null;

        EObject this_dateFieldType_3 = null;

        EObject this_blobFieldType_4 = null;

        EObject this_entityType_5 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:318:2: ( (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType | this_entityType_5= ruleentityType ) )
            // InternalKukulkan.g:319:2: (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType | this_entityType_5= ruleentityType )
            {
            // InternalKukulkan.g:319:2: (this_stringFieldType_0= rulestringFieldType | this_numericFieldType_1= rulenumericFieldType | this_booleanFieldType_2= rulebooleanFieldType | this_dateFieldType_3= ruledateFieldType | this_blobFieldType_4= ruleblobFieldType | this_entityType_5= ruleentityType )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt8=5;
                }
                break;
            case 11:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKukulkan.g:320:3: this_stringFieldType_0= rulestringFieldType
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
                    // InternalKukulkan.g:329:3: this_numericFieldType_1= rulenumericFieldType
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
                    // InternalKukulkan.g:338:3: this_booleanFieldType_2= rulebooleanFieldType
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
                    // InternalKukulkan.g:347:3: this_dateFieldType_3= ruledateFieldType
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
                    // InternalKukulkan.g:356:3: this_blobFieldType_4= ruleblobFieldType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_blobFieldType_4=ruleblobFieldType();

                    state._fsp--;


                    			current = this_blobFieldType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalKukulkan.g:365:3: this_entityType_5= ruleentityType
                    {

                    			newCompositeNode(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_entityType_5=ruleentityType();

                    state._fsp--;


                    			current = this_entityType_5;
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


    // $ANTLR start "entryRuleentityType"
    // InternalKukulkan.g:377:1: entryRuleentityType returns [EObject current=null] : iv_ruleentityType= ruleentityType EOF ;
    public final EObject entryRuleentityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentityType = null;


        try {
            // InternalKukulkan.g:377:51: (iv_ruleentityType= ruleentityType EOF )
            // InternalKukulkan.g:378:2: iv_ruleentityType= ruleentityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleentityType=ruleentityType();

            state._fsp--;

             current =iv_ruleentityType; 
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
    // $ANTLR end "entryRuleentityType"


    // $ANTLR start "ruleentityType"
    // InternalKukulkan.g:384:1: ruleentityType returns [EObject current=null] : this_entity_0= ruleentity ;
    public final EObject ruleentityType() throws RecognitionException {
        EObject current = null;

        EObject this_entity_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:390:2: (this_entity_0= ruleentity )
            // InternalKukulkan.g:391:2: this_entity_0= ruleentity
            {

            		newCompositeNode(grammarAccess.getEntityTypeAccess().getEntityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_entity_0=ruleentity();

            state._fsp--;


            		current = this_entity_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleentityType"


    // $ANTLR start "entryRulestringFieldType"
    // InternalKukulkan.g:402:1: entryRulestringFieldType returns [EObject current=null] : iv_rulestringFieldType= rulestringFieldType EOF ;
    public final EObject entryRulestringFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringFieldType = null;


        try {
            // InternalKukulkan.g:402:56: (iv_rulestringFieldType= rulestringFieldType EOF )
            // InternalKukulkan.g:403:2: iv_rulestringFieldType= rulestringFieldType EOF
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
    // InternalKukulkan.g:409:1: rulestringFieldType returns [EObject current=null] : ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* ) ;
    public final EObject rulestringFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:415:2: ( ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* ) )
            // InternalKukulkan.g:416:2: ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* )
            {
            // InternalKukulkan.g:416:2: ( ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )* )
            // InternalKukulkan.g:417:3: ( (lv_name_0_0= rulestringType ) ) ( (lv_constraints_1_0= rulestringValidators ) )*
            {
            // InternalKukulkan.g:417:3: ( (lv_name_0_0= rulestringType ) )
            // InternalKukulkan.g:418:4: (lv_name_0_0= rulestringType )
            {
            // InternalKukulkan.g:418:4: (lv_name_0_0= rulestringType )
            // InternalKukulkan.g:419:5: lv_name_0_0= rulestringType
            {

            					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getNameStringTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalKukulkan.g:436:3: ( (lv_constraints_1_0= rulestringValidators ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=32 && LA9_0<=35)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKukulkan.g:437:4: (lv_constraints_1_0= rulestringValidators )
            	    {
            	    // InternalKukulkan.g:437:4: (lv_constraints_1_0= rulestringValidators )
            	    // InternalKukulkan.g:438:5: lv_constraints_1_0= rulestringValidators
            	    {

            	    					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getConstraintsStringValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
    // InternalKukulkan.g:459:1: entryRulestringType returns [String current=null] : iv_rulestringType= rulestringType EOF ;
    public final String entryRulestringType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestringType = null;


        try {
            // InternalKukulkan.g:459:50: (iv_rulestringType= rulestringType EOF )
            // InternalKukulkan.g:460:2: iv_rulestringType= rulestringType EOF
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
    // InternalKukulkan.g:466:1: rulestringType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken rulestringType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:472:2: (kw= 'String' )
            // InternalKukulkan.g:473:2: kw= 'String'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getStringTypeAccess().getStringKeyword());
            	

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
    // InternalKukulkan.g:481:1: entryRulenumericFieldType returns [EObject current=null] : iv_rulenumericFieldType= rulenumericFieldType EOF ;
    public final EObject entryRulenumericFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumericFieldType = null;


        try {
            // InternalKukulkan.g:481:57: (iv_rulenumericFieldType= rulenumericFieldType EOF )
            // InternalKukulkan.g:482:2: iv_rulenumericFieldType= rulenumericFieldType EOF
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
    // InternalKukulkan.g:488:1: rulenumericFieldType returns [EObject current=null] : ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* ) ;
    public final EObject rulenumericFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:494:2: ( ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* ) )
            // InternalKukulkan.g:495:2: ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* )
            {
            // InternalKukulkan.g:495:2: ( ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )* )
            // InternalKukulkan.g:496:3: ( (lv_name_0_0= rulenumericTypes ) ) ( (lv_constraints_1_0= rulenumericValidators ) )*
            {
            // InternalKukulkan.g:496:3: ( (lv_name_0_0= rulenumericTypes ) )
            // InternalKukulkan.g:497:4: (lv_name_0_0= rulenumericTypes )
            {
            // InternalKukulkan.g:497:4: (lv_name_0_0= rulenumericTypes )
            // InternalKukulkan.g:498:5: lv_name_0_0= rulenumericTypes
            {

            					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getNameNumericTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalKukulkan.g:515:3: ( (lv_constraints_1_0= rulenumericValidators ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32||(LA10_0>=36 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKukulkan.g:516:4: (lv_constraints_1_0= rulenumericValidators )
            	    {
            	    // InternalKukulkan.g:516:4: (lv_constraints_1_0= rulenumericValidators )
            	    // InternalKukulkan.g:517:5: lv_constraints_1_0= rulenumericValidators
            	    {

            	    					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getConstraintsNumericValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
    // InternalKukulkan.g:538:1: entryRulenumericTypes returns [String current=null] : iv_rulenumericTypes= rulenumericTypes EOF ;
    public final String entryRulenumericTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumericTypes = null;


        try {
            // InternalKukulkan.g:538:52: (iv_rulenumericTypes= rulenumericTypes EOF )
            // InternalKukulkan.g:539:2: iv_rulenumericTypes= rulenumericTypes EOF
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
    // InternalKukulkan.g:545:1: rulenumericTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= ruleINTEGER | this_LONG_1= ruleLONG | this_BIG_DECIMAL_2= ruleBIG_DECIMAL | this_FLOAT_3= ruleFLOAT | this_DOUBLE_4= ruleDOUBLE ) ;
    public final AntlrDatatypeRuleToken rulenumericTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_INTEGER_0 = null;

        AntlrDatatypeRuleToken this_LONG_1 = null;

        AntlrDatatypeRuleToken this_BIG_DECIMAL_2 = null;

        AntlrDatatypeRuleToken this_FLOAT_3 = null;

        AntlrDatatypeRuleToken this_DOUBLE_4 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:551:2: ( (this_INTEGER_0= ruleINTEGER | this_LONG_1= ruleLONG | this_BIG_DECIMAL_2= ruleBIG_DECIMAL | this_FLOAT_3= ruleFLOAT | this_DOUBLE_4= ruleDOUBLE ) )
            // InternalKukulkan.g:552:2: (this_INTEGER_0= ruleINTEGER | this_LONG_1= ruleLONG | this_BIG_DECIMAL_2= ruleBIG_DECIMAL | this_FLOAT_3= ruleFLOAT | this_DOUBLE_4= ruleDOUBLE )
            {
            // InternalKukulkan.g:552:2: (this_INTEGER_0= ruleINTEGER | this_LONG_1= ruleLONG | this_BIG_DECIMAL_2= ruleBIG_DECIMAL | this_FLOAT_3= ruleFLOAT | this_DOUBLE_4= ruleDOUBLE )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
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
                    // InternalKukulkan.g:553:3: this_INTEGER_0= ruleINTEGER
                    {

                    			newCompositeNode(grammarAccess.getNumericTypesAccess().getINTEGERParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_INTEGER_0=ruleINTEGER();

                    state._fsp--;


                    			current.merge(this_INTEGER_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:564:3: this_LONG_1= ruleLONG
                    {

                    			newCompositeNode(grammarAccess.getNumericTypesAccess().getLONGParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LONG_1=ruleLONG();

                    state._fsp--;


                    			current.merge(this_LONG_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:575:3: this_BIG_DECIMAL_2= ruleBIG_DECIMAL
                    {

                    			newCompositeNode(grammarAccess.getNumericTypesAccess().getBIG_DECIMALParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BIG_DECIMAL_2=ruleBIG_DECIMAL();

                    state._fsp--;


                    			current.merge(this_BIG_DECIMAL_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:586:3: this_FLOAT_3= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getNumericTypesAccess().getFLOATParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_3=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:597:3: this_DOUBLE_4= ruleDOUBLE
                    {

                    			newCompositeNode(grammarAccess.getNumericTypesAccess().getDOUBLEParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOUBLE_4=ruleDOUBLE();

                    state._fsp--;


                    			current.merge(this_DOUBLE_4);
                    		

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
    // $ANTLR end "rulenumericTypes"


    // $ANTLR start "entryRuleINTEGER"
    // InternalKukulkan.g:611:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalKukulkan.g:611:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalKukulkan.g:612:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
             newCompositeNode(grammarAccess.getINTEGERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;

             current =iv_ruleINTEGER.getText(); 
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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalKukulkan.g:618:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:624:2: (kw= 'Integer' )
            // InternalKukulkan.g:625:2: kw= 'Integer'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getINTEGERAccess().getIntegerKeyword());
            	

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleLONG"
    // InternalKukulkan.g:633:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalKukulkan.g:633:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalKukulkan.g:634:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalKukulkan.g:640:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Long' ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:646:2: (kw= 'Long' )
            // InternalKukulkan.g:647:2: kw= 'Long'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLONGAccess().getLongKeyword());
            	

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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleBIG_DECIMAL"
    // InternalKukulkan.g:655:1: entryRuleBIG_DECIMAL returns [String current=null] : iv_ruleBIG_DECIMAL= ruleBIG_DECIMAL EOF ;
    public final String entryRuleBIG_DECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBIG_DECIMAL = null;


        try {
            // InternalKukulkan.g:655:51: (iv_ruleBIG_DECIMAL= ruleBIG_DECIMAL EOF )
            // InternalKukulkan.g:656:2: iv_ruleBIG_DECIMAL= ruleBIG_DECIMAL EOF
            {
             newCompositeNode(grammarAccess.getBIG_DECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBIG_DECIMAL=ruleBIG_DECIMAL();

            state._fsp--;

             current =iv_ruleBIG_DECIMAL.getText(); 
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
    // $ANTLR end "entryRuleBIG_DECIMAL"


    // $ANTLR start "ruleBIG_DECIMAL"
    // InternalKukulkan.g:662:1: ruleBIG_DECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BigDecimal' ;
    public final AntlrDatatypeRuleToken ruleBIG_DECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:668:2: (kw= 'BigDecimal' )
            // InternalKukulkan.g:669:2: kw= 'BigDecimal'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBIG_DECIMALAccess().getBigDecimalKeyword());
            	

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
    // $ANTLR end "ruleBIG_DECIMAL"


    // $ANTLR start "entryRuleFLOAT"
    // InternalKukulkan.g:677:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalKukulkan.g:677:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalKukulkan.g:678:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalKukulkan.g:684:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Float' ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:690:2: (kw= 'Float' )
            // InternalKukulkan.g:691:2: kw= 'Float'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFLOATAccess().getFloatKeyword());
            	

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalKukulkan.g:699:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalKukulkan.g:699:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalKukulkan.g:700:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalKukulkan.g:706:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:712:2: (kw= 'Double' )
            // InternalKukulkan.g:713:2: kw= 'Double'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDOUBLEAccess().getDoubleKeyword());
            	

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulebooleanFieldType"
    // InternalKukulkan.g:721:1: entryRulebooleanFieldType returns [EObject current=null] : iv_rulebooleanFieldType= rulebooleanFieldType EOF ;
    public final EObject entryRulebooleanFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebooleanFieldType = null;


        try {
            // InternalKukulkan.g:721:57: (iv_rulebooleanFieldType= rulebooleanFieldType EOF )
            // InternalKukulkan.g:722:2: iv_rulebooleanFieldType= rulebooleanFieldType EOF
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
    // InternalKukulkan.g:728:1: rulebooleanFieldType returns [EObject current=null] : ( ( (lv_name_0_0= ruleBOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )* ) ;
    public final EObject rulebooleanFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_required_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:734:2: ( ( ( (lv_name_0_0= ruleBOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )* ) )
            // InternalKukulkan.g:735:2: ( ( (lv_name_0_0= ruleBOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )* )
            {
            // InternalKukulkan.g:735:2: ( ( (lv_name_0_0= ruleBOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )* )
            // InternalKukulkan.g:736:3: ( (lv_name_0_0= ruleBOOLEAN_TYPE ) ) ( (lv_required_1_0= rulerequiredValidator ) )*
            {
            // InternalKukulkan.g:736:3: ( (lv_name_0_0= ruleBOOLEAN_TYPE ) )
            // InternalKukulkan.g:737:4: (lv_name_0_0= ruleBOOLEAN_TYPE )
            {
            // InternalKukulkan.g:737:4: (lv_name_0_0= ruleBOOLEAN_TYPE )
            // InternalKukulkan.g:738:5: lv_name_0_0= ruleBOOLEAN_TYPE
            {

            					newCompositeNode(grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_0_0=ruleBOOLEAN_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanFieldTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"mx.infotec.dads.kukulkan.Kukulkan.BOOLEAN_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKukulkan.g:755:3: ( (lv_required_1_0= rulerequiredValidator ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKukulkan.g:756:4: (lv_required_1_0= rulerequiredValidator )
            	    {
            	    // InternalKukulkan.g:756:4: (lv_required_1_0= rulerequiredValidator )
            	    // InternalKukulkan.g:757:5: lv_required_1_0= rulerequiredValidator
            	    {

            	    					newCompositeNode(grammarAccess.getBooleanFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
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

            	default :
            	    break loop12;
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
    // $ANTLR end "rulebooleanFieldType"


    // $ANTLR start "entryRuleBOOLEAN_TYPE"
    // InternalKukulkan.g:778:1: entryRuleBOOLEAN_TYPE returns [String current=null] : iv_ruleBOOLEAN_TYPE= ruleBOOLEAN_TYPE EOF ;
    public final String entryRuleBOOLEAN_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN_TYPE = null;


        try {
            // InternalKukulkan.g:778:52: (iv_ruleBOOLEAN_TYPE= ruleBOOLEAN_TYPE EOF )
            // InternalKukulkan.g:779:2: iv_ruleBOOLEAN_TYPE= ruleBOOLEAN_TYPE EOF
            {
             newCompositeNode(grammarAccess.getBOOLEAN_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN_TYPE=ruleBOOLEAN_TYPE();

            state._fsp--;

             current =iv_ruleBOOLEAN_TYPE.getText(); 
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
    // $ANTLR end "entryRuleBOOLEAN_TYPE"


    // $ANTLR start "ruleBOOLEAN_TYPE"
    // InternalKukulkan.g:785:1: ruleBOOLEAN_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:791:2: (kw= 'Boolean' )
            // InternalKukulkan.g:792:2: kw= 'Boolean'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBOOLEAN_TYPEAccess().getBooleanKeyword());
            	

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
    // $ANTLR end "ruleBOOLEAN_TYPE"


    // $ANTLR start "entryRuledateFieldType"
    // InternalKukulkan.g:800:1: entryRuledateFieldType returns [EObject current=null] : iv_ruledateFieldType= ruledateFieldType EOF ;
    public final EObject entryRuledateFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledateFieldType = null;


        try {
            // InternalKukulkan.g:800:54: (iv_ruledateFieldType= ruledateFieldType EOF )
            // InternalKukulkan.g:801:2: iv_ruledateFieldType= ruledateFieldType EOF
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
    // InternalKukulkan.g:807:1: ruledateFieldType returns [EObject current=null] : ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) ;
    public final EObject ruledateFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_required_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:813:2: ( ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? ) )
            // InternalKukulkan.g:814:2: ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            {
            // InternalKukulkan.g:814:2: ( ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )? )
            // InternalKukulkan.g:815:3: ( (lv_type_0_0= ruledateTypes ) ) ( (lv_required_1_0= rulerequiredValidator ) )?
            {
            // InternalKukulkan.g:815:3: ( (lv_type_0_0= ruledateTypes ) )
            // InternalKukulkan.g:816:4: (lv_type_0_0= ruledateTypes )
            {
            // InternalKukulkan.g:816:4: (lv_type_0_0= ruledateTypes )
            // InternalKukulkan.g:817:5: lv_type_0_0= ruledateTypes
            {

            					newCompositeNode(grammarAccess.getDateFieldTypeAccess().getTypeDateTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalKukulkan.g:834:3: ( (lv_required_1_0= rulerequiredValidator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKukulkan.g:835:4: (lv_required_1_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:835:4: (lv_required_1_0= rulerequiredValidator )
                    // InternalKukulkan.g:836:5: lv_required_1_0= rulerequiredValidator
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
    // InternalKukulkan.g:857:1: entryRuledateTypes returns [String current=null] : iv_ruledateTypes= ruledateTypes EOF ;
    public final String entryRuledateTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledateTypes = null;


        try {
            // InternalKukulkan.g:857:49: (iv_ruledateTypes= ruledateTypes EOF )
            // InternalKukulkan.g:858:2: iv_ruledateTypes= ruledateTypes EOF
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
    // InternalKukulkan.g:864:1: ruledateTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DATE_0= ruleDATE | this_LOCAL_DATE_1= ruleLOCAL_DATE | this_ZONED_DATETIME_2= ruleZONED_DATETIME | this_INSTANT_3= ruleINSTANT ) ;
    public final AntlrDatatypeRuleToken ruledateTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DATE_0 = null;

        AntlrDatatypeRuleToken this_LOCAL_DATE_1 = null;

        AntlrDatatypeRuleToken this_ZONED_DATETIME_2 = null;

        AntlrDatatypeRuleToken this_INSTANT_3 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:870:2: ( (this_DATE_0= ruleDATE | this_LOCAL_DATE_1= ruleLOCAL_DATE | this_ZONED_DATETIME_2= ruleZONED_DATETIME | this_INSTANT_3= ruleINSTANT ) )
            // InternalKukulkan.g:871:2: (this_DATE_0= ruleDATE | this_LOCAL_DATE_1= ruleLOCAL_DATE | this_ZONED_DATETIME_2= ruleZONED_DATETIME | this_INSTANT_3= ruleINSTANT )
            {
            // InternalKukulkan.g:871:2: (this_DATE_0= ruleDATE | this_LOCAL_DATE_1= ruleLOCAL_DATE | this_ZONED_DATETIME_2= ruleZONED_DATETIME | this_INSTANT_3= ruleINSTANT )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalKukulkan.g:872:3: this_DATE_0= ruleDATE
                    {

                    			newCompositeNode(grammarAccess.getDateTypesAccess().getDATEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DATE_0=ruleDATE();

                    state._fsp--;


                    			current.merge(this_DATE_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:883:3: this_LOCAL_DATE_1= ruleLOCAL_DATE
                    {

                    			newCompositeNode(grammarAccess.getDateTypesAccess().getLOCAL_DATEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LOCAL_DATE_1=ruleLOCAL_DATE();

                    state._fsp--;


                    			current.merge(this_LOCAL_DATE_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:894:3: this_ZONED_DATETIME_2= ruleZONED_DATETIME
                    {

                    			newCompositeNode(grammarAccess.getDateTypesAccess().getZONED_DATETIMEParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ZONED_DATETIME_2=ruleZONED_DATETIME();

                    state._fsp--;


                    			current.merge(this_ZONED_DATETIME_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:905:3: this_INSTANT_3= ruleINSTANT
                    {

                    			newCompositeNode(grammarAccess.getDateTypesAccess().getINSTANTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_INSTANT_3=ruleINSTANT();

                    state._fsp--;


                    			current.merge(this_INSTANT_3);
                    		

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
    // $ANTLR end "ruledateTypes"


    // $ANTLR start "entryRuleDATE"
    // InternalKukulkan.g:919:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalKukulkan.g:919:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalKukulkan.g:920:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE.getText(); 
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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalKukulkan.g:926:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Date' ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:932:2: (kw= 'Date' )
            // InternalKukulkan.g:933:2: kw= 'Date'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDATEAccess().getDateKeyword());
            	

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleLOCAL_DATE"
    // InternalKukulkan.g:941:1: entryRuleLOCAL_DATE returns [String current=null] : iv_ruleLOCAL_DATE= ruleLOCAL_DATE EOF ;
    public final String entryRuleLOCAL_DATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOCAL_DATE = null;


        try {
            // InternalKukulkan.g:941:50: (iv_ruleLOCAL_DATE= ruleLOCAL_DATE EOF )
            // InternalKukulkan.g:942:2: iv_ruleLOCAL_DATE= ruleLOCAL_DATE EOF
            {
             newCompositeNode(grammarAccess.getLOCAL_DATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLOCAL_DATE=ruleLOCAL_DATE();

            state._fsp--;

             current =iv_ruleLOCAL_DATE.getText(); 
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
    // $ANTLR end "entryRuleLOCAL_DATE"


    // $ANTLR start "ruleLOCAL_DATE"
    // InternalKukulkan.g:948:1: ruleLOCAL_DATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LocalDate' ;
    public final AntlrDatatypeRuleToken ruleLOCAL_DATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:954:2: (kw= 'LocalDate' )
            // InternalKukulkan.g:955:2: kw= 'LocalDate'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLOCAL_DATEAccess().getLocalDateKeyword());
            	

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
    // $ANTLR end "ruleLOCAL_DATE"


    // $ANTLR start "entryRuleZONED_DATETIME"
    // InternalKukulkan.g:963:1: entryRuleZONED_DATETIME returns [String current=null] : iv_ruleZONED_DATETIME= ruleZONED_DATETIME EOF ;
    public final String entryRuleZONED_DATETIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleZONED_DATETIME = null;


        try {
            // InternalKukulkan.g:963:54: (iv_ruleZONED_DATETIME= ruleZONED_DATETIME EOF )
            // InternalKukulkan.g:964:2: iv_ruleZONED_DATETIME= ruleZONED_DATETIME EOF
            {
             newCompositeNode(grammarAccess.getZONED_DATETIMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZONED_DATETIME=ruleZONED_DATETIME();

            state._fsp--;

             current =iv_ruleZONED_DATETIME.getText(); 
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
    // $ANTLR end "entryRuleZONED_DATETIME"


    // $ANTLR start "ruleZONED_DATETIME"
    // InternalKukulkan.g:970:1: ruleZONED_DATETIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ZonedDateTime' ;
    public final AntlrDatatypeRuleToken ruleZONED_DATETIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:976:2: (kw= 'ZonedDateTime' )
            // InternalKukulkan.g:977:2: kw= 'ZonedDateTime'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getZONED_DATETIMEAccess().getZonedDateTimeKeyword());
            	

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
    // $ANTLR end "ruleZONED_DATETIME"


    // $ANTLR start "entryRuleINSTANT"
    // InternalKukulkan.g:985:1: entryRuleINSTANT returns [String current=null] : iv_ruleINSTANT= ruleINSTANT EOF ;
    public final String entryRuleINSTANT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINSTANT = null;


        try {
            // InternalKukulkan.g:985:47: (iv_ruleINSTANT= ruleINSTANT EOF )
            // InternalKukulkan.g:986:2: iv_ruleINSTANT= ruleINSTANT EOF
            {
             newCompositeNode(grammarAccess.getINSTANTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTANT=ruleINSTANT();

            state._fsp--;

             current =iv_ruleINSTANT.getText(); 
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
    // $ANTLR end "entryRuleINSTANT"


    // $ANTLR start "ruleINSTANT"
    // InternalKukulkan.g:992:1: ruleINSTANT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Instant' ;
    public final AntlrDatatypeRuleToken ruleINSTANT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:998:2: (kw= 'Instant' )
            // InternalKukulkan.g:999:2: kw= 'Instant'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getINSTANTAccess().getInstantKeyword());
            	

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
    // $ANTLR end "ruleINSTANT"


    // $ANTLR start "entryRuleblobFieldType"
    // InternalKukulkan.g:1007:1: entryRuleblobFieldType returns [EObject current=null] : iv_ruleblobFieldType= ruleblobFieldType EOF ;
    public final EObject entryRuleblobFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblobFieldType = null;


        try {
            // InternalKukulkan.g:1007:54: (iv_ruleblobFieldType= ruleblobFieldType EOF )
            // InternalKukulkan.g:1008:2: iv_ruleblobFieldType= ruleblobFieldType EOF
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
    // InternalKukulkan.g:1014:1: ruleblobFieldType returns [EObject current=null] : ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* ) ;
    public final EObject ruleblobFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1020:2: ( ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* ) )
            // InternalKukulkan.g:1021:2: ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* )
            {
            // InternalKukulkan.g:1021:2: ( ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )* )
            // InternalKukulkan.g:1022:3: ( (lv_name_0_0= ruleblobTypes ) ) ( (lv_constraints_1_0= ruleblobValidators ) )*
            {
            // InternalKukulkan.g:1022:3: ( (lv_name_0_0= ruleblobTypes ) )
            // InternalKukulkan.g:1023:4: (lv_name_0_0= ruleblobTypes )
            {
            // InternalKukulkan.g:1023:4: (lv_name_0_0= ruleblobTypes )
            // InternalKukulkan.g:1024:5: lv_name_0_0= ruleblobTypes
            {

            					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getNameBlobTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalKukulkan.g:1041:3: ( (lv_constraints_1_0= ruleblobValidators ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32||(LA15_0>=38 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKukulkan.g:1042:4: (lv_constraints_1_0= ruleblobValidators )
            	    {
            	    // InternalKukulkan.g:1042:4: (lv_constraints_1_0= ruleblobValidators )
            	    // InternalKukulkan.g:1043:5: lv_constraints_1_0= ruleblobValidators
            	    {

            	    					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getConstraintsBlobValidatorsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
    // InternalKukulkan.g:1064:1: entryRuleblobTypes returns [String current=null] : iv_ruleblobTypes= ruleblobTypes EOF ;
    public final String entryRuleblobTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleblobTypes = null;


        try {
            // InternalKukulkan.g:1064:49: (iv_ruleblobTypes= ruleblobTypes EOF )
            // InternalKukulkan.g:1065:2: iv_ruleblobTypes= ruleblobTypes EOF
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
    // InternalKukulkan.g:1071:1: ruleblobTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BLOB_0= ruleBLOB | this_ANY_BLOB_1= ruleANY_BLOB | this_IMAGE_BLOB_2= ruleIMAGE_BLOB | this_TEXT_BLOB_3= ruleTEXT_BLOB ) ;
    public final AntlrDatatypeRuleToken ruleblobTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BLOB_0 = null;

        AntlrDatatypeRuleToken this_ANY_BLOB_1 = null;

        AntlrDatatypeRuleToken this_IMAGE_BLOB_2 = null;

        AntlrDatatypeRuleToken this_TEXT_BLOB_3 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1077:2: ( (this_BLOB_0= ruleBLOB | this_ANY_BLOB_1= ruleANY_BLOB | this_IMAGE_BLOB_2= ruleIMAGE_BLOB | this_TEXT_BLOB_3= ruleTEXT_BLOB ) )
            // InternalKukulkan.g:1078:2: (this_BLOB_0= ruleBLOB | this_ANY_BLOB_1= ruleANY_BLOB | this_IMAGE_BLOB_2= ruleIMAGE_BLOB | this_TEXT_BLOB_3= ruleTEXT_BLOB )
            {
            // InternalKukulkan.g:1078:2: (this_BLOB_0= ruleBLOB | this_ANY_BLOB_1= ruleANY_BLOB | this_IMAGE_BLOB_2= ruleIMAGE_BLOB | this_TEXT_BLOB_3= ruleTEXT_BLOB )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 31:
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
                    // InternalKukulkan.g:1079:3: this_BLOB_0= ruleBLOB
                    {

                    			newCompositeNode(grammarAccess.getBlobTypesAccess().getBLOBParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BLOB_0=ruleBLOB();

                    state._fsp--;


                    			current.merge(this_BLOB_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1090:3: this_ANY_BLOB_1= ruleANY_BLOB
                    {

                    			newCompositeNode(grammarAccess.getBlobTypesAccess().getANY_BLOBParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANY_BLOB_1=ruleANY_BLOB();

                    state._fsp--;


                    			current.merge(this_ANY_BLOB_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1101:3: this_IMAGE_BLOB_2= ruleIMAGE_BLOB
                    {

                    			newCompositeNode(grammarAccess.getBlobTypesAccess().getIMAGE_BLOBParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IMAGE_BLOB_2=ruleIMAGE_BLOB();

                    state._fsp--;


                    			current.merge(this_IMAGE_BLOB_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1112:3: this_TEXT_BLOB_3= ruleTEXT_BLOB
                    {

                    			newCompositeNode(grammarAccess.getBlobTypesAccess().getTEXT_BLOBParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TEXT_BLOB_3=ruleTEXT_BLOB();

                    state._fsp--;


                    			current.merge(this_TEXT_BLOB_3);
                    		

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
    // $ANTLR end "ruleblobTypes"


    // $ANTLR start "entryRuleBLOB"
    // InternalKukulkan.g:1126:1: entryRuleBLOB returns [String current=null] : iv_ruleBLOB= ruleBLOB EOF ;
    public final String entryRuleBLOB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBLOB = null;


        try {
            // InternalKukulkan.g:1126:44: (iv_ruleBLOB= ruleBLOB EOF )
            // InternalKukulkan.g:1127:2: iv_ruleBLOB= ruleBLOB EOF
            {
             newCompositeNode(grammarAccess.getBLOBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBLOB=ruleBLOB();

            state._fsp--;

             current =iv_ruleBLOB.getText(); 
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
    // $ANTLR end "entryRuleBLOB"


    // $ANTLR start "ruleBLOB"
    // InternalKukulkan.g:1133:1: ruleBLOB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Blob' ;
    public final AntlrDatatypeRuleToken ruleBLOB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1139:2: (kw= 'Blob' )
            // InternalKukulkan.g:1140:2: kw= 'Blob'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBLOBAccess().getBlobKeyword());
            	

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
    // $ANTLR end "ruleBLOB"


    // $ANTLR start "entryRuleANY_BLOB"
    // InternalKukulkan.g:1148:1: entryRuleANY_BLOB returns [String current=null] : iv_ruleANY_BLOB= ruleANY_BLOB EOF ;
    public final String entryRuleANY_BLOB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANY_BLOB = null;


        try {
            // InternalKukulkan.g:1148:48: (iv_ruleANY_BLOB= ruleANY_BLOB EOF )
            // InternalKukulkan.g:1149:2: iv_ruleANY_BLOB= ruleANY_BLOB EOF
            {
             newCompositeNode(grammarAccess.getANY_BLOBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANY_BLOB=ruleANY_BLOB();

            state._fsp--;

             current =iv_ruleANY_BLOB.getText(); 
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
    // $ANTLR end "entryRuleANY_BLOB"


    // $ANTLR start "ruleANY_BLOB"
    // InternalKukulkan.g:1155:1: ruleANY_BLOB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AnyBlob' ;
    public final AntlrDatatypeRuleToken ruleANY_BLOB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1161:2: (kw= 'AnyBlob' )
            // InternalKukulkan.g:1162:2: kw= 'AnyBlob'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getANY_BLOBAccess().getAnyBlobKeyword());
            	

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
    // $ANTLR end "ruleANY_BLOB"


    // $ANTLR start "entryRuleIMAGE_BLOB"
    // InternalKukulkan.g:1170:1: entryRuleIMAGE_BLOB returns [String current=null] : iv_ruleIMAGE_BLOB= ruleIMAGE_BLOB EOF ;
    public final String entryRuleIMAGE_BLOB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_BLOB = null;


        try {
            // InternalKukulkan.g:1170:50: (iv_ruleIMAGE_BLOB= ruleIMAGE_BLOB EOF )
            // InternalKukulkan.g:1171:2: iv_ruleIMAGE_BLOB= ruleIMAGE_BLOB EOF
            {
             newCompositeNode(grammarAccess.getIMAGE_BLOBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAGE_BLOB=ruleIMAGE_BLOB();

            state._fsp--;

             current =iv_ruleIMAGE_BLOB.getText(); 
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
    // $ANTLR end "entryRuleIMAGE_BLOB"


    // $ANTLR start "ruleIMAGE_BLOB"
    // InternalKukulkan.g:1177:1: ruleIMAGE_BLOB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ImageBlob' ;
    public final AntlrDatatypeRuleToken ruleIMAGE_BLOB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1183:2: (kw= 'ImageBlob' )
            // InternalKukulkan.g:1184:2: kw= 'ImageBlob'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getIMAGE_BLOBAccess().getImageBlobKeyword());
            	

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
    // $ANTLR end "ruleIMAGE_BLOB"


    // $ANTLR start "entryRuleTEXT_BLOB"
    // InternalKukulkan.g:1192:1: entryRuleTEXT_BLOB returns [String current=null] : iv_ruleTEXT_BLOB= ruleTEXT_BLOB EOF ;
    public final String entryRuleTEXT_BLOB() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT_BLOB = null;


        try {
            // InternalKukulkan.g:1192:49: (iv_ruleTEXT_BLOB= ruleTEXT_BLOB EOF )
            // InternalKukulkan.g:1193:2: iv_ruleTEXT_BLOB= ruleTEXT_BLOB EOF
            {
             newCompositeNode(grammarAccess.getTEXT_BLOBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTEXT_BLOB=ruleTEXT_BLOB();

            state._fsp--;

             current =iv_ruleTEXT_BLOB.getText(); 
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
    // $ANTLR end "entryRuleTEXT_BLOB"


    // $ANTLR start "ruleTEXT_BLOB"
    // InternalKukulkan.g:1199:1: ruleTEXT_BLOB returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TextBlob' ;
    public final AntlrDatatypeRuleToken ruleTEXT_BLOB() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1205:2: (kw= 'TextBlob' )
            // InternalKukulkan.g:1206:2: kw= 'TextBlob'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTEXT_BLOBAccess().getTextBlobKeyword());
            	

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
    // $ANTLR end "ruleTEXT_BLOB"


    // $ANTLR start "entryRulestringValidators"
    // InternalKukulkan.g:1214:1: entryRulestringValidators returns [EObject current=null] : iv_rulestringValidators= rulestringValidators EOF ;
    public final EObject entryRulestringValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringValidators = null;


        try {
            // InternalKukulkan.g:1214:57: (iv_rulestringValidators= rulestringValidators EOF )
            // InternalKukulkan.g:1215:2: iv_rulestringValidators= rulestringValidators EOF
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
    // InternalKukulkan.g:1221:1: rulestringValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminLengthValidator ) ) | ( (lv_maxLenght_2_0= rulemaxLengthValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) ) ;
    public final EObject rulestringValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minLenght_1_0 = null;

        AntlrDatatypeRuleToken lv_maxLenght_2_0 = null;

        AntlrDatatypeRuleToken lv_pattern_3_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1227:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminLengthValidator ) ) | ( (lv_maxLenght_2_0= rulemaxLengthValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) ) )
            // InternalKukulkan.g:1228:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminLengthValidator ) ) | ( (lv_maxLenght_2_0= rulemaxLengthValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) )
            {
            // InternalKukulkan.g:1228:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minLenght_1_0= ruleminLengthValidator ) ) | ( (lv_maxLenght_2_0= rulemaxLengthValidator ) ) | ( (lv_pattern_3_0= rulepatternValidator ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
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
                    // InternalKukulkan.g:1229:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:1229:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:1230:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:1230:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:1231:5: lv_required_0_0= rulerequiredValidator
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
                    // InternalKukulkan.g:1249:3: ( (lv_minLenght_1_0= ruleminLengthValidator ) )
                    {
                    // InternalKukulkan.g:1249:3: ( (lv_minLenght_1_0= ruleminLengthValidator ) )
                    // InternalKukulkan.g:1250:4: (lv_minLenght_1_0= ruleminLengthValidator )
                    {
                    // InternalKukulkan.g:1250:4: (lv_minLenght_1_0= ruleminLengthValidator )
                    // InternalKukulkan.g:1251:5: lv_minLenght_1_0= ruleminLengthValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMinLenghtMinLengthValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minLenght_1_0=ruleminLengthValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"minLenght",
                    						lv_minLenght_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.minLengthValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1269:3: ( (lv_maxLenght_2_0= rulemaxLengthValidator ) )
                    {
                    // InternalKukulkan.g:1269:3: ( (lv_maxLenght_2_0= rulemaxLengthValidator ) )
                    // InternalKukulkan.g:1270:4: (lv_maxLenght_2_0= rulemaxLengthValidator )
                    {
                    // InternalKukulkan.g:1270:4: (lv_maxLenght_2_0= rulemaxLengthValidator )
                    // InternalKukulkan.g:1271:5: lv_maxLenght_2_0= rulemaxLengthValidator
                    {

                    					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxLengthValidatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maxLenght_2_0=rulemaxLengthValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"maxLenght",
                    						lv_maxLenght_2_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.maxLengthValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1289:3: ( (lv_pattern_3_0= rulepatternValidator ) )
                    {
                    // InternalKukulkan.g:1289:3: ( (lv_pattern_3_0= rulepatternValidator ) )
                    // InternalKukulkan.g:1290:4: (lv_pattern_3_0= rulepatternValidator )
                    {
                    // InternalKukulkan.g:1290:4: (lv_pattern_3_0= rulepatternValidator )
                    // InternalKukulkan.g:1291:5: lv_pattern_3_0= rulepatternValidator
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
    // InternalKukulkan.g:1312:1: entryRulenumericValidators returns [EObject current=null] : iv_rulenumericValidators= rulenumericValidators EOF ;
    public final EObject entryRulenumericValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumericValidators = null;


        try {
            // InternalKukulkan.g:1312:58: (iv_rulenumericValidators= rulenumericValidators EOF )
            // InternalKukulkan.g:1313:2: iv_rulenumericValidators= rulenumericValidators EOF
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
    // InternalKukulkan.g:1319:1: rulenumericValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) ) ;
    public final EObject rulenumericValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minValue_1_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_2_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1325:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) ) )
            // InternalKukulkan.g:1326:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) )
            {
            // InternalKukulkan.g:1326:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minValue_1_0= ruleminValidator ) ) | ( (lv_maxValue_2_0= rulemaxValidator ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
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
                    // InternalKukulkan.g:1327:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:1327:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:1328:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:1328:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:1329:5: lv_required_0_0= rulerequiredValidator
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
                    // InternalKukulkan.g:1347:3: ( (lv_minValue_1_0= ruleminValidator ) )
                    {
                    // InternalKukulkan.g:1347:3: ( (lv_minValue_1_0= ruleminValidator ) )
                    // InternalKukulkan.g:1348:4: (lv_minValue_1_0= ruleminValidator )
                    {
                    // InternalKukulkan.g:1348:4: (lv_minValue_1_0= ruleminValidator )
                    // InternalKukulkan.g:1349:5: lv_minValue_1_0= ruleminValidator
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
                    // InternalKukulkan.g:1367:3: ( (lv_maxValue_2_0= rulemaxValidator ) )
                    {
                    // InternalKukulkan.g:1367:3: ( (lv_maxValue_2_0= rulemaxValidator ) )
                    // InternalKukulkan.g:1368:4: (lv_maxValue_2_0= rulemaxValidator )
                    {
                    // InternalKukulkan.g:1368:4: (lv_maxValue_2_0= rulemaxValidator )
                    // InternalKukulkan.g:1369:5: lv_maxValue_2_0= rulemaxValidator
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
    // InternalKukulkan.g:1390:1: entryRuleblobValidators returns [EObject current=null] : iv_ruleblobValidators= ruleblobValidators EOF ;
    public final EObject entryRuleblobValidators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblobValidators = null;


        try {
            // InternalKukulkan.g:1390:55: (iv_ruleblobValidators= ruleblobValidators EOF )
            // InternalKukulkan.g:1391:2: iv_ruleblobValidators= ruleblobValidators EOF
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
    // InternalKukulkan.g:1397:1: ruleblobValidators returns [EObject current=null] : ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminBytesValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) ) ) ;
    public final EObject ruleblobValidators() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_required_0_0 = null;

        AntlrDatatypeRuleToken lv_minBytesValue_1_0 = null;

        EObject lv_maxBytesValue_2_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1403:2: ( ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminBytesValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) ) ) )
            // InternalKukulkan.g:1404:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminBytesValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) ) )
            {
            // InternalKukulkan.g:1404:2: ( ( (lv_required_0_0= rulerequiredValidator ) ) | ( (lv_minBytesValue_1_0= ruleminBytesValidator ) ) | ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
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
                    // InternalKukulkan.g:1405:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    {
                    // InternalKukulkan.g:1405:3: ( (lv_required_0_0= rulerequiredValidator ) )
                    // InternalKukulkan.g:1406:4: (lv_required_0_0= rulerequiredValidator )
                    {
                    // InternalKukulkan.g:1406:4: (lv_required_0_0= rulerequiredValidator )
                    // InternalKukulkan.g:1407:5: lv_required_0_0= rulerequiredValidator
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
                    // InternalKukulkan.g:1425:3: ( (lv_minBytesValue_1_0= ruleminBytesValidator ) )
                    {
                    // InternalKukulkan.g:1425:3: ( (lv_minBytesValue_1_0= ruleminBytesValidator ) )
                    // InternalKukulkan.g:1426:4: (lv_minBytesValue_1_0= ruleminBytesValidator )
                    {
                    // InternalKukulkan.g:1426:4: (lv_minBytesValue_1_0= ruleminBytesValidator )
                    // InternalKukulkan.g:1427:5: lv_minBytesValue_1_0= ruleminBytesValidator
                    {

                    					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinBytesValidatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minBytesValue_1_0=ruleminBytesValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"minBytesValue",
                    						lv_minBytesValue_1_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.minBytesValidator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1445:3: ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) )
                    {
                    // InternalKukulkan.g:1445:3: ( (lv_maxBytesValue_2_0= rulemaxBytesValidator ) )
                    // InternalKukulkan.g:1446:4: (lv_maxBytesValue_2_0= rulemaxBytesValidator )
                    {
                    // InternalKukulkan.g:1446:4: (lv_maxBytesValue_2_0= rulemaxBytesValidator )
                    // InternalKukulkan.g:1447:5: lv_maxBytesValue_2_0= rulemaxBytesValidator
                    {

                    					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxBytesValidatorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_maxBytesValue_2_0=rulemaxBytesValidator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
                    					}
                    					set(
                    						current,
                    						"maxBytesValue",
                    						lv_maxBytesValue_2_0,
                    						"mx.infotec.dads.kukulkan.Kukulkan.maxBytesValidator");
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
    // InternalKukulkan.g:1468:1: entryRulerequiredValidator returns [String current=null] : iv_rulerequiredValidator= rulerequiredValidator EOF ;
    public final String entryRulerequiredValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerequiredValidator = null;


        try {
            // InternalKukulkan.g:1468:57: (iv_rulerequiredValidator= rulerequiredValidator EOF )
            // InternalKukulkan.g:1469:2: iv_rulerequiredValidator= rulerequiredValidator EOF
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
    // InternalKukulkan.g:1475:1: rulerequiredValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'required' ;
    public final AntlrDatatypeRuleToken rulerequiredValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1481:2: (kw= 'required' )
            // InternalKukulkan.g:1482:2: kw= 'required'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRequiredValidatorAccess().getRequiredKeyword());
            	

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


    // $ANTLR start "entryRuleminLengthValidator"
    // InternalKukulkan.g:1490:1: entryRuleminLengthValidator returns [String current=null] : iv_ruleminLengthValidator= ruleminLengthValidator EOF ;
    public final String entryRuleminLengthValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleminLengthValidator = null;


        try {
            // InternalKukulkan.g:1490:58: (iv_ruleminLengthValidator= ruleminLengthValidator EOF )
            // InternalKukulkan.g:1491:2: iv_ruleminLengthValidator= ruleminLengthValidator EOF
            {
             newCompositeNode(grammarAccess.getMinLengthValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleminLengthValidator=ruleminLengthValidator();

            state._fsp--;

             current =iv_ruleminLengthValidator.getText(); 
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
    // $ANTLR end "entryRuleminLengthValidator"


    // $ANTLR start "ruleminLengthValidator"
    // InternalKukulkan.g:1497:1: ruleminLengthValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'minlength' kw= '(' this_INT_2= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleminLengthValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1503:2: ( (kw= 'minlength' kw= '(' this_INT_2= RULE_INT kw= ')' ) )
            // InternalKukulkan.g:1504:2: (kw= 'minlength' kw= '(' this_INT_2= RULE_INT kw= ')' )
            {
            // InternalKukulkan.g:1504:2: (kw= 'minlength' kw= '(' this_INT_2= RULE_INT kw= ')' )
            // InternalKukulkan.g:1505:3: kw= 'minlength' kw= '(' this_INT_2= RULE_INT kw= ')'
            {
            kw=(Token)match(input,33,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinLengthValidatorAccess().getMinlengthKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinLengthValidatorAccess().getLeftParenthesisKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMinLengthValidatorAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinLengthValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleminLengthValidator"


    // $ANTLR start "entryRulemaxLengthValidator"
    // InternalKukulkan.g:1531:1: entryRulemaxLengthValidator returns [String current=null] : iv_rulemaxLengthValidator= rulemaxLengthValidator EOF ;
    public final String entryRulemaxLengthValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemaxLengthValidator = null;


        try {
            // InternalKukulkan.g:1531:58: (iv_rulemaxLengthValidator= rulemaxLengthValidator EOF )
            // InternalKukulkan.g:1532:2: iv_rulemaxLengthValidator= rulemaxLengthValidator EOF
            {
             newCompositeNode(grammarAccess.getMaxLengthValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemaxLengthValidator=rulemaxLengthValidator();

            state._fsp--;

             current =iv_rulemaxLengthValidator.getText(); 
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
    // $ANTLR end "entryRulemaxLengthValidator"


    // $ANTLR start "rulemaxLengthValidator"
    // InternalKukulkan.g:1538:1: rulemaxLengthValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'maxlength' kw= '(' this_INT_2= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulemaxLengthValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1544:2: ( (kw= 'maxlength' kw= '(' this_INT_2= RULE_INT kw= ')' ) )
            // InternalKukulkan.g:1545:2: (kw= 'maxlength' kw= '(' this_INT_2= RULE_INT kw= ')' )
            {
            // InternalKukulkan.g:1545:2: (kw= 'maxlength' kw= '(' this_INT_2= RULE_INT kw= ')' )
            // InternalKukulkan.g:1546:3: kw= 'maxlength' kw= '(' this_INT_2= RULE_INT kw= ')'
            {
            kw=(Token)match(input,34,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxLengthValidatorAccess().getMaxlengthKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxLengthValidatorAccess().getLeftParenthesisKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMaxLengthValidatorAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxLengthValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulemaxLengthValidator"


    // $ANTLR start "entryRulepatternValidator"
    // InternalKukulkan.g:1572:1: entryRulepatternValidator returns [String current=null] : iv_rulepatternValidator= rulepatternValidator EOF ;
    public final String entryRulepatternValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepatternValidator = null;


        try {
            // InternalKukulkan.g:1572:56: (iv_rulepatternValidator= rulepatternValidator EOF )
            // InternalKukulkan.g:1573:2: iv_rulepatternValidator= rulepatternValidator EOF
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
    // InternalKukulkan.g:1579:1: rulepatternValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pattern' kw= '(' this_PATTERN_VALUE_2= rulePATTERN_VALUE kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulepatternValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PATTERN_VALUE_2 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1585:2: ( (kw= 'pattern' kw= '(' this_PATTERN_VALUE_2= rulePATTERN_VALUE kw= ')' ) )
            // InternalKukulkan.g:1586:2: (kw= 'pattern' kw= '(' this_PATTERN_VALUE_2= rulePATTERN_VALUE kw= ')' )
            {
            // InternalKukulkan.g:1586:2: (kw= 'pattern' kw= '(' this_PATTERN_VALUE_2= rulePATTERN_VALUE kw= ')' )
            // InternalKukulkan.g:1587:3: kw= 'pattern' kw= '(' this_PATTERN_VALUE_2= rulePATTERN_VALUE kw= ')'
            {
            kw=(Token)match(input,35,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPatternValidatorAccess().getPatternKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPatternValidatorAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getPatternValidatorAccess().getPATTERN_VALUEParserRuleCall_2());
            		
            pushFollow(FOLLOW_6);
            this_PATTERN_VALUE_2=rulePATTERN_VALUE();

            state._fsp--;


            			current.merge(this_PATTERN_VALUE_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPatternValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalKukulkan.g:1616:1: entryRuleminValidator returns [String current=null] : iv_ruleminValidator= ruleminValidator EOF ;
    public final String entryRuleminValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleminValidator = null;


        try {
            // InternalKukulkan.g:1616:52: (iv_ruleminValidator= ruleminValidator EOF )
            // InternalKukulkan.g:1617:2: iv_ruleminValidator= ruleminValidator EOF
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
    // InternalKukulkan.g:1623:1: ruleminValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'min' kw= '(' this_INT_2= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleminValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1629:2: ( (kw= 'min' kw= '(' this_INT_2= RULE_INT kw= ')' ) )
            // InternalKukulkan.g:1630:2: (kw= 'min' kw= '(' this_INT_2= RULE_INT kw= ')' )
            {
            // InternalKukulkan.g:1630:2: (kw= 'min' kw= '(' this_INT_2= RULE_INT kw= ')' )
            // InternalKukulkan.g:1631:3: kw= 'min' kw= '(' this_INT_2= RULE_INT kw= ')'
            {
            kw=(Token)match(input,36,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinValidatorAccess().getMinKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinValidatorAccess().getLeftParenthesisKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMinValidatorAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalKukulkan.g:1657:1: entryRulemaxValidator returns [String current=null] : iv_rulemaxValidator= rulemaxValidator EOF ;
    public final String entryRulemaxValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemaxValidator = null;


        try {
            // InternalKukulkan.g:1657:52: (iv_rulemaxValidator= rulemaxValidator EOF )
            // InternalKukulkan.g:1658:2: iv_rulemaxValidator= rulemaxValidator EOF
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
    // InternalKukulkan.g:1664:1: rulemaxValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'max' kw= '(' this_INT_2= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulemaxValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1670:2: ( (kw= 'max' kw= '(' this_INT_2= RULE_INT kw= ')' ) )
            // InternalKukulkan.g:1671:2: (kw= 'max' kw= '(' this_INT_2= RULE_INT kw= ')' )
            {
            // InternalKukulkan.g:1671:2: (kw= 'max' kw= '(' this_INT_2= RULE_INT kw= ')' )
            // InternalKukulkan.g:1672:3: kw= 'max' kw= '(' this_INT_2= RULE_INT kw= ')'
            {
            kw=(Token)match(input,37,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxValidatorAccess().getMaxKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxValidatorAccess().getLeftParenthesisKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMaxValidatorAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMaxValidatorAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleminBytesValidator"
    // InternalKukulkan.g:1698:1: entryRuleminBytesValidator returns [String current=null] : iv_ruleminBytesValidator= ruleminBytesValidator EOF ;
    public final String entryRuleminBytesValidator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleminBytesValidator = null;


        try {
            // InternalKukulkan.g:1698:57: (iv_ruleminBytesValidator= ruleminBytesValidator EOF )
            // InternalKukulkan.g:1699:2: iv_ruleminBytesValidator= ruleminBytesValidator EOF
            {
             newCompositeNode(grammarAccess.getMinBytesValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleminBytesValidator=ruleminBytesValidator();

            state._fsp--;

             current =iv_ruleminBytesValidator.getText(); 
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
    // $ANTLR end "entryRuleminBytesValidator"


    // $ANTLR start "ruleminBytesValidator"
    // InternalKukulkan.g:1705:1: ruleminBytesValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'minbytes' kw= '(' this_INT_2= RULE_INT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleminBytesValidator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1711:2: ( (kw= 'minbytes' kw= '(' this_INT_2= RULE_INT kw= ')' ) )
            // InternalKukulkan.g:1712:2: (kw= 'minbytes' kw= '(' this_INT_2= RULE_INT kw= ')' )
            {
            // InternalKukulkan.g:1712:2: (kw= 'minbytes' kw= '(' this_INT_2= RULE_INT kw= ')' )
            // InternalKukulkan.g:1713:3: kw= 'minbytes' kw= '(' this_INT_2= RULE_INT kw= ')'
            {
            kw=(Token)match(input,38,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinBytesValidatorAccess().getMinbytesKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinBytesValidatorAccess().getLeftParenthesisKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getMinBytesValidatorAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMinBytesValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleminBytesValidator"


    // $ANTLR start "entryRulemaxBytesValidator"
    // InternalKukulkan.g:1739:1: entryRulemaxBytesValidator returns [EObject current=null] : iv_rulemaxBytesValidator= rulemaxBytesValidator EOF ;
    public final EObject entryRulemaxBytesValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemaxBytesValidator = null;


        try {
            // InternalKukulkan.g:1739:58: (iv_rulemaxBytesValidator= rulemaxBytesValidator EOF )
            // InternalKukulkan.g:1740:2: iv_rulemaxBytesValidator= rulemaxBytesValidator EOF
            {
             newCompositeNode(grammarAccess.getMaxBytesValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemaxBytesValidator=rulemaxBytesValidator();

            state._fsp--;

             current =iv_rulemaxBytesValidator; 
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
    // $ANTLR end "entryRulemaxBytesValidator"


    // $ANTLR start "rulemaxBytesValidator"
    // InternalKukulkan.g:1746:1: rulemaxBytesValidator returns [EObject current=null] : (otherlv_0= 'maxbytes' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject rulemaxBytesValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1752:2: ( (otherlv_0= 'maxbytes' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalKukulkan.g:1753:2: (otherlv_0= 'maxbytes' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalKukulkan.g:1753:2: (otherlv_0= 'maxbytes' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalKukulkan.g:1754:3: otherlv_0= 'maxbytes' otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxBytesValidatorAccess().getMaxbytesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxBytesValidatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKukulkan.g:1762:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalKukulkan.g:1763:4: (lv_value_2_0= RULE_INT )
            {
            // InternalKukulkan.g:1763:4: (lv_value_2_0= RULE_INT )
            // InternalKukulkan.g:1764:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxBytesValidatorAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBytesValidatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxBytesValidatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulemaxBytesValidator"


    // $ANTLR start "entryRuleoption"
    // InternalKukulkan.g:1788:1: entryRuleoption returns [EObject current=null] : iv_ruleoption= ruleoption EOF ;
    public final EObject entryRuleoption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoption = null;


        try {
            // InternalKukulkan.g:1788:47: (iv_ruleoption= ruleoption EOF )
            // InternalKukulkan.g:1789:2: iv_ruleoption= ruleoption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoption=ruleoption();

            state._fsp--;

             current =iv_ruleoption; 
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
    // $ANTLR end "entryRuleoption"


    // $ANTLR start "ruleoption"
    // InternalKukulkan.g:1795:1: ruleoption returns [EObject current=null] : ( (lv_setting_0_0= ruleoptionSetting ) ) ;
    public final EObject ruleoption() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_setting_0_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1801:2: ( ( (lv_setting_0_0= ruleoptionSetting ) ) )
            // InternalKukulkan.g:1802:2: ( (lv_setting_0_0= ruleoptionSetting ) )
            {
            // InternalKukulkan.g:1802:2: ( (lv_setting_0_0= ruleoptionSetting ) )
            // InternalKukulkan.g:1803:3: (lv_setting_0_0= ruleoptionSetting )
            {
            // InternalKukulkan.g:1803:3: (lv_setting_0_0= ruleoptionSetting )
            // InternalKukulkan.g:1804:4: lv_setting_0_0= ruleoptionSetting
            {

            				newCompositeNode(grammarAccess.getOptionAccess().getSettingOptionSettingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_setting_0_0=ruleoptionSetting();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOptionRule());
            				}
            				set(
            					current,
            					"setting",
            					lv_setting_0_0,
            					"mx.infotec.dads.kukulkan.Kukulkan.optionSetting");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleoption"


    // $ANTLR start "entryRuleoptionSetting"
    // InternalKukulkan.g:1824:1: entryRuleoptionSetting returns [String current=null] : iv_ruleoptionSetting= ruleoptionSetting EOF ;
    public final String entryRuleoptionSetting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoptionSetting = null;


        try {
            // InternalKukulkan.g:1824:53: (iv_ruleoptionSetting= ruleoptionSetting EOF )
            // InternalKukulkan.g:1825:2: iv_ruleoptionSetting= ruleoptionSetting EOF
            {
             newCompositeNode(grammarAccess.getOptionSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoptionSetting=ruleoptionSetting();

            state._fsp--;

             current =iv_ruleoptionSetting.getText(); 
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
    // $ANTLR end "entryRuleoptionSetting"


    // $ANTLR start "ruleoptionSetting"
    // InternalKukulkan.g:1831:1: ruleoptionSetting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_dtoOption_0= ruledtoOption ;
    public final AntlrDatatypeRuleToken ruleoptionSetting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_dtoOption_0 = null;



        	enterRule();

        try {
            // InternalKukulkan.g:1837:2: (this_dtoOption_0= ruledtoOption )
            // InternalKukulkan.g:1838:2: this_dtoOption_0= ruledtoOption
            {

            		newCompositeNode(grammarAccess.getOptionSettingAccess().getDtoOptionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_dtoOption_0=ruledtoOption();

            state._fsp--;


            		current.merge(this_dtoOption_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleoptionSetting"


    // $ANTLR start "entryRuledtoOption"
    // InternalKukulkan.g:1851:1: entryRuledtoOption returns [String current=null] : iv_ruledtoOption= ruledtoOption EOF ;
    public final String entryRuledtoOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledtoOption = null;


        try {
            // InternalKukulkan.g:1851:49: (iv_ruledtoOption= ruledtoOption EOF )
            // InternalKukulkan.g:1852:2: iv_ruledtoOption= ruledtoOption EOF
            {
             newCompositeNode(grammarAccess.getDtoOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledtoOption=ruledtoOption();

            state._fsp--;

             current =iv_ruledtoOption.getText(); 
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
    // $ANTLR end "entryRuledtoOption"


    // $ANTLR start "ruledtoOption"
    // InternalKukulkan.g:1858:1: ruledtoOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'dto' )? ;
    public final AntlrDatatypeRuleToken ruledtoOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1864:2: ( (kw= 'dto' )? )
            // InternalKukulkan.g:1865:2: (kw= 'dto' )?
            {
            // InternalKukulkan.g:1865:2: (kw= 'dto' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKukulkan.g:1866:3: kw= 'dto'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDtoOptionAccess().getDtoKeyword());
                    		

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
    // $ANTLR end "ruledtoOption"


    // $ANTLR start "entryRulePATTERN_VALUE"
    // InternalKukulkan.g:1875:1: entryRulePATTERN_VALUE returns [String current=null] : iv_rulePATTERN_VALUE= rulePATTERN_VALUE EOF ;
    public final String entryRulePATTERN_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePATTERN_VALUE = null;


        try {
            // InternalKukulkan.g:1875:53: (iv_rulePATTERN_VALUE= rulePATTERN_VALUE EOF )
            // InternalKukulkan.g:1876:2: iv_rulePATTERN_VALUE= rulePATTERN_VALUE EOF
            {
             newCompositeNode(grammarAccess.getPATTERN_VALUERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePATTERN_VALUE=rulePATTERN_VALUE();

            state._fsp--;

             current =iv_rulePATTERN_VALUE.getText(); 
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
    // $ANTLR end "entryRulePATTERN_VALUE"


    // $ANTLR start "rulePATTERN_VALUE"
    // InternalKukulkan.g:1882:1: rulePATTERN_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '\"' )* kw= '\"' ) ;
    public final AntlrDatatypeRuleToken rulePATTERN_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1888:2: ( ( (kw= '\"' )* kw= '\"' ) )
            // InternalKukulkan.g:1889:2: ( (kw= '\"' )* kw= '\"' )
            {
            // InternalKukulkan.g:1889:2: ( (kw= '\"' )* kw= '\"' )
            // InternalKukulkan.g:1890:3: (kw= '\"' )* kw= '\"'
            {
            // InternalKukulkan.g:1890:3: (kw= '\"' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==41) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalKukulkan.g:1891:4: kw= '\"'
            	    {
            	    kw=(Token)match(input,41,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            kw=(Token)match(input,41,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_1());
            		

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
    // $ANTLR end "rulePATTERN_VALUE"


    // $ANTLR start "entryRuleONE_TO_MANY"
    // InternalKukulkan.g:1906:1: entryRuleONE_TO_MANY returns [String current=null] : iv_ruleONE_TO_MANY= ruleONE_TO_MANY EOF ;
    public final String entryRuleONE_TO_MANY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleONE_TO_MANY = null;


        try {
            // InternalKukulkan.g:1906:51: (iv_ruleONE_TO_MANY= ruleONE_TO_MANY EOF )
            // InternalKukulkan.g:1907:2: iv_ruleONE_TO_MANY= ruleONE_TO_MANY EOF
            {
             newCompositeNode(grammarAccess.getONE_TO_MANYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleONE_TO_MANY=ruleONE_TO_MANY();

            state._fsp--;

             current =iv_ruleONE_TO_MANY.getText(); 
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
    // $ANTLR end "entryRuleONE_TO_MANY"


    // $ANTLR start "ruleONE_TO_MANY"
    // InternalKukulkan.g:1913:1: ruleONE_TO_MANY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'OneToMany' ;
    public final AntlrDatatypeRuleToken ruleONE_TO_MANY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1919:2: (kw= 'OneToMany' )
            // InternalKukulkan.g:1920:2: kw= 'OneToMany'
            {
            kw=(Token)match(input,42,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getONE_TO_MANYAccess().getOneToManyKeyword());
            	

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
    // $ANTLR end "ruleONE_TO_MANY"


    // $ANTLR start "entryRuleMANY_TO_ONE"
    // InternalKukulkan.g:1928:1: entryRuleMANY_TO_ONE returns [String current=null] : iv_ruleMANY_TO_ONE= ruleMANY_TO_ONE EOF ;
    public final String entryRuleMANY_TO_ONE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMANY_TO_ONE = null;


        try {
            // InternalKukulkan.g:1928:51: (iv_ruleMANY_TO_ONE= ruleMANY_TO_ONE EOF )
            // InternalKukulkan.g:1929:2: iv_ruleMANY_TO_ONE= ruleMANY_TO_ONE EOF
            {
             newCompositeNode(grammarAccess.getMANY_TO_ONERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMANY_TO_ONE=ruleMANY_TO_ONE();

            state._fsp--;

             current =iv_ruleMANY_TO_ONE.getText(); 
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
    // $ANTLR end "entryRuleMANY_TO_ONE"


    // $ANTLR start "ruleMANY_TO_ONE"
    // InternalKukulkan.g:1935:1: ruleMANY_TO_ONE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ManyToOne' ;
    public final AntlrDatatypeRuleToken ruleMANY_TO_ONE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1941:2: (kw= 'ManyToOne' )
            // InternalKukulkan.g:1942:2: kw= 'ManyToOne'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMANY_TO_ONEAccess().getManyToOneKeyword());
            	

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
    // $ANTLR end "ruleMANY_TO_ONE"


    // $ANTLR start "entryRuleONE_TO_ONE"
    // InternalKukulkan.g:1950:1: entryRuleONE_TO_ONE returns [String current=null] : iv_ruleONE_TO_ONE= ruleONE_TO_ONE EOF ;
    public final String entryRuleONE_TO_ONE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleONE_TO_ONE = null;


        try {
            // InternalKukulkan.g:1950:50: (iv_ruleONE_TO_ONE= ruleONE_TO_ONE EOF )
            // InternalKukulkan.g:1951:2: iv_ruleONE_TO_ONE= ruleONE_TO_ONE EOF
            {
             newCompositeNode(grammarAccess.getONE_TO_ONERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleONE_TO_ONE=ruleONE_TO_ONE();

            state._fsp--;

             current =iv_ruleONE_TO_ONE.getText(); 
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
    // $ANTLR end "entryRuleONE_TO_ONE"


    // $ANTLR start "ruleONE_TO_ONE"
    // InternalKukulkan.g:1957:1: ruleONE_TO_ONE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'OneToOne' ;
    public final AntlrDatatypeRuleToken ruleONE_TO_ONE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1963:2: (kw= 'OneToOne' )
            // InternalKukulkan.g:1964:2: kw= 'OneToOne'
            {
            kw=(Token)match(input,44,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getONE_TO_ONEAccess().getOneToOneKeyword());
            	

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
    // $ANTLR end "ruleONE_TO_ONE"


    // $ANTLR start "entryRuleMANY_TO_MANY"
    // InternalKukulkan.g:1972:1: entryRuleMANY_TO_MANY returns [String current=null] : iv_ruleMANY_TO_MANY= ruleMANY_TO_MANY EOF ;
    public final String entryRuleMANY_TO_MANY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMANY_TO_MANY = null;


        try {
            // InternalKukulkan.g:1972:52: (iv_ruleMANY_TO_MANY= ruleMANY_TO_MANY EOF )
            // InternalKukulkan.g:1973:2: iv_ruleMANY_TO_MANY= ruleMANY_TO_MANY EOF
            {
             newCompositeNode(grammarAccess.getMANY_TO_MANYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMANY_TO_MANY=ruleMANY_TO_MANY();

            state._fsp--;

             current =iv_ruleMANY_TO_MANY.getText(); 
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
    // $ANTLR end "entryRuleMANY_TO_MANY"


    // $ANTLR start "ruleMANY_TO_MANY"
    // InternalKukulkan.g:1979:1: ruleMANY_TO_MANY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ManyToMany' ;
    public final AntlrDatatypeRuleToken ruleMANY_TO_MANY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKukulkan.g:1985:2: (kw= 'ManyToMany' )
            // InternalKukulkan.g:1986:2: kw= 'ManyToMany'
            {
            kw=(Token)match(input,45,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMANY_TO_MANYAccess().getManyToManyKeyword());
            	

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
    // $ANTLR end "ruleMANY_TO_MANY"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000FFFE0800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003100000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000C100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});

}