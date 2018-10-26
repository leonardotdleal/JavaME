import javax.microedition.lcdui.Graphics;


public class Picture {
	
	public int x;
	private int y;
	private int color;

	private static final int VERDE = 0x00FF00;
	private static final int VERMELHA = 0xFF0000;
	
	private static final int SQUARE = 0;
	private static final int CIRCLE = 1;
	
	private int form;
	
	public Picture(int width, int height) {
		x = width/2;
		y = height/2;
		color = VERDE;
		form = SQUARE;
	}
	
	public void paint(Graphics graphics) {
		graphics.setColor(color);
		if (form == SQUARE)
			graphics.fillRect(x, y, 20, 20);
		else
			graphics.fillArc(x, y, 20, 20, 0, 360);
	}
	
	public void setForm() {
		if (this.form == SQUARE)
			this.form = CIRCLE;
		else
			this.form = SQUARE;
	}

	public void setColorGreen() {
		this.color = VERDE;
	}
	
	public void setColorRed() {
		this.color = VERMELHA;
	}

}
