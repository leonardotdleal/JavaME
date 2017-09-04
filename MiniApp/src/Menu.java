import java.io.IOException;

import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;


public class Menu extends Form {
	
	private ChoiceGroup choice;
	
	public Menu(String title) throws IOException {
		super(title);
		append("Adicionando texto antes...");
		append(choice = new ChoiceGroup("Selecione uma opcao:", 
				      Choice.POPUP, 
				      new String[]{"Notepad", "Game"},
					  new Image[]{Image.createImage("/download.png"),
								  Image.createImage("/download2.png")}));
		
				
		addCommand(new Command("SAIR", Command.EXIT, 1));
		addCommand(new Command("IR"  , Command.OK  , 2));
	}
	
	public int getSelection(){
		return choice.getSelectedIndex();
	}

}
