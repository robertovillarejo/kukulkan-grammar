package mx.infotec.dads.kukulkan.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.formatter.FormatterTestRequest
import org.eclipse.xtext.testing.formatter.FormatterTestHelper

@RunWith(XtextRunner)
@InjectWith(KukulkanInjectorProvider)
class KukulkanFormattingTest {

	@Inject extension protected FormatterTestHelper

	protected def assertFormattedWithoutSerialization((FormatterTestRequest)=>void init) {
		assertFormatted[
			init.apply(it)
			useSerializer = false
		]
	}

	@Test
	def void testEntityFormatting() {
		assertFormattedWithoutSerialization[
			expectation = 
'''
entity Persona {
	nombre : String
}
entity Alumno {
}
'''
			toBeFormatted = 
'''
entity Persona{nombre:String}
entity Alumno{
	
}
'''
		]
	}
}