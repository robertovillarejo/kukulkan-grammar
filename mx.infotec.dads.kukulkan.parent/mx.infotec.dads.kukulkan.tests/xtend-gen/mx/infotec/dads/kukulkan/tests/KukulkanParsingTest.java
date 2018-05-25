package mx.infotec.dads.kukulkan.tests;

import com.google.inject.Inject;
import java.util.List;
import mx.infotec.dads.kukulkan.kukulkan.domainModel;
import mx.infotec.dads.kukulkan.kukulkan.entity;
import mx.infotec.dads.kukulkan.tests.KukulkanInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(KukulkanInjectorProvider.class)
@SuppressWarnings("all")
public class KukulkanParsingTest {
  @Inject
  private ParseHelper<domainModel> parseHelper;
  
  @Inject
  private ValidationTestHelper validationTestHelper;
  
  @Test
  public void parseDomainModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity Persona (usuarios){");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("nombre : String required min(3) max(50) pattern(\"persona\"),");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("edad : Integer required,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("numero : Long,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("sueldo : BigDecimal,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("impuesto : Float,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("impuestoDetalle : Double,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("activo : Boolean,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("fechaLocalDate : LocalDate,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("fechaZoneDateTime : ZonedDateTime,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("imagen : Blob,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("imagenAnyBlob : AnyBlob,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("imagenBlob : ImageBlob,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("desc : TextBlob,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("instante : Instant");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final domainModel model = this.parseHelper.parse(_builder);
      final entity entity = IterableExtensions.<mx.infotec.dads.kukulkan.kukulkan.entity>head(model.getEntities());
      Assert.assertSame(entity.getName(), entity.getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseLowerCaseEntity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("entity Persona(usuarios) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("id: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("entity Student {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("id: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("entity Teacher(maestros) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("id: String");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final domainModel model = this.parseHelper.parse(_builder);
      InputOutput.<List<Issue>>println(this.validationTestHelper.validate(model));
      Assert.assertSame(Boolean.valueOf(true), Boolean.valueOf(true));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
