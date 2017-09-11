import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;


public class Notepad extends TextBox {

	public Notepad(String title) {
		super(title, "Digite seu texto.", 400, TextField.ANY);
		
		addCommand(new Command("VOLTAR", Command.BACK, 1));
	}
	
	public void carregarTexto() throws Exception {
		System.out.println("-->Carregando...");
		
		RecordStore rs = RecordStore.openRecordStore("ARQUIVO", true);
		byte bytes[] = rs.getRecord(rs.getNumRecords());
		
		this.setString(new String(bytes));
		
		for (int i = 1; i < rs.getNumRecords(); i++) {
			System.out.println(i + ") " + new String(rs.getRecord(i)));
		}
		
		rs.closeRecordStore();
	}
	
	public void armazenarTexto() throws Exception {
		System.out.println("-->Salvando...");
		
		RecordStore rs = RecordStore.openRecordStore("ARQUIVO", false);
		byte bytes[] = this.getString().getBytes();
		
		rs.addRecord(bytes, 0, bytes.length);
		rs.closeRecordStore();
	}

}
