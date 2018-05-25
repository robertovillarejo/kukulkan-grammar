package mx.infotec.dads.kukulkan.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import mx.infotec.dads.kukulkan.kukulkan.domainModel;
import mx.infotec.dads.kukulkan.kukulkan.entity;
import mx.infotec.dads.kukulkan.kukulkan.entityField;
import mx.infotec.dads.kukulkan.kukulkan.primitiveField;
import mx.infotec.dads.kukulkan.services.KukulkanGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.formatting2.FormatterRequest;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.preferences.ITypedPreferenceValues;
import org.eclipse.xtext.preferences.MapBasedPreferenceValues;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class KukulkanFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private KukulkanGrammarAccess _kukulkanGrammarAccess;
  
  @Inject
  private IIndentationInformation indentationInformation;
  
  @Override
  protected void initialize(final FormatterRequest request) {
    final ITypedPreferenceValues preferences = request.getPreferences();
    if ((preferences instanceof MapBasedPreferenceValues)) {
      ((MapBasedPreferenceValues)preferences).<String>put(FormatterPreferenceKeys.indentation, this.indentationInformation.getIndentString());
    }
    super.initialize(request);
  }
  
  protected void _format(final domainModel domainModel, @Extension final IFormattableDocument document) {
    InputOutput.<String>println(this.getTextRegionAccess().toString());
    EList<entity> _entities = domainModel.getEntities();
    for (final entity entity : _entities) {
      document.<mx.infotec.dads.kukulkan.kukulkan.entity>format(entity);
    }
  }
  
  protected void _format(final entity entity, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(entity).ruleCall(this._kukulkanGrammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0()), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(entity).ruleCall(this._kukulkanGrammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      this.textRegionExtensions.regionFor(entity).ruleCall(this._kukulkanGrammarAccess.getEntityAccess().getLBRACETerminalRuleCall_3_0()), 
      this.textRegionExtensions.regionFor(entity).ruleCall(this._kukulkanGrammarAccess.getEntityAccess().getRBRACETerminalRuleCall_3_2()), _function_2);
    EList<entityField> _fields = entity.getFields();
    for (final entityField entityField : _fields) {
      document.<mx.infotec.dads.kukulkan.kukulkan.entityField>format(entityField);
    }
  }
  
  protected void _format(final primitiveField primitiveField, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(primitiveField).ruleCall(this._kukulkanGrammarAccess.getPrimitiveFieldAccess().getSEMICOLONTerminalRuleCall_1()), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.<mx.infotec.dads.kukulkan.kukulkan.primitiveField>prepend(primitiveField, _function_1);
  }
  
  public void format(final Object primitiveField, final IFormattableDocument document) {
    if (primitiveField instanceof XtextResource) {
      _format((XtextResource)primitiveField, document);
      return;
    } else if (primitiveField instanceof mx.infotec.dads.kukulkan.kukulkan.primitiveField) {
      _format((mx.infotec.dads.kukulkan.kukulkan.primitiveField)primitiveField, document);
      return;
    } else if (primitiveField instanceof domainModel) {
      _format((domainModel)primitiveField, document);
      return;
    } else if (primitiveField instanceof entity) {
      _format((entity)primitiveField, document);
      return;
    } else if (primitiveField instanceof EObject) {
      _format((EObject)primitiveField, document);
      return;
    } else if (primitiveField == null) {
      _format((Void)null, document);
      return;
    } else if (primitiveField != null) {
      _format(primitiveField, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(primitiveField, document).toString());
    }
  }
}
