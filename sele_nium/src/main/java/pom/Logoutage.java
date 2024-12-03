package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutage {

	@FindBy(linkText = "Log out")
	WebElement logout;
	
	public Logoutage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout() {
		logout.click();
	}
}
