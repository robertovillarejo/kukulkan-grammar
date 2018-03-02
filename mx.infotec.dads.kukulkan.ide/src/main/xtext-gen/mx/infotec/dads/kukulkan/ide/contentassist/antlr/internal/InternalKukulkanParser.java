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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Long'", "'BigDecimal'", "'Float'", "'Double'", "'Boolean'", "'Date'", "'LocalDate'", "'ZonedDateTime'", "'Instant'", "'Blob'", "'AnyBlob'", "'ImageBlob'", "'TextBlob'", "'required'", "'dto'", "'OneToMany'", "'ManyToOne'", "'OneToOne'", "'ManyToMany'", "'entity'", "'('", "')'", "'{'", "'}'", "','", "'minlength'", "'maxlength'", "'pattern'", "'min'", "'max'", "'minbytes'", "'maxbytes'", "'\"'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalKukulkan.g:62:1: ruledomainModel : ( ( rule__DomainModel__Alternatives ) ) ;
    public final void ruledomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:66:2: ( ( ( rule__DomainModel__Alternatives ) ) )
            // InternalKukulkan.g:67:2: ( ( rule__DomainModel__Alternatives ) )
            {
            // InternalKukulkan.g:67:2: ( ( rule__DomainModel__Alternatives ) )
            // InternalKukulkan.g:68:3: ( rule__DomainModel__Alternatives )
            {
             before(grammarAccess.getDomainModelAccess().getAlternatives()); 
            // InternalKukulkan.g:69:3: ( rule__DomainModel__Alternatives )
            // InternalKukulkan.g:69:4: rule__DomainModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getAlternatives()); 

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
    // InternalKukulkan.g:78:1: entryRuleentity : ruleentity EOF ;
    public final void entryRuleentity() throws RecognitionException {
        try {
            // InternalKukulkan.g:79:1: ( ruleentity EOF )
            // InternalKukulkan.g:80:1: ruleentity EOF
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
    // InternalKukulkan.g:87:1: ruleentity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleentity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalKukulkan.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalKukulkan.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalKukulkan.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalKukulkan.g:94:3: ( rule__Entity__Group__0 )
            // InternalKukulkan.g:94:4: rule__Entity__Group__0
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
    // InternalKukulkan.g:103:1: entryRuleentityField : ruleentityField EOF ;
    public final void entryRuleentityField() throws RecognitionException {
        try {
            // InternalKukulkan.g:104:1: ( ruleentityField EOF )
            // InternalKukulkan.g:105:1: ruleentityField EOF
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
    // InternalKukulkan.g:112:1: ruleentityField : ( ( rule__EntityField__Group__0 ) ) ;
    public final void ruleentityField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:116:2: ( ( ( rule__EntityField__Group__0 ) ) )
            // InternalKukulkan.g:117:2: ( ( rule__EntityField__Group__0 ) )
            {
            // InternalKukulkan.g:117:2: ( ( rule__EntityField__Group__0 ) )
            // InternalKukulkan.g:118:3: ( rule__EntityField__Group__0 )
            {
             before(grammarAccess.getEntityFieldAccess().getGroup()); 
            // InternalKukulkan.g:119:3: ( rule__EntityField__Group__0 )
            // InternalKukulkan.g:119:4: rule__EntityField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getGroup()); 

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


    // $ANTLR start "entryRulefieldType"
    // InternalKukulkan.g:128:1: entryRulefieldType : rulefieldType EOF ;
    public final void entryRulefieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:129:1: ( rulefieldType EOF )
            // InternalKukulkan.g:130:1: rulefieldType EOF
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
    // InternalKukulkan.g:137:1: rulefieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void rulefieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:141:2: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalKukulkan.g:142:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalKukulkan.g:142:2: ( ( rule__FieldType__Alternatives ) )
            // InternalKukulkan.g:143:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalKukulkan.g:144:3: ( rule__FieldType__Alternatives )
            // InternalKukulkan.g:144:4: rule__FieldType__Alternatives
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


    // $ANTLR start "entryRuleentityType"
    // InternalKukulkan.g:153:1: entryRuleentityType : ruleentityType EOF ;
    public final void entryRuleentityType() throws RecognitionException {
        try {
            // InternalKukulkan.g:154:1: ( ruleentityType EOF )
            // InternalKukulkan.g:155:1: ruleentityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleentityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
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
    // $ANTLR end "entryRuleentityType"


    // $ANTLR start "ruleentityType"
    // InternalKukulkan.g:162:1: ruleentityType : ( ruleentity ) ;
    public final void ruleentityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:166:2: ( ( ruleentity ) )
            // InternalKukulkan.g:167:2: ( ruleentity )
            {
            // InternalKukulkan.g:167:2: ( ruleentity )
            // InternalKukulkan.g:168:3: ruleentity
            {
             before(grammarAccess.getEntityTypeAccess().getEntityParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getEntityTypeAccess().getEntityParserRuleCall()); 

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
    // $ANTLR end "ruleentityType"


    // $ANTLR start "entryRulestringFieldType"
    // InternalKukulkan.g:178:1: entryRulestringFieldType : rulestringFieldType EOF ;
    public final void entryRulestringFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:179:1: ( rulestringFieldType EOF )
            // InternalKukulkan.g:180:1: rulestringFieldType EOF
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
    // InternalKukulkan.g:187:1: rulestringFieldType : ( ( rule__StringFieldType__Group__0 ) ) ;
    public final void rulestringFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:191:2: ( ( ( rule__StringFieldType__Group__0 ) ) )
            // InternalKukulkan.g:192:2: ( ( rule__StringFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:192:2: ( ( rule__StringFieldType__Group__0 ) )
            // InternalKukulkan.g:193:3: ( rule__StringFieldType__Group__0 )
            {
             before(grammarAccess.getStringFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:194:3: ( rule__StringFieldType__Group__0 )
            // InternalKukulkan.g:194:4: rule__StringFieldType__Group__0
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
    // InternalKukulkan.g:203:1: entryRulestringType : rulestringType EOF ;
    public final void entryRulestringType() throws RecognitionException {
        try {
            // InternalKukulkan.g:204:1: ( rulestringType EOF )
            // InternalKukulkan.g:205:1: rulestringType EOF
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
    // InternalKukulkan.g:212:1: rulestringType : ( 'String' ) ;
    public final void rulestringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:216:2: ( ( 'String' ) )
            // InternalKukulkan.g:217:2: ( 'String' )
            {
            // InternalKukulkan.g:217:2: ( 'String' )
            // InternalKukulkan.g:218:3: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword()); 

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
    // InternalKukulkan.g:228:1: entryRulenumericFieldType : rulenumericFieldType EOF ;
    public final void entryRulenumericFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:229:1: ( rulenumericFieldType EOF )
            // InternalKukulkan.g:230:1: rulenumericFieldType EOF
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
    // InternalKukulkan.g:237:1: rulenumericFieldType : ( ( rule__NumericFieldType__Group__0 ) ) ;
    public final void rulenumericFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:241:2: ( ( ( rule__NumericFieldType__Group__0 ) ) )
            // InternalKukulkan.g:242:2: ( ( rule__NumericFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:242:2: ( ( rule__NumericFieldType__Group__0 ) )
            // InternalKukulkan.g:243:3: ( rule__NumericFieldType__Group__0 )
            {
             before(grammarAccess.getNumericFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:244:3: ( rule__NumericFieldType__Group__0 )
            // InternalKukulkan.g:244:4: rule__NumericFieldType__Group__0
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
    // InternalKukulkan.g:253:1: entryRulenumericTypes : rulenumericTypes EOF ;
    public final void entryRulenumericTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:254:1: ( rulenumericTypes EOF )
            // InternalKukulkan.g:255:1: rulenumericTypes EOF
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
    // InternalKukulkan.g:262:1: rulenumericTypes : ( ( rule__NumericTypes__Alternatives ) ) ;
    public final void rulenumericTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:266:2: ( ( ( rule__NumericTypes__Alternatives ) ) )
            // InternalKukulkan.g:267:2: ( ( rule__NumericTypes__Alternatives ) )
            {
            // InternalKukulkan.g:267:2: ( ( rule__NumericTypes__Alternatives ) )
            // InternalKukulkan.g:268:3: ( rule__NumericTypes__Alternatives )
            {
             before(grammarAccess.getNumericTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:269:3: ( rule__NumericTypes__Alternatives )
            // InternalKukulkan.g:269:4: rule__NumericTypes__Alternatives
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalKukulkan.g:278:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalKukulkan.g:279:1: ( ruleINTEGER EOF )
            // InternalKukulkan.g:280:1: ruleINTEGER EOF
            {
             before(grammarAccess.getINTEGERRule()); 
            pushFollow(FOLLOW_1);
            ruleINTEGER();

            state._fsp--;

             after(grammarAccess.getINTEGERRule()); 
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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalKukulkan.g:287:1: ruleINTEGER : ( 'Integer' ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:291:2: ( ( 'Integer' ) )
            // InternalKukulkan.g:292:2: ( 'Integer' )
            {
            // InternalKukulkan.g:292:2: ( 'Integer' )
            // InternalKukulkan.g:293:3: 'Integer'
            {
             before(grammarAccess.getINTEGERAccess().getIntegerKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getINTEGERAccess().getIntegerKeyword()); 

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleLONG"
    // InternalKukulkan.g:303:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalKukulkan.g:304:1: ( ruleLONG EOF )
            // InternalKukulkan.g:305:1: ruleLONG EOF
            {
             before(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getLONGRule()); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalKukulkan.g:312:1: ruleLONG : ( 'Long' ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:316:2: ( ( 'Long' ) )
            // InternalKukulkan.g:317:2: ( 'Long' )
            {
            // InternalKukulkan.g:317:2: ( 'Long' )
            // InternalKukulkan.g:318:3: 'Long'
            {
             before(grammarAccess.getLONGAccess().getLongKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getLongKeyword()); 

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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleBIG_DECIMAL"
    // InternalKukulkan.g:328:1: entryRuleBIG_DECIMAL : ruleBIG_DECIMAL EOF ;
    public final void entryRuleBIG_DECIMAL() throws RecognitionException {
        try {
            // InternalKukulkan.g:329:1: ( ruleBIG_DECIMAL EOF )
            // InternalKukulkan.g:330:1: ruleBIG_DECIMAL EOF
            {
             before(grammarAccess.getBIG_DECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleBIG_DECIMAL();

            state._fsp--;

             after(grammarAccess.getBIG_DECIMALRule()); 
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
    // $ANTLR end "entryRuleBIG_DECIMAL"


    // $ANTLR start "ruleBIG_DECIMAL"
    // InternalKukulkan.g:337:1: ruleBIG_DECIMAL : ( 'BigDecimal' ) ;
    public final void ruleBIG_DECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:341:2: ( ( 'BigDecimal' ) )
            // InternalKukulkan.g:342:2: ( 'BigDecimal' )
            {
            // InternalKukulkan.g:342:2: ( 'BigDecimal' )
            // InternalKukulkan.g:343:3: 'BigDecimal'
            {
             before(grammarAccess.getBIG_DECIMALAccess().getBigDecimalKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBIG_DECIMALAccess().getBigDecimalKeyword()); 

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
    // $ANTLR end "ruleBIG_DECIMAL"


    // $ANTLR start "entryRuleFLOAT"
    // InternalKukulkan.g:353:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalKukulkan.g:354:1: ( ruleFLOAT EOF )
            // InternalKukulkan.g:355:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalKukulkan.g:362:1: ruleFLOAT : ( 'Float' ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:366:2: ( ( 'Float' ) )
            // InternalKukulkan.g:367:2: ( 'Float' )
            {
            // InternalKukulkan.g:367:2: ( 'Float' )
            // InternalKukulkan.g:368:3: 'Float'
            {
             before(grammarAccess.getFLOATAccess().getFloatKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFloatKeyword()); 

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalKukulkan.g:378:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalKukulkan.g:379:1: ( ruleDOUBLE EOF )
            // InternalKukulkan.g:380:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalKukulkan.g:387:1: ruleDOUBLE : ( 'Double' ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:391:2: ( ( 'Double' ) )
            // InternalKukulkan.g:392:2: ( 'Double' )
            {
            // InternalKukulkan.g:392:2: ( 'Double' )
            // InternalKukulkan.g:393:3: 'Double'
            {
             before(grammarAccess.getDOUBLEAccess().getDoubleKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getDoubleKeyword()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulebooleanFieldType"
    // InternalKukulkan.g:403:1: entryRulebooleanFieldType : rulebooleanFieldType EOF ;
    public final void entryRulebooleanFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:404:1: ( rulebooleanFieldType EOF )
            // InternalKukulkan.g:405:1: rulebooleanFieldType EOF
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
    // InternalKukulkan.g:412:1: rulebooleanFieldType : ( ( rule__BooleanFieldType__Group__0 ) ) ;
    public final void rulebooleanFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:416:2: ( ( ( rule__BooleanFieldType__Group__0 ) ) )
            // InternalKukulkan.g:417:2: ( ( rule__BooleanFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:417:2: ( ( rule__BooleanFieldType__Group__0 ) )
            // InternalKukulkan.g:418:3: ( rule__BooleanFieldType__Group__0 )
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:419:3: ( rule__BooleanFieldType__Group__0 )
            // InternalKukulkan.g:419:4: rule__BooleanFieldType__Group__0
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


    // $ANTLR start "entryRuleBOOLEAN_TYPE"
    // InternalKukulkan.g:428:1: entryRuleBOOLEAN_TYPE : ruleBOOLEAN_TYPE EOF ;
    public final void entryRuleBOOLEAN_TYPE() throws RecognitionException {
        try {
            // InternalKukulkan.g:429:1: ( ruleBOOLEAN_TYPE EOF )
            // InternalKukulkan.g:430:1: ruleBOOLEAN_TYPE EOF
            {
             before(grammarAccess.getBOOLEAN_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN_TYPE();

            state._fsp--;

             after(grammarAccess.getBOOLEAN_TYPERule()); 
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
    // $ANTLR end "entryRuleBOOLEAN_TYPE"


    // $ANTLR start "ruleBOOLEAN_TYPE"
    // InternalKukulkan.g:437:1: ruleBOOLEAN_TYPE : ( 'Boolean' ) ;
    public final void ruleBOOLEAN_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:441:2: ( ( 'Boolean' ) )
            // InternalKukulkan.g:442:2: ( 'Boolean' )
            {
            // InternalKukulkan.g:442:2: ( 'Boolean' )
            // InternalKukulkan.g:443:3: 'Boolean'
            {
             before(grammarAccess.getBOOLEAN_TYPEAccess().getBooleanKeyword()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBOOLEAN_TYPEAccess().getBooleanKeyword()); 

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
    // $ANTLR end "ruleBOOLEAN_TYPE"


    // $ANTLR start "entryRuledateFieldType"
    // InternalKukulkan.g:453:1: entryRuledateFieldType : ruledateFieldType EOF ;
    public final void entryRuledateFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:454:1: ( ruledateFieldType EOF )
            // InternalKukulkan.g:455:1: ruledateFieldType EOF
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
    // InternalKukulkan.g:462:1: ruledateFieldType : ( ( rule__DateFieldType__Group__0 ) ) ;
    public final void ruledateFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:466:2: ( ( ( rule__DateFieldType__Group__0 ) ) )
            // InternalKukulkan.g:467:2: ( ( rule__DateFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:467:2: ( ( rule__DateFieldType__Group__0 ) )
            // InternalKukulkan.g:468:3: ( rule__DateFieldType__Group__0 )
            {
             before(grammarAccess.getDateFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:469:3: ( rule__DateFieldType__Group__0 )
            // InternalKukulkan.g:469:4: rule__DateFieldType__Group__0
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
    // InternalKukulkan.g:478:1: entryRuledateTypes : ruledateTypes EOF ;
    public final void entryRuledateTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:479:1: ( ruledateTypes EOF )
            // InternalKukulkan.g:480:1: ruledateTypes EOF
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
    // InternalKukulkan.g:487:1: ruledateTypes : ( ( rule__DateTypes__Alternatives ) ) ;
    public final void ruledateTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:491:2: ( ( ( rule__DateTypes__Alternatives ) ) )
            // InternalKukulkan.g:492:2: ( ( rule__DateTypes__Alternatives ) )
            {
            // InternalKukulkan.g:492:2: ( ( rule__DateTypes__Alternatives ) )
            // InternalKukulkan.g:493:3: ( rule__DateTypes__Alternatives )
            {
             before(grammarAccess.getDateTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:494:3: ( rule__DateTypes__Alternatives )
            // InternalKukulkan.g:494:4: rule__DateTypes__Alternatives
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


    // $ANTLR start "entryRuleDATE"
    // InternalKukulkan.g:503:1: entryRuleDATE : ruleDATE EOF ;
    public final void entryRuleDATE() throws RecognitionException {
        try {
            // InternalKukulkan.g:504:1: ( ruleDATE EOF )
            // InternalKukulkan.g:505:1: ruleDATE EOF
            {
             before(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getDATERule()); 
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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalKukulkan.g:512:1: ruleDATE : ( 'Date' ) ;
    public final void ruleDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:516:2: ( ( 'Date' ) )
            // InternalKukulkan.g:517:2: ( 'Date' )
            {
            // InternalKukulkan.g:517:2: ( 'Date' )
            // InternalKukulkan.g:518:3: 'Date'
            {
             before(grammarAccess.getDATEAccess().getDateKeyword()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getDateKeyword()); 

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleLOCAL_DATE"
    // InternalKukulkan.g:528:1: entryRuleLOCAL_DATE : ruleLOCAL_DATE EOF ;
    public final void entryRuleLOCAL_DATE() throws RecognitionException {
        try {
            // InternalKukulkan.g:529:1: ( ruleLOCAL_DATE EOF )
            // InternalKukulkan.g:530:1: ruleLOCAL_DATE EOF
            {
             before(grammarAccess.getLOCAL_DATERule()); 
            pushFollow(FOLLOW_1);
            ruleLOCAL_DATE();

            state._fsp--;

             after(grammarAccess.getLOCAL_DATERule()); 
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
    // $ANTLR end "entryRuleLOCAL_DATE"


    // $ANTLR start "ruleLOCAL_DATE"
    // InternalKukulkan.g:537:1: ruleLOCAL_DATE : ( 'LocalDate' ) ;
    public final void ruleLOCAL_DATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:541:2: ( ( 'LocalDate' ) )
            // InternalKukulkan.g:542:2: ( 'LocalDate' )
            {
            // InternalKukulkan.g:542:2: ( 'LocalDate' )
            // InternalKukulkan.g:543:3: 'LocalDate'
            {
             before(grammarAccess.getLOCAL_DATEAccess().getLocalDateKeyword()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLOCAL_DATEAccess().getLocalDateKeyword()); 

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
    // $ANTLR end "ruleLOCAL_DATE"


    // $ANTLR start "entryRuleZONED_DATETIME"
    // InternalKukulkan.g:553:1: entryRuleZONED_DATETIME : ruleZONED_DATETIME EOF ;
    public final void entryRuleZONED_DATETIME() throws RecognitionException {
        try {
            // InternalKukulkan.g:554:1: ( ruleZONED_DATETIME EOF )
            // InternalKukulkan.g:555:1: ruleZONED_DATETIME EOF
            {
             before(grammarAccess.getZONED_DATETIMERule()); 
            pushFollow(FOLLOW_1);
            ruleZONED_DATETIME();

            state._fsp--;

             after(grammarAccess.getZONED_DATETIMERule()); 
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
    // $ANTLR end "entryRuleZONED_DATETIME"


    // $ANTLR start "ruleZONED_DATETIME"
    // InternalKukulkan.g:562:1: ruleZONED_DATETIME : ( 'ZonedDateTime' ) ;
    public final void ruleZONED_DATETIME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:566:2: ( ( 'ZonedDateTime' ) )
            // InternalKukulkan.g:567:2: ( 'ZonedDateTime' )
            {
            // InternalKukulkan.g:567:2: ( 'ZonedDateTime' )
            // InternalKukulkan.g:568:3: 'ZonedDateTime'
            {
             before(grammarAccess.getZONED_DATETIMEAccess().getZonedDateTimeKeyword()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getZONED_DATETIMEAccess().getZonedDateTimeKeyword()); 

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
    // $ANTLR end "ruleZONED_DATETIME"


    // $ANTLR start "entryRuleINSTANT"
    // InternalKukulkan.g:578:1: entryRuleINSTANT : ruleINSTANT EOF ;
    public final void entryRuleINSTANT() throws RecognitionException {
        try {
            // InternalKukulkan.g:579:1: ( ruleINSTANT EOF )
            // InternalKukulkan.g:580:1: ruleINSTANT EOF
            {
             before(grammarAccess.getINSTANTRule()); 
            pushFollow(FOLLOW_1);
            ruleINSTANT();

            state._fsp--;

             after(grammarAccess.getINSTANTRule()); 
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
    // $ANTLR end "entryRuleINSTANT"


    // $ANTLR start "ruleINSTANT"
    // InternalKukulkan.g:587:1: ruleINSTANT : ( 'Instant' ) ;
    public final void ruleINSTANT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:591:2: ( ( 'Instant' ) )
            // InternalKukulkan.g:592:2: ( 'Instant' )
            {
            // InternalKukulkan.g:592:2: ( 'Instant' )
            // InternalKukulkan.g:593:3: 'Instant'
            {
             before(grammarAccess.getINSTANTAccess().getInstantKeyword()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getINSTANTAccess().getInstantKeyword()); 

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
    // $ANTLR end "ruleINSTANT"


    // $ANTLR start "entryRuleblobFieldType"
    // InternalKukulkan.g:603:1: entryRuleblobFieldType : ruleblobFieldType EOF ;
    public final void entryRuleblobFieldType() throws RecognitionException {
        try {
            // InternalKukulkan.g:604:1: ( ruleblobFieldType EOF )
            // InternalKukulkan.g:605:1: ruleblobFieldType EOF
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
    // InternalKukulkan.g:612:1: ruleblobFieldType : ( ( rule__BlobFieldType__Group__0 ) ) ;
    public final void ruleblobFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:616:2: ( ( ( rule__BlobFieldType__Group__0 ) ) )
            // InternalKukulkan.g:617:2: ( ( rule__BlobFieldType__Group__0 ) )
            {
            // InternalKukulkan.g:617:2: ( ( rule__BlobFieldType__Group__0 ) )
            // InternalKukulkan.g:618:3: ( rule__BlobFieldType__Group__0 )
            {
             before(grammarAccess.getBlobFieldTypeAccess().getGroup()); 
            // InternalKukulkan.g:619:3: ( rule__BlobFieldType__Group__0 )
            // InternalKukulkan.g:619:4: rule__BlobFieldType__Group__0
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
    // InternalKukulkan.g:628:1: entryRuleblobTypes : ruleblobTypes EOF ;
    public final void entryRuleblobTypes() throws RecognitionException {
        try {
            // InternalKukulkan.g:629:1: ( ruleblobTypes EOF )
            // InternalKukulkan.g:630:1: ruleblobTypes EOF
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
    // InternalKukulkan.g:637:1: ruleblobTypes : ( ( rule__BlobTypes__Alternatives ) ) ;
    public final void ruleblobTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:641:2: ( ( ( rule__BlobTypes__Alternatives ) ) )
            // InternalKukulkan.g:642:2: ( ( rule__BlobTypes__Alternatives ) )
            {
            // InternalKukulkan.g:642:2: ( ( rule__BlobTypes__Alternatives ) )
            // InternalKukulkan.g:643:3: ( rule__BlobTypes__Alternatives )
            {
             before(grammarAccess.getBlobTypesAccess().getAlternatives()); 
            // InternalKukulkan.g:644:3: ( rule__BlobTypes__Alternatives )
            // InternalKukulkan.g:644:4: rule__BlobTypes__Alternatives
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


    // $ANTLR start "entryRuleBLOB"
    // InternalKukulkan.g:653:1: entryRuleBLOB : ruleBLOB EOF ;
    public final void entryRuleBLOB() throws RecognitionException {
        try {
            // InternalKukulkan.g:654:1: ( ruleBLOB EOF )
            // InternalKukulkan.g:655:1: ruleBLOB EOF
            {
             before(grammarAccess.getBLOBRule()); 
            pushFollow(FOLLOW_1);
            ruleBLOB();

            state._fsp--;

             after(grammarAccess.getBLOBRule()); 
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
    // $ANTLR end "entryRuleBLOB"


    // $ANTLR start "ruleBLOB"
    // InternalKukulkan.g:662:1: ruleBLOB : ( 'Blob' ) ;
    public final void ruleBLOB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:666:2: ( ( 'Blob' ) )
            // InternalKukulkan.g:667:2: ( 'Blob' )
            {
            // InternalKukulkan.g:667:2: ( 'Blob' )
            // InternalKukulkan.g:668:3: 'Blob'
            {
             before(grammarAccess.getBLOBAccess().getBlobKeyword()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBLOBAccess().getBlobKeyword()); 

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
    // $ANTLR end "ruleBLOB"


    // $ANTLR start "entryRuleANY_BLOB"
    // InternalKukulkan.g:678:1: entryRuleANY_BLOB : ruleANY_BLOB EOF ;
    public final void entryRuleANY_BLOB() throws RecognitionException {
        try {
            // InternalKukulkan.g:679:1: ( ruleANY_BLOB EOF )
            // InternalKukulkan.g:680:1: ruleANY_BLOB EOF
            {
             before(grammarAccess.getANY_BLOBRule()); 
            pushFollow(FOLLOW_1);
            ruleANY_BLOB();

            state._fsp--;

             after(grammarAccess.getANY_BLOBRule()); 
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
    // $ANTLR end "entryRuleANY_BLOB"


    // $ANTLR start "ruleANY_BLOB"
    // InternalKukulkan.g:687:1: ruleANY_BLOB : ( 'AnyBlob' ) ;
    public final void ruleANY_BLOB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:691:2: ( ( 'AnyBlob' ) )
            // InternalKukulkan.g:692:2: ( 'AnyBlob' )
            {
            // InternalKukulkan.g:692:2: ( 'AnyBlob' )
            // InternalKukulkan.g:693:3: 'AnyBlob'
            {
             before(grammarAccess.getANY_BLOBAccess().getAnyBlobKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getANY_BLOBAccess().getAnyBlobKeyword()); 

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
    // $ANTLR end "ruleANY_BLOB"


    // $ANTLR start "entryRuleIMAGE_BLOB"
    // InternalKukulkan.g:703:1: entryRuleIMAGE_BLOB : ruleIMAGE_BLOB EOF ;
    public final void entryRuleIMAGE_BLOB() throws RecognitionException {
        try {
            // InternalKukulkan.g:704:1: ( ruleIMAGE_BLOB EOF )
            // InternalKukulkan.g:705:1: ruleIMAGE_BLOB EOF
            {
             before(grammarAccess.getIMAGE_BLOBRule()); 
            pushFollow(FOLLOW_1);
            ruleIMAGE_BLOB();

            state._fsp--;

             after(grammarAccess.getIMAGE_BLOBRule()); 
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
    // $ANTLR end "entryRuleIMAGE_BLOB"


    // $ANTLR start "ruleIMAGE_BLOB"
    // InternalKukulkan.g:712:1: ruleIMAGE_BLOB : ( 'ImageBlob' ) ;
    public final void ruleIMAGE_BLOB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:716:2: ( ( 'ImageBlob' ) )
            // InternalKukulkan.g:717:2: ( 'ImageBlob' )
            {
            // InternalKukulkan.g:717:2: ( 'ImageBlob' )
            // InternalKukulkan.g:718:3: 'ImageBlob'
            {
             before(grammarAccess.getIMAGE_BLOBAccess().getImageBlobKeyword()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIMAGE_BLOBAccess().getImageBlobKeyword()); 

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
    // $ANTLR end "ruleIMAGE_BLOB"


    // $ANTLR start "entryRuleTEXT_BLOB"
    // InternalKukulkan.g:728:1: entryRuleTEXT_BLOB : ruleTEXT_BLOB EOF ;
    public final void entryRuleTEXT_BLOB() throws RecognitionException {
        try {
            // InternalKukulkan.g:729:1: ( ruleTEXT_BLOB EOF )
            // InternalKukulkan.g:730:1: ruleTEXT_BLOB EOF
            {
             before(grammarAccess.getTEXT_BLOBRule()); 
            pushFollow(FOLLOW_1);
            ruleTEXT_BLOB();

            state._fsp--;

             after(grammarAccess.getTEXT_BLOBRule()); 
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
    // $ANTLR end "entryRuleTEXT_BLOB"


    // $ANTLR start "ruleTEXT_BLOB"
    // InternalKukulkan.g:737:1: ruleTEXT_BLOB : ( 'TextBlob' ) ;
    public final void ruleTEXT_BLOB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:741:2: ( ( 'TextBlob' ) )
            // InternalKukulkan.g:742:2: ( 'TextBlob' )
            {
            // InternalKukulkan.g:742:2: ( 'TextBlob' )
            // InternalKukulkan.g:743:3: 'TextBlob'
            {
             before(grammarAccess.getTEXT_BLOBAccess().getTextBlobKeyword()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTEXT_BLOBAccess().getTextBlobKeyword()); 

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
    // $ANTLR end "ruleTEXT_BLOB"


    // $ANTLR start "entryRulestringValidators"
    // InternalKukulkan.g:753:1: entryRulestringValidators : rulestringValidators EOF ;
    public final void entryRulestringValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:754:1: ( rulestringValidators EOF )
            // InternalKukulkan.g:755:1: rulestringValidators EOF
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
    // InternalKukulkan.g:762:1: rulestringValidators : ( ( rule__StringValidators__Alternatives ) ) ;
    public final void rulestringValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:766:2: ( ( ( rule__StringValidators__Alternatives ) ) )
            // InternalKukulkan.g:767:2: ( ( rule__StringValidators__Alternatives ) )
            {
            // InternalKukulkan.g:767:2: ( ( rule__StringValidators__Alternatives ) )
            // InternalKukulkan.g:768:3: ( rule__StringValidators__Alternatives )
            {
             before(grammarAccess.getStringValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:769:3: ( rule__StringValidators__Alternatives )
            // InternalKukulkan.g:769:4: rule__StringValidators__Alternatives
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
    // InternalKukulkan.g:778:1: entryRulenumericValidators : rulenumericValidators EOF ;
    public final void entryRulenumericValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:779:1: ( rulenumericValidators EOF )
            // InternalKukulkan.g:780:1: rulenumericValidators EOF
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
    // InternalKukulkan.g:787:1: rulenumericValidators : ( ( rule__NumericValidators__Alternatives ) ) ;
    public final void rulenumericValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:791:2: ( ( ( rule__NumericValidators__Alternatives ) ) )
            // InternalKukulkan.g:792:2: ( ( rule__NumericValidators__Alternatives ) )
            {
            // InternalKukulkan.g:792:2: ( ( rule__NumericValidators__Alternatives ) )
            // InternalKukulkan.g:793:3: ( rule__NumericValidators__Alternatives )
            {
             before(grammarAccess.getNumericValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:794:3: ( rule__NumericValidators__Alternatives )
            // InternalKukulkan.g:794:4: rule__NumericValidators__Alternatives
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
    // InternalKukulkan.g:803:1: entryRuleblobValidators : ruleblobValidators EOF ;
    public final void entryRuleblobValidators() throws RecognitionException {
        try {
            // InternalKukulkan.g:804:1: ( ruleblobValidators EOF )
            // InternalKukulkan.g:805:1: ruleblobValidators EOF
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
    // InternalKukulkan.g:812:1: ruleblobValidators : ( ( rule__BlobValidators__Alternatives ) ) ;
    public final void ruleblobValidators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:816:2: ( ( ( rule__BlobValidators__Alternatives ) ) )
            // InternalKukulkan.g:817:2: ( ( rule__BlobValidators__Alternatives ) )
            {
            // InternalKukulkan.g:817:2: ( ( rule__BlobValidators__Alternatives ) )
            // InternalKukulkan.g:818:3: ( rule__BlobValidators__Alternatives )
            {
             before(grammarAccess.getBlobValidatorsAccess().getAlternatives()); 
            // InternalKukulkan.g:819:3: ( rule__BlobValidators__Alternatives )
            // InternalKukulkan.g:819:4: rule__BlobValidators__Alternatives
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
    // InternalKukulkan.g:828:1: entryRulerequiredValidator : rulerequiredValidator EOF ;
    public final void entryRulerequiredValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:829:1: ( rulerequiredValidator EOF )
            // InternalKukulkan.g:830:1: rulerequiredValidator EOF
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
    // InternalKukulkan.g:837:1: rulerequiredValidator : ( 'required' ) ;
    public final void rulerequiredValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:841:2: ( ( 'required' ) )
            // InternalKukulkan.g:842:2: ( 'required' )
            {
            // InternalKukulkan.g:842:2: ( 'required' )
            // InternalKukulkan.g:843:3: 'required'
            {
             before(grammarAccess.getRequiredValidatorAccess().getRequiredKeyword()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRequiredValidatorAccess().getRequiredKeyword()); 

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


    // $ANTLR start "entryRuleminLengthValidator"
    // InternalKukulkan.g:853:1: entryRuleminLengthValidator : ruleminLengthValidator EOF ;
    public final void entryRuleminLengthValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:854:1: ( ruleminLengthValidator EOF )
            // InternalKukulkan.g:855:1: ruleminLengthValidator EOF
            {
             before(grammarAccess.getMinLengthValidatorRule()); 
            pushFollow(FOLLOW_1);
            ruleminLengthValidator();

            state._fsp--;

             after(grammarAccess.getMinLengthValidatorRule()); 
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
    // $ANTLR end "entryRuleminLengthValidator"


    // $ANTLR start "ruleminLengthValidator"
    // InternalKukulkan.g:862:1: ruleminLengthValidator : ( ( rule__MinLengthValidator__Group__0 ) ) ;
    public final void ruleminLengthValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:866:2: ( ( ( rule__MinLengthValidator__Group__0 ) ) )
            // InternalKukulkan.g:867:2: ( ( rule__MinLengthValidator__Group__0 ) )
            {
            // InternalKukulkan.g:867:2: ( ( rule__MinLengthValidator__Group__0 ) )
            // InternalKukulkan.g:868:3: ( rule__MinLengthValidator__Group__0 )
            {
             before(grammarAccess.getMinLengthValidatorAccess().getGroup()); 
            // InternalKukulkan.g:869:3: ( rule__MinLengthValidator__Group__0 )
            // InternalKukulkan.g:869:4: rule__MinLengthValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinLengthValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinLengthValidatorAccess().getGroup()); 

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
    // $ANTLR end "ruleminLengthValidator"


    // $ANTLR start "entryRulemaxLengthValidator"
    // InternalKukulkan.g:878:1: entryRulemaxLengthValidator : rulemaxLengthValidator EOF ;
    public final void entryRulemaxLengthValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:879:1: ( rulemaxLengthValidator EOF )
            // InternalKukulkan.g:880:1: rulemaxLengthValidator EOF
            {
             before(grammarAccess.getMaxLengthValidatorRule()); 
            pushFollow(FOLLOW_1);
            rulemaxLengthValidator();

            state._fsp--;

             after(grammarAccess.getMaxLengthValidatorRule()); 
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
    // $ANTLR end "entryRulemaxLengthValidator"


    // $ANTLR start "rulemaxLengthValidator"
    // InternalKukulkan.g:887:1: rulemaxLengthValidator : ( ( rule__MaxLengthValidator__Group__0 ) ) ;
    public final void rulemaxLengthValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:891:2: ( ( ( rule__MaxLengthValidator__Group__0 ) ) )
            // InternalKukulkan.g:892:2: ( ( rule__MaxLengthValidator__Group__0 ) )
            {
            // InternalKukulkan.g:892:2: ( ( rule__MaxLengthValidator__Group__0 ) )
            // InternalKukulkan.g:893:3: ( rule__MaxLengthValidator__Group__0 )
            {
             before(grammarAccess.getMaxLengthValidatorAccess().getGroup()); 
            // InternalKukulkan.g:894:3: ( rule__MaxLengthValidator__Group__0 )
            // InternalKukulkan.g:894:4: rule__MaxLengthValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxLengthValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxLengthValidatorAccess().getGroup()); 

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
    // $ANTLR end "rulemaxLengthValidator"


    // $ANTLR start "entryRulepatternValidator"
    // InternalKukulkan.g:903:1: entryRulepatternValidator : rulepatternValidator EOF ;
    public final void entryRulepatternValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:904:1: ( rulepatternValidator EOF )
            // InternalKukulkan.g:905:1: rulepatternValidator EOF
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
    // InternalKukulkan.g:912:1: rulepatternValidator : ( ( rule__PatternValidator__Group__0 ) ) ;
    public final void rulepatternValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:916:2: ( ( ( rule__PatternValidator__Group__0 ) ) )
            // InternalKukulkan.g:917:2: ( ( rule__PatternValidator__Group__0 ) )
            {
            // InternalKukulkan.g:917:2: ( ( rule__PatternValidator__Group__0 ) )
            // InternalKukulkan.g:918:3: ( rule__PatternValidator__Group__0 )
            {
             before(grammarAccess.getPatternValidatorAccess().getGroup()); 
            // InternalKukulkan.g:919:3: ( rule__PatternValidator__Group__0 )
            // InternalKukulkan.g:919:4: rule__PatternValidator__Group__0
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
    // InternalKukulkan.g:928:1: entryRuleminValidator : ruleminValidator EOF ;
    public final void entryRuleminValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:929:1: ( ruleminValidator EOF )
            // InternalKukulkan.g:930:1: ruleminValidator EOF
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
    // InternalKukulkan.g:937:1: ruleminValidator : ( ( rule__MinValidator__Group__0 ) ) ;
    public final void ruleminValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:941:2: ( ( ( rule__MinValidator__Group__0 ) ) )
            // InternalKukulkan.g:942:2: ( ( rule__MinValidator__Group__0 ) )
            {
            // InternalKukulkan.g:942:2: ( ( rule__MinValidator__Group__0 ) )
            // InternalKukulkan.g:943:3: ( rule__MinValidator__Group__0 )
            {
             before(grammarAccess.getMinValidatorAccess().getGroup()); 
            // InternalKukulkan.g:944:3: ( rule__MinValidator__Group__0 )
            // InternalKukulkan.g:944:4: rule__MinValidator__Group__0
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
    // InternalKukulkan.g:953:1: entryRulemaxValidator : rulemaxValidator EOF ;
    public final void entryRulemaxValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:954:1: ( rulemaxValidator EOF )
            // InternalKukulkan.g:955:1: rulemaxValidator EOF
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
    // InternalKukulkan.g:962:1: rulemaxValidator : ( ( rule__MaxValidator__Group__0 ) ) ;
    public final void rulemaxValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:966:2: ( ( ( rule__MaxValidator__Group__0 ) ) )
            // InternalKukulkan.g:967:2: ( ( rule__MaxValidator__Group__0 ) )
            {
            // InternalKukulkan.g:967:2: ( ( rule__MaxValidator__Group__0 ) )
            // InternalKukulkan.g:968:3: ( rule__MaxValidator__Group__0 )
            {
             before(grammarAccess.getMaxValidatorAccess().getGroup()); 
            // InternalKukulkan.g:969:3: ( rule__MaxValidator__Group__0 )
            // InternalKukulkan.g:969:4: rule__MaxValidator__Group__0
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


    // $ANTLR start "entryRuleminBytesValidator"
    // InternalKukulkan.g:978:1: entryRuleminBytesValidator : ruleminBytesValidator EOF ;
    public final void entryRuleminBytesValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:979:1: ( ruleminBytesValidator EOF )
            // InternalKukulkan.g:980:1: ruleminBytesValidator EOF
            {
             before(grammarAccess.getMinBytesValidatorRule()); 
            pushFollow(FOLLOW_1);
            ruleminBytesValidator();

            state._fsp--;

             after(grammarAccess.getMinBytesValidatorRule()); 
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
    // $ANTLR end "entryRuleminBytesValidator"


    // $ANTLR start "ruleminBytesValidator"
    // InternalKukulkan.g:987:1: ruleminBytesValidator : ( ( rule__MinBytesValidator__Group__0 ) ) ;
    public final void ruleminBytesValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:991:2: ( ( ( rule__MinBytesValidator__Group__0 ) ) )
            // InternalKukulkan.g:992:2: ( ( rule__MinBytesValidator__Group__0 ) )
            {
            // InternalKukulkan.g:992:2: ( ( rule__MinBytesValidator__Group__0 ) )
            // InternalKukulkan.g:993:3: ( rule__MinBytesValidator__Group__0 )
            {
             before(grammarAccess.getMinBytesValidatorAccess().getGroup()); 
            // InternalKukulkan.g:994:3: ( rule__MinBytesValidator__Group__0 )
            // InternalKukulkan.g:994:4: rule__MinBytesValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinBytesValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinBytesValidatorAccess().getGroup()); 

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
    // $ANTLR end "ruleminBytesValidator"


    // $ANTLR start "entryRulemaxBytesValidator"
    // InternalKukulkan.g:1003:1: entryRulemaxBytesValidator : rulemaxBytesValidator EOF ;
    public final void entryRulemaxBytesValidator() throws RecognitionException {
        try {
            // InternalKukulkan.g:1004:1: ( rulemaxBytesValidator EOF )
            // InternalKukulkan.g:1005:1: rulemaxBytesValidator EOF
            {
             before(grammarAccess.getMaxBytesValidatorRule()); 
            pushFollow(FOLLOW_1);
            rulemaxBytesValidator();

            state._fsp--;

             after(grammarAccess.getMaxBytesValidatorRule()); 
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
    // $ANTLR end "entryRulemaxBytesValidator"


    // $ANTLR start "rulemaxBytesValidator"
    // InternalKukulkan.g:1012:1: rulemaxBytesValidator : ( ( rule__MaxBytesValidator__Group__0 ) ) ;
    public final void rulemaxBytesValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1016:2: ( ( ( rule__MaxBytesValidator__Group__0 ) ) )
            // InternalKukulkan.g:1017:2: ( ( rule__MaxBytesValidator__Group__0 ) )
            {
            // InternalKukulkan.g:1017:2: ( ( rule__MaxBytesValidator__Group__0 ) )
            // InternalKukulkan.g:1018:3: ( rule__MaxBytesValidator__Group__0 )
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getGroup()); 
            // InternalKukulkan.g:1019:3: ( rule__MaxBytesValidator__Group__0 )
            // InternalKukulkan.g:1019:4: rule__MaxBytesValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxBytesValidatorAccess().getGroup()); 

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
    // $ANTLR end "rulemaxBytesValidator"


    // $ANTLR start "entryRuleoption"
    // InternalKukulkan.g:1028:1: entryRuleoption : ruleoption EOF ;
    public final void entryRuleoption() throws RecognitionException {
        try {
            // InternalKukulkan.g:1029:1: ( ruleoption EOF )
            // InternalKukulkan.g:1030:1: ruleoption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleoption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
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
    // $ANTLR end "entryRuleoption"


    // $ANTLR start "ruleoption"
    // InternalKukulkan.g:1037:1: ruleoption : ( ( rule__Option__SettingAssignment ) ) ;
    public final void ruleoption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1041:2: ( ( ( rule__Option__SettingAssignment ) ) )
            // InternalKukulkan.g:1042:2: ( ( rule__Option__SettingAssignment ) )
            {
            // InternalKukulkan.g:1042:2: ( ( rule__Option__SettingAssignment ) )
            // InternalKukulkan.g:1043:3: ( rule__Option__SettingAssignment )
            {
             before(grammarAccess.getOptionAccess().getSettingAssignment()); 
            // InternalKukulkan.g:1044:3: ( rule__Option__SettingAssignment )
            // InternalKukulkan.g:1044:4: rule__Option__SettingAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Option__SettingAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getSettingAssignment()); 

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
    // $ANTLR end "ruleoption"


    // $ANTLR start "entryRuleoptionSetting"
    // InternalKukulkan.g:1053:1: entryRuleoptionSetting : ruleoptionSetting EOF ;
    public final void entryRuleoptionSetting() throws RecognitionException {
        try {
            // InternalKukulkan.g:1054:1: ( ruleoptionSetting EOF )
            // InternalKukulkan.g:1055:1: ruleoptionSetting EOF
            {
             before(grammarAccess.getOptionSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleoptionSetting();

            state._fsp--;

             after(grammarAccess.getOptionSettingRule()); 
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
    // $ANTLR end "entryRuleoptionSetting"


    // $ANTLR start "ruleoptionSetting"
    // InternalKukulkan.g:1062:1: ruleoptionSetting : ( ruledtoOption ) ;
    public final void ruleoptionSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1066:2: ( ( ruledtoOption ) )
            // InternalKukulkan.g:1067:2: ( ruledtoOption )
            {
            // InternalKukulkan.g:1067:2: ( ruledtoOption )
            // InternalKukulkan.g:1068:3: ruledtoOption
            {
             before(grammarAccess.getOptionSettingAccess().getDtoOptionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruledtoOption();

            state._fsp--;

             after(grammarAccess.getOptionSettingAccess().getDtoOptionParserRuleCall()); 

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
    // $ANTLR end "ruleoptionSetting"


    // $ANTLR start "entryRuledtoOption"
    // InternalKukulkan.g:1078:1: entryRuledtoOption : ruledtoOption EOF ;
    public final void entryRuledtoOption() throws RecognitionException {
        try {
            // InternalKukulkan.g:1079:1: ( ruledtoOption EOF )
            // InternalKukulkan.g:1080:1: ruledtoOption EOF
            {
             before(grammarAccess.getDtoOptionRule()); 
            pushFollow(FOLLOW_1);
            ruledtoOption();

            state._fsp--;

             after(grammarAccess.getDtoOptionRule()); 
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
    // $ANTLR end "entryRuledtoOption"


    // $ANTLR start "ruledtoOption"
    // InternalKukulkan.g:1087:1: ruledtoOption : ( ( 'dto' )? ) ;
    public final void ruledtoOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1091:2: ( ( ( 'dto' )? ) )
            // InternalKukulkan.g:1092:2: ( ( 'dto' )? )
            {
            // InternalKukulkan.g:1092:2: ( ( 'dto' )? )
            // InternalKukulkan.g:1093:3: ( 'dto' )?
            {
             before(grammarAccess.getDtoOptionAccess().getDtoKeyword()); 
            // InternalKukulkan.g:1094:3: ( 'dto' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKukulkan.g:1094:4: 'dto'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDtoOptionAccess().getDtoKeyword()); 

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
    // $ANTLR end "ruledtoOption"


    // $ANTLR start "entryRulePATTERN_VALUE"
    // InternalKukulkan.g:1103:1: entryRulePATTERN_VALUE : rulePATTERN_VALUE EOF ;
    public final void entryRulePATTERN_VALUE() throws RecognitionException {
        try {
            // InternalKukulkan.g:1104:1: ( rulePATTERN_VALUE EOF )
            // InternalKukulkan.g:1105:1: rulePATTERN_VALUE EOF
            {
             before(grammarAccess.getPATTERN_VALUERule()); 
            pushFollow(FOLLOW_1);
            rulePATTERN_VALUE();

            state._fsp--;

             after(grammarAccess.getPATTERN_VALUERule()); 
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
    // $ANTLR end "entryRulePATTERN_VALUE"


    // $ANTLR start "rulePATTERN_VALUE"
    // InternalKukulkan.g:1112:1: rulePATTERN_VALUE : ( ( rule__PATTERN_VALUE__Group__0 ) ) ;
    public final void rulePATTERN_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1116:2: ( ( ( rule__PATTERN_VALUE__Group__0 ) ) )
            // InternalKukulkan.g:1117:2: ( ( rule__PATTERN_VALUE__Group__0 ) )
            {
            // InternalKukulkan.g:1117:2: ( ( rule__PATTERN_VALUE__Group__0 ) )
            // InternalKukulkan.g:1118:3: ( rule__PATTERN_VALUE__Group__0 )
            {
             before(grammarAccess.getPATTERN_VALUEAccess().getGroup()); 
            // InternalKukulkan.g:1119:3: ( rule__PATTERN_VALUE__Group__0 )
            // InternalKukulkan.g:1119:4: rule__PATTERN_VALUE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PATTERN_VALUE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPATTERN_VALUEAccess().getGroup()); 

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
    // $ANTLR end "rulePATTERN_VALUE"


    // $ANTLR start "entryRuleONE_TO_MANY"
    // InternalKukulkan.g:1128:1: entryRuleONE_TO_MANY : ruleONE_TO_MANY EOF ;
    public final void entryRuleONE_TO_MANY() throws RecognitionException {
        try {
            // InternalKukulkan.g:1129:1: ( ruleONE_TO_MANY EOF )
            // InternalKukulkan.g:1130:1: ruleONE_TO_MANY EOF
            {
             before(grammarAccess.getONE_TO_MANYRule()); 
            pushFollow(FOLLOW_1);
            ruleONE_TO_MANY();

            state._fsp--;

             after(grammarAccess.getONE_TO_MANYRule()); 
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
    // $ANTLR end "entryRuleONE_TO_MANY"


    // $ANTLR start "ruleONE_TO_MANY"
    // InternalKukulkan.g:1137:1: ruleONE_TO_MANY : ( 'OneToMany' ) ;
    public final void ruleONE_TO_MANY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1141:2: ( ( 'OneToMany' ) )
            // InternalKukulkan.g:1142:2: ( 'OneToMany' )
            {
            // InternalKukulkan.g:1142:2: ( 'OneToMany' )
            // InternalKukulkan.g:1143:3: 'OneToMany'
            {
             before(grammarAccess.getONE_TO_MANYAccess().getOneToManyKeyword()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getONE_TO_MANYAccess().getOneToManyKeyword()); 

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
    // $ANTLR end "ruleONE_TO_MANY"


    // $ANTLR start "entryRuleMANY_TO_ONE"
    // InternalKukulkan.g:1153:1: entryRuleMANY_TO_ONE : ruleMANY_TO_ONE EOF ;
    public final void entryRuleMANY_TO_ONE() throws RecognitionException {
        try {
            // InternalKukulkan.g:1154:1: ( ruleMANY_TO_ONE EOF )
            // InternalKukulkan.g:1155:1: ruleMANY_TO_ONE EOF
            {
             before(grammarAccess.getMANY_TO_ONERule()); 
            pushFollow(FOLLOW_1);
            ruleMANY_TO_ONE();

            state._fsp--;

             after(grammarAccess.getMANY_TO_ONERule()); 
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
    // $ANTLR end "entryRuleMANY_TO_ONE"


    // $ANTLR start "ruleMANY_TO_ONE"
    // InternalKukulkan.g:1162:1: ruleMANY_TO_ONE : ( 'ManyToOne' ) ;
    public final void ruleMANY_TO_ONE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1166:2: ( ( 'ManyToOne' ) )
            // InternalKukulkan.g:1167:2: ( 'ManyToOne' )
            {
            // InternalKukulkan.g:1167:2: ( 'ManyToOne' )
            // InternalKukulkan.g:1168:3: 'ManyToOne'
            {
             before(grammarAccess.getMANY_TO_ONEAccess().getManyToOneKeyword()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMANY_TO_ONEAccess().getManyToOneKeyword()); 

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
    // $ANTLR end "ruleMANY_TO_ONE"


    // $ANTLR start "entryRuleONE_TO_ONE"
    // InternalKukulkan.g:1178:1: entryRuleONE_TO_ONE : ruleONE_TO_ONE EOF ;
    public final void entryRuleONE_TO_ONE() throws RecognitionException {
        try {
            // InternalKukulkan.g:1179:1: ( ruleONE_TO_ONE EOF )
            // InternalKukulkan.g:1180:1: ruleONE_TO_ONE EOF
            {
             before(grammarAccess.getONE_TO_ONERule()); 
            pushFollow(FOLLOW_1);
            ruleONE_TO_ONE();

            state._fsp--;

             after(grammarAccess.getONE_TO_ONERule()); 
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
    // $ANTLR end "entryRuleONE_TO_ONE"


    // $ANTLR start "ruleONE_TO_ONE"
    // InternalKukulkan.g:1187:1: ruleONE_TO_ONE : ( 'OneToOne' ) ;
    public final void ruleONE_TO_ONE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1191:2: ( ( 'OneToOne' ) )
            // InternalKukulkan.g:1192:2: ( 'OneToOne' )
            {
            // InternalKukulkan.g:1192:2: ( 'OneToOne' )
            // InternalKukulkan.g:1193:3: 'OneToOne'
            {
             before(grammarAccess.getONE_TO_ONEAccess().getOneToOneKeyword()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getONE_TO_ONEAccess().getOneToOneKeyword()); 

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
    // $ANTLR end "ruleONE_TO_ONE"


    // $ANTLR start "entryRuleMANY_TO_MANY"
    // InternalKukulkan.g:1203:1: entryRuleMANY_TO_MANY : ruleMANY_TO_MANY EOF ;
    public final void entryRuleMANY_TO_MANY() throws RecognitionException {
        try {
            // InternalKukulkan.g:1204:1: ( ruleMANY_TO_MANY EOF )
            // InternalKukulkan.g:1205:1: ruleMANY_TO_MANY EOF
            {
             before(grammarAccess.getMANY_TO_MANYRule()); 
            pushFollow(FOLLOW_1);
            ruleMANY_TO_MANY();

            state._fsp--;

             after(grammarAccess.getMANY_TO_MANYRule()); 
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
    // $ANTLR end "entryRuleMANY_TO_MANY"


    // $ANTLR start "ruleMANY_TO_MANY"
    // InternalKukulkan.g:1212:1: ruleMANY_TO_MANY : ( 'ManyToMany' ) ;
    public final void ruleMANY_TO_MANY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1216:2: ( ( 'ManyToMany' ) )
            // InternalKukulkan.g:1217:2: ( 'ManyToMany' )
            {
            // InternalKukulkan.g:1217:2: ( 'ManyToMany' )
            // InternalKukulkan.g:1218:3: 'ManyToMany'
            {
             before(grammarAccess.getMANY_TO_MANYAccess().getManyToManyKeyword()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMANY_TO_MANYAccess().getManyToManyKeyword()); 

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
    // $ANTLR end "ruleMANY_TO_MANY"


    // $ANTLR start "rule__DomainModel__Alternatives"
    // InternalKukulkan.g:1227:1: rule__DomainModel__Alternatives : ( ( ( ( rule__DomainModel__EntitiesAssignment_0 ) ) ( ( rule__DomainModel__EntitiesAssignment_0 )* ) ) | ( ( rule__DomainModel__SettingsAssignment_1 ) ) );
    public final void rule__DomainModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1231:1: ( ( ( ( rule__DomainModel__EntitiesAssignment_0 ) ) ( ( rule__DomainModel__EntitiesAssignment_0 )* ) ) | ( ( rule__DomainModel__SettingsAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKukulkan.g:1232:2: ( ( ( rule__DomainModel__EntitiesAssignment_0 ) ) ( ( rule__DomainModel__EntitiesAssignment_0 )* ) )
                    {
                    // InternalKukulkan.g:1232:2: ( ( ( rule__DomainModel__EntitiesAssignment_0 ) ) ( ( rule__DomainModel__EntitiesAssignment_0 )* ) )
                    // InternalKukulkan.g:1233:3: ( ( rule__DomainModel__EntitiesAssignment_0 ) ) ( ( rule__DomainModel__EntitiesAssignment_0 )* )
                    {
                    // InternalKukulkan.g:1233:3: ( ( rule__DomainModel__EntitiesAssignment_0 ) )
                    // InternalKukulkan.g:1234:4: ( rule__DomainModel__EntitiesAssignment_0 )
                    {
                     before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_0()); 
                    // InternalKukulkan.g:1235:4: ( rule__DomainModel__EntitiesAssignment_0 )
                    // InternalKukulkan.g:1235:5: rule__DomainModel__EntitiesAssignment_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DomainModel__EntitiesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_0()); 

                    }

                    // InternalKukulkan.g:1238:3: ( ( rule__DomainModel__EntitiesAssignment_0 )* )
                    // InternalKukulkan.g:1239:4: ( rule__DomainModel__EntitiesAssignment_0 )*
                    {
                     before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_0()); 
                    // InternalKukulkan.g:1240:4: ( rule__DomainModel__EntitiesAssignment_0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==32) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKukulkan.g:1240:5: rule__DomainModel__EntitiesAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__DomainModel__EntitiesAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1245:2: ( ( rule__DomainModel__SettingsAssignment_1 ) )
                    {
                    // InternalKukulkan.g:1245:2: ( ( rule__DomainModel__SettingsAssignment_1 ) )
                    // InternalKukulkan.g:1246:3: ( rule__DomainModel__SettingsAssignment_1 )
                    {
                     before(grammarAccess.getDomainModelAccess().getSettingsAssignment_1()); 
                    // InternalKukulkan.g:1247:3: ( rule__DomainModel__SettingsAssignment_1 )
                    // InternalKukulkan.g:1247:4: rule__DomainModel__SettingsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainModel__SettingsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelAccess().getSettingsAssignment_1()); 

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
    // $ANTLR end "rule__DomainModel__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalKukulkan.g:1255:1: rule__FieldType__Alternatives : ( ( rulestringFieldType ) | ( rulenumericFieldType ) | ( rulebooleanFieldType ) | ( ruledateFieldType ) | ( ruleblobFieldType ) | ( ruleentityType ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1259:1: ( ( rulestringFieldType ) | ( rulenumericFieldType ) | ( rulebooleanFieldType ) | ( ruledateFieldType ) | ( ruleblobFieldType ) | ( ruleentityType ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKukulkan.g:1260:2: ( rulestringFieldType )
                    {
                    // InternalKukulkan.g:1260:2: ( rulestringFieldType )
                    // InternalKukulkan.g:1261:3: rulestringFieldType
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
                    // InternalKukulkan.g:1266:2: ( rulenumericFieldType )
                    {
                    // InternalKukulkan.g:1266:2: ( rulenumericFieldType )
                    // InternalKukulkan.g:1267:3: rulenumericFieldType
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
                    // InternalKukulkan.g:1272:2: ( rulebooleanFieldType )
                    {
                    // InternalKukulkan.g:1272:2: ( rulebooleanFieldType )
                    // InternalKukulkan.g:1273:3: rulebooleanFieldType
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
                    // InternalKukulkan.g:1278:2: ( ruledateFieldType )
                    {
                    // InternalKukulkan.g:1278:2: ( ruledateFieldType )
                    // InternalKukulkan.g:1279:3: ruledateFieldType
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
                    // InternalKukulkan.g:1284:2: ( ruleblobFieldType )
                    {
                    // InternalKukulkan.g:1284:2: ( ruleblobFieldType )
                    // InternalKukulkan.g:1285:3: ruleblobFieldType
                    {
                     before(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleblobFieldType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalKukulkan.g:1290:2: ( ruleentityType )
                    {
                    // InternalKukulkan.g:1290:2: ( ruleentityType )
                    // InternalKukulkan.g:1291:3: ruleentityType
                    {
                     before(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleentityType();

                    state._fsp--;

                     after(grammarAccess.getFieldTypeAccess().getEntityTypeParserRuleCall_5()); 

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
    // InternalKukulkan.g:1300:1: rule__NumericTypes__Alternatives : ( ( ruleINTEGER ) | ( ruleLONG ) | ( ruleBIG_DECIMAL ) | ( ruleFLOAT ) | ( ruleDOUBLE ) );
    public final void rule__NumericTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1304:1: ( ( ruleINTEGER ) | ( ruleLONG ) | ( ruleBIG_DECIMAL ) | ( ruleFLOAT ) | ( ruleDOUBLE ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKukulkan.g:1305:2: ( ruleINTEGER )
                    {
                    // InternalKukulkan.g:1305:2: ( ruleINTEGER )
                    // InternalKukulkan.g:1306:3: ruleINTEGER
                    {
                     before(grammarAccess.getNumericTypesAccess().getINTEGERParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleINTEGER();

                    state._fsp--;

                     after(grammarAccess.getNumericTypesAccess().getINTEGERParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1311:2: ( ruleLONG )
                    {
                    // InternalKukulkan.g:1311:2: ( ruleLONG )
                    // InternalKukulkan.g:1312:3: ruleLONG
                    {
                     before(grammarAccess.getNumericTypesAccess().getLONGParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLONG();

                    state._fsp--;

                     after(grammarAccess.getNumericTypesAccess().getLONGParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1317:2: ( ruleBIG_DECIMAL )
                    {
                    // InternalKukulkan.g:1317:2: ( ruleBIG_DECIMAL )
                    // InternalKukulkan.g:1318:3: ruleBIG_DECIMAL
                    {
                     before(grammarAccess.getNumericTypesAccess().getBIG_DECIMALParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBIG_DECIMAL();

                    state._fsp--;

                     after(grammarAccess.getNumericTypesAccess().getBIG_DECIMALParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1323:2: ( ruleFLOAT )
                    {
                    // InternalKukulkan.g:1323:2: ( ruleFLOAT )
                    // InternalKukulkan.g:1324:3: ruleFLOAT
                    {
                     before(grammarAccess.getNumericTypesAccess().getFLOATParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getNumericTypesAccess().getFLOATParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalKukulkan.g:1329:2: ( ruleDOUBLE )
                    {
                    // InternalKukulkan.g:1329:2: ( ruleDOUBLE )
                    // InternalKukulkan.g:1330:3: ruleDOUBLE
                    {
                     before(grammarAccess.getNumericTypesAccess().getDOUBLEParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDOUBLE();

                    state._fsp--;

                     after(grammarAccess.getNumericTypesAccess().getDOUBLEParserRuleCall_4()); 

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
    // InternalKukulkan.g:1339:1: rule__DateTypes__Alternatives : ( ( ruleDATE ) | ( ruleLOCAL_DATE ) | ( ruleZONED_DATETIME ) | ( ruleINSTANT ) );
    public final void rule__DateTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1343:1: ( ( ruleDATE ) | ( ruleLOCAL_DATE ) | ( ruleZONED_DATETIME ) | ( ruleINSTANT ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
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
                    // InternalKukulkan.g:1344:2: ( ruleDATE )
                    {
                    // InternalKukulkan.g:1344:2: ( ruleDATE )
                    // InternalKukulkan.g:1345:3: ruleDATE
                    {
                     before(grammarAccess.getDateTypesAccess().getDATEParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDATE();

                    state._fsp--;

                     after(grammarAccess.getDateTypesAccess().getDATEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1350:2: ( ruleLOCAL_DATE )
                    {
                    // InternalKukulkan.g:1350:2: ( ruleLOCAL_DATE )
                    // InternalKukulkan.g:1351:3: ruleLOCAL_DATE
                    {
                     before(grammarAccess.getDateTypesAccess().getLOCAL_DATEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLOCAL_DATE();

                    state._fsp--;

                     after(grammarAccess.getDateTypesAccess().getLOCAL_DATEParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1356:2: ( ruleZONED_DATETIME )
                    {
                    // InternalKukulkan.g:1356:2: ( ruleZONED_DATETIME )
                    // InternalKukulkan.g:1357:3: ruleZONED_DATETIME
                    {
                     before(grammarAccess.getDateTypesAccess().getZONED_DATETIMEParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleZONED_DATETIME();

                    state._fsp--;

                     after(grammarAccess.getDateTypesAccess().getZONED_DATETIMEParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1362:2: ( ruleINSTANT )
                    {
                    // InternalKukulkan.g:1362:2: ( ruleINSTANT )
                    // InternalKukulkan.g:1363:3: ruleINSTANT
                    {
                     before(grammarAccess.getDateTypesAccess().getINSTANTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleINSTANT();

                    state._fsp--;

                     after(grammarAccess.getDateTypesAccess().getINSTANTParserRuleCall_3()); 

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
    // InternalKukulkan.g:1372:1: rule__BlobTypes__Alternatives : ( ( ruleBLOB ) | ( ruleANY_BLOB ) | ( ruleIMAGE_BLOB ) | ( ruleTEXT_BLOB ) );
    public final void rule__BlobTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1376:1: ( ( ruleBLOB ) | ( ruleANY_BLOB ) | ( ruleIMAGE_BLOB ) | ( ruleTEXT_BLOB ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
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
                    // InternalKukulkan.g:1377:2: ( ruleBLOB )
                    {
                    // InternalKukulkan.g:1377:2: ( ruleBLOB )
                    // InternalKukulkan.g:1378:3: ruleBLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getBLOBParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBLOB();

                    state._fsp--;

                     after(grammarAccess.getBlobTypesAccess().getBLOBParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKukulkan.g:1383:2: ( ruleANY_BLOB )
                    {
                    // InternalKukulkan.g:1383:2: ( ruleANY_BLOB )
                    // InternalKukulkan.g:1384:3: ruleANY_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getANY_BLOBParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleANY_BLOB();

                    state._fsp--;

                     after(grammarAccess.getBlobTypesAccess().getANY_BLOBParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalKukulkan.g:1389:2: ( ruleIMAGE_BLOB )
                    {
                    // InternalKukulkan.g:1389:2: ( ruleIMAGE_BLOB )
                    // InternalKukulkan.g:1390:3: ruleIMAGE_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getIMAGE_BLOBParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIMAGE_BLOB();

                    state._fsp--;

                     after(grammarAccess.getBlobTypesAccess().getIMAGE_BLOBParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalKukulkan.g:1395:2: ( ruleTEXT_BLOB )
                    {
                    // InternalKukulkan.g:1395:2: ( ruleTEXT_BLOB )
                    // InternalKukulkan.g:1396:3: ruleTEXT_BLOB
                    {
                     before(grammarAccess.getBlobTypesAccess().getTEXT_BLOBParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTEXT_BLOB();

                    state._fsp--;

                     after(grammarAccess.getBlobTypesAccess().getTEXT_BLOBParserRuleCall_3()); 

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
    // InternalKukulkan.g:1405:1: rule__StringValidators__Alternatives : ( ( ( rule__StringValidators__RequiredAssignment_0 ) ) | ( ( rule__StringValidators__MinLenghtAssignment_1 ) ) | ( ( rule__StringValidators__MaxLenghtAssignment_2 ) ) | ( ( rule__StringValidators__PatternAssignment_3 ) ) );
    public final void rule__StringValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1409:1: ( ( ( rule__StringValidators__RequiredAssignment_0 ) ) | ( ( rule__StringValidators__MinLenghtAssignment_1 ) ) | ( ( rule__StringValidators__MaxLenghtAssignment_2 ) ) | ( ( rule__StringValidators__PatternAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKukulkan.g:1410:2: ( ( rule__StringValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:1410:2: ( ( rule__StringValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:1411:3: ( rule__StringValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:1412:3: ( rule__StringValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:1412:4: rule__StringValidators__RequiredAssignment_0
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
                    // InternalKukulkan.g:1416:2: ( ( rule__StringValidators__MinLenghtAssignment_1 ) )
                    {
                    // InternalKukulkan.g:1416:2: ( ( rule__StringValidators__MinLenghtAssignment_1 ) )
                    // InternalKukulkan.g:1417:3: ( rule__StringValidators__MinLenghtAssignment_1 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getMinLenghtAssignment_1()); 
                    // InternalKukulkan.g:1418:3: ( rule__StringValidators__MinLenghtAssignment_1 )
                    // InternalKukulkan.g:1418:4: rule__StringValidators__MinLenghtAssignment_1
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
                    // InternalKukulkan.g:1422:2: ( ( rule__StringValidators__MaxLenghtAssignment_2 ) )
                    {
                    // InternalKukulkan.g:1422:2: ( ( rule__StringValidators__MaxLenghtAssignment_2 ) )
                    // InternalKukulkan.g:1423:3: ( rule__StringValidators__MaxLenghtAssignment_2 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getMaxLenghtAssignment_2()); 
                    // InternalKukulkan.g:1424:3: ( rule__StringValidators__MaxLenghtAssignment_2 )
                    // InternalKukulkan.g:1424:4: rule__StringValidators__MaxLenghtAssignment_2
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
                    // InternalKukulkan.g:1428:2: ( ( rule__StringValidators__PatternAssignment_3 ) )
                    {
                    // InternalKukulkan.g:1428:2: ( ( rule__StringValidators__PatternAssignment_3 ) )
                    // InternalKukulkan.g:1429:3: ( rule__StringValidators__PatternAssignment_3 )
                    {
                     before(grammarAccess.getStringValidatorsAccess().getPatternAssignment_3()); 
                    // InternalKukulkan.g:1430:3: ( rule__StringValidators__PatternAssignment_3 )
                    // InternalKukulkan.g:1430:4: rule__StringValidators__PatternAssignment_3
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
    // InternalKukulkan.g:1438:1: rule__NumericValidators__Alternatives : ( ( ( rule__NumericValidators__RequiredAssignment_0 ) ) | ( ( rule__NumericValidators__MinValueAssignment_1 ) ) | ( ( rule__NumericValidators__MaxValueAssignment_2 ) ) );
    public final void rule__NumericValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1442:1: ( ( ( rule__NumericValidators__RequiredAssignment_0 ) ) | ( ( rule__NumericValidators__MinValueAssignment_1 ) ) | ( ( rule__NumericValidators__MaxValueAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
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
                    // InternalKukulkan.g:1443:2: ( ( rule__NumericValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:1443:2: ( ( rule__NumericValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:1444:3: ( rule__NumericValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:1445:3: ( rule__NumericValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:1445:4: rule__NumericValidators__RequiredAssignment_0
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
                    // InternalKukulkan.g:1449:2: ( ( rule__NumericValidators__MinValueAssignment_1 ) )
                    {
                    // InternalKukulkan.g:1449:2: ( ( rule__NumericValidators__MinValueAssignment_1 ) )
                    // InternalKukulkan.g:1450:3: ( rule__NumericValidators__MinValueAssignment_1 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getMinValueAssignment_1()); 
                    // InternalKukulkan.g:1451:3: ( rule__NumericValidators__MinValueAssignment_1 )
                    // InternalKukulkan.g:1451:4: rule__NumericValidators__MinValueAssignment_1
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
                    // InternalKukulkan.g:1455:2: ( ( rule__NumericValidators__MaxValueAssignment_2 ) )
                    {
                    // InternalKukulkan.g:1455:2: ( ( rule__NumericValidators__MaxValueAssignment_2 ) )
                    // InternalKukulkan.g:1456:3: ( rule__NumericValidators__MaxValueAssignment_2 )
                    {
                     before(grammarAccess.getNumericValidatorsAccess().getMaxValueAssignment_2()); 
                    // InternalKukulkan.g:1457:3: ( rule__NumericValidators__MaxValueAssignment_2 )
                    // InternalKukulkan.g:1457:4: rule__NumericValidators__MaxValueAssignment_2
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
    // InternalKukulkan.g:1465:1: rule__BlobValidators__Alternatives : ( ( ( rule__BlobValidators__RequiredAssignment_0 ) ) | ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) ) | ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) ) );
    public final void rule__BlobValidators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1469:1: ( ( ( rule__BlobValidators__RequiredAssignment_0 ) ) | ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) ) | ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 43:
                {
                alt10=2;
                }
                break;
            case 44:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKukulkan.g:1470:2: ( ( rule__BlobValidators__RequiredAssignment_0 ) )
                    {
                    // InternalKukulkan.g:1470:2: ( ( rule__BlobValidators__RequiredAssignment_0 ) )
                    // InternalKukulkan.g:1471:3: ( rule__BlobValidators__RequiredAssignment_0 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getRequiredAssignment_0()); 
                    // InternalKukulkan.g:1472:3: ( rule__BlobValidators__RequiredAssignment_0 )
                    // InternalKukulkan.g:1472:4: rule__BlobValidators__RequiredAssignment_0
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
                    // InternalKukulkan.g:1476:2: ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) )
                    {
                    // InternalKukulkan.g:1476:2: ( ( rule__BlobValidators__MinBytesValueAssignment_1 ) )
                    // InternalKukulkan.g:1477:3: ( rule__BlobValidators__MinBytesValueAssignment_1 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getMinBytesValueAssignment_1()); 
                    // InternalKukulkan.g:1478:3: ( rule__BlobValidators__MinBytesValueAssignment_1 )
                    // InternalKukulkan.g:1478:4: rule__BlobValidators__MinBytesValueAssignment_1
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
                    // InternalKukulkan.g:1482:2: ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) )
                    {
                    // InternalKukulkan.g:1482:2: ( ( rule__BlobValidators__MaxBytesValueAssignment_2 ) )
                    // InternalKukulkan.g:1483:3: ( rule__BlobValidators__MaxBytesValueAssignment_2 )
                    {
                     before(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueAssignment_2()); 
                    // InternalKukulkan.g:1484:3: ( rule__BlobValidators__MaxBytesValueAssignment_2 )
                    // InternalKukulkan.g:1484:4: rule__BlobValidators__MaxBytesValueAssignment_2
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


    // $ANTLR start "rule__Entity__Group__0"
    // InternalKukulkan.g:1492:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1496:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalKukulkan.g:1497:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalKukulkan.g:1504:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1508:1: ( ( 'entity' ) )
            // InternalKukulkan.g:1509:1: ( 'entity' )
            {
            // InternalKukulkan.g:1509:1: ( 'entity' )
            // InternalKukulkan.g:1510:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // InternalKukulkan.g:1519:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1523:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalKukulkan.g:1524:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalKukulkan.g:1531:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1535:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalKukulkan.g:1536:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalKukulkan.g:1536:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalKukulkan.g:1537:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalKukulkan.g:1538:2: ( rule__Entity__NameAssignment_1 )
            // InternalKukulkan.g:1538:3: rule__Entity__NameAssignment_1
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
    // InternalKukulkan.g:1546:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1550:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalKukulkan.g:1551:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalKukulkan.g:1558:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1562:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalKukulkan.g:1563:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalKukulkan.g:1563:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalKukulkan.g:1564:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalKukulkan.g:1565:2: ( rule__Entity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKukulkan.g:1565:3: rule__Entity__Group_2__0
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
    // InternalKukulkan.g:1573:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1577:1: ( rule__Entity__Group__3__Impl )
            // InternalKukulkan.g:1578:2: rule__Entity__Group__3__Impl
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
    // InternalKukulkan.g:1584:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1588:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalKukulkan.g:1589:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalKukulkan.g:1589:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalKukulkan.g:1590:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalKukulkan.g:1591:2: ( rule__Entity__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKukulkan.g:1591:3: rule__Entity__Group_3__0
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
    // InternalKukulkan.g:1600:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1604:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalKukulkan.g:1605:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalKukulkan.g:1612:1: rule__Entity__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1616:1: ( ( '(' ) )
            // InternalKukulkan.g:1617:1: ( '(' )
            {
            // InternalKukulkan.g:1617:1: ( '(' )
            // InternalKukulkan.g:1618:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2_0()); 

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
    // InternalKukulkan.g:1627:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1631:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalKukulkan.g:1632:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalKukulkan.g:1639:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__TableNameAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1643:1: ( ( ( rule__Entity__TableNameAssignment_2_1 ) ) )
            // InternalKukulkan.g:1644:1: ( ( rule__Entity__TableNameAssignment_2_1 ) )
            {
            // InternalKukulkan.g:1644:1: ( ( rule__Entity__TableNameAssignment_2_1 ) )
            // InternalKukulkan.g:1645:2: ( rule__Entity__TableNameAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getTableNameAssignment_2_1()); 
            // InternalKukulkan.g:1646:2: ( rule__Entity__TableNameAssignment_2_1 )
            // InternalKukulkan.g:1646:3: rule__Entity__TableNameAssignment_2_1
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
    // InternalKukulkan.g:1654:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1658:1: ( rule__Entity__Group_2__2__Impl )
            // InternalKukulkan.g:1659:2: rule__Entity__Group_2__2__Impl
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
    // InternalKukulkan.g:1665:1: rule__Entity__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1669:1: ( ( ')' ) )
            // InternalKukulkan.g:1670:1: ( ')' )
            {
            // InternalKukulkan.g:1670:1: ( ')' )
            // InternalKukulkan.g:1671:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_2_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_2_2()); 

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
    // InternalKukulkan.g:1681:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1685:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalKukulkan.g:1686:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
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
    // InternalKukulkan.g:1693:1: rule__Entity__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1697:1: ( ( '{' ) )
            // InternalKukulkan.g:1698:1: ( '{' )
            {
            // InternalKukulkan.g:1698:1: ( '{' )
            // InternalKukulkan.g:1699:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // InternalKukulkan.g:1708:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1712:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalKukulkan.g:1713:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
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
    // InternalKukulkan.g:1720:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__Group_3_1__0 )? ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1724:1: ( ( ( rule__Entity__Group_3_1__0 )? ) )
            // InternalKukulkan.g:1725:1: ( ( rule__Entity__Group_3_1__0 )? )
            {
            // InternalKukulkan.g:1725:1: ( ( rule__Entity__Group_3_1__0 )? )
            // InternalKukulkan.g:1726:2: ( rule__Entity__Group_3_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3_1()); 
            // InternalKukulkan.g:1727:2: ( rule__Entity__Group_3_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKukulkan.g:1727:3: rule__Entity__Group_3_1__0
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
    // InternalKukulkan.g:1735:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1739:1: ( rule__Entity__Group_3__2__Impl )
            // InternalKukulkan.g:1740:2: rule__Entity__Group_3__2__Impl
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
    // InternalKukulkan.g:1746:1: rule__Entity__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1750:1: ( ( '}' ) )
            // InternalKukulkan.g:1751:1: ( '}' )
            {
            // InternalKukulkan.g:1751:1: ( '}' )
            // InternalKukulkan.g:1752:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_2()); 

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
    // InternalKukulkan.g:1762:1: rule__Entity__Group_3_1__0 : rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1 ;
    public final void rule__Entity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1766:1: ( rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1 )
            // InternalKukulkan.g:1767:2: rule__Entity__Group_3_1__0__Impl rule__Entity__Group_3_1__1
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
    // InternalKukulkan.g:1774:1: rule__Entity__Group_3_1__0__Impl : ( ( rule__Entity__FieldsAssignment_3_1_0 ) ) ;
    public final void rule__Entity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1778:1: ( ( ( rule__Entity__FieldsAssignment_3_1_0 ) ) )
            // InternalKukulkan.g:1779:1: ( ( rule__Entity__FieldsAssignment_3_1_0 ) )
            {
            // InternalKukulkan.g:1779:1: ( ( rule__Entity__FieldsAssignment_3_1_0 ) )
            // InternalKukulkan.g:1780:2: ( rule__Entity__FieldsAssignment_3_1_0 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_0()); 
            // InternalKukulkan.g:1781:2: ( rule__Entity__FieldsAssignment_3_1_0 )
            // InternalKukulkan.g:1781:3: rule__Entity__FieldsAssignment_3_1_0
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
    // InternalKukulkan.g:1789:1: rule__Entity__Group_3_1__1 : rule__Entity__Group_3_1__1__Impl ;
    public final void rule__Entity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1793:1: ( rule__Entity__Group_3_1__1__Impl )
            // InternalKukulkan.g:1794:2: rule__Entity__Group_3_1__1__Impl
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
    // InternalKukulkan.g:1800:1: rule__Entity__Group_3_1__1__Impl : ( ( rule__Entity__Group_3_1_1__0 )* ) ;
    public final void rule__Entity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1804:1: ( ( ( rule__Entity__Group_3_1_1__0 )* ) )
            // InternalKukulkan.g:1805:1: ( ( rule__Entity__Group_3_1_1__0 )* )
            {
            // InternalKukulkan.g:1805:1: ( ( rule__Entity__Group_3_1_1__0 )* )
            // InternalKukulkan.g:1806:2: ( rule__Entity__Group_3_1_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_1_1()); 
            // InternalKukulkan.g:1807:2: ( rule__Entity__Group_3_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKukulkan.g:1807:3: rule__Entity__Group_3_1_1__0
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
    // InternalKukulkan.g:1816:1: rule__Entity__Group_3_1_1__0 : rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1 ;
    public final void rule__Entity__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1820:1: ( rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1 )
            // InternalKukulkan.g:1821:2: rule__Entity__Group_3_1_1__0__Impl rule__Entity__Group_3_1_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalKukulkan.g:1828:1: rule__Entity__Group_3_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Entity__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1832:1: ( ( ( ',' )? ) )
            // InternalKukulkan.g:1833:1: ( ( ',' )? )
            {
            // InternalKukulkan.g:1833:1: ( ( ',' )? )
            // InternalKukulkan.g:1834:2: ( ',' )?
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_3_1_1_0()); 
            // InternalKukulkan.g:1835:2: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKukulkan.g:1835:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getCommaKeyword_3_1_1_0()); 

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
    // InternalKukulkan.g:1843:1: rule__Entity__Group_3_1_1__1 : rule__Entity__Group_3_1_1__1__Impl ;
    public final void rule__Entity__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1847:1: ( rule__Entity__Group_3_1_1__1__Impl )
            // InternalKukulkan.g:1848:2: rule__Entity__Group_3_1_1__1__Impl
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
    // InternalKukulkan.g:1854:1: rule__Entity__Group_3_1_1__1__Impl : ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) ) ;
    public final void rule__Entity__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1858:1: ( ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) ) )
            // InternalKukulkan.g:1859:1: ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) )
            {
            // InternalKukulkan.g:1859:1: ( ( rule__Entity__FieldsAssignment_3_1_1_1 ) )
            // InternalKukulkan.g:1860:2: ( rule__Entity__FieldsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_3_1_1_1()); 
            // InternalKukulkan.g:1861:2: ( rule__Entity__FieldsAssignment_3_1_1_1 )
            // InternalKukulkan.g:1861:3: rule__Entity__FieldsAssignment_3_1_1_1
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


    // $ANTLR start "rule__EntityField__Group__0"
    // InternalKukulkan.g:1870:1: rule__EntityField__Group__0 : rule__EntityField__Group__0__Impl rule__EntityField__Group__1 ;
    public final void rule__EntityField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1874:1: ( rule__EntityField__Group__0__Impl rule__EntityField__Group__1 )
            // InternalKukulkan.g:1875:2: rule__EntityField__Group__0__Impl rule__EntityField__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EntityField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityField__Group__1();

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
    // $ANTLR end "rule__EntityField__Group__0"


    // $ANTLR start "rule__EntityField__Group__0__Impl"
    // InternalKukulkan.g:1882:1: rule__EntityField__Group__0__Impl : ( ( rule__EntityField__IdAssignment_0 ) ) ;
    public final void rule__EntityField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1886:1: ( ( ( rule__EntityField__IdAssignment_0 ) ) )
            // InternalKukulkan.g:1887:1: ( ( rule__EntityField__IdAssignment_0 ) )
            {
            // InternalKukulkan.g:1887:1: ( ( rule__EntityField__IdAssignment_0 ) )
            // InternalKukulkan.g:1888:2: ( rule__EntityField__IdAssignment_0 )
            {
             before(grammarAccess.getEntityFieldAccess().getIdAssignment_0()); 
            // InternalKukulkan.g:1889:2: ( rule__EntityField__IdAssignment_0 )
            // InternalKukulkan.g:1889:3: rule__EntityField__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getIdAssignment_0()); 

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
    // $ANTLR end "rule__EntityField__Group__0__Impl"


    // $ANTLR start "rule__EntityField__Group__1"
    // InternalKukulkan.g:1897:1: rule__EntityField__Group__1 : rule__EntityField__Group__1__Impl ;
    public final void rule__EntityField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1901:1: ( rule__EntityField__Group__1__Impl )
            // InternalKukulkan.g:1902:2: rule__EntityField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__Group__1__Impl();

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
    // $ANTLR end "rule__EntityField__Group__1"


    // $ANTLR start "rule__EntityField__Group__1__Impl"
    // InternalKukulkan.g:1908:1: rule__EntityField__Group__1__Impl : ( ( rule__EntityField__TypeAssignment_1 ) ) ;
    public final void rule__EntityField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1912:1: ( ( ( rule__EntityField__TypeAssignment_1 ) ) )
            // InternalKukulkan.g:1913:1: ( ( rule__EntityField__TypeAssignment_1 ) )
            {
            // InternalKukulkan.g:1913:1: ( ( rule__EntityField__TypeAssignment_1 ) )
            // InternalKukulkan.g:1914:2: ( rule__EntityField__TypeAssignment_1 )
            {
             before(grammarAccess.getEntityFieldAccess().getTypeAssignment_1()); 
            // InternalKukulkan.g:1915:2: ( rule__EntityField__TypeAssignment_1 )
            // InternalKukulkan.g:1915:3: rule__EntityField__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityField__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFieldAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__EntityField__Group__1__Impl"


    // $ANTLR start "rule__StringFieldType__Group__0"
    // InternalKukulkan.g:1924:1: rule__StringFieldType__Group__0 : rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1 ;
    public final void rule__StringFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1928:1: ( rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1 )
            // InternalKukulkan.g:1929:2: rule__StringFieldType__Group__0__Impl rule__StringFieldType__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalKukulkan.g:1936:1: rule__StringFieldType__Group__0__Impl : ( ( rule__StringFieldType__NameAssignment_0 ) ) ;
    public final void rule__StringFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1940:1: ( ( ( rule__StringFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1941:1: ( ( rule__StringFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1941:1: ( ( rule__StringFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1942:2: ( rule__StringFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getStringFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1943:2: ( rule__StringFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1943:3: rule__StringFieldType__NameAssignment_0
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
    // InternalKukulkan.g:1951:1: rule__StringFieldType__Group__1 : rule__StringFieldType__Group__1__Impl ;
    public final void rule__StringFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1955:1: ( rule__StringFieldType__Group__1__Impl )
            // InternalKukulkan.g:1956:2: rule__StringFieldType__Group__1__Impl
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
    // InternalKukulkan.g:1962:1: rule__StringFieldType__Group__1__Impl : ( ( rule__StringFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__StringFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1966:1: ( ( ( rule__StringFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:1967:1: ( ( rule__StringFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:1967:1: ( ( rule__StringFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:1968:2: ( rule__StringFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getStringFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:1969:2: ( rule__StringFieldType__ConstraintsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26||(LA16_0>=38 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKukulkan.g:1969:3: rule__StringFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalKukulkan.g:1978:1: rule__NumericFieldType__Group__0 : rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1 ;
    public final void rule__NumericFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1982:1: ( rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1 )
            // InternalKukulkan.g:1983:2: rule__NumericFieldType__Group__0__Impl rule__NumericFieldType__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKukulkan.g:1990:1: rule__NumericFieldType__Group__0__Impl : ( ( rule__NumericFieldType__NameAssignment_0 ) ) ;
    public final void rule__NumericFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:1994:1: ( ( ( rule__NumericFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:1995:1: ( ( rule__NumericFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:1995:1: ( ( rule__NumericFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:1996:2: ( rule__NumericFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getNumericFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:1997:2: ( rule__NumericFieldType__NameAssignment_0 )
            // InternalKukulkan.g:1997:3: rule__NumericFieldType__NameAssignment_0
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
    // InternalKukulkan.g:2005:1: rule__NumericFieldType__Group__1 : rule__NumericFieldType__Group__1__Impl ;
    public final void rule__NumericFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2009:1: ( rule__NumericFieldType__Group__1__Impl )
            // InternalKukulkan.g:2010:2: rule__NumericFieldType__Group__1__Impl
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
    // InternalKukulkan.g:2016:1: rule__NumericFieldType__Group__1__Impl : ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__NumericFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2020:1: ( ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:2021:1: ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:2021:1: ( ( rule__NumericFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:2022:2: ( rule__NumericFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getNumericFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:2023:2: ( rule__NumericFieldType__ConstraintsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26||(LA17_0>=41 && LA17_0<=42)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKukulkan.g:2023:3: rule__NumericFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalKukulkan.g:2032:1: rule__BooleanFieldType__Group__0 : rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1 ;
    public final void rule__BooleanFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2036:1: ( rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1 )
            // InternalKukulkan.g:2037:2: rule__BooleanFieldType__Group__0__Impl rule__BooleanFieldType__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalKukulkan.g:2044:1: rule__BooleanFieldType__Group__0__Impl : ( ( rule__BooleanFieldType__NameAssignment_0 ) ) ;
    public final void rule__BooleanFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2048:1: ( ( ( rule__BooleanFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:2049:1: ( ( rule__BooleanFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:2049:1: ( ( rule__BooleanFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:2050:2: ( rule__BooleanFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:2051:2: ( rule__BooleanFieldType__NameAssignment_0 )
            // InternalKukulkan.g:2051:3: rule__BooleanFieldType__NameAssignment_0
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
    // InternalKukulkan.g:2059:1: rule__BooleanFieldType__Group__1 : rule__BooleanFieldType__Group__1__Impl ;
    public final void rule__BooleanFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2063:1: ( rule__BooleanFieldType__Group__1__Impl )
            // InternalKukulkan.g:2064:2: rule__BooleanFieldType__Group__1__Impl
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
    // InternalKukulkan.g:2070:1: rule__BooleanFieldType__Group__1__Impl : ( ( rule__BooleanFieldType__RequiredAssignment_1 )* ) ;
    public final void rule__BooleanFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2074:1: ( ( ( rule__BooleanFieldType__RequiredAssignment_1 )* ) )
            // InternalKukulkan.g:2075:1: ( ( rule__BooleanFieldType__RequiredAssignment_1 )* )
            {
            // InternalKukulkan.g:2075:1: ( ( rule__BooleanFieldType__RequiredAssignment_1 )* )
            // InternalKukulkan.g:2076:2: ( rule__BooleanFieldType__RequiredAssignment_1 )*
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getRequiredAssignment_1()); 
            // InternalKukulkan.g:2077:2: ( rule__BooleanFieldType__RequiredAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKukulkan.g:2077:3: rule__BooleanFieldType__RequiredAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__BooleanFieldType__RequiredAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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
    // InternalKukulkan.g:2086:1: rule__DateFieldType__Group__0 : rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1 ;
    public final void rule__DateFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2090:1: ( rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1 )
            // InternalKukulkan.g:2091:2: rule__DateFieldType__Group__0__Impl rule__DateFieldType__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalKukulkan.g:2098:1: rule__DateFieldType__Group__0__Impl : ( ( rule__DateFieldType__TypeAssignment_0 ) ) ;
    public final void rule__DateFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2102:1: ( ( ( rule__DateFieldType__TypeAssignment_0 ) ) )
            // InternalKukulkan.g:2103:1: ( ( rule__DateFieldType__TypeAssignment_0 ) )
            {
            // InternalKukulkan.g:2103:1: ( ( rule__DateFieldType__TypeAssignment_0 ) )
            // InternalKukulkan.g:2104:2: ( rule__DateFieldType__TypeAssignment_0 )
            {
             before(grammarAccess.getDateFieldTypeAccess().getTypeAssignment_0()); 
            // InternalKukulkan.g:2105:2: ( rule__DateFieldType__TypeAssignment_0 )
            // InternalKukulkan.g:2105:3: rule__DateFieldType__TypeAssignment_0
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
    // InternalKukulkan.g:2113:1: rule__DateFieldType__Group__1 : rule__DateFieldType__Group__1__Impl ;
    public final void rule__DateFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2117:1: ( rule__DateFieldType__Group__1__Impl )
            // InternalKukulkan.g:2118:2: rule__DateFieldType__Group__1__Impl
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
    // InternalKukulkan.g:2124:1: rule__DateFieldType__Group__1__Impl : ( ( rule__DateFieldType__RequiredAssignment_1 )? ) ;
    public final void rule__DateFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2128:1: ( ( ( rule__DateFieldType__RequiredAssignment_1 )? ) )
            // InternalKukulkan.g:2129:1: ( ( rule__DateFieldType__RequiredAssignment_1 )? )
            {
            // InternalKukulkan.g:2129:1: ( ( rule__DateFieldType__RequiredAssignment_1 )? )
            // InternalKukulkan.g:2130:2: ( rule__DateFieldType__RequiredAssignment_1 )?
            {
             before(grammarAccess.getDateFieldTypeAccess().getRequiredAssignment_1()); 
            // InternalKukulkan.g:2131:2: ( rule__DateFieldType__RequiredAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKukulkan.g:2131:3: rule__DateFieldType__RequiredAssignment_1
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
    // InternalKukulkan.g:2140:1: rule__BlobFieldType__Group__0 : rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1 ;
    public final void rule__BlobFieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2144:1: ( rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1 )
            // InternalKukulkan.g:2145:2: rule__BlobFieldType__Group__0__Impl rule__BlobFieldType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalKukulkan.g:2152:1: rule__BlobFieldType__Group__0__Impl : ( ( rule__BlobFieldType__NameAssignment_0 ) ) ;
    public final void rule__BlobFieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2156:1: ( ( ( rule__BlobFieldType__NameAssignment_0 ) ) )
            // InternalKukulkan.g:2157:1: ( ( rule__BlobFieldType__NameAssignment_0 ) )
            {
            // InternalKukulkan.g:2157:1: ( ( rule__BlobFieldType__NameAssignment_0 ) )
            // InternalKukulkan.g:2158:2: ( rule__BlobFieldType__NameAssignment_0 )
            {
             before(grammarAccess.getBlobFieldTypeAccess().getNameAssignment_0()); 
            // InternalKukulkan.g:2159:2: ( rule__BlobFieldType__NameAssignment_0 )
            // InternalKukulkan.g:2159:3: rule__BlobFieldType__NameAssignment_0
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
    // InternalKukulkan.g:2167:1: rule__BlobFieldType__Group__1 : rule__BlobFieldType__Group__1__Impl ;
    public final void rule__BlobFieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2171:1: ( rule__BlobFieldType__Group__1__Impl )
            // InternalKukulkan.g:2172:2: rule__BlobFieldType__Group__1__Impl
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
    // InternalKukulkan.g:2178:1: rule__BlobFieldType__Group__1__Impl : ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* ) ;
    public final void rule__BlobFieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2182:1: ( ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* ) )
            // InternalKukulkan.g:2183:1: ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* )
            {
            // InternalKukulkan.g:2183:1: ( ( rule__BlobFieldType__ConstraintsAssignment_1 )* )
            // InternalKukulkan.g:2184:2: ( rule__BlobFieldType__ConstraintsAssignment_1 )*
            {
             before(grammarAccess.getBlobFieldTypeAccess().getConstraintsAssignment_1()); 
            // InternalKukulkan.g:2185:2: ( rule__BlobFieldType__ConstraintsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||(LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKukulkan.g:2185:3: rule__BlobFieldType__ConstraintsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
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


    // $ANTLR start "rule__MinLengthValidator__Group__0"
    // InternalKukulkan.g:2194:1: rule__MinLengthValidator__Group__0 : rule__MinLengthValidator__Group__0__Impl rule__MinLengthValidator__Group__1 ;
    public final void rule__MinLengthValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2198:1: ( rule__MinLengthValidator__Group__0__Impl rule__MinLengthValidator__Group__1 )
            // InternalKukulkan.g:2199:2: rule__MinLengthValidator__Group__0__Impl rule__MinLengthValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MinLengthValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLengthValidator__Group__1();

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
    // $ANTLR end "rule__MinLengthValidator__Group__0"


    // $ANTLR start "rule__MinLengthValidator__Group__0__Impl"
    // InternalKukulkan.g:2206:1: rule__MinLengthValidator__Group__0__Impl : ( 'minlength' ) ;
    public final void rule__MinLengthValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2210:1: ( ( 'minlength' ) )
            // InternalKukulkan.g:2211:1: ( 'minlength' )
            {
            // InternalKukulkan.g:2211:1: ( 'minlength' )
            // InternalKukulkan.g:2212:2: 'minlength'
            {
             before(grammarAccess.getMinLengthValidatorAccess().getMinlengthKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinLengthValidatorAccess().getMinlengthKeyword_0()); 

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
    // $ANTLR end "rule__MinLengthValidator__Group__0__Impl"


    // $ANTLR start "rule__MinLengthValidator__Group__1"
    // InternalKukulkan.g:2221:1: rule__MinLengthValidator__Group__1 : rule__MinLengthValidator__Group__1__Impl rule__MinLengthValidator__Group__2 ;
    public final void rule__MinLengthValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2225:1: ( rule__MinLengthValidator__Group__1__Impl rule__MinLengthValidator__Group__2 )
            // InternalKukulkan.g:2226:2: rule__MinLengthValidator__Group__1__Impl rule__MinLengthValidator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MinLengthValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLengthValidator__Group__2();

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
    // $ANTLR end "rule__MinLengthValidator__Group__1"


    // $ANTLR start "rule__MinLengthValidator__Group__1__Impl"
    // InternalKukulkan.g:2233:1: rule__MinLengthValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MinLengthValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2237:1: ( ( '(' ) )
            // InternalKukulkan.g:2238:1: ( '(' )
            {
            // InternalKukulkan.g:2238:1: ( '(' )
            // InternalKukulkan.g:2239:2: '('
            {
             before(grammarAccess.getMinLengthValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMinLengthValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MinLengthValidator__Group__1__Impl"


    // $ANTLR start "rule__MinLengthValidator__Group__2"
    // InternalKukulkan.g:2248:1: rule__MinLengthValidator__Group__2 : rule__MinLengthValidator__Group__2__Impl rule__MinLengthValidator__Group__3 ;
    public final void rule__MinLengthValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2252:1: ( rule__MinLengthValidator__Group__2__Impl rule__MinLengthValidator__Group__3 )
            // InternalKukulkan.g:2253:2: rule__MinLengthValidator__Group__2__Impl rule__MinLengthValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MinLengthValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLengthValidator__Group__3();

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
    // $ANTLR end "rule__MinLengthValidator__Group__2"


    // $ANTLR start "rule__MinLengthValidator__Group__2__Impl"
    // InternalKukulkan.g:2260:1: rule__MinLengthValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MinLengthValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2264:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2265:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2265:1: ( RULE_INT )
            // InternalKukulkan.g:2266:2: RULE_INT
            {
             before(grammarAccess.getMinLengthValidatorAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinLengthValidatorAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__MinLengthValidator__Group__2__Impl"


    // $ANTLR start "rule__MinLengthValidator__Group__3"
    // InternalKukulkan.g:2275:1: rule__MinLengthValidator__Group__3 : rule__MinLengthValidator__Group__3__Impl ;
    public final void rule__MinLengthValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2279:1: ( rule__MinLengthValidator__Group__3__Impl )
            // InternalKukulkan.g:2280:2: rule__MinLengthValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinLengthValidator__Group__3__Impl();

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
    // $ANTLR end "rule__MinLengthValidator__Group__3"


    // $ANTLR start "rule__MinLengthValidator__Group__3__Impl"
    // InternalKukulkan.g:2286:1: rule__MinLengthValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MinLengthValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2290:1: ( ( ')' ) )
            // InternalKukulkan.g:2291:1: ( ')' )
            {
            // InternalKukulkan.g:2291:1: ( ')' )
            // InternalKukulkan.g:2292:2: ')'
            {
             before(grammarAccess.getMinLengthValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMinLengthValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MinLengthValidator__Group__3__Impl"


    // $ANTLR start "rule__MaxLengthValidator__Group__0"
    // InternalKukulkan.g:2302:1: rule__MaxLengthValidator__Group__0 : rule__MaxLengthValidator__Group__0__Impl rule__MaxLengthValidator__Group__1 ;
    public final void rule__MaxLengthValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2306:1: ( rule__MaxLengthValidator__Group__0__Impl rule__MaxLengthValidator__Group__1 )
            // InternalKukulkan.g:2307:2: rule__MaxLengthValidator__Group__0__Impl rule__MaxLengthValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MaxLengthValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLengthValidator__Group__1();

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
    // $ANTLR end "rule__MaxLengthValidator__Group__0"


    // $ANTLR start "rule__MaxLengthValidator__Group__0__Impl"
    // InternalKukulkan.g:2314:1: rule__MaxLengthValidator__Group__0__Impl : ( 'maxlength' ) ;
    public final void rule__MaxLengthValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2318:1: ( ( 'maxlength' ) )
            // InternalKukulkan.g:2319:1: ( 'maxlength' )
            {
            // InternalKukulkan.g:2319:1: ( 'maxlength' )
            // InternalKukulkan.g:2320:2: 'maxlength'
            {
             before(grammarAccess.getMaxLengthValidatorAccess().getMaxlengthKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMaxLengthValidatorAccess().getMaxlengthKeyword_0()); 

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
    // $ANTLR end "rule__MaxLengthValidator__Group__0__Impl"


    // $ANTLR start "rule__MaxLengthValidator__Group__1"
    // InternalKukulkan.g:2329:1: rule__MaxLengthValidator__Group__1 : rule__MaxLengthValidator__Group__1__Impl rule__MaxLengthValidator__Group__2 ;
    public final void rule__MaxLengthValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2333:1: ( rule__MaxLengthValidator__Group__1__Impl rule__MaxLengthValidator__Group__2 )
            // InternalKukulkan.g:2334:2: rule__MaxLengthValidator__Group__1__Impl rule__MaxLengthValidator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MaxLengthValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLengthValidator__Group__2();

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
    // $ANTLR end "rule__MaxLengthValidator__Group__1"


    // $ANTLR start "rule__MaxLengthValidator__Group__1__Impl"
    // InternalKukulkan.g:2341:1: rule__MaxLengthValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MaxLengthValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2345:1: ( ( '(' ) )
            // InternalKukulkan.g:2346:1: ( '(' )
            {
            // InternalKukulkan.g:2346:1: ( '(' )
            // InternalKukulkan.g:2347:2: '('
            {
             before(grammarAccess.getMaxLengthValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMaxLengthValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MaxLengthValidator__Group__1__Impl"


    // $ANTLR start "rule__MaxLengthValidator__Group__2"
    // InternalKukulkan.g:2356:1: rule__MaxLengthValidator__Group__2 : rule__MaxLengthValidator__Group__2__Impl rule__MaxLengthValidator__Group__3 ;
    public final void rule__MaxLengthValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2360:1: ( rule__MaxLengthValidator__Group__2__Impl rule__MaxLengthValidator__Group__3 )
            // InternalKukulkan.g:2361:2: rule__MaxLengthValidator__Group__2__Impl rule__MaxLengthValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MaxLengthValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLengthValidator__Group__3();

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
    // $ANTLR end "rule__MaxLengthValidator__Group__2"


    // $ANTLR start "rule__MaxLengthValidator__Group__2__Impl"
    // InternalKukulkan.g:2368:1: rule__MaxLengthValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MaxLengthValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2372:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2373:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2373:1: ( RULE_INT )
            // InternalKukulkan.g:2374:2: RULE_INT
            {
             before(grammarAccess.getMaxLengthValidatorAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxLengthValidatorAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__MaxLengthValidator__Group__2__Impl"


    // $ANTLR start "rule__MaxLengthValidator__Group__3"
    // InternalKukulkan.g:2383:1: rule__MaxLengthValidator__Group__3 : rule__MaxLengthValidator__Group__3__Impl ;
    public final void rule__MaxLengthValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2387:1: ( rule__MaxLengthValidator__Group__3__Impl )
            // InternalKukulkan.g:2388:2: rule__MaxLengthValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxLengthValidator__Group__3__Impl();

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
    // $ANTLR end "rule__MaxLengthValidator__Group__3"


    // $ANTLR start "rule__MaxLengthValidator__Group__3__Impl"
    // InternalKukulkan.g:2394:1: rule__MaxLengthValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MaxLengthValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2398:1: ( ( ')' ) )
            // InternalKukulkan.g:2399:1: ( ')' )
            {
            // InternalKukulkan.g:2399:1: ( ')' )
            // InternalKukulkan.g:2400:2: ')'
            {
             before(grammarAccess.getMaxLengthValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMaxLengthValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MaxLengthValidator__Group__3__Impl"


    // $ANTLR start "rule__PatternValidator__Group__0"
    // InternalKukulkan.g:2410:1: rule__PatternValidator__Group__0 : rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1 ;
    public final void rule__PatternValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2414:1: ( rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1 )
            // InternalKukulkan.g:2415:2: rule__PatternValidator__Group__0__Impl rule__PatternValidator__Group__1
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
    // InternalKukulkan.g:2422:1: rule__PatternValidator__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__PatternValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2426:1: ( ( 'pattern' ) )
            // InternalKukulkan.g:2427:1: ( 'pattern' )
            {
            // InternalKukulkan.g:2427:1: ( 'pattern' )
            // InternalKukulkan.g:2428:2: 'pattern'
            {
             before(grammarAccess.getPatternValidatorAccess().getPatternKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getPatternKeyword_0()); 

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
    // InternalKukulkan.g:2437:1: rule__PatternValidator__Group__1 : rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2 ;
    public final void rule__PatternValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2441:1: ( rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2 )
            // InternalKukulkan.g:2442:2: rule__PatternValidator__Group__1__Impl rule__PatternValidator__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalKukulkan.g:2449:1: rule__PatternValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__PatternValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2453:1: ( ( '(' ) )
            // InternalKukulkan.g:2454:1: ( '(' )
            {
            // InternalKukulkan.g:2454:1: ( '(' )
            // InternalKukulkan.g:2455:2: '('
            {
             before(grammarAccess.getPatternValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalKukulkan.g:2464:1: rule__PatternValidator__Group__2 : rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3 ;
    public final void rule__PatternValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2468:1: ( rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3 )
            // InternalKukulkan.g:2469:2: rule__PatternValidator__Group__2__Impl rule__PatternValidator__Group__3
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
    // InternalKukulkan.g:2476:1: rule__PatternValidator__Group__2__Impl : ( rulePATTERN_VALUE ) ;
    public final void rule__PatternValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2480:1: ( ( rulePATTERN_VALUE ) )
            // InternalKukulkan.g:2481:1: ( rulePATTERN_VALUE )
            {
            // InternalKukulkan.g:2481:1: ( rulePATTERN_VALUE )
            // InternalKukulkan.g:2482:2: rulePATTERN_VALUE
            {
             before(grammarAccess.getPatternValidatorAccess().getPATTERN_VALUEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            rulePATTERN_VALUE();

            state._fsp--;

             after(grammarAccess.getPatternValidatorAccess().getPATTERN_VALUEParserRuleCall_2()); 

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
    // InternalKukulkan.g:2491:1: rule__PatternValidator__Group__3 : rule__PatternValidator__Group__3__Impl ;
    public final void rule__PatternValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2495:1: ( rule__PatternValidator__Group__3__Impl )
            // InternalKukulkan.g:2496:2: rule__PatternValidator__Group__3__Impl
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
    // InternalKukulkan.g:2502:1: rule__PatternValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__PatternValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2506:1: ( ( ')' ) )
            // InternalKukulkan.g:2507:1: ( ')' )
            {
            // InternalKukulkan.g:2507:1: ( ')' )
            // InternalKukulkan.g:2508:2: ')'
            {
             before(grammarAccess.getPatternValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatternValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // InternalKukulkan.g:2518:1: rule__MinValidator__Group__0 : rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1 ;
    public final void rule__MinValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2522:1: ( rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1 )
            // InternalKukulkan.g:2523:2: rule__MinValidator__Group__0__Impl rule__MinValidator__Group__1
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
    // InternalKukulkan.g:2530:1: rule__MinValidator__Group__0__Impl : ( 'min' ) ;
    public final void rule__MinValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2534:1: ( ( 'min' ) )
            // InternalKukulkan.g:2535:1: ( 'min' )
            {
            // InternalKukulkan.g:2535:1: ( 'min' )
            // InternalKukulkan.g:2536:2: 'min'
            {
             before(grammarAccess.getMinValidatorAccess().getMinKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getMinKeyword_0()); 

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
    // InternalKukulkan.g:2545:1: rule__MinValidator__Group__1 : rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2 ;
    public final void rule__MinValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2549:1: ( rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2 )
            // InternalKukulkan.g:2550:2: rule__MinValidator__Group__1__Impl rule__MinValidator__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalKukulkan.g:2557:1: rule__MinValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MinValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2561:1: ( ( '(' ) )
            // InternalKukulkan.g:2562:1: ( '(' )
            {
            // InternalKukulkan.g:2562:1: ( '(' )
            // InternalKukulkan.g:2563:2: '('
            {
             before(grammarAccess.getMinValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalKukulkan.g:2572:1: rule__MinValidator__Group__2 : rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3 ;
    public final void rule__MinValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2576:1: ( rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3 )
            // InternalKukulkan.g:2577:2: rule__MinValidator__Group__2__Impl rule__MinValidator__Group__3
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
    // InternalKukulkan.g:2584:1: rule__MinValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MinValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2588:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2589:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2589:1: ( RULE_INT )
            // InternalKukulkan.g:2590:2: RULE_INT
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
    // InternalKukulkan.g:2599:1: rule__MinValidator__Group__3 : rule__MinValidator__Group__3__Impl ;
    public final void rule__MinValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2603:1: ( rule__MinValidator__Group__3__Impl )
            // InternalKukulkan.g:2604:2: rule__MinValidator__Group__3__Impl
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
    // InternalKukulkan.g:2610:1: rule__MinValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MinValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2614:1: ( ( ')' ) )
            // InternalKukulkan.g:2615:1: ( ')' )
            {
            // InternalKukulkan.g:2615:1: ( ')' )
            // InternalKukulkan.g:2616:2: ')'
            {
             before(grammarAccess.getMinValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMinValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // InternalKukulkan.g:2626:1: rule__MaxValidator__Group__0 : rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1 ;
    public final void rule__MaxValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2630:1: ( rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1 )
            // InternalKukulkan.g:2631:2: rule__MaxValidator__Group__0__Impl rule__MaxValidator__Group__1
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
    // InternalKukulkan.g:2638:1: rule__MaxValidator__Group__0__Impl : ( 'max' ) ;
    public final void rule__MaxValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2642:1: ( ( 'max' ) )
            // InternalKukulkan.g:2643:1: ( 'max' )
            {
            // InternalKukulkan.g:2643:1: ( 'max' )
            // InternalKukulkan.g:2644:2: 'max'
            {
             before(grammarAccess.getMaxValidatorAccess().getMaxKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getMaxKeyword_0()); 

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
    // InternalKukulkan.g:2653:1: rule__MaxValidator__Group__1 : rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2 ;
    public final void rule__MaxValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2657:1: ( rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2 )
            // InternalKukulkan.g:2658:2: rule__MaxValidator__Group__1__Impl rule__MaxValidator__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalKukulkan.g:2665:1: rule__MaxValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MaxValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2669:1: ( ( '(' ) )
            // InternalKukulkan.g:2670:1: ( '(' )
            {
            // InternalKukulkan.g:2670:1: ( '(' )
            // InternalKukulkan.g:2671:2: '('
            {
             before(grammarAccess.getMaxValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalKukulkan.g:2680:1: rule__MaxValidator__Group__2 : rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3 ;
    public final void rule__MaxValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2684:1: ( rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3 )
            // InternalKukulkan.g:2685:2: rule__MaxValidator__Group__2__Impl rule__MaxValidator__Group__3
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
    // InternalKukulkan.g:2692:1: rule__MaxValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MaxValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2696:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2697:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2697:1: ( RULE_INT )
            // InternalKukulkan.g:2698:2: RULE_INT
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
    // InternalKukulkan.g:2707:1: rule__MaxValidator__Group__3 : rule__MaxValidator__Group__3__Impl ;
    public final void rule__MaxValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2711:1: ( rule__MaxValidator__Group__3__Impl )
            // InternalKukulkan.g:2712:2: rule__MaxValidator__Group__3__Impl
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
    // InternalKukulkan.g:2718:1: rule__MaxValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MaxValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2722:1: ( ( ')' ) )
            // InternalKukulkan.g:2723:1: ( ')' )
            {
            // InternalKukulkan.g:2723:1: ( ')' )
            // InternalKukulkan.g:2724:2: ')'
            {
             before(grammarAccess.getMaxValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMaxValidatorAccess().getRightParenthesisKeyword_3()); 

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


    // $ANTLR start "rule__MinBytesValidator__Group__0"
    // InternalKukulkan.g:2734:1: rule__MinBytesValidator__Group__0 : rule__MinBytesValidator__Group__0__Impl rule__MinBytesValidator__Group__1 ;
    public final void rule__MinBytesValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2738:1: ( rule__MinBytesValidator__Group__0__Impl rule__MinBytesValidator__Group__1 )
            // InternalKukulkan.g:2739:2: rule__MinBytesValidator__Group__0__Impl rule__MinBytesValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MinBytesValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinBytesValidator__Group__1();

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
    // $ANTLR end "rule__MinBytesValidator__Group__0"


    // $ANTLR start "rule__MinBytesValidator__Group__0__Impl"
    // InternalKukulkan.g:2746:1: rule__MinBytesValidator__Group__0__Impl : ( 'minbytes' ) ;
    public final void rule__MinBytesValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2750:1: ( ( 'minbytes' ) )
            // InternalKukulkan.g:2751:1: ( 'minbytes' )
            {
            // InternalKukulkan.g:2751:1: ( 'minbytes' )
            // InternalKukulkan.g:2752:2: 'minbytes'
            {
             before(grammarAccess.getMinBytesValidatorAccess().getMinbytesKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMinBytesValidatorAccess().getMinbytesKeyword_0()); 

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
    // $ANTLR end "rule__MinBytesValidator__Group__0__Impl"


    // $ANTLR start "rule__MinBytesValidator__Group__1"
    // InternalKukulkan.g:2761:1: rule__MinBytesValidator__Group__1 : rule__MinBytesValidator__Group__1__Impl rule__MinBytesValidator__Group__2 ;
    public final void rule__MinBytesValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2765:1: ( rule__MinBytesValidator__Group__1__Impl rule__MinBytesValidator__Group__2 )
            // InternalKukulkan.g:2766:2: rule__MinBytesValidator__Group__1__Impl rule__MinBytesValidator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MinBytesValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinBytesValidator__Group__2();

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
    // $ANTLR end "rule__MinBytesValidator__Group__1"


    // $ANTLR start "rule__MinBytesValidator__Group__1__Impl"
    // InternalKukulkan.g:2773:1: rule__MinBytesValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MinBytesValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2777:1: ( ( '(' ) )
            // InternalKukulkan.g:2778:1: ( '(' )
            {
            // InternalKukulkan.g:2778:1: ( '(' )
            // InternalKukulkan.g:2779:2: '('
            {
             before(grammarAccess.getMinBytesValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMinBytesValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MinBytesValidator__Group__1__Impl"


    // $ANTLR start "rule__MinBytesValidator__Group__2"
    // InternalKukulkan.g:2788:1: rule__MinBytesValidator__Group__2 : rule__MinBytesValidator__Group__2__Impl rule__MinBytesValidator__Group__3 ;
    public final void rule__MinBytesValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2792:1: ( rule__MinBytesValidator__Group__2__Impl rule__MinBytesValidator__Group__3 )
            // InternalKukulkan.g:2793:2: rule__MinBytesValidator__Group__2__Impl rule__MinBytesValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MinBytesValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinBytesValidator__Group__3();

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
    // $ANTLR end "rule__MinBytesValidator__Group__2"


    // $ANTLR start "rule__MinBytesValidator__Group__2__Impl"
    // InternalKukulkan.g:2800:1: rule__MinBytesValidator__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__MinBytesValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2804:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:2805:1: ( RULE_INT )
            {
            // InternalKukulkan.g:2805:1: ( RULE_INT )
            // InternalKukulkan.g:2806:2: RULE_INT
            {
             before(grammarAccess.getMinBytesValidatorAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMinBytesValidatorAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__MinBytesValidator__Group__2__Impl"


    // $ANTLR start "rule__MinBytesValidator__Group__3"
    // InternalKukulkan.g:2815:1: rule__MinBytesValidator__Group__3 : rule__MinBytesValidator__Group__3__Impl ;
    public final void rule__MinBytesValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2819:1: ( rule__MinBytesValidator__Group__3__Impl )
            // InternalKukulkan.g:2820:2: rule__MinBytesValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinBytesValidator__Group__3__Impl();

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
    // $ANTLR end "rule__MinBytesValidator__Group__3"


    // $ANTLR start "rule__MinBytesValidator__Group__3__Impl"
    // InternalKukulkan.g:2826:1: rule__MinBytesValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MinBytesValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2830:1: ( ( ')' ) )
            // InternalKukulkan.g:2831:1: ( ')' )
            {
            // InternalKukulkan.g:2831:1: ( ')' )
            // InternalKukulkan.g:2832:2: ')'
            {
             before(grammarAccess.getMinBytesValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMinBytesValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MinBytesValidator__Group__3__Impl"


    // $ANTLR start "rule__MaxBytesValidator__Group__0"
    // InternalKukulkan.g:2842:1: rule__MaxBytesValidator__Group__0 : rule__MaxBytesValidator__Group__0__Impl rule__MaxBytesValidator__Group__1 ;
    public final void rule__MaxBytesValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2846:1: ( rule__MaxBytesValidator__Group__0__Impl rule__MaxBytesValidator__Group__1 )
            // InternalKukulkan.g:2847:2: rule__MaxBytesValidator__Group__0__Impl rule__MaxBytesValidator__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MaxBytesValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__Group__1();

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
    // $ANTLR end "rule__MaxBytesValidator__Group__0"


    // $ANTLR start "rule__MaxBytesValidator__Group__0__Impl"
    // InternalKukulkan.g:2854:1: rule__MaxBytesValidator__Group__0__Impl : ( 'maxbytes' ) ;
    public final void rule__MaxBytesValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2858:1: ( ( 'maxbytes' ) )
            // InternalKukulkan.g:2859:1: ( 'maxbytes' )
            {
            // InternalKukulkan.g:2859:1: ( 'maxbytes' )
            // InternalKukulkan.g:2860:2: 'maxbytes'
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getMaxbytesKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMaxBytesValidatorAccess().getMaxbytesKeyword_0()); 

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
    // $ANTLR end "rule__MaxBytesValidator__Group__0__Impl"


    // $ANTLR start "rule__MaxBytesValidator__Group__1"
    // InternalKukulkan.g:2869:1: rule__MaxBytesValidator__Group__1 : rule__MaxBytesValidator__Group__1__Impl rule__MaxBytesValidator__Group__2 ;
    public final void rule__MaxBytesValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2873:1: ( rule__MaxBytesValidator__Group__1__Impl rule__MaxBytesValidator__Group__2 )
            // InternalKukulkan.g:2874:2: rule__MaxBytesValidator__Group__1__Impl rule__MaxBytesValidator__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MaxBytesValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__Group__2();

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
    // $ANTLR end "rule__MaxBytesValidator__Group__1"


    // $ANTLR start "rule__MaxBytesValidator__Group__1__Impl"
    // InternalKukulkan.g:2881:1: rule__MaxBytesValidator__Group__1__Impl : ( '(' ) ;
    public final void rule__MaxBytesValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2885:1: ( ( '(' ) )
            // InternalKukulkan.g:2886:1: ( '(' )
            {
            // InternalKukulkan.g:2886:1: ( '(' )
            // InternalKukulkan.g:2887:2: '('
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMaxBytesValidatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MaxBytesValidator__Group__1__Impl"


    // $ANTLR start "rule__MaxBytesValidator__Group__2"
    // InternalKukulkan.g:2896:1: rule__MaxBytesValidator__Group__2 : rule__MaxBytesValidator__Group__2__Impl rule__MaxBytesValidator__Group__3 ;
    public final void rule__MaxBytesValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2900:1: ( rule__MaxBytesValidator__Group__2__Impl rule__MaxBytesValidator__Group__3 )
            // InternalKukulkan.g:2901:2: rule__MaxBytesValidator__Group__2__Impl rule__MaxBytesValidator__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MaxBytesValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__Group__3();

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
    // $ANTLR end "rule__MaxBytesValidator__Group__2"


    // $ANTLR start "rule__MaxBytesValidator__Group__2__Impl"
    // InternalKukulkan.g:2908:1: rule__MaxBytesValidator__Group__2__Impl : ( ( rule__MaxBytesValidator__ValueAssignment_2 ) ) ;
    public final void rule__MaxBytesValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2912:1: ( ( ( rule__MaxBytesValidator__ValueAssignment_2 ) ) )
            // InternalKukulkan.g:2913:1: ( ( rule__MaxBytesValidator__ValueAssignment_2 ) )
            {
            // InternalKukulkan.g:2913:1: ( ( rule__MaxBytesValidator__ValueAssignment_2 ) )
            // InternalKukulkan.g:2914:2: ( rule__MaxBytesValidator__ValueAssignment_2 )
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getValueAssignment_2()); 
            // InternalKukulkan.g:2915:2: ( rule__MaxBytesValidator__ValueAssignment_2 )
            // InternalKukulkan.g:2915:3: rule__MaxBytesValidator__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxBytesValidatorAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MaxBytesValidator__Group__2__Impl"


    // $ANTLR start "rule__MaxBytesValidator__Group__3"
    // InternalKukulkan.g:2923:1: rule__MaxBytesValidator__Group__3 : rule__MaxBytesValidator__Group__3__Impl ;
    public final void rule__MaxBytesValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2927:1: ( rule__MaxBytesValidator__Group__3__Impl )
            // InternalKukulkan.g:2928:2: rule__MaxBytesValidator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxBytesValidator__Group__3__Impl();

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
    // $ANTLR end "rule__MaxBytesValidator__Group__3"


    // $ANTLR start "rule__MaxBytesValidator__Group__3__Impl"
    // InternalKukulkan.g:2934:1: rule__MaxBytesValidator__Group__3__Impl : ( ')' ) ;
    public final void rule__MaxBytesValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2938:1: ( ( ')' ) )
            // InternalKukulkan.g:2939:1: ( ')' )
            {
            // InternalKukulkan.g:2939:1: ( ')' )
            // InternalKukulkan.g:2940:2: ')'
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMaxBytesValidatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MaxBytesValidator__Group__3__Impl"


    // $ANTLR start "rule__PATTERN_VALUE__Group__0"
    // InternalKukulkan.g:2950:1: rule__PATTERN_VALUE__Group__0 : rule__PATTERN_VALUE__Group__0__Impl rule__PATTERN_VALUE__Group__1 ;
    public final void rule__PATTERN_VALUE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2954:1: ( rule__PATTERN_VALUE__Group__0__Impl rule__PATTERN_VALUE__Group__1 )
            // InternalKukulkan.g:2955:2: rule__PATTERN_VALUE__Group__0__Impl rule__PATTERN_VALUE__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PATTERN_VALUE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PATTERN_VALUE__Group__1();

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
    // $ANTLR end "rule__PATTERN_VALUE__Group__0"


    // $ANTLR start "rule__PATTERN_VALUE__Group__0__Impl"
    // InternalKukulkan.g:2962:1: rule__PATTERN_VALUE__Group__0__Impl : ( ( '\"' )* ) ;
    public final void rule__PATTERN_VALUE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2966:1: ( ( ( '\"' )* ) )
            // InternalKukulkan.g:2967:1: ( ( '\"' )* )
            {
            // InternalKukulkan.g:2967:1: ( ( '\"' )* )
            // InternalKukulkan.g:2968:2: ( '\"' )*
            {
             before(grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_0()); 
            // InternalKukulkan.g:2969:2: ( '\"' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==45) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalKukulkan.g:2969:3: '\"'
            	    {
            	    match(input,45,FOLLOW_22); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_0()); 

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
    // $ANTLR end "rule__PATTERN_VALUE__Group__0__Impl"


    // $ANTLR start "rule__PATTERN_VALUE__Group__1"
    // InternalKukulkan.g:2977:1: rule__PATTERN_VALUE__Group__1 : rule__PATTERN_VALUE__Group__1__Impl ;
    public final void rule__PATTERN_VALUE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2981:1: ( rule__PATTERN_VALUE__Group__1__Impl )
            // InternalKukulkan.g:2982:2: rule__PATTERN_VALUE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PATTERN_VALUE__Group__1__Impl();

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
    // $ANTLR end "rule__PATTERN_VALUE__Group__1"


    // $ANTLR start "rule__PATTERN_VALUE__Group__1__Impl"
    // InternalKukulkan.g:2988:1: rule__PATTERN_VALUE__Group__1__Impl : ( '\"' ) ;
    public final void rule__PATTERN_VALUE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:2992:1: ( ( '\"' ) )
            // InternalKukulkan.g:2993:1: ( '\"' )
            {
            // InternalKukulkan.g:2993:1: ( '\"' )
            // InternalKukulkan.g:2994:2: '\"'
            {
             before(grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPATTERN_VALUEAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__PATTERN_VALUE__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment_0"
    // InternalKukulkan.g:3004:1: rule__DomainModel__EntitiesAssignment_0 : ( ruleentity ) ;
    public final void rule__DomainModel__EntitiesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3008:1: ( ( ruleentity ) )
            // InternalKukulkan.g:3009:2: ( ruleentity )
            {
            // InternalKukulkan.g:3009:2: ( ruleentity )
            // InternalKukulkan.g:3010:3: ruleentity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleentity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DomainModel__EntitiesAssignment_0"


    // $ANTLR start "rule__DomainModel__SettingsAssignment_1"
    // InternalKukulkan.g:3019:1: rule__DomainModel__SettingsAssignment_1 : ( ruleoption ) ;
    public final void rule__DomainModel__SettingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3023:1: ( ( ruleoption ) )
            // InternalKukulkan.g:3024:2: ( ruleoption )
            {
            // InternalKukulkan.g:3024:2: ( ruleoption )
            // InternalKukulkan.g:3025:3: ruleoption
            {
             before(grammarAccess.getDomainModelAccess().getSettingsOptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleoption();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getSettingsOptionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainModel__SettingsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalKukulkan.g:3034:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3038:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:3039:2: ( RULE_ID )
            {
            // InternalKukulkan.g:3039:2: ( RULE_ID )
            // InternalKukulkan.g:3040:3: RULE_ID
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
    // InternalKukulkan.g:3049:1: rule__Entity__TableNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Entity__TableNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3053:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:3054:2: ( RULE_ID )
            {
            // InternalKukulkan.g:3054:2: ( RULE_ID )
            // InternalKukulkan.g:3055:3: RULE_ID
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
    // InternalKukulkan.g:3064:1: rule__Entity__FieldsAssignment_3_1_0 : ( ruleentityField ) ;
    public final void rule__Entity__FieldsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3068:1: ( ( ruleentityField ) )
            // InternalKukulkan.g:3069:2: ( ruleentityField )
            {
            // InternalKukulkan.g:3069:2: ( ruleentityField )
            // InternalKukulkan.g:3070:3: ruleentityField
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
    // InternalKukulkan.g:3079:1: rule__Entity__FieldsAssignment_3_1_1_1 : ( ruleentityField ) ;
    public final void rule__Entity__FieldsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3083:1: ( ( ruleentityField ) )
            // InternalKukulkan.g:3084:2: ( ruleentityField )
            {
            // InternalKukulkan.g:3084:2: ( ruleentityField )
            // InternalKukulkan.g:3085:3: ruleentityField
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


    // $ANTLR start "rule__EntityField__IdAssignment_0"
    // InternalKukulkan.g:3094:1: rule__EntityField__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityField__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3098:1: ( ( RULE_ID ) )
            // InternalKukulkan.g:3099:2: ( RULE_ID )
            {
            // InternalKukulkan.g:3099:2: ( RULE_ID )
            // InternalKukulkan.g:3100:3: RULE_ID
            {
             before(grammarAccess.getEntityFieldAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityFieldAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityField__IdAssignment_0"


    // $ANTLR start "rule__EntityField__TypeAssignment_1"
    // InternalKukulkan.g:3109:1: rule__EntityField__TypeAssignment_1 : ( rulefieldType ) ;
    public final void rule__EntityField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3113:1: ( ( rulefieldType ) )
            // InternalKukulkan.g:3114:2: ( rulefieldType )
            {
            // InternalKukulkan.g:3114:2: ( rulefieldType )
            // InternalKukulkan.g:3115:3: rulefieldType
            {
             before(grammarAccess.getEntityFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefieldType();

            state._fsp--;

             after(grammarAccess.getEntityFieldAccess().getTypeFieldTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EntityField__TypeAssignment_1"


    // $ANTLR start "rule__StringFieldType__NameAssignment_0"
    // InternalKukulkan.g:3124:1: rule__StringFieldType__NameAssignment_0 : ( rulestringType ) ;
    public final void rule__StringFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3128:1: ( ( rulestringType ) )
            // InternalKukulkan.g:3129:2: ( rulestringType )
            {
            // InternalKukulkan.g:3129:2: ( rulestringType )
            // InternalKukulkan.g:3130:3: rulestringType
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
    // InternalKukulkan.g:3139:1: rule__StringFieldType__ConstraintsAssignment_1 : ( rulestringValidators ) ;
    public final void rule__StringFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3143:1: ( ( rulestringValidators ) )
            // InternalKukulkan.g:3144:2: ( rulestringValidators )
            {
            // InternalKukulkan.g:3144:2: ( rulestringValidators )
            // InternalKukulkan.g:3145:3: rulestringValidators
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
    // InternalKukulkan.g:3154:1: rule__NumericFieldType__NameAssignment_0 : ( rulenumericTypes ) ;
    public final void rule__NumericFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3158:1: ( ( rulenumericTypes ) )
            // InternalKukulkan.g:3159:2: ( rulenumericTypes )
            {
            // InternalKukulkan.g:3159:2: ( rulenumericTypes )
            // InternalKukulkan.g:3160:3: rulenumericTypes
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
    // InternalKukulkan.g:3169:1: rule__NumericFieldType__ConstraintsAssignment_1 : ( rulenumericValidators ) ;
    public final void rule__NumericFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3173:1: ( ( rulenumericValidators ) )
            // InternalKukulkan.g:3174:2: ( rulenumericValidators )
            {
            // InternalKukulkan.g:3174:2: ( rulenumericValidators )
            // InternalKukulkan.g:3175:3: rulenumericValidators
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
    // InternalKukulkan.g:3184:1: rule__BooleanFieldType__NameAssignment_0 : ( ruleBOOLEAN_TYPE ) ;
    public final void rule__BooleanFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3188:1: ( ( ruleBOOLEAN_TYPE ) )
            // InternalKukulkan.g:3189:2: ( ruleBOOLEAN_TYPE )
            {
            // InternalKukulkan.g:3189:2: ( ruleBOOLEAN_TYPE )
            // InternalKukulkan.g:3190:3: ruleBOOLEAN_TYPE
            {
             before(grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOLEAN_TYPE();

            state._fsp--;

             after(grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPEParserRuleCall_0_0()); 

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
    // InternalKukulkan.g:3199:1: rule__BooleanFieldType__RequiredAssignment_1 : ( rulerequiredValidator ) ;
    public final void rule__BooleanFieldType__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3203:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:3204:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:3204:2: ( rulerequiredValidator )
            // InternalKukulkan.g:3205:3: rulerequiredValidator
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
    // InternalKukulkan.g:3214:1: rule__DateFieldType__TypeAssignment_0 : ( ruledateTypes ) ;
    public final void rule__DateFieldType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3218:1: ( ( ruledateTypes ) )
            // InternalKukulkan.g:3219:2: ( ruledateTypes )
            {
            // InternalKukulkan.g:3219:2: ( ruledateTypes )
            // InternalKukulkan.g:3220:3: ruledateTypes
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
    // InternalKukulkan.g:3229:1: rule__DateFieldType__RequiredAssignment_1 : ( rulerequiredValidator ) ;
    public final void rule__DateFieldType__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3233:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:3234:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:3234:2: ( rulerequiredValidator )
            // InternalKukulkan.g:3235:3: rulerequiredValidator
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
    // InternalKukulkan.g:3244:1: rule__BlobFieldType__NameAssignment_0 : ( ruleblobTypes ) ;
    public final void rule__BlobFieldType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3248:1: ( ( ruleblobTypes ) )
            // InternalKukulkan.g:3249:2: ( ruleblobTypes )
            {
            // InternalKukulkan.g:3249:2: ( ruleblobTypes )
            // InternalKukulkan.g:3250:3: ruleblobTypes
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
    // InternalKukulkan.g:3259:1: rule__BlobFieldType__ConstraintsAssignment_1 : ( ruleblobValidators ) ;
    public final void rule__BlobFieldType__ConstraintsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3263:1: ( ( ruleblobValidators ) )
            // InternalKukulkan.g:3264:2: ( ruleblobValidators )
            {
            // InternalKukulkan.g:3264:2: ( ruleblobValidators )
            // InternalKukulkan.g:3265:3: ruleblobValidators
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
    // InternalKukulkan.g:3274:1: rule__StringValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__StringValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3278:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:3279:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:3279:2: ( rulerequiredValidator )
            // InternalKukulkan.g:3280:3: rulerequiredValidator
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
    // InternalKukulkan.g:3289:1: rule__StringValidators__MinLenghtAssignment_1 : ( ruleminLengthValidator ) ;
    public final void rule__StringValidators__MinLenghtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3293:1: ( ( ruleminLengthValidator ) )
            // InternalKukulkan.g:3294:2: ( ruleminLengthValidator )
            {
            // InternalKukulkan.g:3294:2: ( ruleminLengthValidator )
            // InternalKukulkan.g:3295:3: ruleminLengthValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getMinLenghtMinLengthValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleminLengthValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getMinLenghtMinLengthValidatorParserRuleCall_1_0()); 

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
    // InternalKukulkan.g:3304:1: rule__StringValidators__MaxLenghtAssignment_2 : ( rulemaxLengthValidator ) ;
    public final void rule__StringValidators__MaxLenghtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3308:1: ( ( rulemaxLengthValidator ) )
            // InternalKukulkan.g:3309:2: ( rulemaxLengthValidator )
            {
            // InternalKukulkan.g:3309:2: ( rulemaxLengthValidator )
            // InternalKukulkan.g:3310:3: rulemaxLengthValidator
            {
             before(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxLengthValidatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemaxLengthValidator();

            state._fsp--;

             after(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxLengthValidatorParserRuleCall_2_0()); 

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
    // InternalKukulkan.g:3319:1: rule__StringValidators__PatternAssignment_3 : ( rulepatternValidator ) ;
    public final void rule__StringValidators__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3323:1: ( ( rulepatternValidator ) )
            // InternalKukulkan.g:3324:2: ( rulepatternValidator )
            {
            // InternalKukulkan.g:3324:2: ( rulepatternValidator )
            // InternalKukulkan.g:3325:3: rulepatternValidator
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
    // InternalKukulkan.g:3334:1: rule__NumericValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__NumericValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3338:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:3339:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:3339:2: ( rulerequiredValidator )
            // InternalKukulkan.g:3340:3: rulerequiredValidator
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
    // InternalKukulkan.g:3349:1: rule__NumericValidators__MinValueAssignment_1 : ( ruleminValidator ) ;
    public final void rule__NumericValidators__MinValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3353:1: ( ( ruleminValidator ) )
            // InternalKukulkan.g:3354:2: ( ruleminValidator )
            {
            // InternalKukulkan.g:3354:2: ( ruleminValidator )
            // InternalKukulkan.g:3355:3: ruleminValidator
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
    // InternalKukulkan.g:3364:1: rule__NumericValidators__MaxValueAssignment_2 : ( rulemaxValidator ) ;
    public final void rule__NumericValidators__MaxValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3368:1: ( ( rulemaxValidator ) )
            // InternalKukulkan.g:3369:2: ( rulemaxValidator )
            {
            // InternalKukulkan.g:3369:2: ( rulemaxValidator )
            // InternalKukulkan.g:3370:3: rulemaxValidator
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
    // InternalKukulkan.g:3379:1: rule__BlobValidators__RequiredAssignment_0 : ( rulerequiredValidator ) ;
    public final void rule__BlobValidators__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3383:1: ( ( rulerequiredValidator ) )
            // InternalKukulkan.g:3384:2: ( rulerequiredValidator )
            {
            // InternalKukulkan.g:3384:2: ( rulerequiredValidator )
            // InternalKukulkan.g:3385:3: rulerequiredValidator
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
    // InternalKukulkan.g:3394:1: rule__BlobValidators__MinBytesValueAssignment_1 : ( ruleminBytesValidator ) ;
    public final void rule__BlobValidators__MinBytesValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3398:1: ( ( ruleminBytesValidator ) )
            // InternalKukulkan.g:3399:2: ( ruleminBytesValidator )
            {
            // InternalKukulkan.g:3399:2: ( ruleminBytesValidator )
            // InternalKukulkan.g:3400:3: ruleminBytesValidator
            {
             before(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinBytesValidatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleminBytesValidator();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinBytesValidatorParserRuleCall_1_0()); 

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
    // InternalKukulkan.g:3409:1: rule__BlobValidators__MaxBytesValueAssignment_2 : ( rulemaxBytesValidator ) ;
    public final void rule__BlobValidators__MaxBytesValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3413:1: ( ( rulemaxBytesValidator ) )
            // InternalKukulkan.g:3414:2: ( rulemaxBytesValidator )
            {
            // InternalKukulkan.g:3414:2: ( rulemaxBytesValidator )
            // InternalKukulkan.g:3415:3: rulemaxBytesValidator
            {
             before(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxBytesValidatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulemaxBytesValidator();

            state._fsp--;

             after(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxBytesValidatorParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__MaxBytesValidator__ValueAssignment_2"
    // InternalKukulkan.g:3424:1: rule__MaxBytesValidator__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__MaxBytesValidator__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3428:1: ( ( RULE_INT ) )
            // InternalKukulkan.g:3429:2: ( RULE_INT )
            {
            // InternalKukulkan.g:3429:2: ( RULE_INT )
            // InternalKukulkan.g:3430:3: RULE_INT
            {
             before(grammarAccess.getMaxBytesValidatorAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxBytesValidatorAccess().getValueINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MaxBytesValidator__ValueAssignment_2"


    // $ANTLR start "rule__Option__SettingAssignment"
    // InternalKukulkan.g:3439:1: rule__Option__SettingAssignment : ( ruleoptionSetting ) ;
    public final void rule__Option__SettingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKukulkan.g:3443:1: ( ( ruleoptionSetting ) )
            // InternalKukulkan.g:3444:2: ( ruleoptionSetting )
            {
            // InternalKukulkan.g:3444:2: ( ruleoptionSetting )
            // InternalKukulkan.g:3445:3: ruleoptionSetting
            {
             before(grammarAccess.getOptionAccess().getSettingOptionSettingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleoptionSetting();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getSettingOptionSettingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Option__SettingAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000103FFF800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000001C004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001C004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000060004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000060004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000180004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000002L});

}