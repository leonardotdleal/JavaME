import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;


public class Menu extends Form {
	
	private ChoiceGroup choise;

	public Menu(String title) {
		super(title);
		
		choise = new ChoiceGroup("Selecione uma op��o:", 
					ChoiceGroup.EXCLUSIVE,
					new String[]{"Op��o 1","Op��o 2"},
					null);
		
		append(choise);
	}

}
