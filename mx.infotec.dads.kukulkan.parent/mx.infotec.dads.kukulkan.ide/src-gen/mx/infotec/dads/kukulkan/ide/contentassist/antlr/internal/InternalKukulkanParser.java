package mx.infotec.dads.kukulkan.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mx.infotec.dads.kukulkan.services.KukulkanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKukulkanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_KEYWORD", "RULE_REQUIRED", "RULE_INTEGER", "RULE_LONG", "RULE_BIG_DECIMAL", "RULE_FLOAT", "RULE_DOUBLE", "RULE_LOCAL_DATE", "RULE_ZONED_DATETIME", "RULE_INSTANT", "RULE_BLOB", "RULE_ANY_BLOB", "RULE_IMAGE_BLOB", "RULE_TEXT_BLOB", "RULE_ONE_TO_MANY", "RULE_MANY_TO_ONE", "RULE_ONE_TO_ONE", "RULE_MANY_TO_MANY", "RULE_ENTITY_KEYWORD", "RULE_LPAREN", "RULE_RPAREN", "RULE_LBRACE", "RULE_RBRACE", "RULE_COMMA", "RULE_SEMICOLON", "RULE_PATTERN", "RULE_PATTERN_VALUE", "RULE_MIN", "RULE_INT", "RULE_MAX", "RULE_ID", "RULE_BOOLEAN_TYPE", "RULE_NULL_LITERAL", "RULE_LBRACK", "RULE_RBRACK", "RULE_SEMI", "RULE_DOT", "RULE_ELLIPSIS", "RULE_AT", "RULE_COLONCOLON", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalKukulkanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKukulkanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKukulkanParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKukulkan.g"; }


    	private KukulkanGrammarAccess grammarAccess;

    	public void setGrammarAccess(KukulkanGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuledomainModel"
    // InternalKukulkan.g:53:1: entryRuledomainModel : ruledomainModel EOF ;
    public final void entryRuledomainModel() throws RecognitionException {
        try {
            // InternalKukulkan.g:54:1: ( ruledomainModel EOF )
            // InternalKukulkan.g:55:1: ruledomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruledomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledomainModel"


    // $ANTLR start "ruledomainModel"
    // InternalKukulkan.g:62:1: ruledomainModel : ( ( ( rule__DomainModel__EntitiesAssignment ) ) ( ( rule__DomainModel__EntitiesAssignment )* ) ) ;
    public final void ruledomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:66:2: ( ( ( ( rule__DomainModel__EntitiesAssignment ) ) ( ( rule__DomainModel__EntitiesAssignment )* ) ) )
            // InternalKukulkan.g:67:2: ( ( ( rule__DomainModel__EntitiesAssignment ) ) ( ( rule__DomainModel__EntitiesAssignment )* ) )
            {
            // InternalKukulkan.g:67:2: ( ( ( rule__DomainModel__EntitiesAssignment ) ) ( ( rule__DomainModel__EntitiesAssignment )* ) )
            // InternalKukulkan.g:68:3: ( ( rule__DomainModel__EntitiesAssignment ) ) ( ( rule__DomainModel__EntitiesAssignment )* )
            {
            // InternalKukulkan.g:68:3: ( ( rule__DomainModel__EntitiesAssignment ) )
            // InternalKukulkan.g:69:4: ( rule__DomainModel__EntitiesAssignment )
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment()); 
            // InternalKukulkan.g:70:4: ( rule__DomainModel__EntitiesAssignment )
            // InternalKukulkan.g:70:5: rule__DomainModel__EntitiesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__DomainModel__EntitiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment()); 

            }

            // InternalKukulkan.g:73:3: ( ( rule__DomainModel__EntitiesAssignment )* )
            // InternalKukulkan.g:74:4: ( rule__DomainModel__EntitiesAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment()); 
            // InternalKukulkan.g:75:4: ( rule__DomainModel__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ENTITY_KEYWORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKukulkan.g:75:5: rule__DomainModel__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledomainModel"


    // $ANTLR start "entryRuleentity"
    // InternalKukulkan.g:85:1: entryRuleentity : ruleentity EOF ;
    public final void entryRuleentity() throws RecognitionException {
        try {
            // InternalKukulkan.g:86:1: ( ruleentity EOF )
            // InternalKukulkan.g:87:1: ruleentity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentity"


    // $ANTLR start "ruleentity"
    // InternalKukulkan.g:94:1: ruleentity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleentity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:98:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalKukulkan.g:99:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalKukulkan.g:99:2: ( ( rule__Entity__Group__0 ) )
            // InternalKukulkan.g:100:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalKukulkan.g:101:3: ( rule__Entity__Group__0 )
            // InternalKukulkan.g:101:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentity"


    // $ANTLR start "entryRuleentityField"
    // InternalKukulkan.g:110:1: entryRuleentityField : ruleentityField EOF ;
    public final void entryRuleentityField() throws RecognitionException {
        try {
            // InternalKukulkan.g:111:1: ( ruleentityField EOF )
            // InternalKukulkan.g:112:1: ruleentityField EOF
            {
             before(grammarAccess.getEntityFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleentityField();

            state._fsp--;

             after(grammarAccess.getEntityFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentityField"


    // $ANTLR start "ruleentityField"
    // InternalKukulkan.g:119:1: ruleentityField : ( ( rule__EntityField__Alternatives ) ) ;
    public final void ruleentityField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:123:2: ( ( ( rule__EntityField__Alternatives ) ) )
            // InternalKukulkan.g:124:2: ( ( rule__EntityField__Alternatives ) )
            {
            // InternalKukulkan.g:124:2: ( ( rule__EntityField__Alternatives ) )
            // InternalKukulkan.g:125:3: ( rule__EntityField__Alternatives )
            {
             before(grammarAccess.getEntityFieldAccess().getAlternatives()); 
            // InternalKukulkan.g:126:3: ( rule__EntityField__Alternatives )
            // InternalKukulkan.g:126:4: rule__EntityField__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentityField"


    // $ANTLR start "entryRuleprimitiveField"
    // InternalKukulkan.g:135:1: entryRuleprimitiveField : ruleprimitiveField EOF ;
    public final void entryRuleprimitiveField() throws RecognitionException {
        try {
            // InternalKukulkan.g:136:1: ( ruleprimitiveField EOF )
            // InternalKukulkan.g:137:1: ruleprimitiveField EOF
            {
             before(grammarAccess.getPrimitiveFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleprimitiveField();

            state._fsp--;

             after(grammarAccess.getPrimitiveFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprimitiveField"


    // $ANTLR start "ruleprimitiveField"
    // InternalKukulkan.g:144:1: ruleprimitiveField : ( ( rule__PrimitiveField__Group__0 ) ) ;
    public final void ruleprimitiveField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:148:2: ( ( ( rule__PrimitiveField__Group__0 ) ) )
            // InternalKukulkan.g:149:2: ( ( rule__PrimitiveField__Group__0 ) )
            {
            // InternalKukulkan.g:149:2: ( ( rule__PrimitiveField__Group__0 ) )
            // InternalKukulkan.g:150:3: ( rule__PrimitiveField__Group__0 )
            {
             before(grammarAccess.getPrimitiveFieldAccess().getGroup()); 
            // InternalKukulkan.g:151:3: ( rule__PrimitiveField__Group__0 )
            // InternalKukulkan.g:151:4: rule__PrimitiveField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprimitiveField"


    // $ANTLR start "entryRulefieldType"
    // InternalKukulkan.g:160:1: entryRulefieldType : rulefieldType EOF ;
    public final void entryRulefieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:161:1: ( rulefieldType EOF )
            // InternalKukulkan.g:162:1: rulefieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            rulefieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefieldType"


    // $ANTLR start "rulefieldType"
    // InternalKukulkan.g:169:1: rulefieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void rulefieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:173:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalKukulkan.g:174:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalKukulkan.g:174:2: ( ( rule__FieldType__Alternatives ) )
            // InternalKukulkan.g:175:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalKukulkan.g:176:3: ( rule__FieldType__Alternatives )
            // InternalKukulkan.g:176:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefieldType"


    // $ANTLR start "entryRuleassociationField"
    // InternalKukulkan.g:185:1: entryRuleassociationField : ruleassociationField EOF ;
    public final void entryRuleassociationField() throws RecognitionException {
        try {
            // InternalKukulkan.g:186:1: ( ruleassociationField EOF )
            // InternalKukulkan.g:187:1: ruleassociationField EOF
            {
             before(grammarAccess.getAssociationFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleassociationField();

            state._fsp--;

             after(grammarAccess.getAssociationFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleassociationField"


    // $ANTLR start "ruleassociationField"
    // InternalKukulkan.g:194:1: ruleassociationField : ( ( rule__AssociationField__Group__0 ) ) ;
    public final void ruleassociationField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:198:2: ( ( ( rule__AssociationField__Group__0 ) ) )
            // InternalKukulkan.g:199:2: ( ( rule__AssociationField__Group__0 ) )
            {
            // InternalKukulkan.g:199:2: ( ( rule__AssociationField__Group__0 ) )
            // InternalKukulkan.g:200:3: ( rule__AssociationField__Group__0 )
            {
             before(grammarAccess.getAssociationFieldAccess().getGroup()); 
            // InternalKukulkan.g:201:3: ( rule__AssociationField__Group__0 )
            // InternalKukulkan.g:201:4: rule__AssociationField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleassociationField"


    // $ANTLR start "entryRulestringFieldType"
    // InternalKukulkan.g:210:1: entryRulestringFieldType : rulestringFieldType EOF ;
    public final void entryRulestringFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:211:1: ( rulestringFieldType EOF )
            // InternalKukulkan.g:212:1: rulestringFieldType EOF
            {
             before(grammarAccess.getStringFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            rulestringFieldType();

            state._fsp--;

             after(grammarAccess.getStringFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestringFieldType"


    // $ANTLR start "rulestringFieldType"
    // InternalKukulkan.g:219:1: rulestringFieldType : ( ( rule__StringFieldType__Group__0 ) ) ;
    public final void rulestringFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:223:2: ( ( ( rule__StringFieldType__Group__0 ) ) )
            // InternalKukulkan.g:224:2: ( ( rule__StringFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:224:2: ( ( rule__StringFieldType__Group__0 ) )
            // InternalKukulkan.g:225:3: ( rule__StringFieldType__Group__0 )
            {
             before(grammarAccess.getStringFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:226:3: ( rule__StringFieldType__Group__0 )
            // InternalKukulkan.g:226:4: rule__StringFieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestringFieldType"


    // $ANTLR start "entryRulestringType"
    // InternalKukulkan.g:235:1: entryRulestringType : rulestringType EOF ;
    public final void entryRulestringType() throws RecognitionException {
        try {
            // InternalKukulkan.g:236:1: ( rulestringType EOF )
            // InternalKukulkan.g:237:1: rulestringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            rulestringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestringType"


    // $ANTLR start "rulestringType"
    // InternalKukulkan.g:244:1: rulestringType : ( RULE_STRING_KEYWORD ) ;
    public final void rulestringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:248:2: ( ( RULE_STRING_KEYWORD ) )
            // InternalKukulkan.g:249:2: ( RULE_STRING_KEYWORD )
            {
            // InternalKukulkan.g:249:2: ( RULE_STRING_KEYWORD )
            // InternalKukulkan.g:250:3: RULE_STRING_KEYWORD
            {
             before(grammarAccess.getStringTypeAccess().getSTRING_KEYWORDTerminalRuleCall()); 
            match(input,RULE_STRING_KEYWORD,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getSTRING_KEYWORDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestringType"


    // $ANTLR start "entryRulenumericFieldType"
    // InternalKukulkan.g:260:1: entryRulenumericFieldType : rulenumericFieldType EOF ;
    public final void entryRulenumericFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:261:1: ( rulenumericFieldType EOF )
            // InternalKukulkan.g:262:1: rulenumericFieldType EOF
            {
             before(grammarAccess.getNumericFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            rulenumericFieldType();

            state._fsp--;

             after(grammarAccess.getNumericFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumericFieldType"


    // $ANTLR start "rulenumericFieldType"
    // InternalKukulkan.g:269:1: rulenumericFieldType : ( ( rule__NumericFieldType__Group__0 ) ) ;
    public final void rulenumericFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:273:2: ( ( ( rule__NumericFieldType__Group__0 ) ) )
            // InternalKukulkan.g:274:2: ( ( rule__NumericFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:274:2: ( ( rule__NumericFieldType__Group__0 ) )
            // InternalKukulkan.g:275:3: ( rule__NumericFieldType__Group__0 )
            {
             before(grammarAccess.getNumericFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:276:3: ( rule__NumericFieldType__Group__0 )
            // InternalKukulkan.g:276:4: rule__NumericFieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericFieldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumericFieldType"


    // $ANTLR start "entryRulenumericTypes"
    // InternalKukulkan.g:285:1: entryRulenumericTypes : rulenumericTypes EOF ;
    public final void entryRulenumericTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:286:1: ( rulenumericTypes EOF )
            // InternalKukulkan.g:287:1: rulenumericTypes EOF
            {
             before(grammarAccess.getNumericTypesRule()); 
            pushFollow(FOLLOW_1);
            rulenumericTypes();

            state._fsp--;

             after(grammarAccess.getNumericTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumericTypes"


    // $ANTLR start "rulenumericTypes"
    // InternalKukulkan.g:294:1: rulenumericTypes : ( ( rule__NumericTypes__Alternatives ) ) ;
    public final void rulenumericTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:298:2: ( ( ( rule__NumericTypes__Alternatives ) ) )
            // InternalKukulkan.g:299:2: ( ( rule__NumericTypes__Alternatives ) )
            {
            // InternalKukulkan.g:299:2: ( ( rule__NumericTypes__Alternatives ) )
            // InternalKukulkan.g:300:3: ( rule__NumericTypes__Alternatives )
            {
             before(grammarAccess.getNumericTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:301:3: ( rule__NumericTypes__Alternatives )
            // InternalKukulkan.g:301:4: rule__NumericTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumericTypes"


    // $ANTLR start "entryRulebooleanFieldType"
    // InternalKukulkan.g:310:1: entryRulebooleanFieldType : rulebooleanFieldType EOF ;
    public final void entryRulebooleanFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:311:1: ( rulebooleanFieldType EOF )
            // InternalKukulkan.g:312:1: rulebooleanFieldType EOF
            {
             before(grammarAccess.getBooleanFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            rulebooleanFieldType();

            state._fsp--;

             after(grammarAccess.getBooleanFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleanFieldType"


    // $ANTLR start "rulebooleanFieldType"
    // InternalKukulkan.g:319:1: rulebooleanFieldType : ( ( rule__BooleanFieldType__Group__0 ) ) ;
    public final void rulebooleanFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:323:2: ( ( ( rule__BooleanFieldType__Group__0 ) ) )
            // InternalKukulkan.g:324:2: ( ( rule__BooleanFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:324:2: ( ( rule__BooleanFieldType__Group__0 ) )
            // InternalKukulkan.g:325:3: ( rule__BooleanFieldType__Group__0 )
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:326:3: ( rule__BooleanFieldType__Group__0 )
            // InternalKukulkan.g:326:4: rule__BooleanFieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFieldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleanFieldType"


    // $ANTLR start "entryRuledateFieldType"
    // InternalKukulkan.g:335:1: entryRuledateFieldType : ruledateFieldType EOF ;
    public final void entryRuledateFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:336:1: ( ruledateFieldType EOF )
            // InternalKukulkan.g:337:1: ruledateFieldType EOF
            {
             before(grammarAccess.getDateFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruledateFieldType();

            state._fsp--;

             after(grammarAccess.getDateFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledateFieldType"


    // $ANTLR start "ruledateFieldType"
    // InternalKukulkan.g:344:1: ruledateFieldType : ( ( rule__DateFieldType__Group__0 ) ) ;
    public final void ruledateFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:348:2: ( ( ( rule__DateFieldType__Group__0 ) ) )
            // InternalKukulkan.g:349:2: ( ( rule__DateFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:349:2: ( ( rule__DateFieldType__Group__0 ) )
            // InternalKukulkan.g:350:3: ( rule__DateFieldType__Group__0 )
            {
             before(grammarAccess.getDateFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:351:3: ( rule__DateFieldType__Group__0 )
            // InternalKukulkan.g:351:4: rule__DateFieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateFieldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledateFieldType"


    // $ANTLR start "entryRuledateTypes"
    // InternalKukulkan.g:360:1: entryRuledateTypes : ruledateTypes EOF ;
    public final void entryRuledateTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:361:1: ( ruledateTypes EOF )
            // InternalKukulkan.g:362:1: ruledateTypes EOF
            {
             before(grammarAccess.getDateTypesRule()); 
            pushFollow(FOLLOW_1);
            ruledateTypes();

            state._fsp--;

             after(grammarAccess.getDateTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledateTypes"


    // $ANTLR start "ruledateTypes"
    // InternalKukulkan.g:369:1: ruledateTypes : ( ( rule__DateTypes__Alternatives ) ) ;
    public final void ruledateTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:373:2: ( ( ( rule__DateTypes__Alternatives ) ) )
            // InternalKukulkan.g:374:2: ( ( rule__DateTypes__Alternatives ) )
            {
            // InternalKukulkan.g:374:2: ( ( rule__DateTypes__Alternatives ) )
            // InternalKukulkan.g:375:3: ( rule__DateTypes__Alternatives )
            {
             before(grammarAccess.getDateTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:376:3: ( rule__DateTypes__Alternatives )
            // InternalKukulkan.g:376:4: rule__DateTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DateTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDateTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledateTypes"


    // $ANTLR start "entryRuleblobFieldType"
    // InternalKukulkan.g:385:1: entryRuleblobFieldType : ruleblobFieldType EOF ;
    public final void entryRuleblobFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:386:1: ( ruleblobFieldType EOF )
            // InternalKukulkan.g:387:1: ruleblobFieldType EOF
            {
             before(grammarAccess.getBlobFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleblobFieldType();

            state._fsp--;

             after(grammarAccess.getBlobFieldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblobFieldType"


    // $ANTLR start "ruleblobFieldType"
    // InternalKukulkan.g:394:1: ruleblobFieldType : ( ( rule__BlobFieldType__Group__0 ) ) ;
    public final void ruleblobFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:398:2: ( ( ( rule__BlobFieldType__Group__0 ) ) )
            // InternalKukulkan.g:399:2: ( ( rule__BlobFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:399:2: ( ( rule__BlobFieldType__Group__0 ) )
            // InternalKukulkan.g:400:3: ( rule__BlobFieldType__Group__0 )
            {
             before(grammarAccess.getBlobFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:401:3: ( rule__BlobFieldType__Group__0 )
            // InternalKukulkan.g:401:4: rule__BlobFieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlobFieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlobFieldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblobFieldType"


    // $ANTLR start "entryRuleblobTypes"
    // InternalKukulkan.g:410:1: entryRuleblobTypes : ruleblobTypes EOF ;
    public final void entryRuleblobTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:411:1: ( ruleblobTypes EOF )
            // InternalKukulkan.g:412:1: ruleblobTypes EOF
            {
             before(grammarAccess.getBlobTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleblobTypes();

            state._fsp--;

             after(grammarAccess.getBlobTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblobTypes"


    // $ANTLR start "ruleblobTypes"
    // InternalKukulkan.g:419:1: ruleblobTypes : ( ( rule__BlobTypes__Alternatives ) ) ;
    public final void ruleblobTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:423:2: ( ( ( rule__BlobTypes__Alternatives ) ) )
            // InternalKukulkan.g:424:2: ( ( rule__BlobTypes__Alternatives ) )
            {
            // InternalKukulkan.g:424:2: ( ( rule__BlobTypes__Alternatives ) )
            // InternalKukulkan.g:425:3: ( rule__BlobTypes__Alternatives )
            {
             before(grammarAccess.getBlobTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:426:3: ( rule__BlobTypes__Alternatives )
            // InternalKukulkan.g:426:4: rule__BlobTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlobTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlobTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblobTypes"


    // $ANTLR start "entryRulestringValidators"
    // InternalKukulkan.g:435:1: entryRulestringValidators : rulestringValidators EOF ;
    public final void entryRulestringValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:436:1: ( rulestringValidators EOF )
            // InternalKukulkan.g:437:1: rulestringValidators EOF
            {
             before(grammarAccess.getStringValidatorsRule()); 
            pushFollow(FOLLOW_1);
            rulestringValidators();

            state._fsp--;

             after(grammarAccess.getStringValidatorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestringValidators"


    // $ANTLR start "rulestringValidators"
    // InternalKukulkan.g:444:1: rulestringValidators : ( ( rule__StringValidators__Alternatives ) ) ;
    public final void rulestringValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:448:2: ( ( ( rule__StringValidators__Alternatives ) ) )
            // InternalKukulkan.g:449:2: ( ( rule__StringValidators__Alternatives ) )
            {
            // InternalKukulkan.g:449:2: ( ( rule__StringValidators__Alternatives ) )
            // InternalKukulkan.g:450:3: ( rule__StringValidators__Alternatives )
            {
             before(grammarAccess.getStringValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:451:3: ( rule__StringValidators__Alternatives )
            // InternalKukulkan.g:451:4: rule__StringValidators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringValidators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringValidatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestringValidators"


    // $ANTLR start "entryRulenumericValidators"
    // InternalKukulkan.g:460:1: entryRulenumericValidators : rulenumericValidators EOF ;
    public final void entryRulenumericValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:461:1: ( rulenumericValidators EOF )
            // InternalKukulkan.g:462:1: rulenumericValidators EOF
            {
             before(grammarAccess.getNumericValidatorsRule()); 
            pushFollow(FOLLOW_1);
            rulenumericValidators();

            state._fsp--;

             after(grammarAccess.getNumericValidatorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumericValidators"


    // $ANTLR start "rulenumericValidators"
    // InternalKukulkan.g:469:1: rulenumericValidators : ( ( rule__NumericValidators__Alternatives ) ) ;
    public final void rulenumericValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:473:2: ( ( ( rule__NumericValidators__Alternatives ) ) )
            // InternalKukulkan.g:474:2: ( ( rule__NumericValidators__Alternatives ) )
            {
            // InternalKukulkan.g:474:2: ( ( rule__NumericValidators__Alternatives ) )
            // InternalKukulkan.g:475:3: ( rule__NumericValidators__Alternatives )
            {
             before(grammarAccess.getNumericValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:476:3: ( rule__NumericValidators__Alternatives )
            // InternalKukulkan.g:476:4: rule__NumericValidators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericValidators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericValidatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumericValidators"


    // $ANTLR start "entryRuleblobValidators"
    // InternalKukulkan.g:485:1: entryRuleblobValidators : ruleblobValidators EOF ;
    public final void entryRuleblobValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:486:1: ( ruleblobValidators EOF )
            // InternalKukulkan.g:487:1: ruleblobValidators EOF
            {
             before(grammarAccess.getBlobValidatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleblobValidators();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblobValidators"


    // $ANTLR start "ruleblobValidators"
    // InternalKukulkan.g:494:1: ruleblobValidators : ( ( rule__BlobValidators__Alternatives ) ) ;
    public final void ruleblobValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:498:2: ( ( ( rule__BlobValidators__Alternatives ) ) )
            // InternalKukulkan.g:499:2: ( ( rule__BlobValidators__Alternatives ) )
            {
            // InternalKukulkan.g:499:2: ( ( rule__BlobValidators__Alternatives ) )
            // InternalKukulkan.g:500:3: ( rule__BlobValidators__Alternatives )
            {
             before(grammarAccess.getBlobValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:501:3: ( rule__BlobValidators__Alternatives )
            // InternalKukulkan.g:501:4: rule__BlobValidators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlobValidators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlobValidatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblobValidators"


    // $ANTLR start "entryRulerequiredValidator"
    // InternalKukulkan.g:510:1: entryRulerequiredValidator : rulerequiredValidator EOF ;
    public final void entryRulerequiredValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:511:1: ( rulerequiredValidator EOF )
            // InternalKukulkan.g:512:1: rulerequiredValidator EOF
            {
             before(grammarAccess.getRequiredValidatorRule()); 
            pushFollow(FOLLOW_1);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getRequiredValidatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerequiredValidator"


    // $ANTLR start "rulerequiredValidator"
    // InternalKukulkan.g:519:1: rulerequiredValidator : ( RULE_REQUIRED ) ;
    public final void rulerequiredValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:523:2: ( ( RULE_REQUIRED ) )
            // InternalKukulkan.g:524:2: ( RULE_REQUIRED )
            {
            // InternalKukulkan.g:524:2: ( RULE_REQUIRED )
            // InternalKukulkan.g:525:3: RULE_REQUIRED
            {
             before(grammarAccess.getRequiredValidatorAccess().getREQUIREDTerminalRuleCall()); 
            match(input,RULE_REQUIRED,FOLLOW_2); 
             after(grammarAccess.getRequiredValidatorAccess().getREQUIREDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerequiredValidator"


    // $ANTLR start "entryRulepatternValidator"
    // InternalKukulkan.g:535:1: entryRulepatternValidator : rulepatternValidator EOF ;
    public final void entryRulepatternValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:536:1: ( rulepatternValidator EOF )
            // InternalKukulkan.g:537:1: rulepatternValidator EOF
            {
             before(grammarAccess.getPatternValidatorRule()); 
            pushFollow(FOLLOW_1);
            rulepatternValidator();

            state._fsp--;

             after(grammarAccess.getPatternValidatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepatternValidator"


    // $ANTLR start "rulepatternValidator"
    // InternalKukulkan.g:544:1: rulepatternValidator : ( ( rule__PatternValidator__Group__0 ) ) ;
    public final void rulepatternValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:548:2: ( ( ( rule__PatternValidator__Group__0 ) ) )
            // InternalKukulkan.g:549:2: ( ( rule__PatternValidator__Group__0 ) )
            {
            // InternalKukulkan.g:549:2: ( ( rule__PatternValidator__Group__0 ) )
            // InternalKukulkan.g:550:3: ( rule__PatternValidator__Group__0 )
            {
             before(grammarAccess.getPatternValidatorAccess().getGroup()); 
            // InternalKukulkan.g:551:3: ( rule__PatternValidator__Group__0 )
            // InternalKukulkan.g:551:4: rule__PatternValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternValidatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepatternValidator"


    // $ANTLR start "entryRuleminValidator"
    // InternalKukulkan.g:560:1: entryRuleminValidator : ruleminValidator EOF ;
    public final void entryRuleminValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:561:1: ( ruleminValidator EOF )
            // InternalKukulkan.g:562:1: ruleminValidator EOF
            {
             before(grammarAccess.getMinValidatorRule()); 
            pushFollow(FOLLOW_1);
            ruleminValidator();

            state._fsp--;

             after(grammarAccess.getMinValidatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleminValidator"


    // $ANTLR start "ruleminValidator"
    // InternalKukulkan.g:569:1: ruleminValidator : ( ( rule__MinValidator__Group__0 ) ) ;
    public final void ruleminValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:573:2: ( ( ( rule__MinValidator__Group__0 ) ) )
            // InternalKukulkan.g:574:2: ( ( rule__MinValidator__Group__0 ) )
            {
            // InternalKukulkan.g:574:2: ( ( rule__MinValidator__Group__0 ) )
            // InternalKukulkan.g:575:3: ( rule__MinValidator__Group__0 )
            {
             before(grammarAccess.getMinValidatorAccess().getGroup()); 
            // InternalKukulkan.g:576:3: ( rule__MinValidator__Group__0 )
            // InternalKukulkan.g:576:4: rule__MinValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinValidatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleminValidator"


    // $ANTLR start "entryRulemaxValidator"
    // InternalKukulkan.g:585:1: entryRulemaxValidator : rulemaxValidator EOF ;
    public final void entryRulemaxValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:586:1: ( rulemaxValidator EOF )
            // InternalKukulkan.g:587:1: rulemaxValidator EOF
            {
             before(grammarAccess.getMaxValidatorRule()); 
            pushFollow(FOLLOW_1);
            rulemaxValidator();

            state._fsp--;

             after(grammarAccess.getMaxValidatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemaxValidator"


    // $ANTLR start "rulemaxValidator"
    // InternalKukulkan.g:594:1: rulemaxValidator : ( ( rule__MaxValidator__Group__0 ) ) ;
    public final void rulemaxValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:598:2: ( ( ( rule__MaxValidator__Group__0 ) ) )
            // InternalKukulkan.g:599:2: ( ( rule__MaxValidator__Group__0 ) )
            {
            // InternalKukulkan.g:599:2: ( ( rule__MaxValidator__Group__0 ) )
            // InternalKukulkan.g:600:3: ( rule__MaxValidator__Group__0 )
            {
             before(grammarAccess.getMaxValidatorAccess().getGroup()); 
            // InternalKukulkan.g:601:3: ( rule__MaxValidator__Group__0 )
            // InternalKukulkan.g:601:4: rule__MaxValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxValidatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemaxValidator"


    // $ANTLR start "entryRulecardinality"
    // InternalKukulkan.g:610:1: entryRulecardinality : rulecardinality EOF ;
    public final void entryRulecardinality() throws RecognitionException {
        try {
            // InternalKukulkan.g:611:1: ( rulecardinality EOF )
            // InternalKukulkan.g:612:1: rulecardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            rulecardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecardinality"


    // $ANTLR start "rulecardinality"
    // InternalKukulkan.g:619:1: rulecardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void rulecardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:623:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalKukulkan.g:624:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalKukulkan.g:624:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalKukulkan.g:625:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalKukulkan.g:626:3: ( rule__Cardinality__Alternatives )
            // InternalKukulkan.g:626:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecardinality"


    // $ANTLR start "rule__EntityField__Alternatives"
    // InternalKukulkan.g:634:1: rule__EntityField__Alternatives : ( ( ruleprimitiveField ) | ( ruleassociationField ) );
    public final void rule__EntityField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:638:1: ( ( ruleprimitiveField ) | ( ruleassociationField ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ONE_TO_MANY && LA2_0<=RULE_MANY_TO_MANY)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKukulkan.g:639:2: ( ruleprimitiveField )
                    {
                    // InternalKukulkan.g:639:2: ( ruleprimitiveField )
                    // InternalKukulkan.g:640:3: ruleprimitiveField
                    {
                     before(grammarAccess.getEntityFieldAccess().getPrimitiveFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleprimitiveField();

                    state._fsp--;

                     after(grammarAccess.getEntityFieldAccess().getPrimitiveFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:645:2: ( ruleassociationField )
                    {
                    // InternalKukulkan.g:645:2: ( ruleassociationField )
                    // InternalKukulkan.g:646:3: ruleassociationField
                    {
                     before(grammarAccess.getEntityFieldAccess().getAssociationFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleassociationField();

                    state._fsp--;

                     after(grammarAccess.getEntityFieldAccess().getAssociationFieldParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityField__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalKukulkan.g:655:1: rule__FieldType__Alternatives : ( ( rulestringFieldType ) | ( rulenumericFieldType ) | ( rulebooleanFieldType ) | ( ruledateFieldType ) | ( ruleblobFieldType ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:659:1: ( ( rulestringFieldType ) | ( rulenumericFieldType ) | ( rulebooleanFieldType ) | ( ruledateFieldType ) | ( ruleblobFieldType ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_STRING_KEYWORD:
                {
                alt3=1;
                }
                break;
            case RULE_INTEGER:
            case RULE_LONG:
            case RULE_BIG_DECIMAL:
            case RULE_FLOAT:
            case RULE_DOUBLE:
                {
                alt3=2;
                }
                break;
            case RULE_BOOLEAN_TYPE:
                {
                alt3=3;
                }
                break;
            case RULE_LOCAL_DATE:
            case RULE_ZONED_DATETIME:
            case RULE_INSTANT:
                {
                alt3=4;
                }
                break;
            case RULE_BLOB:
            case RULE_ANY_BLOB:
            case RULE_IMAGE_BLOB:
            case RULE_TEXT_BLOB:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKukulkan.g:660:2: ( rulestringFieldType )
                    {
                    // InternalKukulkan.g:660:2: ( rulestringFieldType )
                    // InternalKukulkan.g:661:3: rulestringFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringFieldTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulestringFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getStringFieldTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:666:2: ( rulenumericFieldType )
                    {
                    // InternalKukulkan.g:666:2: ( rulenumericFieldType )
                    // InternalKukulkan.g:667:3: rulenumericFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getNumericFieldTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulenumericFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getNumericFieldTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:672:2: ( rulebooleanFieldType )
                    {
                    // InternalKukulkan.g:672:2: ( rulebooleanFieldType )
                    // InternalKukulkan.g:673:3: rulebooleanFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanFieldTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulebooleanFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getBooleanFieldTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:678:2: ( ruledateFieldType )
                    {
                    // InternalKukulkan.g:678:2: ( ruledateFieldType )
                    // InternalKukulkan.g:679:3: ruledateFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateFieldTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruledateFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getDateFieldTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:684:2: ( ruleblobFieldType )
                    {
                    // InternalKukulkan.g:684:2: ( ruleblobFieldType )
                    // InternalKukulkan.g:685:3: ruleblobFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleblobFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__NumericTypes__Alternatives"
    // InternalKukulkan.g:694:1: rule__NumericTypes__Alternatives : ( ( RULE_INTEGER ) | ( RULE_LONG ) | ( RULE_BIG_DECIMAL ) | ( RULE_FLOAT ) | ( RULE_DOUBLE ) );
    public final void rule__NumericTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:698:1: ( ( RULE_INTEGER ) | ( RULE_LONG ) | ( RULE_BIG_DECIMAL ) | ( RULE_FLOAT ) | ( RULE_DOUBLE ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt4=1;
                }
                break;
            case RULE_LONG:
                {
                alt4=2;
                }
                break;
            case RULE_BIG_DECIMAL:
                {
                alt4=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=4;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKukulkan.g:699:2: ( RULE_INTEGER )
                    {
                    // InternalKukulkan.g:699:2: ( RULE_INTEGER )
                    // InternalKukulkan.g:700:3: RULE_INTEGER
                    {
                     before(grammarAccess.getNumericTypesAccess().getINTEGERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_2); 
                     after(grammarAccess.getNumericTypesAccess().getINTEGERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:705:2: ( RULE_LONG )
                    {
                    // InternalKukulkan.g:705:2: ( RULE_LONG )
                    // InternalKukulkan.g:706:3: RULE_LONG
                    {
                     before(grammarAccess.getNumericTypesAccess().getLONGTerminalRuleCall_1()); 
                    match(input,RULE_LONG,FOLLOW_2); 
                     after(grammarAccess.getNumericTypesAccess().getLONGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:711:2: ( RULE_BIG_DECIMAL )
                    {
                    // InternalKukulkan.g:711:2: ( RULE_BIG_DECIMAL )
                    // InternalKukulkan.g:712:3: RULE_BIG_DECIMAL
                    {
                     before(grammarAccess.getNumericTypesAccess().getBIG_DECIMALTerminalRuleCall_2()); 
                    match(input,RULE_BIG_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getNumericTypesAccess().getBIG_DECIMALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:717:2: ( RULE_FLOAT )
                    {
                    // InternalKukulkan.g:717:2: ( RULE_FLOAT )
                    // InternalKukulkan.g:718:3: RULE_FLOAT
                    {
                     before(grammarAccess.getNumericTypesAccess().getFLOATTerminalRuleCall_3()); 
                    match(input,RULE_FLOAT,FOLLOW_2); 
                     after(grammarAccess.getNumericTypesAccess().getFLOATTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:723:2: ( RULE_DOUBLE )
                    {
                    // InternalKukulkan.g:723:2: ( RULE_DOUBLE )
                    // InternalKukulkan.g:724:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumericTypesAccess().getDOUBLETerminalRuleCall_4()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getNumericTypesAccess().getDOUBLETerminalRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypes__Alternatives"


    // $ANTLR start "rule__DateTypes__Alternatives"
    // InternalKukulkan.g:733:1: rule__DateTypes__Alternatives : ( ( RULE_LOCAL_DATE ) | ( RULE_ZONED_DATETIME ) | ( RULE_INSTANT ) );
    public final void rule__DateTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:737:1: ( ( RULE_LOCAL_DATE ) | ( RULE_ZONED_DATETIME ) | ( RULE_INSTANT ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_LOCAL_DATE:
                {
                alt5=1;
                }
                break;
            case RULE_ZONED_DATETIME:
                {
                alt5=2;
                }
                break;
            case RULE_INSTANT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKukulkan.g:738:2: ( RULE_LOCAL_DATE )
                    {
                    // InternalKukulkan.g:738:2: ( RULE_LOCAL_DATE )
                    // InternalKukulkan.g:739:3: RULE_LOCAL_DATE
                    {
                     before(grammarAccess.getDateTypesAccess().getLOCAL_DATETerminalRuleCall_0()); 
                    match(input,RULE_LOCAL_DATE,FOLLOW_2); 
                     after(grammarAccess.getDateTypesAccess().getLOCAL_DATETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:744:2: ( RULE_ZONED_DATETIME )
                    {
                    // InternalKukulkan.g:744:2: ( RULE_ZONED_DATETIME )
                    // InternalKukulkan.g:745:3: RULE_ZONED_DATETIME
                    {
                     before(grammarAccess.getDateTypesAccess().getZONED_DATETIMETerminalRuleCall_1()); 
                    match(input,RULE_ZONED_DATETIME,FOLLOW_2); 
                     after(grammarAccess.getDateTypesAccess().getZONED_DATETIMETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:750:2: ( RULE_INSTANT )
                    {
                    // InternalKukulkan.g:750:2: ( RULE_INSTANT )
                    // InternalKukulkan.g:751:3: RULE_INSTANT
                    {
                     before(grammarAccess.getDateTypesAccess().getINSTANTTerminalRuleCall_2()); 
                    match(input,RULE_INSTANT,FOLLOW_2); 
                     after(grammarAccess.getDateTypesAccess().getINSTANTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTypes__Alternatives"


    // $ANTLR start "rule__BlobTypes__Alternatives"
    // InternalKukulkan.g:760:1: rule__BlobTypes__Alternatives : ( ( RULE_BLOB ) | ( RULE_ANY_BLOB ) | ( RULE_IMAGE_BLOB ) | ( RULE_TEXT_BLOB ) );
    public final void rule__BlobTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:764:1: ( ( RULE_BLOB ) | ( RULE_ANY_BLOB ) | ( RULE_IMAGE_BLOB ) | ( RULE_TEXT_BLOB ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_BLOB:
                {
                alt6=1;
                }
                break;
            case RULE_ANY_BLOB:
                {
                alt6=2;
                }
                break;
            case RULE_IMAGE_BLOB:
                {
                alt6=3;
                }
                break;
            case RULE_TEXT_BLOB:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKukulkan.g:765:2: ( RULE_BLOB )
                    {
                    // InternalKukulkan.g:765:2: ( RULE_BLOB )
                    // InternalKukulkan.g:766:3: RULE_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getBLOBTerminalRuleCall_0()); 
                    match(input,RULE_BLOB,FOLLOW_2); 
                     after(grammarAccess.getBlobTypesAccess().getBLOBTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:771:2: ( RULE_ANY_BLOB )
                    {
                    // InternalKukulkan.g:771:2: ( RULE_ANY_BLOB )
                    // InternalKukulkan.g:772:3: RULE_ANY_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getANY_BLOBTerminalRuleCall_1()); 
                    match(input,RULE_ANY_BLOB,FOLLOW_2); 
                     after(grammarAccess.getBlobTypesAccess().getANY_BLOBTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:777:2: ( RULE_IMAGE_BLOB )
                    {
                    // InternalKukulkan.g:777:2: ( RULE_IMAGE_BLOB )
                    // InternalKukulkan.g:778:3: RULE_IMAGE_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getIMAGE_BLOBTerminalRuleCall_2()); 
                    match(input,RULE_IMAGE_BLOB,FOLLOW_2); 
                     after(grammarAccess.getBlobTypesAccess().getIMAGE_BLOBTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:783:2: ( RULE_TEXT_BLOB )
                    {
                    // InternalKukulkan.g:783:2: ( RULE_TEXT_BLOB )
                    // InternalKukulkan.g:784:3: RULE_TEXT_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getTEXT_BLOBTerminalRuleCall_3()); 
                    match(input,RULE_TEXT_BLOB,FOLLOW_2); 
                     after(grammarAccess.getBlobTypesAccess().getTEXT_BLOBTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobTypes__Alternatives"


    // $ANTLR start "rule__StringValidators__Alternatives"
    // InternalKukulkan.g:793:1: rule__StringValidators__Alternatives : ( ( ( rule__StringValidators__RequiredAssignment_0 ) ) | ( ( rule__StringValidators__MinLenghtAssignment_1 ) ) | ( ( rule__StringValidators__MaxLenghtAssignment_2 ) ) | ( ( rule__StringValidators__PatternAssignment_3 ) ) );
    public final void rule__StringValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:797:1: ( ( ( rule__StringValidators__RequiredAssignment_0 ) ) | ( ( rule__StringValidators__MinLenghtAssignment_1 ) ) | ( ( rule__StringValidators__MaxLenghtAssignment_2 ) ) | ( ( rule__StringValidators__PatternAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt7=1;
                }
                break;
            case RULE_MIN:
                {
                alt7=2;
                }
                break;
            case RULE_MAX:
                {
                alt7=3;
                }
                break;
            case RULE_PATTERN:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKukulkan.g:798:2: ( ( rule__StringValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:798:2: ( ( rule__StringValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:799:3: ( rule__StringValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:800:3: ( rule__StringValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:800:4: rule__StringValidators__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValidators__RequiredAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringValidatorsAccess().getRequiredAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:804:2: ( ( rule__StringValidators__MinLenghtAssignment_1 ) )
                    {
                    // InternalKukulkan.g:804:2: ( ( rule__StringValidators__MinLenghtAssignment_1 ) )
                    // InternalKukulkan.g:805:3: ( rule__StringValidators__MinLenghtAssignment_1 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getMinLenghtAssignment_1()); 
                    // InternalKukulkan.g:806:3: ( rule__StringValidators__MinLenghtAssignment_1 )
                    // InternalKukulkan.g:806:4: rule__StringValidators__MinLenghtAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValidators__MinLenghtAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringValidatorsAccess().getMinLenghtAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:810:2: ( ( rule__StringValidators__MaxLenghtAssignment_2 ) )
                    {
                    // InternalKukulkan.g:810:2: ( ( rule__StringValidators__MaxLenghtAssignment_2 ) )
                    // InternalKukulkan.g:811:3: ( rule__StringValidators__MaxLenghtAssignment_2 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getMaxLenghtAssignment_2()); 
                    // InternalKukulkan.g:812:3: ( rule__StringValidators__MaxLenghtAssignment_2 )
                    // InternalKukulkan.g:812:4: rule__StringValidators__MaxLenghtAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValidators__MaxLenghtAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringValidatorsAccess().getMaxLenghtAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:816:2: ( ( rule__StringValidators__PatternAssignment_3 ) )
                    {
                    // InternalKukulkan.g:816:2: ( ( rule__StringValidators__PatternAssignment_3 ) )
                    // InternalKukulkan.g:817:3: ( rule__StringValidators__PatternAssignment_3 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getPatternAssignment_3()); 
                    // InternalKukulkan.g:818:3: ( rule__StringValidators__PatternAssignment_3 )
                    // InternalKukulkan.g:818:4: rule__StringValidators__PatternAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringValidators__PatternAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringValidatorsAccess().getPatternAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValidators__Alternatives"


    // $ANTLR start "rule__NumericValidators__Alternatives"
    // InternalKukulkan.g:826:1: rule__NumericValidators__Alternatives : ( ( ( rule__NumericValidators__RequiredAssignment_0 ) ) | ( ( rule__NumericValidators__MinValueAssignment_1 ) ) | ( ( rule__NumericValidators__MaxValueAssignment_2 ) ) );
    public final void rule__NumericValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:830:1: ( ( ( rule__NumericValidators__RequiredAssignment_0 ) ) | ( ( rule__NumericValidators__MinValueAssignment_1 ) ) | ( ( rule__NumericValidators__MaxValueAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt8=1;
                }
                break;
            case RULE_MIN:
                {
                alt8=2;
                }
                break;
            case RULE_MAX:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKukulkan.g:831:2: ( ( rule__NumericValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:831:2: ( ( rule__NumericValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:832:3: ( rule__NumericValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:833:3: ( rule__NumericValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:833:4: rule__NumericValidators__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericValidators__RequiredAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericValidatorsAccess().getRequiredAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:837:2: ( ( rule__NumericValidators__MinValueAssignment_1 ) )
                    {
                    // InternalKukulkan.g:837:2: ( ( rule__NumericValidators__MinValueAssignment_1 ) )
                    // InternalKukulkan.g:838:3: ( rule__NumericValidators__MinValueAssignment_1 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getMinValueAssignment_1()); 
                    // InternalKukulkan.g:839:3: ( rule__NumericValidators__MinValueAssignment_1 )
                    // InternalKukulkan.g:839:4: rule__NumericValidators__MinValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericValidators__MinValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericValidatorsAccess().getMinValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:843:2: ( ( rule__NumericValidators__MaxValueAssignment_2 ) )
                    {
                    // InternalKukulkan.g:843:2: ( ( rule__NumericValidators__MaxValueAssignment_2 ) )
                    // InternalKukulkan.g:844:3: ( rule__NumericValidators__MaxValueAssignment_2 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getMaxValueAssignment_2()); 
                    // InternalKukulkan.g:845:3: ( rule__NumericValidators__MaxValueAssignment_2 )
                    // InternalKukulkan.g:845:4: rule__NumericValidators__MaxValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericValidators__MaxValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumericValidatorsAccess().getMaxValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValidators__Alternatives"


    // $ANTLR start "rule__BlobValidators__Alternatives"
    // InternalKukulkan.g:853:1: rule__BlobValidators__Alternatives : ( ( ( rule__BlobValidators__RequiredAssignment_0 ) ) | ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) ) | ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) ) );
    public final void rule__BlobValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:857:1: ( ( ( rule__BlobValidators__RequiredAssignment_0 ) ) | ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) ) | ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_REQUIRED:
                {
                alt9=1;
                }
                break;
            case RULE_MIN:
                {
                alt9=2;
                }
                break;
            case RULE_MAX:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKukulkan.g:858:2: ( ( rule__BlobValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:858:2: ( ( rule__BlobValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:859:3: ( rule__BlobValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:860:3: ( rule__BlobValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:860:4: rule__BlobValidators__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlobValidators__RequiredAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlobValidatorsAccess().getRequiredAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:864:2: ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) )
                    {
                    // InternalKukulkan.g:864:2: ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) )
                    // InternalKukulkan.g:865:3: ( rule__BlobValidators__MinBytesValueAssignment_1 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getMinBytesValueAssignment_1()); 
                    // InternalKukulkan.g:866:3: ( rule__BlobValidators__MinBytesValueAssignment_1 )
                    // InternalKukulkan.g:866:4: rule__BlobValidators__MinBytesValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlobValidators__MinBytesValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlobValidatorsAccess().getMinBytesValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:870:2: ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) )
                    {
                    // InternalKukulkan.g:870:2: ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) )
                    // InternalKukulkan.g:871:3: ( rule__BlobValidators__MaxBytesValueAssignment_2 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueAssignment_2()); 
                    // InternalKukulkan.g:872:3: ( rule__BlobValidators__MaxBytesValueAssignment_2 )
                    // InternalKukulkan.g:872:4: rule__BlobValidators__MaxBytesValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlobValidators__MaxBytesValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobValidators__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalKukulkan.g:880:1: rule__Cardinality__Alternatives : ( ( RULE_ONE_TO_MANY ) | ( RULE_MANY_TO_ONE ) | ( RULE_ONE_TO_ONE ) | ( RULE_MANY_TO_MANY ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:884:1: ( ( RULE_ONE_TO_MANY ) | ( RULE_MANY_TO_ONE ) | ( RULE_ONE_TO_ONE ) | ( RULE_MANY_TO_MANY ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_ONE_TO_MANY:
                {
                alt10=1;
                }
                break;
            case RULE_MANY_TO_ONE:
                {
                alt10=2;
                }
                break;
            case RULE_ONE_TO_ONE:
                {
                alt10=3;
                }
                break;
            case RULE_MANY_TO_MANY:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKukulkan.g:885:2: ( RULE_ONE_TO_MANY )
                    {
                    // InternalKukulkan.g:885:2: ( RULE_ONE_TO_MANY )
                    // InternalKukulkan.g:886:3: RULE_ONE_TO_MANY
                    {
                     before(grammarAccess.getCardinalityAccess().getONE_TO_MANYTerminalRuleCall_0()); 
                    match(input,RULE_ONE_TO_MANY,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getONE_TO_MANYTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:891:2: ( RULE_MANY_TO_ONE )
                    {
                    // InternalKukulkan.g:891:2: ( RULE_MANY_TO_ONE )
                    // InternalKukulkan.g:892:3: RULE_MANY_TO_ONE
                    {
                     before(grammarAccess.getCardinalityAccess().getMANY_TO_ONETerminalRuleCall_1()); 
                    match(input,RULE_MANY_TO_ONE,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getMANY_TO_ONETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:897:2: ( RULE_ONE_TO_ONE )
                    {
                    // InternalKukulkan.g:897:2: ( RULE_ONE_TO_ONE )
                    // InternalKukulkan.g:898:3: RULE_ONE_TO_ONE
                    {
                     before(grammarAccess.getCardinalityAccess().getONE_TO_ONETerminalRuleCall_2()); 
                    match(input,RULE_ONE_TO_ONE,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getONE_TO_ONETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:903:2: ( RULE_MANY_TO_MANY )
                    {
                    // InternalKukulkan.g:903:2: ( RULE_MANY_TO_MANY )
                    // InternalKukulkan.g:904:3: RULE_MANY_TO_MANY
                    {
                     before(grammarAccess.getCardinalityAccess().getMANY_TO_MANYTerminalRuleCall_3()); 
                    match(input,RULE_MANY_TO_MANY,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getMANY_TO_MANYTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalKukulkan.g:913:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:917:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalKukulkan.g:918:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalKukulkan.g:925:1: rule__Entity__Group__0__Impl : ( RULE_ENTITY_KEYWORD ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:929:1: ( ( RULE_ENTITY_KEYWORD ) )
            // InternalKukulkan.g:930:1: ( RULE_ENTITY_KEYWORD )
            {
            // InternalKukulkan.g:930:1: ( RULE_ENTITY_KEYWORD )
            // InternalKukulkan.g:931:2: RULE_ENTITY_KEYWORD
            {
             before(grammarAccess.getEntityAccess().getENTITY_KEYWORDTerminalRuleCall_0()); 
            match(input,RULE_ENTITY_KEYWORD,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getENTITY_KEYWORDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalKukulkan.g:940:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:944:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalKukulkan.g:945:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalKukulkan.g:952:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:956:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalKukulkan.g:957:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalKukulkan.g:957:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalKukulkan.g:958:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalKukulkan.g:959:2: ( rule__Entity__NameAssignment_1 )
            // InternalKukulkan.g:959:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalKukulkan.g:967:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:971:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalKukulkan.g:972:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalKukulkan.g:979:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:983:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalKukulkan.g:984:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalKukulkan.g:984:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalKukulkan.g:985:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalKukulkan.g:986:2: ( rule__Entity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_LPAREN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKukulkan.g:986:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalKukulkan.g:994:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:998:1: ( rule__Entity__Group__3__Impl )
            // InternalKukulkan.g:999:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalKukulkan.g:1005:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1009:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalKukulkan.g:1010:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalKukulkan.g:1010:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalKukulkan.g:1011:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalKukulkan.g:1012:2: ( rule__Entity__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LBRACE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKukulkan.g:1012:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalKukulkan.g:1021:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1025:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalKukulkan.g:1026:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalKukulkan.g:1033:1: rule__Entity__Group_2__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1037:1: ( ( RULE_LPAREN ) )
            // InternalKukulkan.g:1038:1: ( RULE_LPAREN )
            {
            // InternalKukulkan.g:1038:1: ( RULE_LPAREN )
            // InternalKukulkan.g:1039:2: RULE_LPAREN
            {
             before(grammarAccess.getEntityAccess().getLPARENTerminalRuleCall_2_0()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalKukulkan.g:1048:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1052:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalKukulkan.g:1053:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalKukulkan.g:1060:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__TableNameAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1064:1: ( ( ( rule__Entity__TableNameAssignment_2_1 ) ) )
            // InternalKukulkan.g:1065:1: ( ( rule__Entity__TableNameAssignment_2_1 ) )
            {
            // InternalKukulkan.g:1065:1: ( ( rule__Entity__TableNameAssignment_2_1 ) )
            // InternalKukulkan.g:1066:2: ( rule__Entity__TableNameAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getTableNameAssignment_2_1()); 
            // InternalKukulkan.g:1067:2: ( rule__Entity__TableNameAssignment_2_1 )
            // InternalKukulkan.g:1067:3: rule__Entity__TableNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__TableNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getTableNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // InternalKukulkan.g:1075:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1079:1: ( rule__Entity__Group_2__2__Impl )
            // InternalKukulkan.g:1080:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // InternalKukulkan.g:1086:1: rule__Entity__Group_2__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1090:1: ( ( RULE_RPAREN ) )
            // InternalKukulkan.g:1091:1: ( RULE_RPAREN )
            {
            // InternalKukulkan.g:1091:1: ( RULE_RPAREN )
            // InternalKukulkan.g:1092:2: RULE_RPAREN
            {
             before(grammarAccess.getEntityAccess().getRPARENTerminalRuleCall_2_2()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRPARENTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalKukulkan.g:1102:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1106:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalKukulkan.g:1107:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalKukulkan.g:1114:1: rule__Entity__Group_3__0__Impl : ( RULE_LBRACE ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1118:1: ( ( RULE_LBRACE ) )
            // InternalKukulkan.g:1119:1: ( RULE_LBRACE )
            {
            // InternalKukulkan.g:1119:1: ( RULE_LBRACE )
            // InternalKukulkan.g:1120:2: RULE_LBRACE
            {
             before(grammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0()); 
            match(input,RULE_LBRACE,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalKukulkan.g:1129:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1133:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalKukulkan.g:1134:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalKukulkan.g:1141:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__Group_3_1__0 )? ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1145:1: ( ( ( rule__Entity__Group_3_1__0 )? ) )
            // InternalKukulkan.g:1146:1: ( ( rule__Entity__Group_3_1__0 )? )
            {
            // InternalKukulkan.g:1146:1: ( ( rule__Entity__Group_3_1__0 )? )
            // InternalKukulkan.g:1147:2: ( rule__Entity__Group_3_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3_1()); 
            // InternalKukulkan.g:1148:2: ( rule__Entity__Group_3_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ONE_TO_MANY && LA13_0<=RULE_MANY_TO_MANY)||LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKukulkan.g:1148:3: rule__Entity__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalKukulkan.g:1156:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1160:1: ( rule__Entity__Group_3__2__Impl )
            // InternalKukulkan.g:1161:2: rule__Entity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalKukulkan.g:1167:1: rule__Entity__Group_3__2__Impl : ( RULE_RBRACE ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1171:1: ( ( RULE_RBRACE ) )
            // InternalKukulkan.g:1172:1: ( RULE_RBRACE )
            {
            // InternalKukulkan.g:1172:1: ( RULE_RBRACE )
            // InternalKukulkan.g:1173:2: RULE_RBRACE
            {
             before(grammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2()); 
            match(input,RULE_RBRACE,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3_1__0"
    // InternalKukulkan.g:1183:1: rule__Entity__Group_3_1__0 : rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1 ;
    public final void rule__Entity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1187:1: ( rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1 )
            // InternalKukulkan.g:1188:2: rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1__0"


    // $ANTLR start "rule__Entity__Group_3_1__0__Impl"
    // InternalKukulkan.g:1195:1: rule__Entity__Group_3_1__0__Impl : ( ( rule__Entity__FieldsAssignment_3_1_0 ) ) ;
    public final void rule__Entity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1199:1: ( ( ( rule__Entity__FieldsAssignment_3_1_0 ) ) )
            // InternalKukulkan.g:1200:1: ( ( rule__Entity__FieldsAssignment_3_1_0 ) )
            {
            // InternalKukulkan.g:1200:1: ( ( rule__Entity__FieldsAssignment_3_1_0 ) )
            // InternalKukulkan.g:1201:2: ( rule__Entity__FieldsAssignment_3_1_0 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_0()); 
            // InternalKukulkan.g:1202:2: ( rule__Entity__FieldsAssignment_3_1_0 )
            // InternalKukulkan.g:1202:3: rule__Entity__FieldsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_3_1__1"
    // InternalKukulkan.g:1210:1: rule__Entity__Group_3_1__1 : rule__Entity__Group_3_1__1__Impl ;
    public final void rule__Entity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1214:1: ( rule__Entity__Group_3_1__1__Impl )
            // InternalKukulkan.g:1215:2: rule__Entity__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1__1"


    // $ANTLR start "rule__Entity__Group_3_1__1__Impl"
    // InternalKukulkan.g:1221:1: rule__Entity__Group_3_1__1__Impl : ( ( rule__Entity__Group_3_1_1__0 )* ) ;
    public final void rule__Entity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1225:1: ( ( ( rule__Entity__Group_3_1_1__0 )* ) )
            // InternalKukulkan.g:1226:1: ( ( rule__Entity__Group_3_1_1__0 )* )
            {
            // InternalKukulkan.g:1226:1: ( ( rule__Entity__Group_3_1_1__0 )* )
            // InternalKukulkan.g:1227:2: ( rule__Entity__Group_3_1_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_1_1()); 
            // InternalKukulkan.g:1228:2: ( rule__Entity__Group_3_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKukulkan.g:1228:3: rule__Entity__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1__1__Impl"


    // $ANTLR start "rule__Entity__Group_3_1_1__0"
    // InternalKukulkan.g:1237:1: rule__Entity__Group_3_1_1__0 : rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1 ;
    public final void rule__Entity__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1241:1: ( rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1 )
            // InternalKukulkan.g:1242:2: rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1_1__0"


    // $ANTLR start "rule__Entity__Group_3_1_1__0__Impl"
    // InternalKukulkan.g:1249:1: rule__Entity__Group_3_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Entity__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1253:1: ( ( RULE_COMMA ) )
            // InternalKukulkan.g:1254:1: ( RULE_COMMA )
            {
            // InternalKukulkan.g:1254:1: ( RULE_COMMA )
            // InternalKukulkan.g:1255:2: RULE_COMMA
            {
             before(grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_3_1_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_3_1_1__1"
    // InternalKukulkan.g:1264:1: rule__Entity__Group_3_1_1__1 : rule__Entity__Group_3_1_1__1__Impl ;
    public final void rule__Entity__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1268:1: ( rule__Entity__Group_3_1_1__1__Impl )
            // InternalKukulkan.g:1269:2: rule__Entity__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1_1__1"


    // $ANTLR start "rule__Entity__Group_3_1_1__1__Impl"
    // InternalKukulkan.g:1275:1: rule__Entity__Group_3_1_1__1__Impl : ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) ) ;
    public final void rule__Entity__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1279:1: ( ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) ) )
            // InternalKukulkan.g:1280:1: ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) )
            {
            // InternalKukulkan.g:1280:1: ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) )
            // InternalKukulkan.g:1281:2: ( rule__Entity__FieldsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_1_1()); 
            // InternalKukulkan.g:1282:2: ( rule__Entity__FieldsAssignment_3_1_1_1 )
            // InternalKukulkan.g:1282:3: rule__Entity__FieldsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__PrimitiveField__Group__0"
    // InternalKukulkan.g:1291:1: rule__PrimitiveField__Group__0 : rule__PrimitiveField__Group__0__Impl rule__PrimitiveField__Group__1 ;
    public final void rule__PrimitiveField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1295:1: ( rule__PrimitiveField__Group__0__Impl rule__PrimitiveField__Group__1 )
            // InternalKukulkan.g:1296:2: rule__PrimitiveField__Group__0__Impl rule__PrimitiveField__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PrimitiveField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__0"


    // $ANTLR start "rule__PrimitiveField__Group__0__Impl"
    // InternalKukulkan.g:1303:1: rule__PrimitiveField__Group__0__Impl : ( ( rule__PrimitiveField__IdAssignment_0 ) ) ;
    public final void rule__PrimitiveField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1307:1: ( ( ( rule__PrimitiveField__IdAssignment_0 ) ) )
            // InternalKukulkan.g:1308:1: ( ( rule__PrimitiveField__IdAssignment_0 ) )
            {
            // InternalKukulkan.g:1308:1: ( ( rule__PrimitiveField__IdAssignment_0 ) )
            // InternalKukulkan.g:1309:2: ( rule__PrimitiveField__IdAssignment_0 )
            {
             before(grammarAccess.getPrimitiveFieldAccess().getIdAssignment_0()); 
            // InternalKukulkan.g:1310:2: ( rule__PrimitiveField__IdAssignment_0 )
            // InternalKukulkan.g:1310:3: rule__PrimitiveField__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveField__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveFieldAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveField__Group__1"
    // InternalKukulkan.g:1318:1: rule__PrimitiveField__Group__1 : rule__PrimitiveField__Group__1__Impl rule__PrimitiveField__Group__2 ;
    public final void rule__PrimitiveField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1322:1: ( rule__PrimitiveField__Group__1__Impl rule__PrimitiveField__Group__2 )
            // InternalKukulkan.g:1323:2: rule__PrimitiveField__Group__1__Impl rule__PrimitiveField__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PrimitiveField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__1"


    // $ANTLR start "rule__PrimitiveField__Group__1__Impl"
    // InternalKukulkan.g:1330:1: rule__PrimitiveField__Group__1__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__PrimitiveField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1334:1: ( ( RULE_SEMICOLON ) )
            // InternalKukulkan.g:1335:1: ( RULE_SEMICOLON )
            {
            // InternalKukulkan.g:1335:1: ( RULE_SEMICOLON )
            // InternalKukulkan.g:1336:2: RULE_SEMICOLON
            {
             before(grammarAccess.getPrimitiveFieldAccess().getSEMICOLONTerminalRuleCall_1()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getPrimitiveFieldAccess().getSEMICOLONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveField__Group__2"
    // InternalKukulkan.g:1345:1: rule__PrimitiveField__Group__2 : rule__PrimitiveField__Group__2__Impl ;
    public final void rule__PrimitiveField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1349:1: ( rule__PrimitiveField__Group__2__Impl )
            // InternalKukulkan.g:1350:2: rule__PrimitiveField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__2"


    // $ANTLR start "rule__PrimitiveField__Group__2__Impl"
    // InternalKukulkan.g:1356:1: rule__PrimitiveField__Group__2__Impl : ( ( rule__PrimitiveField__TypeAssignment_2 ) ) ;
    public final void rule__PrimitiveField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1360:1: ( ( ( rule__PrimitiveField__TypeAssignment_2 ) ) )
            // InternalKukulkan.g:1361:1: ( ( rule__PrimitiveField__TypeAssignment_2 ) )
            {
            // InternalKukulkan.g:1361:1: ( ( rule__PrimitiveField__TypeAssignment_2 ) )
            // InternalKukulkan.g:1362:2: ( rule__PrimitiveField__TypeAssignment_2 )
            {
             before(grammarAccess.getPrimitiveFieldAccess().getTypeAssignment_2()); 
            // InternalKukulkan.g:1363:2: ( rule__PrimitiveField__TypeAssignment_2 )
            // InternalKukulkan.g:1363:3: rule__PrimitiveField__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveField__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveFieldAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__Group__2__Impl"


    // $ANTLR start "rule__AssociationField__Group__0"
    // InternalKukulkan.g:1372:1: rule__AssociationField__Group__0 : rule__AssociationField__Group__0__Impl rule__AssociationField__Group__1 ;
    public final void rule__AssociationField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1376:1: ( rule__AssociationField__Group__0__Impl rule__AssociationField__Group__1 )
            // InternalKukulkan.g:1377:2: rule__AssociationField__Group__0__Impl rule__AssociationField__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AssociationField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__0"


    // $ANTLR start "rule__AssociationField__Group__0__Impl"
    // InternalKukulkan.g:1384:1: rule__AssociationField__Group__0__Impl : ( ( rule__AssociationField__TypeAssignment_0 ) ) ;
    public final void rule__AssociationField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1388:1: ( ( ( rule__AssociationField__TypeAssignment_0 ) ) )
            // InternalKukulkan.g:1389:1: ( ( rule__AssociationField__TypeAssignment_0 ) )
            {
            // InternalKukulkan.g:1389:1: ( ( rule__AssociationField__TypeAssignment_0 ) )
            // InternalKukulkan.g:1390:2: ( rule__AssociationField__TypeAssignment_0 )
            {
             before(grammarAccess.getAssociationFieldAccess().getTypeAssignment_0()); 
            // InternalKukulkan.g:1391:2: ( rule__AssociationField__TypeAssignment_0 )
            // InternalKukulkan.g:1391:3: rule__AssociationField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__0__Impl"


    // $ANTLR start "rule__AssociationField__Group__1"
    // InternalKukulkan.g:1399:1: rule__AssociationField__Group__1 : rule__AssociationField__Group__1__Impl rule__AssociationField__Group__2 ;
    public final void rule__AssociationField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1403:1: ( rule__AssociationField__Group__1__Impl rule__AssociationField__Group__2 )
            // InternalKukulkan.g:1404:2: rule__AssociationField__Group__1__Impl rule__AssociationField__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AssociationField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__1"


    // $ANTLR start "rule__AssociationField__Group__1__Impl"
    // InternalKukulkan.g:1411:1: rule__AssociationField__Group__1__Impl : ( ( rule__AssociationField__Group_1__0 )? ) ;
    public final void rule__AssociationField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1415:1: ( ( ( rule__AssociationField__Group_1__0 )? ) )
            // InternalKukulkan.g:1416:1: ( ( rule__AssociationField__Group_1__0 )? )
            {
            // InternalKukulkan.g:1416:1: ( ( rule__AssociationField__Group_1__0 )? )
            // InternalKukulkan.g:1417:2: ( rule__AssociationField__Group_1__0 )?
            {
             before(grammarAccess.getAssociationFieldAccess().getGroup_1()); 
            // InternalKukulkan.g:1418:2: ( rule__AssociationField__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LPAREN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKukulkan.g:1418:3: rule__AssociationField__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationFieldAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__1__Impl"


    // $ANTLR start "rule__AssociationField__Group__2"
    // InternalKukulkan.g:1426:1: rule__AssociationField__Group__2 : rule__AssociationField__Group__2__Impl rule__AssociationField__Group__3 ;
    public final void rule__AssociationField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1430:1: ( rule__AssociationField__Group__2__Impl rule__AssociationField__Group__3 )
            // InternalKukulkan.g:1431:2: rule__AssociationField__Group__2__Impl rule__AssociationField__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AssociationField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__2"


    // $ANTLR start "rule__AssociationField__Group__2__Impl"
    // InternalKukulkan.g:1438:1: rule__AssociationField__Group__2__Impl : ( ( rule__AssociationField__IdAssignment_2 ) ) ;
    public final void rule__AssociationField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1442:1: ( ( ( rule__AssociationField__IdAssignment_2 ) ) )
            // InternalKukulkan.g:1443:1: ( ( rule__AssociationField__IdAssignment_2 ) )
            {
            // InternalKukulkan.g:1443:1: ( ( rule__AssociationField__IdAssignment_2 ) )
            // InternalKukulkan.g:1444:2: ( rule__AssociationField__IdAssignment_2 )
            {
             before(grammarAccess.getAssociationFieldAccess().getIdAssignment_2()); 
            // InternalKukulkan.g:1445:2: ( rule__AssociationField__IdAssignment_2 )
            // InternalKukulkan.g:1445:3: rule__AssociationField__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationFieldAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__2__Impl"


    // $ANTLR start "rule__AssociationField__Group__3"
    // InternalKukulkan.g:1453:1: rule__AssociationField__Group__3 : rule__AssociationField__Group__3__Impl rule__AssociationField__Group__4 ;
    public final void rule__AssociationField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1457:1: ( rule__AssociationField__Group__3__Impl rule__AssociationField__Group__4 )
            // InternalKukulkan.g:1458:2: rule__AssociationField__Group__3__Impl rule__AssociationField__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AssociationField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__3"


    // $ANTLR start "rule__AssociationField__Group__3__Impl"
    // InternalKukulkan.g:1465:1: rule__AssociationField__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AssociationField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1469:1: ( ( RULE_SEMICOLON ) )
            // InternalKukulkan.g:1470:1: ( RULE_SEMICOLON )
            {
            // InternalKukulkan.g:1470:1: ( RULE_SEMICOLON )
            // InternalKukulkan.g:1471:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAssociationFieldAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__3__Impl"


    // $ANTLR start "rule__AssociationField__Group__4"
    // InternalKukulkan.g:1480:1: rule__AssociationField__Group__4 : rule__AssociationField__Group__4__Impl ;
    public final void rule__AssociationField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1484:1: ( rule__AssociationField__Group__4__Impl )
            // InternalKukulkan.g:1485:2: rule__AssociationField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__4"


    // $ANTLR start "rule__AssociationField__Group__4__Impl"
    // InternalKukulkan.g:1491:1: rule__AssociationField__Group__4__Impl : ( ( rule__AssociationField__TargetEntityAssignment_4 ) ) ;
    public final void rule__AssociationField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1495:1: ( ( ( rule__AssociationField__TargetEntityAssignment_4 ) ) )
            // InternalKukulkan.g:1496:1: ( ( rule__AssociationField__TargetEntityAssignment_4 ) )
            {
            // InternalKukulkan.g:1496:1: ( ( rule__AssociationField__TargetEntityAssignment_4 ) )
            // InternalKukulkan.g:1497:2: ( rule__AssociationField__TargetEntityAssignment_4 )
            {
             before(grammarAccess.getAssociationFieldAccess().getTargetEntityAssignment_4()); 
            // InternalKukulkan.g:1498:2: ( rule__AssociationField__TargetEntityAssignment_4 )
            // InternalKukulkan.g:1498:3: rule__AssociationField__TargetEntityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__TargetEntityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationFieldAccess().getTargetEntityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group__4__Impl"


    // $ANTLR start "rule__AssociationField__Group_1__0"
    // InternalKukulkan.g:1507:1: rule__AssociationField__Group_1__0 : rule__AssociationField__Group_1__0__Impl rule__AssociationField__Group_1__1 ;
    public final void rule__AssociationField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1511:1: ( rule__AssociationField__Group_1__0__Impl rule__AssociationField__Group_1__1 )
            // InternalKukulkan.g:1512:2: rule__AssociationField__Group_1__0__Impl rule__AssociationField__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AssociationField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__0"


    // $ANTLR start "rule__AssociationField__Group_1__0__Impl"
    // InternalKukulkan.g:1519:1: rule__AssociationField__Group_1__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__AssociationField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1523:1: ( ( RULE_LPAREN ) )
            // InternalKukulkan.g:1524:1: ( RULE_LPAREN )
            {
            // InternalKukulkan.g:1524:1: ( RULE_LPAREN )
            // InternalKukulkan.g:1525:2: RULE_LPAREN
            {
             before(grammarAccess.getAssociationFieldAccess().getLPARENTerminalRuleCall_1_0()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getLPARENTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__0__Impl"


    // $ANTLR start "rule__AssociationField__Group_1__1"
    // InternalKukulkan.g:1534:1: rule__AssociationField__Group_1__1 : rule__AssociationField__Group_1__1__Impl rule__AssociationField__Group_1__2 ;
    public final void rule__AssociationField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1538:1: ( rule__AssociationField__Group_1__1__Impl rule__AssociationField__Group_1__2 )
            // InternalKukulkan.g:1539:2: rule__AssociationField__Group_1__1__Impl rule__AssociationField__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__AssociationField__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationField__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__1"


    // $ANTLR start "rule__AssociationField__Group_1__1__Impl"
    // InternalKukulkan.g:1546:1: rule__AssociationField__Group_1__1__Impl : ( ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 ) ) ;
    public final void rule__AssociationField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1550:1: ( ( ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 ) ) )
            // InternalKukulkan.g:1551:1: ( ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 ) )
            {
            // InternalKukulkan.g:1551:1: ( ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 ) )
            // InternalKukulkan.g:1552:2: ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 )
            {
             before(grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameAssignment_1_1()); 
            // InternalKukulkan.g:1553:2: ( rule__AssociationField__ToSourcePropertyNameAssignment_1_1 )
            // InternalKukulkan.g:1553:3: rule__AssociationField__ToSourcePropertyNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__ToSourcePropertyNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__1__Impl"


    // $ANTLR start "rule__AssociationField__Group_1__2"
    // InternalKukulkan.g:1561:1: rule__AssociationField__Group_1__2 : rule__AssociationField__Group_1__2__Impl ;
    public final void rule__AssociationField__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1565:1: ( rule__AssociationField__Group_1__2__Impl )
            // InternalKukulkan.g:1566:2: rule__AssociationField__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationField__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__2"


    // $ANTLR start "rule__AssociationField__Group_1__2__Impl"
    // InternalKukulkan.g:1572:1: rule__AssociationField__Group_1__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__AssociationField__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1576:1: ( ( RULE_RPAREN ) )
            // InternalKukulkan.g:1577:1: ( RULE_RPAREN )
            {
            // InternalKukulkan.g:1577:1: ( RULE_RPAREN )
            // InternalKukulkan.g:1578:2: RULE_RPAREN
            {
             before(grammarAccess.getAssociationFieldAccess().getRPARENTerminalRuleCall_1_2()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getRPARENTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__Group_1__2__Impl"


    // $ANTLR start "rule__StringFieldType__Group__0"
    // InternalKukulkan.g:1588:1: rule__StringFieldType__Group__0 : rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1 ;
    public final void rule__StringFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1592:1: ( rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1 )
            // InternalKukulkan.g:1593:2: rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__StringFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringFieldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__Group__0"


    // $ANTLR start "rule__StringFieldType__Group__0__Impl"
    // InternalKukulkan.g:1600:1: rule__StringFieldType__Group__0__Impl : ( ( rule__StringFieldType__NameAssignment_0 ) ) ;
    public final void rule__StringFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1604:1: ( ( ( rule__StringFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1605:1: ( ( rule__StringFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1605:1: ( ( rule__StringFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1606:2: ( rule__StringFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getStringFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1607:2: ( rule__StringFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1607:3: rule__StringFieldType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringFieldType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringFieldTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__Group__0__Impl"


    // $ANTLR start "rule__StringFieldType__Group__1"
    // InternalKukulkan.g:1615:1: rule__StringFieldType__Group__1 : rule__StringFieldType__Group__1__Impl ;
    public final void rule__StringFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1619:1: ( rule__StringFieldType__Group__1__Impl )
            // InternalKukulkan.g:1620:2: rule__StringFieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringFieldType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__Group__1"


    // $ANTLR start "rule__StringFieldType__Group__1__Impl"
    // InternalKukulkan.g:1626:1: rule__StringFieldType__Group__1__Impl : ( ( rule__StringFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__StringFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1630:1: ( ( ( rule__StringFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:1631:1: ( ( rule__StringFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:1631:1: ( ( rule__StringFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:1632:2: ( rule__StringFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getStringFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:1633:2: ( rule__StringFieldType__ConstraintsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_REQUIRED||LA16_0==RULE_PATTERN||LA16_0==RULE_MIN||LA16_0==RULE_MAX) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKukulkan.g:1633:3: rule__StringFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StringFieldType__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStringFieldTypeAccess().getConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__Group__1__Impl"


    // $ANTLR start "rule__NumericFieldType__Group__0"
    // InternalKukulkan.g:1642:1: rule__NumericFieldType__Group__0 : rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1 ;
    public final void rule__NumericFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1646:1: ( rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1 )
            // InternalKukulkan.g:1647:2: rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__NumericFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericFieldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__Group__0"


    // $ANTLR start "rule__NumericFieldType__Group__0__Impl"
    // InternalKukulkan.g:1654:1: rule__NumericFieldType__Group__0__Impl : ( ( rule__NumericFieldType__NameAssignment_0 ) ) ;
    public final void rule__NumericFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1658:1: ( ( ( rule__NumericFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1659:1: ( ( rule__NumericFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1659:1: ( ( rule__NumericFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1660:2: ( rule__NumericFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getNumericFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1661:2: ( rule__NumericFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1661:3: rule__NumericFieldType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumericFieldType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumericFieldTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__Group__0__Impl"


    // $ANTLR start "rule__NumericFieldType__Group__1"
    // InternalKukulkan.g:1669:1: rule__NumericFieldType__Group__1 : rule__NumericFieldType__Group__1__Impl ;
    public final void rule__NumericFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1673:1: ( rule__NumericFieldType__Group__1__Impl )
            // InternalKukulkan.g:1674:2: rule__NumericFieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericFieldType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__Group__1"


    // $ANTLR start "rule__NumericFieldType__Group__1__Impl"
    // InternalKukulkan.g:1680:1: rule__NumericFieldType__Group__1__Impl : ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__NumericFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1684:1: ( ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:1685:1: ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:1685:1: ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:1686:2: ( rule__NumericFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getNumericFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:1687:2: ( rule__NumericFieldType__ConstraintsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_REQUIRED||LA17_0==RULE_MIN||LA17_0==RULE_MAX) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKukulkan.g:1687:3: rule__NumericFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__NumericFieldType__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNumericFieldTypeAccess().getConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__Group__1__Impl"


    // $ANTLR start "rule__BooleanFieldType__Group__0"
    // InternalKukulkan.g:1696:1: rule__BooleanFieldType__Group__0 : rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1 ;
    public final void rule__BooleanFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1700:1: ( rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1 )
            // InternalKukulkan.g:1701:2: rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BooleanFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanFieldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__Group__0"


    // $ANTLR start "rule__BooleanFieldType__Group__0__Impl"
    // InternalKukulkan.g:1708:1: rule__BooleanFieldType__Group__0__Impl : ( ( rule__BooleanFieldType__NameAssignment_0 ) ) ;
    public final void rule__BooleanFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1712:1: ( ( ( rule__BooleanFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1713:1: ( ( rule__BooleanFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1713:1: ( ( rule__BooleanFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1714:2: ( rule__BooleanFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1715:2: ( rule__BooleanFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1715:3: rule__BooleanFieldType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFieldType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanFieldTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__Group__0__Impl"


    // $ANTLR start "rule__BooleanFieldType__Group__1"
    // InternalKukulkan.g:1723:1: rule__BooleanFieldType__Group__1 : rule__BooleanFieldType__Group__1__Impl ;
    public final void rule__BooleanFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1727:1: ( rule__BooleanFieldType__Group__1__Impl )
            // InternalKukulkan.g:1728:2: rule__BooleanFieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanFieldType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__Group__1"


    // $ANTLR start "rule__BooleanFieldType__Group__1__Impl"
    // InternalKukulkan.g:1734:1: rule__BooleanFieldType__Group__1__Impl : ( ( rule__BooleanFieldType__RequiredAssignment_1 )? ) ;
    public final void rule__BooleanFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1738:1: ( ( ( rule__BooleanFieldType__RequiredAssignment_1 )? ) )
            // InternalKukulkan.g:1739:1: ( ( rule__BooleanFieldType__RequiredAssignment_1 )? )
            {
            // InternalKukulkan.g:1739:1: ( ( rule__BooleanFieldType__RequiredAssignment_1 )? )
            // InternalKukulkan.g:1740:2: ( rule__BooleanFieldType__RequiredAssignment_1 )?
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getRequiredAssignment_1()); 
            // InternalKukulkan.g:1741:2: ( rule__BooleanFieldType__RequiredAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_REQUIRED) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKukulkan.g:1741:3: rule__BooleanFieldType__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanFieldType__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanFieldTypeAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__Group__1__Impl"


    // $ANTLR start "rule__DateFieldType__Group__0"
    // InternalKukulkan.g:1750:1: rule__DateFieldType__Group__0 : rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1 ;
    public final void rule__DateFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1754:1: ( rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1 )
            // InternalKukulkan.g:1755:2: rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__DateFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateFieldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__Group__0"


    // $ANTLR start "rule__DateFieldType__Group__0__Impl"
    // InternalKukulkan.g:1762:1: rule__DateFieldType__Group__0__Impl : ( ( rule__DateFieldType__TypeAssignment_0 ) ) ;
    public final void rule__DateFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1766:1: ( ( ( rule__DateFieldType__TypeAssignment_0 ) ) )
            // InternalKukulkan.g:1767:1: ( ( rule__DateFieldType__TypeAssignment_0 ) )
            {
            // InternalKukulkan.g:1767:1: ( ( rule__DateFieldType__TypeAssignment_0 ) )
            // InternalKukulkan.g:1768:2: ( rule__DateFieldType__TypeAssignment_0 )
            {
             before(grammarAccess.getDateFieldTypeAccess().getTypeAssignment_0()); 
            // InternalKukulkan.g:1769:2: ( rule__DateFieldType__TypeAssignment_0 )
            // InternalKukulkan.g:1769:3: rule__DateFieldType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DateFieldType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateFieldTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__Group__0__Impl"


    // $ANTLR start "rule__DateFieldType__Group__1"
    // InternalKukulkan.g:1777:1: rule__DateFieldType__Group__1 : rule__DateFieldType__Group__1__Impl ;
    public final void rule__DateFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1781:1: ( rule__DateFieldType__Group__1__Impl )
            // InternalKukulkan.g:1782:2: rule__DateFieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateFieldType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__Group__1"


    // $ANTLR start "rule__DateFieldType__Group__1__Impl"
    // InternalKukulkan.g:1788:1: rule__DateFieldType__Group__1__Impl : ( ( rule__DateFieldType__RequiredAssignment_1 )? ) ;
    public final void rule__DateFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1792:1: ( ( ( rule__DateFieldType__RequiredAssignment_1 )? ) )
            // InternalKukulkan.g:1793:1: ( ( rule__DateFieldType__RequiredAssignment_1 )? )
            {
            // InternalKukulkan.g:1793:1: ( ( rule__DateFieldType__RequiredAssignment_1 )? )
            // InternalKukulkan.g:1794:2: ( rule__DateFieldType__RequiredAssignment_1 )?
            {
             before(grammarAccess.getDateFieldTypeAccess().getRequiredAssignment_1()); 
            // InternalKukulkan.g:1795:2: ( rule__DateFieldType__RequiredAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_REQUIRED) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKukulkan.g:1795:3: rule__DateFieldType__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DateFieldType__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateFieldTypeAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__Group__1__Impl"


    // $ANTLR start "rule__BlobFieldType__Group__0"
    // InternalKukulkan.g:1804:1: rule__BlobFieldType__Group__0 : rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1 ;
    public final void rule__BlobFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1808:1: ( rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1 )
            // InternalKukulkan.g:1809:2: rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BlobFieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlobFieldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__Group__0"


    // $ANTLR start "rule__BlobFieldType__Group__0__Impl"
    // InternalKukulkan.g:1816:1: rule__BlobFieldType__Group__0__Impl : ( ( rule__BlobFieldType__NameAssignment_0 ) ) ;
    public final void rule__BlobFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1820:1: ( ( ( rule__BlobFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1821:1: ( ( rule__BlobFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1821:1: ( ( rule__BlobFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1822:2: ( rule__BlobFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getBlobFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1823:2: ( rule__BlobFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1823:3: rule__BlobFieldType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BlobFieldType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBlobFieldTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__Group__0__Impl"


    // $ANTLR start "rule__BlobFieldType__Group__1"
    // InternalKukulkan.g:1831:1: rule__BlobFieldType__Group__1 : rule__BlobFieldType__Group__1__Impl ;
    public final void rule__BlobFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1835:1: ( rule__BlobFieldType__Group__1__Impl )
            // InternalKukulkan.g:1836:2: rule__BlobFieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlobFieldType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__Group__1"


    // $ANTLR start "rule__BlobFieldType__Group__1__Impl"
    // InternalKukulkan.g:1842:1: rule__BlobFieldType__Group__1__Impl : ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__BlobFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1846:1: ( ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:1847:1: ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:1847:1: ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:1848:2: ( rule__BlobFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getBlobFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:1849:2: ( rule__BlobFieldType__ConstraintsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_REQUIRED||LA20_0==RULE_MIN||LA20_0==RULE_MAX) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKukulkan.g:1849:3: rule__BlobFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__BlobFieldType__ConstraintsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBlobFieldTypeAccess().getConstraintsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__Group__1__Impl"


    // $ANTLR start "rule__PatternValidator__Group__0"
    // InternalKukulkan.g:1858:1: rule__PatternValidator__Group__0 : rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1 ;
    public final void rule__PatternValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1862:1: ( rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1 )
            // InternalKukulkan.g:1863:2: rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PatternValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternValidator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__0"


    // $ANTLR start "rule__PatternValidator__Group__0__Impl"
    // InternalKukulkan.g:1870:1: rule__PatternValidator__Group__0__Impl : ( RULE_PATTERN ) ;
    public final void rule__PatternValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1874:1: ( ( RULE_PATTERN ) )
            // InternalKukulkan.g:1875:1: ( RULE_PATTERN )
            {
            // InternalKukulkan.g:1875:1: ( RULE_PATTERN )
            // InternalKukulkan.g:1876:2: RULE_PATTERN
            {
             before(grammarAccess.getPatternValidatorAccess().getPATTERNTerminalRuleCall_0()); 
            match(input,RULE_PATTERN,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getPATTERNTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__0__Impl"


    // $ANTLR start "rule__PatternValidator__Group__1"
    // InternalKukulkan.g:1885:1: rule__PatternValidator__Group__1 : rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2 ;
    public final void rule__PatternValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1889:1: ( rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2 )
            // InternalKukulkan.g:1890:2: rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__PatternValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternValidator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__1"


    // $ANTLR start "rule__PatternValidator__Group__1__Impl"
    // InternalKukulkan.g:1897:1: rule__PatternValidator__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__PatternValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1901:1: ( ( RULE_LPAREN ) )
            // InternalKukulkan.g:1902:1: ( RULE_LPAREN )
            {
            // InternalKukulkan.g:1902:1: ( RULE_LPAREN )
            // InternalKukulkan.g:1903:2: RULE_LPAREN
            {
             before(grammarAccess.getPatternValidatorAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__1__Impl"


    // $ANTLR start "rule__PatternValidator__Group__2"
    // InternalKukulkan.g:1912:1: rule__PatternValidator__Group__2 : rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3 ;
    public final void rule__PatternValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1916:1: ( rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3 )
            // InternalKukulkan.g:1917:2: rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PatternValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternValidator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__2"


    // $ANTLR start "rule__PatternValidator__Group__2__Impl"
    // InternalKukulkan.g:1924:1: rule__PatternValidator__Group__2__Impl : ( RULE_PATTERN_VALUE ) ;
    public final void rule__PatternValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1928:1: ( ( RULE_PATTERN_VALUE ) )
            // InternalKukulkan.g:1929:1: ( RULE_PATTERN_VALUE )
            {
            // InternalKukulkan.g:1929:1: ( RULE_PATTERN_VALUE )
            // InternalKukulkan.g:1930:2: RULE_PATTERN_VALUE
            {
             before(grammarAccess.getPatternValidatorAccess().getPATTERN_VALUETerminalRuleCall_2()); 
            match(input,RULE_PATTERN_VALUE,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getPATTERN_VALUETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__2__Impl"


    // $ANTLR start "rule__PatternValidator__Group__3"
    // InternalKukulkan.g:1939:1: rule__PatternValidator__Group__3 : rule__PatternValidator__Group__3__Impl ;
    public final void rule__PatternValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1943:1: ( rule__PatternValidator__Group__3__Impl )
            // InternalKukulkan.g:1944:2: rule__PatternValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternValidator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__3"


    // $ANTLR start "rule__PatternValidator__Group__3__Impl"
    // InternalKukulkan.g:1950:1: rule__PatternValidator__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__PatternValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1954:1: ( ( RULE_RPAREN ) )
            // InternalKukulkan.g:1955:1: ( RULE_RPAREN )
            {
            // InternalKukulkan.g:1955:1: ( RULE_RPAREN )
            // InternalKukulkan.g:1956:2: RULE_RPAREN
            {
             before(grammarAccess.getPatternValidatorAccess().getRPARENTerminalRuleCall_3()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getRPARENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternValidator__Group__3__Impl"


    // $ANTLR start "rule__MinValidator__Group__0"
    // InternalKukulkan.g:1966:1: rule__MinValidator__Group__0 : rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1 ;
    public final void rule__MinValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1970:1: ( rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1 )
            // InternalKukulkan.g:1971:2: rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MinValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinValidator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__0"


    // $ANTLR start "rule__MinValidator__Group__0__Impl"
    // InternalKukulkan.g:1978:1: rule__MinValidator__Group__0__Impl : ( RULE_MIN ) ;
    public final void rule__MinValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1982:1: ( ( RULE_MIN ) )
            // InternalKukulkan.g:1983:1: ( RULE_MIN )
            {
            // InternalKukulkan.g:1983:1: ( RULE_MIN )
            // InternalKukulkan.g:1984:2: RULE_MIN
            {
             before(grammarAccess.getMinValidatorAccess().getMINTerminalRuleCall_0()); 
            match(input,RULE_MIN,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getMINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__0__Impl"


    // $ANTLR start "rule__MinValidator__Group__1"
    // InternalKukulkan.g:1993:1: rule__MinValidator__Group__1 : rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2 ;
    public final void rule__MinValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1997:1: ( rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2 )
            // InternalKukulkan.g:1998:2: rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MinValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinValidator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__1"


    // $ANTLR start "rule__MinValidator__Group__1__Impl"
    // InternalKukulkan.g:2005:1: rule__MinValidator__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__MinValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2009:1: ( ( RULE_LPAREN ) )
            // InternalKukulkan.g:2010:1: ( RULE_LPAREN )
            {
            // InternalKukulkan.g:2010:1: ( RULE_LPAREN )
            // InternalKukulkan.g:2011:2: RULE_LPAREN
            {
             before(grammarAccess.getMinValidatorAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__1__Impl"


    // $ANTLR start "rule__MinValidator__Group__2"
    // InternalKukulkan.g:2020:1: rule__MinValidator__Group__2 : rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3 ;
    public final void rule__MinValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2024:1: ( rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3 )
            // InternalKukulkan.g:2025:2: rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MinValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinValidator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__2"


    // $ANTLR start "rule__MinValidator__Group__2__Impl"
    // InternalKukulkan.g:2032:1: rule__MinValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MinValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2036:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2037:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2037:1: ( RULE_INT )
            // InternalKukulkan.g:2038:2: RULE_INT
            {
             before(grammarAccess.getMinValidatorAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__2__Impl"


    // $ANTLR start "rule__MinValidator__Group__3"
    // InternalKukulkan.g:2047:1: rule__MinValidator__Group__3 : rule__MinValidator__Group__3__Impl ;
    public final void rule__MinValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2051:1: ( rule__MinValidator__Group__3__Impl )
            // InternalKukulkan.g:2052:2: rule__MinValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinValidator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__3"


    // $ANTLR start "rule__MinValidator__Group__3__Impl"
    // InternalKukulkan.g:2058:1: rule__MinValidator__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__MinValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2062:1: ( ( RULE_RPAREN ) )
            // InternalKukulkan.g:2063:1: ( RULE_RPAREN )
            {
            // InternalKukulkan.g:2063:1: ( RULE_RPAREN )
            // InternalKukulkan.g:2064:2: RULE_RPAREN
            {
             before(grammarAccess.getMinValidatorAccess().getRPARENTerminalRuleCall_3()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getRPARENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinValidator__Group__3__Impl"


    // $ANTLR start "rule__MaxValidator__Group__0"
    // InternalKukulkan.g:2074:1: rule__MaxValidator__Group__0 : rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1 ;
    public final void rule__MaxValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2078:1: ( rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1 )
            // InternalKukulkan.g:2079:2: rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MaxValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxValidator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__0"


    // $ANTLR start "rule__MaxValidator__Group__0__Impl"
    // InternalKukulkan.g:2086:1: rule__MaxValidator__Group__0__Impl : ( RULE_MAX ) ;
    public final void rule__MaxValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2090:1: ( ( RULE_MAX ) )
            // InternalKukulkan.g:2091:1: ( RULE_MAX )
            {
            // InternalKukulkan.g:2091:1: ( RULE_MAX )
            // InternalKukulkan.g:2092:2: RULE_MAX
            {
             before(grammarAccess.getMaxValidatorAccess().getMAXTerminalRuleCall_0()); 
            match(input,RULE_MAX,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getMAXTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__0__Impl"


    // $ANTLR start "rule__MaxValidator__Group__1"
    // InternalKukulkan.g:2101:1: rule__MaxValidator__Group__1 : rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2 ;
    public final void rule__MaxValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2105:1: ( rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2 )
            // InternalKukulkan.g:2106:2: rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MaxValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxValidator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__1"


    // $ANTLR start "rule__MaxValidator__Group__1__Impl"
    // InternalKukulkan.g:2113:1: rule__MaxValidator__Group__1__Impl : ( RULE_LPAREN ) ;
    public final void rule__MaxValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2117:1: ( ( RULE_LPAREN ) )
            // InternalKukulkan.g:2118:1: ( RULE_LPAREN )
            {
            // InternalKukulkan.g:2118:1: ( RULE_LPAREN )
            // InternalKukulkan.g:2119:2: RULE_LPAREN
            {
             before(grammarAccess.getMaxValidatorAccess().getLPARENTerminalRuleCall_1()); 
            match(input,RULE_LPAREN,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getLPARENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__1__Impl"


    // $ANTLR start "rule__MaxValidator__Group__2"
    // InternalKukulkan.g:2128:1: rule__MaxValidator__Group__2 : rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3 ;
    public final void rule__MaxValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2132:1: ( rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3 )
            // InternalKukulkan.g:2133:2: rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MaxValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxValidator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__2"


    // $ANTLR start "rule__MaxValidator__Group__2__Impl"
    // InternalKukulkan.g:2140:1: rule__MaxValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MaxValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2144:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2145:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2145:1: ( RULE_INT )
            // InternalKukulkan.g:2146:2: RULE_INT
            {
             before(grammarAccess.getMaxValidatorAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__2__Impl"


    // $ANTLR start "rule__MaxValidator__Group__3"
    // InternalKukulkan.g:2155:1: rule__MaxValidator__Group__3 : rule__MaxValidator__Group__3__Impl ;
    public final void rule__MaxValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2159:1: ( rule__MaxValidator__Group__3__Impl )
            // InternalKukulkan.g:2160:2: rule__MaxValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxValidator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__3"


    // $ANTLR start "rule__MaxValidator__Group__3__Impl"
    // InternalKukulkan.g:2166:1: rule__MaxValidator__Group__3__Impl : ( RULE_RPAREN ) ;
    public final void rule__MaxValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2170:1: ( ( RULE_RPAREN ) )
            // InternalKukulkan.g:2171:1: ( RULE_RPAREN )
            {
            // InternalKukulkan.g:2171:1: ( RULE_RPAREN )
            // InternalKukulkan.g:2172:2: RULE_RPAREN
            {
             before(grammarAccess.getMaxValidatorAccess().getRPARENTerminalRuleCall_3()); 
            match(input,RULE_RPAREN,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getRPARENTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValidator__Group__3__Impl"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment"
    // InternalKukulkan.g:2182:1: rule__DomainModel__EntitiesAssignment : ( ruleentity ) ;
    public final void rule__DomainModel__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2186:1: ( ( ruleentity ) )
            // InternalKukulkan.g:2187:2: ( ruleentity )
            {
            // InternalKukulkan.g:2187:2: ( ruleentity )
            // InternalKukulkan.g:2188:3: ruleentity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalKukulkan.g:2197:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2201:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:2202:2: ( RULE_ID )
            {
            // InternalKukulkan.g:2202:2: ( RULE_ID )
            // InternalKukulkan.g:2203:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__TableNameAssignment_2_1"
    // InternalKukulkan.g:2212:1: rule__Entity__TableNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Entity__TableNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2216:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:2217:2: ( RULE_ID )
            {
            // InternalKukulkan.g:2217:2: ( RULE_ID )
            // InternalKukulkan.g:2218:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getTableNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getTableNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__TableNameAssignment_2_1"


    // $ANTLR start "rule__Entity__FieldsAssignment_3_1_0"
    // InternalKukulkan.g:2227:1: rule__Entity__FieldsAssignment_3_1_0 : ( ruleentityField ) ;
    public final void rule__Entity__FieldsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2231:1: ( ( ruleentityField ) )
            // InternalKukulkan.g:2232:2: ( ruleentityField )
            {
            // InternalKukulkan.g:2232:2: ( ruleentityField )
            // InternalKukulkan.g:2233:3: ruleentityField
            {
             before(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleentityField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_3_1_0"


    // $ANTLR start "rule__Entity__FieldsAssignment_3_1_1_1"
    // InternalKukulkan.g:2242:1: rule__Entity__FieldsAssignment_3_1_1_1 : ( ruleentityField ) ;
    public final void rule__Entity__FieldsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2246:1: ( ( ruleentityField ) )
            // InternalKukulkan.g:2247:2: ( ruleentityField )
            {
            // InternalKukulkan.g:2247:2: ( ruleentityField )
            // InternalKukulkan.g:2248:3: ruleentityField
            {
             before(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleentityField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_3_1_1_1"


    // $ANTLR start "rule__PrimitiveField__IdAssignment_0"
    // InternalKukulkan.g:2257:1: rule__PrimitiveField__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__PrimitiveField__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2261:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:2262:2: ( RULE_ID )
            {
            // InternalKukulkan.g:2262:2: ( RULE_ID )
            // InternalKukulkan.g:2263:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveFieldAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveFieldAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__IdAssignment_0"


    // $ANTLR start "rule__PrimitiveField__TypeAssignment_2"
    // InternalKukulkan.g:2272:1: rule__PrimitiveField__TypeAssignment_2 : ( rulefieldType ) ;
    public final void rule__PrimitiveField__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2276:1: ( ( rulefieldType ) )
            // InternalKukulkan.g:2277:2: ( rulefieldType )
            {
            // InternalKukulkan.g:2277:2: ( rulefieldType )
            // InternalKukulkan.g:2278:3: rulefieldType
            {
             before(grammarAccess.getPrimitiveFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulefieldType();

            state._fsp--;

             after(grammarAccess.getPrimitiveFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveField__TypeAssignment_2"


    // $ANTLR start "rule__AssociationField__TypeAssignment_0"
    // InternalKukulkan.g:2287:1: rule__AssociationField__TypeAssignment_0 : ( rulecardinality ) ;
    public final void rule__AssociationField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2291:1: ( ( rulecardinality ) )
            // InternalKukulkan.g:2292:2: ( rulecardinality )
            {
            // InternalKukulkan.g:2292:2: ( rulecardinality )
            // InternalKukulkan.g:2293:3: rulecardinality
            {
             before(grammarAccess.getAssociationFieldAccess().getTypeCardinalityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulecardinality();

            state._fsp--;

             after(grammarAccess.getAssociationFieldAccess().getTypeCardinalityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__TypeAssignment_0"


    // $ANTLR start "rule__AssociationField__ToSourcePropertyNameAssignment_1_1"
    // InternalKukulkan.g:2302:1: rule__AssociationField__ToSourcePropertyNameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__AssociationField__ToSourcePropertyNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2306:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:2307:2: ( RULE_ID )
            {
            // InternalKukulkan.g:2307:2: ( RULE_ID )
            // InternalKukulkan.g:2308:3: RULE_ID
            {
             before(grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__ToSourcePropertyNameAssignment_1_1"


    // $ANTLR start "rule__AssociationField__IdAssignment_2"
    // InternalKukulkan.g:2317:1: rule__AssociationField__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__AssociationField__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2321:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:2322:2: ( RULE_ID )
            {
            // InternalKukulkan.g:2322:2: ( RULE_ID )
            // InternalKukulkan.g:2323:3: RULE_ID
            {
             before(grammarAccess.getAssociationFieldAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__IdAssignment_2"


    // $ANTLR start "rule__AssociationField__TargetEntityAssignment_4"
    // InternalKukulkan.g:2332:1: rule__AssociationField__TargetEntityAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AssociationField__TargetEntityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2336:1: ( ( ( RULE_ID ) ) )
            // InternalKukulkan.g:2337:2: ( ( RULE_ID ) )
            {
            // InternalKukulkan.g:2337:2: ( ( RULE_ID ) )
            // InternalKukulkan.g:2338:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationFieldAccess().getTargetEntityEntityCrossReference_4_0()); 
            // InternalKukulkan.g:2339:3: ( RULE_ID )
            // InternalKukulkan.g:2340:4: RULE_ID
            {
             before(grammarAccess.getAssociationFieldAccess().getTargetEntityEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationFieldAccess().getTargetEntityEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssociationFieldAccess().getTargetEntityEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationField__TargetEntityAssignment_4"


    // $ANTLR start "rule__StringFieldType__NameAssignment_0"
    // InternalKukulkan.g:2351:1: rule__StringFieldType__NameAssignment_0 : ( rulestringType ) ;
    public final void rule__StringFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2355:1: ( ( rulestringType ) )
            // InternalKukulkan.g:2356:2: ( rulestringType )
            {
            // InternalKukulkan.g:2356:2: ( rulestringType )
            // InternalKukulkan.g:2357:3: rulestringType
            {
             before(grammarAccess.getStringFieldTypeAccess().getNameStringTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulestringType();

            state._fsp--;

             after(grammarAccess.getStringFieldTypeAccess().getNameStringTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__NameAssignment_0"


    // $ANTLR start "rule__StringFieldType__ConstraintsAssignment_1"
    // InternalKukulkan.g:2366:1: rule__StringFieldType__ConstraintsAssignment_1 : ( rulestringValidators ) ;
    public final void rule__StringFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2370:1: ( ( rulestringValidators ) )
            // InternalKukulkan.g:2371:2: ( rulestringValidators )
            {
            // InternalKukulkan.g:2371:2: ( rulestringValidators )
            // InternalKukulkan.g:2372:3: rulestringValidators
            {
             before(grammarAccess.getStringFieldTypeAccess().getConstraintsStringValidatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestringValidators();

            state._fsp--;

             after(grammarAccess.getStringFieldTypeAccess().getConstraintsStringValidatorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringFieldType__ConstraintsAssignment_1"


    // $ANTLR start "rule__NumericFieldType__NameAssignment_0"
    // InternalKukulkan.g:2381:1: rule__NumericFieldType__NameAssignment_0 : ( rulenumericTypes ) ;
    public final void rule__NumericFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2385:1: ( ( rulenumericTypes ) )
            // InternalKukulkan.g:2386:2: ( rulenumericTypes )
            {
            // InternalKukulkan.g:2386:2: ( rulenumericTypes )
            // InternalKukulkan.g:2387:3: rulenumericTypes
            {
             before(grammarAccess.getNumericFieldTypeAccess().getNameNumericTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulenumericTypes();

            state._fsp--;

             after(grammarAccess.getNumericFieldTypeAccess().getNameNumericTypesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__NameAssignment_0"


    // $ANTLR start "rule__NumericFieldType__ConstraintsAssignment_1"
    // InternalKukulkan.g:2396:1: rule__NumericFieldType__ConstraintsAssignment_1 : ( rulenumericValidators ) ;
    public final void rule__NumericFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2400:1: ( ( rulenumericValidators ) )
            // InternalKukulkan.g:2401:2: ( rulenumericValidators )
            {
            // InternalKukulkan.g:2401:2: ( rulenumericValidators )
            // InternalKukulkan.g:2402:3: rulenumericValidators
            {
             before(grammarAccess.getNumericFieldTypeAccess().getConstraintsNumericValidatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulenumericValidators();

            state._fsp--;

             after(grammarAccess.getNumericFieldTypeAccess().getConstraintsNumericValidatorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericFieldType__ConstraintsAssignment_1"


    // $ANTLR start "rule__BooleanFieldType__NameAssignment_0"
    // InternalKukulkan.g:2411:1: rule__BooleanFieldType__NameAssignment_0 : ( RULE_BOOLEAN_TYPE ) ;
    public final void rule__BooleanFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2415:1: ( ( RULE_BOOLEAN_TYPE ) )
            // InternalKukulkan.g:2416:2: ( RULE_BOOLEAN_TYPE )
            {
            // InternalKukulkan.g:2416:2: ( RULE_BOOLEAN_TYPE )
            // InternalKukulkan.g:2417:3: RULE_BOOLEAN_TYPE
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPETerminalRuleCall_0_0()); 
            match(input,RULE_BOOLEAN_TYPE,FOLLOW_2); 
             after(grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__NameAssignment_0"


    // $ANTLR start "rule__BooleanFieldType__RequiredAssignment_1"
    // InternalKukulkan.g:2426:1: rule__BooleanFieldType__RequiredAssignment_1 : ( rulerequiredValidator ) ;
    public final void rule__BooleanFieldType__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2430:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:2431:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:2431:2: ( rulerequiredValidator )
            // InternalKukulkan.g:2432:3: rulerequiredValidator
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getBooleanFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanFieldType__RequiredAssignment_1"


    // $ANTLR start "rule__DateFieldType__TypeAssignment_0"
    // InternalKukulkan.g:2441:1: rule__DateFieldType__TypeAssignment_0 : ( ruledateTypes ) ;
    public final void rule__DateFieldType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2445:1: ( ( ruledateTypes ) )
            // InternalKukulkan.g:2446:2: ( ruledateTypes )
            {
            // InternalKukulkan.g:2446:2: ( ruledateTypes )
            // InternalKukulkan.g:2447:3: ruledateTypes
            {
             before(grammarAccess.getDateFieldTypeAccess().getTypeDateTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruledateTypes();

            state._fsp--;

             after(grammarAccess.getDateFieldTypeAccess().getTypeDateTypesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__TypeAssignment_0"


    // $ANTLR start "rule__DateFieldType__RequiredAssignment_1"
    // InternalKukulkan.g:2456:1: rule__DateFieldType__RequiredAssignment_1 : ( rulerequiredValidator ) ;
    public final void rule__DateFieldType__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2460:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:2461:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:2461:2: ( rulerequiredValidator )
            // InternalKukulkan.g:2462:3: rulerequiredValidator
            {
             before(grammarAccess.getDateFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getDateFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateFieldType__RequiredAssignment_1"


    // $ANTLR start "rule__BlobFieldType__NameAssignment_0"
    // InternalKukulkan.g:2471:1: rule__BlobFieldType__NameAssignment_0 : ( ruleblobTypes ) ;
    public final void rule__BlobFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2475:1: ( ( ruleblobTypes ) )
            // InternalKukulkan.g:2476:2: ( ruleblobTypes )
            {
            // InternalKukulkan.g:2476:2: ( ruleblobTypes )
            // InternalKukulkan.g:2477:3: ruleblobTypes
            {
             before(grammarAccess.getBlobFieldTypeAccess().getNameBlobTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleblobTypes();

            state._fsp--;

             after(grammarAccess.getBlobFieldTypeAccess().getNameBlobTypesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__NameAssignment_0"


    // $ANTLR start "rule__BlobFieldType__ConstraintsAssignment_1"
    // InternalKukulkan.g:2486:1: rule__BlobFieldType__ConstraintsAssignment_1 : ( ruleblobValidators ) ;
    public final void rule__BlobFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2490:1: ( ( ruleblobValidators ) )
            // InternalKukulkan.g:2491:2: ( ruleblobValidators )
            {
            // InternalKukulkan.g:2491:2: ( ruleblobValidators )
            // InternalKukulkan.g:2492:3: ruleblobValidators
            {
             before(grammarAccess.getBlobFieldTypeAccess().getConstraintsBlobValidatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleblobValidators();

            state._fsp--;

             after(grammarAccess.getBlobFieldTypeAccess().getConstraintsBlobValidatorsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobFieldType__ConstraintsAssignment_1"


    // $ANTLR start "rule__StringValidators__RequiredAssignment_0"
    // InternalKukulkan.g:2501:1: rule__StringValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__StringValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2505:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:2506:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:2506:2: ( rulerequiredValidator )
            // InternalKukulkan.g:2507:3: rulerequiredValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValidators__RequiredAssignment_0"


    // $ANTLR start "rule__StringValidators__MinLenghtAssignment_1"
    // InternalKukulkan.g:2516:1: rule__StringValidators__MinLenghtAssignment_1 : ( ruleminValidator ) ;
    public final void rule__StringValidators__MinLenghtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2520:1: ( ( ruleminValidator ) )
            // InternalKukulkan.g:2521:2: ( ruleminValidator )
            {
            // InternalKukulkan.g:2521:2: ( ruleminValidator )
            // InternalKukulkan.g:2522:3: ruleminValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getMinLenghtMinValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleminValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getMinLenghtMinValidatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValidators__MinLenghtAssignment_1"


    // $ANTLR start "rule__StringValidators__MaxLenghtAssignment_2"
    // InternalKukulkan.g:2531:1: rule__StringValidators__MaxLenghtAssignment_2 : ( rulemaxValidator ) ;
    public final void rule__StringValidators__MaxLenghtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2535:1: ( ( rulemaxValidator ) )
            // InternalKukulkan.g:2536:2: ( rulemaxValidator )
            {
            // InternalKukulkan.g:2536:2: ( rulemaxValidator )
            // InternalKukulkan.g:2537:3: rulemaxValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxValidatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemaxValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxValidatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValidators__MaxLenghtAssignment_2"


    // $ANTLR start "rule__StringValidators__PatternAssignment_3"
    // InternalKukulkan.g:2546:1: rule__StringValidators__PatternAssignment_3 : ( rulepatternValidator ) ;
    public final void rule__StringValidators__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2550:1: ( ( rulepatternValidator ) )
            // InternalKukulkan.g:2551:2: ( rulepatternValidator )
            {
            // InternalKukulkan.g:2551:2: ( rulepatternValidator )
            // InternalKukulkan.g:2552:3: rulepatternValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getPatternPatternValidatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulepatternValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getPatternPatternValidatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValidators__PatternAssignment_3"


    // $ANTLR start "rule__NumericValidators__RequiredAssignment_0"
    // InternalKukulkan.g:2561:1: rule__NumericValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__NumericValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2565:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:2566:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:2566:2: ( rulerequiredValidator )
            // InternalKukulkan.g:2567:3: rulerequiredValidator
            {
             before(grammarAccess.getNumericValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getNumericValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValidators__RequiredAssignment_0"


    // $ANTLR start "rule__NumericValidators__MinValueAssignment_1"
    // InternalKukulkan.g:2576:1: rule__NumericValidators__MinValueAssignment_1 : ( ruleminValidator ) ;
    public final void rule__NumericValidators__MinValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2580:1: ( ( ruleminValidator ) )
            // InternalKukulkan.g:2581:2: ( ruleminValidator )
            {
            // InternalKukulkan.g:2581:2: ( ruleminValidator )
            // InternalKukulkan.g:2582:3: ruleminValidator
            {
             before(grammarAccess.getNumericValidatorsAccess().getMinValueMinValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleminValidator();

            state._fsp--;

             after(grammarAccess.getNumericValidatorsAccess().getMinValueMinValidatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValidators__MinValueAssignment_1"


    // $ANTLR start "rule__NumericValidators__MaxValueAssignment_2"
    // InternalKukulkan.g:2591:1: rule__NumericValidators__MaxValueAssignment_2 : ( rulemaxValidator ) ;
    public final void rule__NumericValidators__MaxValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2595:1: ( ( rulemaxValidator ) )
            // InternalKukulkan.g:2596:2: ( rulemaxValidator )
            {
            // InternalKukulkan.g:2596:2: ( rulemaxValidator )
            // InternalKukulkan.g:2597:3: rulemaxValidator
            {
             before(grammarAccess.getNumericValidatorsAccess().getMaxValueMaxValidatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemaxValidator();

            state._fsp--;

             after(grammarAccess.getNumericValidatorsAccess().getMaxValueMaxValidatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValidators__MaxValueAssignment_2"


    // $ANTLR start "rule__BlobValidators__RequiredAssignment_0"
    // InternalKukulkan.g:2606:1: rule__BlobValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__BlobValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2610:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:2611:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:2611:2: ( rulerequiredValidator )
            // InternalKukulkan.g:2612:3: rulerequiredValidator
            {
             before(grammarAccess.getBlobValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulerequiredValidator();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobValidators__RequiredAssignment_0"


    // $ANTLR start "rule__BlobValidators__MinBytesValueAssignment_1"
    // InternalKukulkan.g:2621:1: rule__BlobValidators__MinBytesValueAssignment_1 : ( ruleminValidator ) ;
    public final void rule__BlobValidators__MinBytesValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2625:1: ( ( ruleminValidator ) )
            // InternalKukulkan.g:2626:2: ( ruleminValidator )
            {
            // InternalKukulkan.g:2626:2: ( ruleminValidator )
            // InternalKukulkan.g:2627:3: ruleminValidator
            {
             before(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleminValidator();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinValidatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobValidators__MinBytesValueAssignment_1"


    // $ANTLR start "rule__BlobValidators__MaxBytesValueAssignment_2"
    // InternalKukulkan.g:2636:1: rule__BlobValidators__MaxBytesValueAssignment_2 : ( rulemaxValidator ) ;
    public final void rule__BlobValidators__MaxBytesValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2640:1: ( ( rulemaxValidator ) )
            // InternalKukulkan.g:2641:2: ( rulemaxValidator )
            {
            // InternalKukulkan.g:2641:2: ( rulemaxValidator )
            // InternalKukulkan.g:2642:3: rulemaxValidator
            {
             before(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxValidatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemaxValidator();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxValidatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlobValidators__MaxBytesValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000004043C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000004003C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000080003FFD0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000002A0000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002A0000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000280000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000280000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});

}