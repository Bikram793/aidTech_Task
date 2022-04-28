package boss;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class Frame  extends JFrame{

Label label=new Label();
//Panel panel=new Panel();
/*	
	public void paint(Graphics g) {
		Graphics2D g2D =(Graphics2D)g;
		

	g2D.drawImage(backgroundImage, 0, 0, 900, 720, null);

	}
	*/
Frame(){
	
	this.setTitle("game");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(900, 720);  //we used this.pack(); thats why we dont need to set the size again

	this.setVisible(true);
	this.setResizable(false);
	
	this.add(label);
	
	//this.setLayout(null);
	this.setLocationRelativeTo(null);//if we add graphics
this.addKeyListener(label);
//this.setLayout(null);
	//this.getContentPane().setBackground(new ImageIcon(backgroundImage));
	
	//if we add setBound

	//this.add(panel);
	
}


}
