/*
 * generated by Xtext 2.13.0
 */
grammar InternalKukulkan;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package mx.infotec.dads.kukulkan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuledomainModel
entryRuledomainModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	iv_ruledomainModel=ruledomainModel
	{ $current=$iv_ruledomainModel.current; }
	EOF;

// Rule domainModel
ruledomainModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_0());
			}
			lv_entities_0_0=ruleentity
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDomainModelRule());
				}
				add(
					$current,
					"entities",
					lv_entities_0_0,
					"mx.infotec.dads.kukulkan.Kukulkan.entity");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleentity
entryRuleentity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleentity=ruleentity
	{ $current=$iv_ruleentity.current; }
	EOF;

// Rule entity
ruleentity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ENTITY_KEYWORD_0=RULE_ENTITY_KEYWORD
		{
			newLeafNode(this_ENTITY_KEYWORD_0, grammarAccess.getEntityAccess().getENTITY_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			this_LPAREN_2=RULE_LPAREN
			{
				newLeafNode(this_LPAREN_2, grammarAccess.getEntityAccess().getLPARENTerminalRuleCall_2_0());
			}
			(
				(
					lv_tableName_3_0=RULE_ID
					{
						newLeafNode(lv_tableName_3_0, grammarAccess.getEntityAccess().getTableNameIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
						setWithLastConsumed(
							$current,
							"tableName",
							lv_tableName_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			this_RPAREN_4=RULE_RPAREN
			{
				newLeafNode(this_RPAREN_4, grammarAccess.getEntityAccess().getRPARENTerminalRuleCall_2_2());
			}
		)?
		(
			this_LBRACE_5=RULE_LBRACE
			{
				newLeafNode(this_LBRACE_5, grammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_0_0());
						}
						lv_fields_6_0=ruleentityField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"fields",
								lv_fields_6_0,
								"mx.infotec.dads.kukulkan.Kukulkan.entityField");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					this_COMMA_7=RULE_COMMA
					{
						newLeafNode(this_COMMA_7, grammarAccess.getEntityAccess().getCOMMATerminalRuleCall_3_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getEntityAccess().getFieldsEntityFieldParserRuleCall_3_1_1_1_0());
							}
							lv_fields_8_0=ruleentityField
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getEntityRule());
								}
								add(
									$current,
									"fields",
									lv_fields_8_0,
									"mx.infotec.dads.kukulkan.Kukulkan.entityField");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			this_RBRACE_9=RULE_RBRACE
			{
				newLeafNode(this_RBRACE_9, grammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2());
			}
		)?
	)
;

// Entry rule entryRuleentityField
entryRuleentityField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityFieldRule()); }
	iv_ruleentityField=ruleentityField
	{ $current=$iv_ruleentityField.current; }
	EOF;

// Rule entityField
ruleentityField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEntityFieldAccess().getPrimitiveFieldParserRuleCall_0());
		}
		this_primitiveField_0=ruleprimitiveField
		{
			$current = $this_primitiveField_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEntityFieldAccess().getAssociationFieldParserRuleCall_1());
		}
		this_associationField_1=ruleassociationField
		{
			$current = $this_associationField_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleprimitiveField
entryRuleprimitiveField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveFieldRule()); }
	iv_ruleprimitiveField=ruleprimitiveField
	{ $current=$iv_ruleprimitiveField.current; }
	EOF;

// Rule primitiveField
ruleprimitiveField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_ID
				{
					newLeafNode(lv_id_0_0, grammarAccess.getPrimitiveFieldAccess().getIdIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveFieldRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_SEMICOLON_1=RULE_SEMICOLON
		{
			newLeafNode(this_SEMICOLON_1, grammarAccess.getPrimitiveFieldAccess().getSEMICOLONTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveFieldAccess().getTypeFieldTypeParserRuleCall_2_0());
				}
				lv_type_2_0=rulefieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"mx.infotec.dads.kukulkan.Kukulkan.fieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulefieldType
entryRulefieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldTypeRule()); }
	iv_rulefieldType=rulefieldType
	{ $current=$iv_rulefieldType.current; }
	EOF;

