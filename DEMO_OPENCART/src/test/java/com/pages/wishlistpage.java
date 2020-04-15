package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wishlistpage {
	WebDriver driver;
	By product_box = By.xpath("/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[2]/a");
	By continue_btn = By.xpath("/html/body/div[2]/div/div/div/div/a");

	public wishlistpage(WebDriver driver)
	{
	this.driver=driver;
	}
	public void wishlist_product_box() {
	driver.findElement(product_box).click();
	}

	public void wishlist_continue_btn() {
	driver.findElement(continue_btn).click();
	}

}
