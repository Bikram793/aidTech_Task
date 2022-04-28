package boss;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame  extends JFrame{
	MyFrame(){
		
		this.setTitle("Boss");//sets title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application we can keep (Jthis.DO_NOTHING_ON_CLOSE)
		
		this.setResizable(false); //prevent screen from resize
		this.setSize(420,420);//sets x-dimesnsion,y-dimension of this
		this.setVisible(true);//make this visible
	ImageIcon image = new ImageIcon("boss.jpg");//create an image icon
	this.setIconImage(image.getImage());//change icon of this
	this.getContentPane().setBackground(new Color(74,233,36));//change color of background for default color(Color.green)
	}

}
