package com.nandari.saucedemo.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nandari.saucedemo.pages.InventoryItemPage;
import com.nandari.saucedemo.pages.InventoryPage;
import com.nandari.saucedemo.pages.LoginPage;
import com.nandari.saucedemo.pages.SortItem;

public class SeleniumTest extends BaseTest {

	@Test
	public void test() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("standard_user");
		loginPage.setPassword("secret_sauce");
		loginPage.clickLogin();

		SortItem sortItem = new SortItem(driver);
		sortItem.clickItemSort(1);
		
		InventoryPage inventoryPage = new InventoryPage(driver);
		String expectedItemName = inventoryPage.getItemName(1);
		String expectedItemDesc = inventoryPage.getItemDescription(1);
		String expectedItemPrice = inventoryPage.getItemsPrice(1);
		inventoryPage.clickItemName(1);

		InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
		String actualItemName = inventoryItemPage.getItemName();
		String actualItemDesc = inventoryItemPage.getItemDescription();
		String actualItemPrice = inventoryItemPage.getItemPrice();

		Assert.assertEquals(expectedItemName, actualItemName);
		Assert.assertEquals(expectedItemDesc, actualItemDesc);
		Assert.assertEquals(expectedItemPrice, actualItemPrice);
	}

}