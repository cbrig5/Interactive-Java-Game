package Main;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


public class ActionHandler implements ActionListener{

	GameManager gameManager;
	
	public ActionHandler(GameManager gameManager) {
		
		this.gameManager = gameManager;
	}
	

	@Override 
	public void actionPerformed(ActionEvent e) {
		
		String yourChoiceString = e.getActionCommand();
		
		switch(yourChoiceString){
		
		// INTRO EVENTS
		case "lookHut": gameManager.introEvents.lookHut();break;
		case "talkHut": gameManager.introEvents.talkHut();break;
		case "enterHut": gameManager.introEvents.enterHut();break;
		case "lookChest": gameManager.introEvents.lookChest();break;
		case "talkChest": gameManager.introEvents.talkChest();break;
		case "openChest": gameManager.introEvents.openChest();break;
		case "lookCow": gameManager.introEvents.lookCow();break;
		case "talkCow": gameManager.introEvents.talkCow();break;
		case "takeCow": gameManager.introEvents.takeCow();break;
		case "placeCow": gameManager.introEvents.placeCow();break;
		case "restart":gameManager.introEvents.restart();break;
		
		
		
		// HOUSE EVENTS
		case "lookLockedChest": gameManager.houseEvents.lookLockedChest();break;
		case "talkLockedChest": gameManager.houseEvents.talkLockedChest();break;
		case "openLockedChest": gameManager.houseEvents.openLockedChest();break;
		
		// TREE AREA EVENTS
		case "lookSomethingNoCowRight": gameManager.treeAreaEvents.lookSomethingNoCowRight();break;
		case "lookSomethingNoCowLeft": gameManager.treeAreaEvents.lookSomethingNoCowLeft();break;
		case "lookSomethingWithCowDistance": gameManager.treeAreaEvents.lookSomethingWithCowDistance();break;
		case "seeSomethingLeft": gameManager.treeAreaEvents.seeSomethingLeft();break;
		case "seeSomethingRight": gameManager.treeAreaEvents.seeSomethingRight();break;
		case "placeCowRight": gameManager.treeAreaEvents.placeCowRight();break;
		case "placeCowLeft": gameManager.treeAreaEvents.placeCowLeft();break;
		case "takeCowTreeArea": gameManager.treeAreaEvents.takeCowTreeArea();break;
		case "cantTakeCow": gameManager.treeAreaEvents.cantTakeCow();break;
		case "lookCowRight": gameManager.treeAreaEvents.lookCowRight();break;
		case "lookCowLeft": gameManager.treeAreaEvents.lookCowLeft();break;
		case "lookCowRight_withoutKeys": gameManager.treeAreaEvents.lookCowRight_withoutKeys();break;
		case "easterEggDay1": gameManager.treeAreaEvents.easterEggDay1();break;
		
		// Change Scenes
		
		// TO INTRO
		case "goIntroWithCow_WithoutCow":gameManager.sceneChanger.showIntroWithCow_WithoutCow();break;
		case "goIntroWithoutCow":gameManager.sceneChanger.showIntroWithoutCow_WithoutCow();break;
		case "goIntroWithoutCow_WithoutCow":gameManager.sceneChanger.showIntroWithoutCow_WithoutCow();break;
		case "goIntroWithoutCow_WithCowRight":gameManager.sceneChanger.showIntroWithoutCow_WithCowRight();break;
		case "goIntroWithoutCow_WithCowLeft":gameManager.sceneChanger.showIntroWithoutCow_WithCowLeft();break;
		case "goIntroWithoutCow_WithCowRightWithoutKeys":gameManager.sceneChanger.showIntroWithoutCow_withoutCowAndKey();break;
		case "goIntroWithoutCow_noGoingBack":gameManager.sceneChanger.showIntroWithoutCow_noGoingBack();break;
		
		// TO TREE AREA
		case "goTreeAreaWithoutCow_WithCow":gameManager.sceneChanger.showTreeAreaWithoutCow_WithCow();break;
		case "goTreeAreaWithoutCow_WithoutCow":gameManager.sceneChanger.showTreeAreaWithoutCow_WithoutCow();break;
		case "goTreeAreaWithCowRight_WithoutCow":gameManager.sceneChanger.showTreeAreaWithCowRight_WithoutCow();break;
		case "goTreeAreaWithCowLeft_WithoutCow":gameManager.sceneChanger.showTreeAreaWithCowLeft_WithoutCow();break;
		case "goTreeAreaWitCowRightWithoutkeys_WithoutCow":gameManager.sceneChanger.showTreeAreaWithCowRightWithoutKeys_WithoutCow();break;
		case "goTreeAreaWithoutCowAndKeys_WithoutCow":gameManager.sceneChanger.showTreeAreaWithoutCowAndKeys_WithoutCow();break;
		
		// TO COW SCENE
		case "goCowScene":gameManager.sceneChanger.showCowScene();break;
		
		// TO EASTER EGG
		case "goEasterEggDay1":gameManager.sceneChanger.showEasterEggDay1();break;
		case "goEasterEggYear1":gameManager.sceneChanger.showEasterEggYear1();break;
		case "goEasterEggYear2":gameManager.sceneChanger.showEasterEggYear2();break;
		

		}
		
	}

}
