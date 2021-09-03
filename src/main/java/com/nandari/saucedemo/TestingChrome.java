package com.nandari.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingChrome {
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String expected = "OrangeHRM";
		String actualTitle = "";

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expected)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}

}
