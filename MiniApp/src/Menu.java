import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;


public class Menu extends Form {
	
	private ChoiceGroup choise;

	public Menu(String title) {
		super(title);
		
		choise = new ChoiceGroup("Selecione uma opção:", 
					ChoiceGroup.EXCLUSIVE,
					new String[]{"Opção 1","Opção 2"},
					null);
		
		append(choise);
	}

}
