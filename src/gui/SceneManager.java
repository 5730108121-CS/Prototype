package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.MainLogic;

public class SceneManager {
	
	public static GameTitle title;
	private static GameScreen screen;
	private static GameWindow window;
	
	public static void runGame(){
		title = new GameTitle();
		screen = new GameScreen();
		window = new GameWindow(title);
	}
	
	public static void gotoTitle(){
		window.switchScene(title);
	}
	
	public static void gotoGameScreen(){
		window.switchScene(screen);
	}
}
