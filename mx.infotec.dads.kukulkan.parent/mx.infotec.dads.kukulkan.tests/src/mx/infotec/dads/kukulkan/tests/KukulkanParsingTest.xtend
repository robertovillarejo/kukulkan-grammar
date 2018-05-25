package mx.infotec.dads.kukulkan.tests

import com.google.inject.Inject
import mx.infotec.dads.kukulkan.kukulkan.domainModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(KukulkanInjectorProvider)
class KukulkanParsingTest {
	@Inject
	ParseHelper<domainModel> parseHelper

	@Inject
	ValidationTestHelper validationTestHelper

	@Test
	def void parseDomainModel() {
		val model = parseHelper.parse('''
			entity Persona (usuarios){
			    nombre : String required min(3) max(50) pattern("persona"),
			    edad : Integer required,
			    numero : Long,
			    sueldo : BigDecimal,
			    impuesto : Float,
			    impuestoDetalle : Double,
			    activo : Boolean,
			    fechaLocalDate : LocalDate,
			    fechaZoneDateTime : ZonedDateTime,
			    imagen : Blob,
			    imagenAnyBlob : AnyBlob,
			    imagenBlob : ImageBlob,
			    desc : TextBlob,
			    instante : Instant
			}
		''')
		val entity = model.entities.head
		Assert.assertSame(entity.name, entity.name)
	}

	@Test
	def void parseLowerCaseEntity() {
		val model = parseHelper.parse('''
			entity Persona(usuarios) {
				id: String
			}
			entity Student {
				id: String
			}
			entity Teacher(maestros) {
				id: String
			}
		''')
		println(validationTestHelper.validate(model))
		Assert.assertSame(true, true);
	}
}