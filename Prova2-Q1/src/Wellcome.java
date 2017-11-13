import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;


public class Wellcome extends Form {

	public Wellcome() {
		super("Wellcome");
		addCommand(new Command("Ir_Form3", Command.OK, 3));
	}
	
}