// Rule fieldType
rulefieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFieldTypeAccess().getStringFieldTypeParserRuleCall_0());
		}
		this_stringFieldType_0=rulestringFieldType
		{
			$current = $this_stringFieldType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldTypeAccess().getNumericFieldTypeParserRuleCall_1());
		}
		this_numericFieldType_1=rulenumericFieldType
		{
			$current = $this_numericFieldType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldTypeAccess().getBooleanFieldTypeParserRuleCall_2());
		}
		this_booleanFieldType_2=rulebooleanFieldType
		{
			$current = $this_booleanFieldType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldTypeAccess().getDateFieldTypeParserRuleCall_3());
		}
		this_dateFieldType_3=ruledateFieldType
		{
			$current = $this_dateFieldType_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFieldTypeAccess().getBlobFieldTypeParserRuleCall_4());
		}
		this_blobFieldType_4=ruleblobFieldType
		{
			$current = $this_blobFieldType_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleassociationField
entryRuleassociationField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationFieldRule()); }
	iv_ruleassociationField=ruleassociationField
	{ $current=$iv_ruleassociationField.current; }
	EOF;

// Rule associationField
ruleassociationField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationFieldAccess().getTypeCardinalityParserRuleCall_0_0());
				}
				lv_type_0_0=rulecardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_LPAREN_1=RULE_LPAREN
			{
				newLeafNode(this_LPAREN_1, grammarAccess.getAssociationFieldAccess().getLPARENTerminalRuleCall_1_0());
			}
			(
				(
					lv_toSourcePropertyName_2_0=RULE_ID
					{
						newLeafNode(lv_toSourcePropertyName_2_0, grammarAccess.getAssociationFieldAccess().getToSourcePropertyNameIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssociationFieldRule());
						}
						setWithLastConsumed(
							$current,
							"toSourcePropertyName",
							lv_toSourcePropertyName_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			this_RPAREN_3=RULE_RPAREN
			{
				newLeafNode(this_RPAREN_3, grammarAccess.getAssociationFieldAccess().getRPARENTerminalRuleCall_1_2());
			}
		)?
		(
			(
				lv_id_4_0=RULE_ID
				{
					newLeafNode(lv_id_4_0, grammarAccess.getAssociationFieldAccess().getIdIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationFieldRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_SEMICOLON_5=RULE_SEMICOLON
		{
			newLeafNode(this_SEMICOLON_5, grammarAccess.getAssociationFieldAccess().getSEMICOLONTerminalRuleCall_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationFieldRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getAssociationFieldAccess().getTargetEntityEntityCrossReference_4_0());
				}
			)
		)
	)
;

// Entry rule entryRulestringFieldType
entryRulestringFieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringFieldTypeRule()); }
	iv_rulestringFieldType=rulestringFieldType
	{ $current=$iv_rulestringFieldType.current; }
	EOF;

// Rule stringFieldType
rulestringFieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getNameStringTypeParserRuleCall_0_0());
				}
				lv_name_0_0=rulestringType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringFieldTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.stringType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStringFieldTypeAccess().getConstraintsStringValidatorsParserRuleCall_1_0());
				}
				lv_constraints_1_0=rulestringValidators
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringFieldTypeRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.stringValidators");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulestringType
entryRulestringType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStringTypeRule()); }
	iv_rulestringType=rulestringType
	{ $current=$iv_rulestringType.current.getText(); }
	EOF;

// Rule stringType
rulestringType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_KEYWORD_0=RULE_STRING_KEYWORD
	{
		$current.merge(this_STRING_KEYWORD_0);
	}
	{
		newLeafNode(this_STRING_KEYWORD_0, grammarAccess.getStringTypeAccess().getSTRING_KEYWORDTerminalRuleCall());
	}
;

// Entry rule entryRulenumericFieldType
entryRulenumericFieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericFieldTypeRule()); }
	iv_rulenumericFieldType=rulenumericFieldType
	{ $current=$iv_rulenumericFieldType.current; }
	EOF;

