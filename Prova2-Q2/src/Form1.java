import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

public class Form1 extends TextBox {
	
	public Form1() {
		super("FORM1", "", 300, TextField.ANY);
				
		addCommand(new Command("Salvar", Command.OK, 1));
		addCommand(new Command("Buscar string", Command.OK, 2));
		addCommand(new Command("Fechar", Command.EXIT, 1));
	}
	
}
