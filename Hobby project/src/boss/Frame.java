package boss;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class Frame  extends JFrame{
	//JLayeredPane layeredPane =new JLayeredPane();

Label label=new Label();
Panel panel=new Panel();
Frame(){
	
	this.setTitle("game");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(900, 720);  //we used this.pack(); thats why we dont need to set the size again

	this.setVisible(true);
	this.setResizable(false);
	
	//this.add(label);
	
//this.setLayout(null);//if this is open rocket doesn't appear//if we add setBound
	this.setLocationRelativeTo(null);//if we add graphics
this.addKeyListener(label);
//panel.add(label);
	//label.setVisible(true);
	//label.setOpaque(true);
	//layeredPane.add(panel,JLayeredPane.DEFAULT_LAYER);
//layeredPane.add(label, JLayeredPane.DRAG_LAYER);
this.add(label);

this.add(panel);


}


}
