package mx.infotec.dads.kukulkan.formatting2;

import org.eclipse.xtext.formatting.IIndentationInformation;

@SuppressWarnings("all")
public class KukulkanIndentationInformation implements IIndentationInformation {
  @Override
  public String getIndentString() {
    return "    ";
  }
}
