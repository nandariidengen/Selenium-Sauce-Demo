package com.nandari.saucedemo;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// navigate web driver
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@Test
	public void test() {
		// input username dan password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// click
		driver.findElement(By.id("login-button")).click();
		
		String expecetedItemName = driver.findElement(By.className("inventory_item_name")).getText();
		String expecetedItemDesc = driver.findElement(By.className("inventory_item_desc")).getText();
		String expecetedItemPrice = driver.findElement(By.className("inventory_item_price")).getText();

//		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).click();

		String actualItemName = driver.findElement(By.cssSelector(".inventory_item_name")).getText();
		String actualItemDesc = driver.findElement(By.className("inventory_item_desc")).getText();
		String actualItemPrice = driver.findElement(By.cssSelector(".inventory_item_price")).getText();

		Assert.assertEquals(expecetedItemName, actualItemName);
		Assert.assertEquals(expecetedItemDesc, actualItemDesc);
		Assert.assertEquals(expecetedItemPrice, actualItemPrice);
		System.out.println("Passed");
	}


	
	@After
	public void quit() {
		driver.close();
	}

}