// Rule numericFieldType
rulenumericFieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getNameNumericTypesParserRuleCall_0_0());
				}
				lv_name_0_0=rulenumericTypes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericFieldTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.numericTypes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericFieldTypeAccess().getConstraintsNumericValidatorsParserRuleCall_1_0());
				}
				lv_constraints_1_0=rulenumericValidators
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericFieldTypeRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.numericValidators");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulenumericTypes
entryRulenumericTypes returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumericTypesRule()); }
	iv_rulenumericTypes=rulenumericTypes
	{ $current=$iv_rulenumericTypes.current.getText(); }
	EOF;

// Rule numericTypes
rulenumericTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INTEGER_0=RULE_INTEGER
		{
			$current.merge(this_INTEGER_0);
		}
		{
			newLeafNode(this_INTEGER_0, grammarAccess.getNumericTypesAccess().getINTEGERTerminalRuleCall_0());
		}
		    |
		this_LONG_1=RULE_LONG
		{
			$current.merge(this_LONG_1);
		}
		{
			newLeafNode(this_LONG_1, grammarAccess.getNumericTypesAccess().getLONGTerminalRuleCall_1());
		}
		    |
		this_BIG_DECIMAL_2=RULE_BIG_DECIMAL
		{
			$current.merge(this_BIG_DECIMAL_2);
		}
		{
			newLeafNode(this_BIG_DECIMAL_2, grammarAccess.getNumericTypesAccess().getBIG_DECIMALTerminalRuleCall_2());
		}
		    |
		this_FLOAT_3=RULE_FLOAT
		{
			$current.merge(this_FLOAT_3);
		}
		{
			newLeafNode(this_FLOAT_3, grammarAccess.getNumericTypesAccess().getFLOATTerminalRuleCall_3());
		}
		    |
		this_DOUBLE_4=RULE_DOUBLE
		{
			$current.merge(this_DOUBLE_4);
		}
		{
			newLeafNode(this_DOUBLE_4, grammarAccess.getNumericTypesAccess().getDOUBLETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRulebooleanFieldType
entryRulebooleanFieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanFieldTypeRule()); }
	iv_rulebooleanFieldType=rulebooleanFieldType
	{ $current=$iv_rulebooleanFieldType.current; }
	EOF;

// Rule booleanFieldType
rulebooleanFieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_BOOLEAN_TYPE
				{
					newLeafNode(lv_name_0_0, grammarAccess.getBooleanFieldTypeAccess().getNameBOOLEAN_TYPETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanFieldTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.BOOLEAN_TYPE");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0());
				}
				lv_required_1_0=rulerequiredValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanFieldTypeRule());
					}
					set(
						$current,
						"required",
						lv_required_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuledateFieldType
entryRuledateFieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDateFieldTypeRule()); }
	iv_ruledateFieldType=ruledateFieldType
	{ $current=$iv_ruledateFieldType.current; }
	EOF;

// Rule dateFieldType
ruledateFieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDateFieldTypeAccess().getTypeDateTypesParserRuleCall_0_0());
				}
				lv_type_0_0=ruledateTypes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDateFieldTypeRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.dateTypes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDateFieldTypeAccess().getRequiredRequiredValidatorParserRuleCall_1_0());
				}
				lv_required_1_0=rulerequiredValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDateFieldTypeRule());
					}
					set(
						$current,
						"required",
						lv_required_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuledateTypes
entryRuledateTypes returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDateTypesRule()); }
	iv_ruledateTypes=ruledateTypes
	{ $current=$iv_ruledateTypes.current.getText(); }
	EOF;

// Rule dateTypes
ruledateTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LOCAL_DATE_0=RULE_LOCAL_DATE
		{
			$current.merge(this_LOCAL_DATE_0);
		}
		{
			newLeafNode(this_LOCAL_DATE_0, grammarAccess.getDateTypesAccess().getLOCAL_DATETerminalRuleCall_0());
		}
		    |
		this_ZONED_DATETIME_1=RULE_ZONED_DATETIME
		{
			$current.merge(this_ZONED_DATETIME_1);
		}
		{
			newLeafNode(this_ZONED_DATETIME_1, grammarAccess.getDateTypesAccess().getZONED_DATETIMETerminalRuleCall_1());
		}
		    |
		this_INSTANT_2=RULE_INSTANT
		{
			$current.merge(this_INSTANT_2);
		}
		{
			newLeafNode(this_INSTANT_2, grammarAccess.getDateTypesAccess().getINSTANTTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleblobFieldType
entryRuleblobFieldType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlobFieldTypeRule()); }
	iv_ruleblobFieldType=ruleblobFieldType
	{ $current=$iv_ruleblobFieldType.current; }
	EOF;

