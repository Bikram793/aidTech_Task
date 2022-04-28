package boss;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label  extends JLabel implements KeyListener{
	Image image;
	


Label(){
	
		image=new ImageIcon("rocket.png").getImage();
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D =(Graphics2D)g;
		
	
	g2D.drawImage(image, 0, 0, 60, 90, null);
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a': this.setLocation(this.getX()-10, this.getY());
				break;
			case 'w': this.setLocation(this.getX(), this.getY()-10);
				break;
			case 's': this.setLocation(this.getX(), this.getY()+10);
				break;
			case 'd': this.setLocation(this.getX()+10, this.getY());
				break;
		}
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 37: this.setLocation(this.getX()-10, this.getY());
			break;
		case 38: this.setLocation(this.getX(), this.getY()-10);
			break;
		case 39: this.setLocation(this.getX()+10, this.getY());
			break;
		case 40: this.setLocation(this.getX(), this.getY()+10);
			break;
	}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
	}
	}



