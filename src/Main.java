import gui.GameScreen;
import gui.SceneManager;
import logic.MainLogic;

public class Main {
	public static MainLogic logic;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logic = new MainLogic();
		SceneManager.runGame();
		
		while(true){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
			update();
		}
	}
	
	public static void update(){
		GameScreen.gamescreen.repaint();
		logic.logicUpdate();
	}

}