// Rule blobFieldType
ruleblobFieldType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getNameBlobTypesParserRuleCall_0_0());
				}
				lv_name_0_0=ruleblobTypes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlobFieldTypeRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.blobTypes");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBlobFieldTypeAccess().getConstraintsBlobValidatorsParserRuleCall_1_0());
				}
				lv_constraints_1_0=ruleblobValidators
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlobFieldTypeRule());
					}
					add(
						$current,
						"constraints",
						lv_constraints_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.blobValidators");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleblobTypes
entryRuleblobTypes returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBlobTypesRule()); }
	iv_ruleblobTypes=ruleblobTypes
	{ $current=$iv_ruleblobTypes.current.getText(); }
	EOF;

// Rule blobTypes
ruleblobTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_BLOB_0=RULE_BLOB
		{
			$current.merge(this_BLOB_0);
		}
		{
			newLeafNode(this_BLOB_0, grammarAccess.getBlobTypesAccess().getBLOBTerminalRuleCall_0());
		}
		    |
		this_ANY_BLOB_1=RULE_ANY_BLOB
		{
			$current.merge(this_ANY_BLOB_1);
		}
		{
			newLeafNode(this_ANY_BLOB_1, grammarAccess.getBlobTypesAccess().getANY_BLOBTerminalRuleCall_1());
		}
		    |
		this_IMAGE_BLOB_2=RULE_IMAGE_BLOB
		{
			$current.merge(this_IMAGE_BLOB_2);
		}
		{
			newLeafNode(this_IMAGE_BLOB_2, grammarAccess.getBlobTypesAccess().getIMAGE_BLOBTerminalRuleCall_2());
		}
		    |
		this_TEXT_BLOB_3=RULE_TEXT_BLOB
		{
			$current.merge(this_TEXT_BLOB_3);
		}
		{
			newLeafNode(this_TEXT_BLOB_3, grammarAccess.getBlobTypesAccess().getTEXT_BLOBTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRulestringValidators
entryRulestringValidators returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValidatorsRule()); }
	iv_rulestringValidators=rulestringValidators
	{ $current=$iv_rulestringValidators.current; }
	EOF;

// Rule stringValidators
rulestringValidators returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
				}
				lv_required_0_0=rulerequiredValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
					}
					set(
						$current,
						"required",
						lv_required_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMinLenghtMinValidatorParserRuleCall_1_0());
				}
				lv_minLenght_1_0=ruleminValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
					}
					set(
						$current,
						"minLenght",
						lv_minLenght_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValidatorsAccess().getMaxLenghtMaxValidatorParserRuleCall_2_0());
				}
				lv_maxLenght_2_0=rulemaxValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
					}
					set(
						$current,
						"maxLenght",
						lv_maxLenght_2_0,
						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValidatorsAccess().getPatternPatternValidatorParserRuleCall_3_0());
				}
				lv_pattern_3_0=rulepatternValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValidatorsRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_3_0,
						"mx.infotec.dads.kukulkan.Kukulkan.patternValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulenumericValidators
entryRulenumericValidators returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericValidatorsRule()); }
	iv_rulenumericValidators=rulenumericValidators
	{ $current=$iv_rulenumericValidators.current; }
	EOF;

// Rule numericValidators
rulenumericValidators returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
				}
				lv_required_0_0=rulerequiredValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
					}
					set(
						$current,
						"required",
						lv_required_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getMinValueMinValidatorParserRuleCall_1_0());
				}
				lv_minValue_1_0=ruleminValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
					}
					set(
						$current,
						"minValue",
						lv_minValue_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getNumericValidatorsAccess().getMaxValueMaxValidatorParserRuleCall_2_0());
				}
				lv_maxValue_2_0=rulemaxValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNumericValidatorsRule());
					}
					set(
						$current,
						"maxValue",
						lv_maxValue_2_0,
						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleblobValidators
entryRuleblobValidators returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlobValidatorsRule()); }
	iv_ruleblobValidators=ruleblobValidators
	{ $current=$iv_ruleblobValidators.current; }
	EOF;

