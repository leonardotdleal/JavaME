import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class MyMidlet extends MIDlet {
	
	private Menu menu;
	private Notepad notepad;
	private Game game;

	protected void startApp() throws MIDletStateChangeException {

		menu = new Menu("MENU");
		notepad = new Notepad("Anotações");
		game = new Game();
		
		game.setTitle("Acertar o Quadrado");
		
		//Mostrando o menu em tela
		Display.getDisplay(this).setCurrent(menu);
		
	}
	
	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {

	}

	protected void pauseApp() {

	}

}
