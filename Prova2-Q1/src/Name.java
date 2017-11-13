import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;


public class Name extends Form {
	private TextField name;
		
	public Name() {
		super("Name");
		name = new TextField("Digite seu nome:", "", 40, TextField.ANY);
		append(name);
		addCommand(new Command("Ir_Form2", Command.OK, 1));
	}
	
	public String getNome() {
		return name.getString();
	}

}
