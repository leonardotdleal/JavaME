import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;


public class MyCanvas extends Canvas {
	
	private boolean cleanDisplay = false;
	private Picture figura;
	
	public MyCanvas() {
		figura = new Picture(getWidth(),getHeight());
	}

	protected void paint(Graphics graphic) {
		if (cleanDisplay == true) {
			graphic.setColor(255, 255, 255);
			graphic.fillRect(0, 0, getWidth(), getHeight());
			cleanDisplay = false;
		}
		
		figura.paint(graphic); 
	}
	
	protected void keyPressed(int keyCode) {
		super.keyPressed(keyCode);
		
		figura.xant = figura.x;
		figura.yant = figura.y;
		
		switch (keyCode) {
		case KEY_STAR:
			cleanDisplay = true;
			break;
		case KEY_NUM2:
			figura.y -= 5;
			cleanDisplay = false;
			break;
		case KEY_NUM4:
			figura.x -= 5;
			cleanDisplay = false;
			break;
		case KEY_NUM6:
			figura.x += 5;
			cleanDisplay = false;
			break;
		case KEY_NUM8:
			figura.y += 5;
			cleanDisplay = false;
			break;
		default:
			break;
		}
		repaint();
	}

}