// Rule blobValidators
ruleblobValidators returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getRequiredRequiredValidatorParserRuleCall_0_0());
				}
				lv_required_0_0=rulerequiredValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
					}
					set(
						$current,
						"required",
						lv_required_0_0,
						"mx.infotec.dads.kukulkan.Kukulkan.requiredValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMinBytesValueMinValidatorParserRuleCall_1_0());
				}
				lv_minBytesValue_1_0=ruleminValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
					}
					set(
						$current,
						"minBytesValue",
						lv_minBytesValue_1_0,
						"mx.infotec.dads.kukulkan.Kukulkan.minValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getBlobValidatorsAccess().getMaxBytesValueMaxValidatorParserRuleCall_2_0());
				}
				lv_maxBytesValue_2_0=rulemaxValidator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlobValidatorsRule());
					}
					set(
						$current,
						"maxBytesValue",
						lv_maxBytesValue_2_0,
						"mx.infotec.dads.kukulkan.Kukulkan.maxValidator");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulerequiredValidator
entryRulerequiredValidator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRequiredValidatorRule()); }
	iv_rulerequiredValidator=rulerequiredValidator
	{ $current=$iv_rulerequiredValidator.current.getText(); }
	EOF;

// Rule requiredValidator
rulerequiredValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_REQUIRED_0=RULE_REQUIRED
	{
		$current.merge(this_REQUIRED_0);
	}
	{
		newLeafNode(this_REQUIRED_0, grammarAccess.getRequiredValidatorAccess().getREQUIREDTerminalRuleCall());
	}
;

// Entry rule entryRulepatternValidator
entryRulepatternValidator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPatternValidatorRule()); }
	iv_rulepatternValidator=rulepatternValidator
	{ $current=$iv_rulepatternValidator.current.getText(); }
	EOF;

// Rule patternValidator
rulepatternValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_PATTERN_0=RULE_PATTERN
		{
			$current.merge(this_PATTERN_0);
		}
		{
			newLeafNode(this_PATTERN_0, grammarAccess.getPatternValidatorAccess().getPATTERNTerminalRuleCall_0());
		}
		this_LPAREN_1=RULE_LPAREN
		{
			$current.merge(this_LPAREN_1);
		}
		{
			newLeafNode(this_LPAREN_1, grammarAccess.getPatternValidatorAccess().getLPARENTerminalRuleCall_1());
		}
		this_PATTERN_VALUE_2=RULE_PATTERN_VALUE
		{
			$current.merge(this_PATTERN_VALUE_2);
		}
		{
			newLeafNode(this_PATTERN_VALUE_2, grammarAccess.getPatternValidatorAccess().getPATTERN_VALUETerminalRuleCall_2());
		}
		this_RPAREN_3=RULE_RPAREN
		{
			$current.merge(this_RPAREN_3);
		}
		{
			newLeafNode(this_RPAREN_3, grammarAccess.getPatternValidatorAccess().getRPARENTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleminValidator
entryRuleminValidator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMinValidatorRule()); }
	iv_ruleminValidator=ruleminValidator
	{ $current=$iv_ruleminValidator.current.getText(); }
	EOF;

// Rule minValidator
ruleminValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MIN_0=RULE_MIN
		{
			$current.merge(this_MIN_0);
		}
		{
			newLeafNode(this_MIN_0, grammarAccess.getMinValidatorAccess().getMINTerminalRuleCall_0());
		}
		this_LPAREN_1=RULE_LPAREN
		{
			$current.merge(this_LPAREN_1);
		}
		{
			newLeafNode(this_LPAREN_1, grammarAccess.getMinValidatorAccess().getLPARENTerminalRuleCall_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getMinValidatorAccess().getINTTerminalRuleCall_2());
		}
		this_RPAREN_3=RULE_RPAREN
		{
			$current.merge(this_RPAREN_3);
		}
		{
			newLeafNode(this_RPAREN_3, grammarAccess.getMinValidatorAccess().getRPARENTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRulemaxValidator
entryRulemaxValidator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMaxValidatorRule()); }
	iv_rulemaxValidator=rulemaxValidator
	{ $current=$iv_rulemaxValidator.current.getText(); }
	EOF;

