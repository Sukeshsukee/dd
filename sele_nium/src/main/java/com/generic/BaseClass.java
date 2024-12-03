package com.generic;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Loginpage;
import pom.Logoutage;

public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suges\\OneDrive\\Documents\\src\\main\\resources\\Driver\\chromedriver.exe");
	}
	 WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException, InvalidFormatException {
		driver=new ChromeDriver();
		ExcelCell ex=new ExcelCell();
		String httt = ex.excel("Sheet1", 0, 1);
		driver.get(httt);
	}
	@BeforeMethod
	public void login() {
		Loginpage ln=new Loginpage(driver);
		ln.enterUserName();
		ln.password();
		ln.clickLogin();
	}
	@AfterMethod
	public void logout() {
		Logoutage ln=new Logoutage(driver);
		ln.clickOnLogout();	
}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}