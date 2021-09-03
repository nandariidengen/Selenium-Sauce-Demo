package com.nandari.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage {
	WebDriver webDriver;

	public InventoryItemPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//div[@class='inventory_details_name large_size']")
	WebElement itemName;
	
	@FindBy(xpath = "//div[@class='inventory_details_desc large_size']")
	WebElement itemDescription;
	
	@FindBy(xpath = "//div[@class='inventory_details_price']")
	WebElement itemPrice;
	
	public String getItemName() {
		return itemName.getText();
	}
	
	public String getItemDescription() {
		return itemDescription.getText();
	}
	
	public String getItemPrice() {
		return itemPrice.getText();
	}
}
