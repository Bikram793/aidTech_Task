package boss;

import java.awt.Color;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Label  extends JLabel implements KeyListener{
	

Image image;
	//Image background;

Label(){
	
		image=new ImageIcon("rocket.png").getImage();
		this.setBounds(100, 200, 1000, 1000);
		//background=new ImageIcon("space.jpg").getImage();
	//this.setVisible(true);
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2D =(Graphics2D)g;
		//g2D.drawImage(background, x, y, null);

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



