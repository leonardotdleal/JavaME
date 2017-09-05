import java.io.IOException;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class MyMidlet extends MIDlet implements CommandListener {
	
	//definindo as janelas da app.
		private Menu 	menu;
		private Notepad notepad;
		private Game	game;
		//
		public void commandAction(Command cmd, Displayable janela) {
			if(janela == menu){
				if(cmd.getCommandType() == Command.EXIT){
					this.notifyDestroyed();
				}
				else {
					Displayable j = notepad;
					if (menu.getSelection() == 1)
						j = game;
					
					Display.getDisplay(this).setCurrent(j);
				}
			}
			if(janela == notepad){
				
			}
			if(janela == game){
				if(cmd.getCommandType() == Command.BACK)
					Display.getDisplay(this).setCurrent(menu);
			}
		}

		protected void startApp() throws MIDletStateChangeException {
			try {
				menu = new Menu("MENU");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			notepad = new Notepad("Anotações");
			try {
				game = new Game();
			} catch (IOException e) {
				e.printStackTrace();
			}
			game.setTitle("Acertar o Quadrado.");
			
			//Setar o listener nas janelas.
			menu.setCommandListener(this);
			notepad.setCommandListener(this);
			game.setCommandListener(this);
			
			//Mostrando o menu na tela.
			Display.getDisplay(this).setCurrent(menu);

		}
		protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
			// TODO Auto-generated method stub

		}

		protected void pauseApp() {
			// TODO Auto-generated method stub

		}

}
