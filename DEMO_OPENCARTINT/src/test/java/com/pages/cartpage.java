package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
	WebDriver driver;
	By clickcheckout = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
	

	public cartpage(WebDriver driver)
	 {
	this.driver=driver;
	 }
	 public void click_checkout()
	 {
	driver.findElement(clickcheckout).click();
	 }

}
