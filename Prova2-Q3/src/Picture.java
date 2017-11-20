import javax.microedition.lcdui.Graphics;


public class Picture {
	
	public int x, xant;
	public int y, yant;
	private int color;

	private static final int VERMELHA = 0xFF0000;
	
	public Picture(int width, int height) {
		xant = x = width/2;
		yant = y = height/2;
		color = VERMELHA;
	}
	
	public void paint(Graphics graphics) {
		graphics.setColor(255,255,255);
		graphics.drawString("#", xant, yant, Graphics.BOTTOM|Graphics.LEFT);
		
		graphics.setColor(color);
		graphics.drawString("#", x, y, Graphics.BOTTOM|Graphics.LEFT);
		
		graphics.drawLine(x, y, xant, yant);
	}

	public void setColorRed() {
		this.color = VERMELHA;
	}
}
