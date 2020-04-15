package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutpage {
	WebDriver driver;

	By continue_btn = By.xpath("/html/body/div[2]/div/div/div/div/a");


	 public logoutpage(WebDriver driver)
	 {
	this.driver=driver;
	 }
	 public void logout_contunie_btn() {
	driver.findElement(continue_btn).click();
	 }

}
