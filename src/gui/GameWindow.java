package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	
	private Scene currentScene;
	
	 public GameWindow(Scene scene){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
			this.currentScene = scene;
			
			this.add(this.currentScene);
			this.pack();
	 }
	 
	public void switchScene(Scene scene){
		this.remove(currentScene);
		this.currentScene = scene;
		this.currentScene.update();
		this.add(currentScene);
		update();
	}
	
	public JPanel getCurrentScene(){
		return currentScene;
	}
	
	public void update(){
		this.validate();
		this.repaint();
		this.pack();
		currentScene.requestFocus();
	}
}
