import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;


public class Game extends Canvas {
	
	private TimerTask t;
	private Timer t1;
	private Random random;
	private Sprite quadrado;
	private Sprite seta;

	public Game() throws IOException {
		addCommand(new Command("VOLTAR", Command.BACK, 1));
		
		random = new Random();
		
		quadrado = new Sprite(Image.createImage("/quadrado.png"));
		quadrado.setPosition(10, 10);
		
		seta = new Sprite(Image.createImage("/seta.png"));
		seta.setRefPixelPosition(seta.getWidth()/2, seta.getHeight()/2);
		seta.setPosition(100, 100);
		
		t = new TimerTask() {
			public void run() {
				int i = random.nextInt(80);
				
				if(i < 20) 
					quadrado.move(0, -5);
				else if(i < 40)
					quadrado.move(0, 5);
				else if(i < 60)
					quadrado.move(-5, 0);
				else if(i < 80)
					quadrado.move(5, 0);
			}
		};
		
		t1 = new Timer();
		t1.schedule(t, 1000, 500);
	}
	
	protected void paint(Graphics g) {
		g.setColor(0,200,200);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		seta.paint(g);
		quadrado.paint(g);
	}
	
	protected void keyPressed(int keyCode) {
		switch (keyCode) {
		case KEY_NUM2:
			seta.setTransform(Sprite.TRANS_MIRROR_ROT270);
			seta.move(0, -5);
			break;
		case KEY_NUM4:
			seta.setTransform(Sprite.TRANS_MIRROR_ROT90);
			seta.move(-5, 0);
			break;
		case KEY_NUM6:
			seta.setTransform(Sprite.TRANS_MIRROR_ROT180);
			seta.move(5, 0);
			break;
		case KEY_NUM8:
			seta.setTransform(Sprite.TRANS_NONE);
			seta.move(0, 5);
			break;
		}
		repaint();
	}


}
