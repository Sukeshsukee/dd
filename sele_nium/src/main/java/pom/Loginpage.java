package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BaseClass;

public class Loginpage {

	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement login;

	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(){
		username.sendKeys("student");	
	}
	public void password(){
		password.sendKeys("Password123");	
	}
	public void clickLogin(){
		login.click();	
	}
	
}
