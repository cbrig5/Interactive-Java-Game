package Main;

public class Player {
	
	GameManager gameManager;
	
	public boolean hasKey;
	public boolean hasCow;
	public boolean hasNote1;
	public boolean hasNote2;
	
	
	
	public Player(GameManager gameManager) {
		this.gameManager = gameManager;
		
	}
	
	public void setPlayerDefaultStatus() {
		hasKey = false;
		hasCow = false;
		hasNote1 = false;
		hasNote2 = false;
		
		updatePlayerStatus();
	}

	
	public void updatePlayerStatus() {
		
		// CHECK PLAYER ITEMS
		if(hasKey==false) {
			gameManager.ui.keyLabel.setVisible(false);
		}
		if(hasKey) {
			gameManager.ui.keyLabel.setVisible(true);
		}
		if(hasCow==false) {
			gameManager.ui.cowLabel.setVisible(false);
		}
		if(hasCow) {
			gameManager.ui.cowLabel.setVisible(true);
		}
		
		if(hasNote1==false) {
			gameManager.ui.note1Label.setVisible(false);
		}
		if(hasNote1) {
			gameManager.ui.note1Label.setVisible(true);
		}
		
		if(hasNote2==false) {
			gameManager.ui.note2Label.setVisible(false);
		}
		if(hasNote2) {
			gameManager.ui.note2Label.setVisible(true);
		}
	}
	
}
