package Main;

import Event.HouseEvents;
import Event.IntroEvents;
import Event.TreeAreaEvents;



public class GameManager {

	ActionHandler actionHandler = new ActionHandler(this);
	public UI ui = new UI(this);
	public Player player = new Player(this);
	public SceneChanger sceneChanger = new SceneChanger(this);
	
	public IntroEvents introEvents = new IntroEvents(this);
	public HouseEvents houseEvents = new HouseEvents(this);
	public TreeAreaEvents treeAreaEvents = new TreeAreaEvents(this);
	
	
	public static void main(String[] args) {
		
		new GameManager();
		
		
	}
	public GameManager() {
		
		player.setPlayerDefaultStatus();
		sceneChanger.showIntroWithCow_WithoutCow();
		
		
	}
}
