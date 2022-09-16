package boss;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Enemy extends JLabel  implements ActionListener{
	Label label=new Label();
	Image enemy;
	Timer timer;
	int xVelocity=1;
	int yVelocity=1;
	int x=0;
	int y=0;
	Enemy(){
	
	enemy=new ImageIcon("enemy.png").getImage();
		//this.addKeyListener(label);
		//this.setLayout(null );
//		this.add(label);
		
	//this.addKeyListener(label);
	//this.setVisible(true);
	this.setBounds(0, 0, 900, 720);
	//this.add(label);
	//this.addKeyListener(label);
	
	timer=new Timer(10,this);
	timer.start();

	}
	public void paintComponent(Graphics g) {
		Graphics2D bo =(Graphics2D)g;
		//g2D.drawImage(background, x, y, null);

	bo.drawImage(enemy,x,y,100,100,null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x>=1300-enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		
		if(y>=1100-enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		repaint();
		
		
			}
	public  void collision() {
		if(label.getLocation()==this.getLocation())
			
	}
	}

