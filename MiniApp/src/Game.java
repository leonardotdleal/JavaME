import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Graphics;


public class Game extends Canvas {
	
	private int x, y;
	private TimerTask t;
	private Timer t1;
	private Random random;
	private Sprite quadrado;
	private Sprite seta;

	public Game() {
		addCommand(new Command("VOLTAR", Command.BACK, 1));
		
		x = y = 10;
		random = new Random();
		
		t = new TimerTask() {
			public void run() {
				int i = random.nextInt(80);
				
				if(i < 20) 
					keyPressed(KEY_NUM2);
				else if(i < 40)
					keyPressed(KEY_NUM8);
				else if(i < 60)
					keyPressed(KEY_NUM4);
				else if(i < 80)
					keyPressed(KEY_NUM6);
			}
		};
		
		t1 = new Timer();
		t1.schedule(t, 1000, 500);
	}
	
	protected void paint(Graphics g) {
		g.setColor(0,200,200);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(0,0,0);
		g.fillRect(x, y, 20, 20);
	}
	
	protected void keyPressed(int keyCode) {
		switch (keyCode) {
		case KEY_NUM2:
			this.y -= 5;
			break;
		case KEY_NUM4:
			this.x -= 5;
			break;
		case KEY_NUM6:
			this.x += 5;
			break;
		case KEY_NUM8:
			this.y += 5;
			break;
		}
		repaint();
	}


}
