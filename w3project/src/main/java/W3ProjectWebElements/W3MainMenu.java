package W3ProjectWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3MainMenu {
WebDriver driver;
public W3MainMenu(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(id="navbtn_tutorials")
WebElement tutorials;
public void clickTutorials() {
	tutorials.click();
}
}
