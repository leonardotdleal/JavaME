import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;


public class MyMidlet extends MIDlet implements CommandListener {
	
	private Form1 form = new Form1();

	public MyMidlet() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		form.setCommandListener(this);
		Display.getDisplay(this).setCurrent(form);
	}

	public void commandAction(Command command, Displayable displayable) {
		if ((displayable == form) && 
			(command.getCommandType() == Command.OK) &&
			(command.getPriority() == 1)) {
			armazenarString(form.getString());
		} else if ((displayable == form) &&
				   (command.getCommandType() == Command.OK) &&
				   (command.getPriority() == 2)) {
			exibirStrings();
		} else if ((displayable == form) && (command.getCommandType() == Command.EXIT)) {
			this.notifyDestroyed();
		}
		
	}
	
	private void exibirStrings() {
		RecordStore _storage;
		
		try {
			_storage = RecordStore.openRecordStore("RegistroDeStrings", true);
			int total = _storage.getNumRecords();
			
			for(int index = 1; index <= total; index++) {
				form.append(new String(_storage.getRecord(index)));
			}
			
			_storage.closeRecordStore();
		} catch(Exception e) {
			form.append("Erro de leitura do recordStore.");
		}
	}
	
	private void armazenarString(String nome) {
		RecordStore _storage;
		
		try {
			_storage = RecordStore.openRecordStore("RegistroDeStrings", true);
			
			byte _data[] = nome.getBytes();
			_storage.addRecord(_data, 0, _data.length); 
			_storage.closeRecordStore();
		} catch(Exception e) {
			form.append("Erro de criacao do recordStore.");
		}
		
	}

}
