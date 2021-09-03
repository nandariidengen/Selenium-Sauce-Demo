package com.nandari.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingFireFox {
	public static void main(String[] args) {
String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String expectedTitle = "OrangHRM";
		String actualTitle = "";
		
		//get actual value of the title
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		Select userType = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userType.selectByVisibleText("ESS");

		
	}

}
