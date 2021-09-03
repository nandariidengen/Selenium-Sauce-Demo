package com.nandari.saucedemo.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// navigate web driver
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	@After
	public void quit() {
		driver.close();
	}
}
