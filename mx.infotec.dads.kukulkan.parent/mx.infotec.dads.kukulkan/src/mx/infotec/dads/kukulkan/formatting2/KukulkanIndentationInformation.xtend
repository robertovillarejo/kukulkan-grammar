package mx.infotec.dads.kukulkan.formatting2

import org.eclipse.xtext.formatting.IIndentationInformation

class KukulkanIndentationInformation implements IIndentationInformation  {
	
	override getIndentString() {
		return '    '
	}
	
}