// Rule maxValidator
rulemaxValidator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MAX_0=RULE_MAX
		{
			$current.merge(this_MAX_0);
		}
		{
			newLeafNode(this_MAX_0, grammarAccess.getMaxValidatorAccess().getMAXTerminalRuleCall_0());
		}
		this_LPAREN_1=RULE_LPAREN
		{
			$current.merge(this_LPAREN_1);
		}
		{
			newLeafNode(this_LPAREN_1, grammarAccess.getMaxValidatorAccess().getLPARENTerminalRuleCall_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getMaxValidatorAccess().getINTTerminalRuleCall_2());
		}
		this_RPAREN_3=RULE_RPAREN
		{
			$current.merge(this_RPAREN_3);
		}
		{
			newLeafNode(this_RPAREN_3, grammarAccess.getMaxValidatorAccess().getRPARENTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRulecardinality
entryRulecardinality returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_rulecardinality=rulecardinality
	{ $current=$iv_rulecardinality.current.getText(); }
	EOF;

// Rule cardinality
rulecardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ONE_TO_MANY_0=RULE_ONE_TO_MANY
		{
			$current.merge(this_ONE_TO_MANY_0);
		}
		{
			newLeafNode(this_ONE_TO_MANY_0, grammarAccess.getCardinalityAccess().getONE_TO_MANYTerminalRuleCall_0());
		}
		    |
		this_MANY_TO_ONE_1=RULE_MANY_TO_ONE
		{
			$current.merge(this_MANY_TO_ONE_1);
		}
		{
			newLeafNode(this_MANY_TO_ONE_1, grammarAccess.getCardinalityAccess().getMANY_TO_ONETerminalRuleCall_1());
		}
		    |
		this_ONE_TO_ONE_2=RULE_ONE_TO_ONE
		{
			$current.merge(this_ONE_TO_ONE_2);
		}
		{
			newLeafNode(this_ONE_TO_ONE_2, grammarAccess.getCardinalityAccess().getONE_TO_ONETerminalRuleCall_2());
		}
		    |
		this_MANY_TO_MANY_3=RULE_MANY_TO_MANY
		{
			$current.merge(this_MANY_TO_MANY_3);
		}
		{
			newLeafNode(this_MANY_TO_MANY_3, grammarAccess.getCardinalityAccess().getMANY_TO_MANYTerminalRuleCall_3());
		}
	)
;

RULE_ENTITY_KEYWORD : 'entity';

RULE_STRING_KEYWORD : 'String';

RULE_INTEGER : 'Integer';

RULE_LONG : 'Long';

RULE_BIG_DECIMAL : 'BigDecimal';

RULE_FLOAT : 'Float';

RULE_DOUBLE : 'Double';

RULE_BOOLEAN_TYPE : 'Boolean';

RULE_LOCAL_DATE : 'LocalDate';

RULE_ZONED_DATETIME : 'ZonedDateTime';

RULE_INSTANT : 'Instant';

RULE_BLOB : 'Blob';

RULE_ANY_BLOB : 'AnyBlob';

RULE_IMAGE_BLOB : 'ImageBlob';

RULE_TEXT_BLOB : 'TextBlob';

RULE_ONE_TO_MANY : 'OneToMany';

RULE_MANY_TO_ONE : 'ManyToOne';

RULE_ONE_TO_ONE : 'OneToOne';

RULE_MANY_TO_MANY : 'ManyToMany';

RULE_PATTERN_VALUE : '"' .* '"';

RULE_MIN : 'min';

RULE_MAX : 'max';

RULE_NULL_LITERAL : 'null';

RULE_LPAREN : '(';

RULE_RPAREN : ')';

RULE_LBRACE : '{';

RULE_RBRACE : '}';

RULE_LBRACK : '[';

RULE_RBRACK : ']';

RULE_SEMI : ';';

RULE_COMMA : ',';

RULE_DOT : '.';

RULE_ELLIPSIS : '...';

RULE_AT : '@';

RULE_COLONCOLON : '::';

RULE_SEMICOLON : ':';

RULE_REQUIRED : 'required';

RULE_PATTERN : 'pattern';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;