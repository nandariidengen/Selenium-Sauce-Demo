package com.nandari.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortItem {
	WebDriver driver;

	public SortItem(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "product_sort_container")
	List<WebElement> itemSort;

	public void clickItemSort(int index) {
	itemSort.get(index).click();
	}
}
