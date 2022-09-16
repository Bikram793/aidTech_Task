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
Enemy enemy=new Enemy();

Frame(){
	this.setTitle("game");
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(900, 720);  //we used this.pack(); thats why we dont need to set the size again
   this.setVisible(true);
	this.setResizable(false);
	//this.setLayout(null);//if this is open rocket doesn't appear//if we add setBound
	this.setLocationRelativeTo(null);//if we add graphics
this.addKeyListener(label);
this.add(label);
this.add(enemy);
this.add(panel);
}
}
