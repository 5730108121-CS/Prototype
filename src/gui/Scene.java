package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Scene extends JPanel{
	public static final int WIDTH = 1366;
	public static final int HEIGHT = 768;
	protected Color color;
	
	public Scene(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	}
	
	public void update(){
		this.validate();
		this.repaint();
	}
	
	public void setDefaultBackground(){
		this.setBackground(color);
	}
}
