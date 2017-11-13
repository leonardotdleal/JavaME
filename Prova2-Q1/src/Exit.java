import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;


public class Exit extends Form {

	public Exit() {
		super("Exit");
		addCommand(new Command("SAIR", Command.EXIT, 5));
	}

}
