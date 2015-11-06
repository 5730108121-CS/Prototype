package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import input.ButtonUtility;
import sprite.RealScreen;

public class GameScreen extends Scene {
	
	public static RealScreen gamescreen;
	
	public GameScreen(){
		super();
		color = new Color(0, 0, 0);
		this.setDefaultBackground();
		this.setLayout(new BorderLayout());
		
		gamescreen = new RealScreen();
		this.add(gamescreen,BorderLayout.CENTER);
		
		JButton b =  new JButton("Roll");
		
		b.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				ButtonUtility.setRoll(true);
			}
		});
		
		this.add(b,BorderLayout.SOUTH);
	}
	
}
