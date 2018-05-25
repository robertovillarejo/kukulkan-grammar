package mx.infotec.dads.kukulkan.tests;

import com.google.inject.Inject;
import mx.infotec.dads.kukulkan.tests.KukulkanInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(KukulkanInjectorProvider.class)
@SuppressWarnings("all")
public class KukulkanFormattingTest {
  @Inject
  @Extension
  protected FormatterTestHelper _formatterTestHelper;
  
  protected void assertFormattedWithoutSerialization(final Procedure1<? super FormatterTestRequest> init) {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      init.apply(it);
      it.setUseSerializer(false);
    };
    this._formatterTestHelper.assertFormatted(_function);
  }
  
  @Test
  public void testEntityFormatting() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity Persona {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("nombre : String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("entity Alumno {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      it.setExpectation(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("entity Persona{nombre:String}");
      _builder_1.newLine();
      _builder_1.append("entity Alumno{");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      it.setToBeFormatted(_builder_1);
    };
    this.assertFormattedWithoutSerialization(_function);
  }
}
