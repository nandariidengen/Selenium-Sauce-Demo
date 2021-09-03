package com.nandari.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	WebDriver webDriver;

	public InventoryPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(className = "inventory_item_name")
	List<WebElement> itemsName;

	@FindBy(className = "inventory_item_desc")
	List<WebElement> itemsDescription;

	@FindBy(className = "inventory_item_price")
	List<WebElement> itemsPrice;

	@FindBy(className = "btn_small btn_inventory")
	List<WebElement> itemsBuyButton;

	public void clickItemName(int index) {
		itemsName.get(index).click();
	}

	public String getItemName(int index) {
		return itemsName.get(index).getText();
	}

	public String getItemDescription(int index) {
		return itemsName.get(index).getText();
	}

	public String getItemsPrice(int index) {
		return itemsPrice.get(index).getText();
	}

}
