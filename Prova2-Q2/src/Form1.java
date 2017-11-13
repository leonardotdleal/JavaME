import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class Form1 extends Form {
	private TextField string;
	
	public Form1() {
		super("FORM1");
		
		string = new TextField("Digite algum texto:", "", 40, TextField.ANY);
		append(string);
		
		addCommand(new Command("Salvar", Command.OK, 1));
		addCommand(new Command("Buscar string", Command.OK, 2));
		addCommand(new Command("Fechar", Command.EXIT, 1));
	}
	
	public String getString() {
		return string.getString();
	}
	
}
