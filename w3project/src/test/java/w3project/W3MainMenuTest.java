package w3project;

import org.testng.annotations.Test;

import W3ProjectWebElements.W3MainMenu;

public class W3MainMenuTest extends W3Base {

@Test

public void clickTutorial() {
	driver.get("https://www.w3schools.com/");
	W3MainMenu w3mm = new W3MainMenu(driver);
	w3mm.clickTutorials();
}

}
