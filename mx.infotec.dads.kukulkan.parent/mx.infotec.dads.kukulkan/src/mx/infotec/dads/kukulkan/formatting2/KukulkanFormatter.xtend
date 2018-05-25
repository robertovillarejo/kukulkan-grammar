package mx.infotec.dads.kukulkan.formatting2

import com.google.inject.Inject
import mx.infotec.dads.kukulkan.kukulkan.domainModel
import mx.infotec.dads.kukulkan.kukulkan.entity
import mx.infotec.dads.kukulkan.kukulkan.entityField
import mx.infotec.dads.kukulkan.kukulkan.primitiveField
import mx.infotec.dads.kukulkan.services.KukulkanGrammarAccess
import org.eclipse.xtext.formatting.IIndentationInformation
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys
import org.eclipse.xtext.formatting2.FormatterRequest
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.preferences.MapBasedPreferenceValues

class KukulkanFormatter extends AbstractFormatter2 {
	
	@Inject extension KukulkanGrammarAccess
	@Inject IIndentationInformation indentationInformation
	
	override protected initialize(FormatterRequest request ){
		val preferences = request.preferences
		if (preferences instanceof MapBasedPreferenceValues) {
			preferences.put(FormatterPreferenceKeys.indentation, indentationInformation.indentString)
		}
//		println("Indent String:");
//		println("'" + indentationInformation.indentString + "'");
		super.initialize(request);
	}

	def dispatch void format(domainModel domainModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		println(textRegionAccess.toString())
		for (entity entity : domainModel.getEntities()) {
			entity.format;
		}
	}

	def dispatch void format(entity entity, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		entity.regionFor.ruleCall(entityAccess.LBRACETerminalRuleCall_3_0).prepend[oneSpace]
		entity.regionFor.ruleCall(entityAccess.RBRACETerminalRuleCall_3_2).prepend[newLine]
		interior(
			entity.regionFor.ruleCall(entityAccess.LBRACETerminalRuleCall_3_0),
			entity.regionFor.ruleCall(entityAccess.RBRACETerminalRuleCall_3_2)
		)[indent]
		
		for (entityField entityField : entity.getFields()) {
			entityField.format;
		}
	}

	def dispatch void format(primitiveField primitiveField, extension IFormattableDocument document) {
		primitiveField.regionFor.ruleCall(primitiveFieldAccess.SEMICOLONTerminalRuleCall_1).surround[oneSpace]
		primitiveField.prepend[newLine]
	}}
