package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mobilenumberpage {
	WebDriver driver;
public mobilenumberpage(WebDriver driver) {
	this.driver=driver;
}
public void enter_newmobilenum(String mobilenum) {
	driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).clear();
	driver.findElement(By.id("input-telephone")).sendKeys(mobilenum);
}
public void click_continue() {
	driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
}
}
