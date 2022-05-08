package boss;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enemy extends JLabel {
	Image enemy;
	
	Enemy(){
	
		enemy=new ImageIcon("enemy.png").getImage();
		//this.addKeyListener(label);
		//this.setLayout(null );
//		this.add(label);
		
	//this.addKeyListener(label);
	//this.setVisible(true);
	//this.setBounds(0, 0, 300, 400);
	//this.add(label);
	//this.addKeyListener(label);

	}
	public void paintComponent(Graphics g) {
		Graphics2D bo =(Graphics2D)g;
		//g2D.drawImage(background, x, y, null);


	bo.drawImage(enemy,0,0,100,100,null);
	}

	}

