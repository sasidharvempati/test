package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage {
	WebDriver driver;
	public productpage(WebDriver driver) {
	this.driver=driver;
	}
	public void deliverydate_pro1(String date) {
	driver.findElement(By.xpath("//*[@id=\"input-option225\"]")).clear();
	driver.findElement(By.id("input-option225")).sendKeys(date);
	}
	public void quantity_pro1(String quantity1) {
	driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
	driver.findElement(By.id("input-quantity")).sendKeys(quantity1);
	}
	public void addtocart_pro1() {
	driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	}
	public void quantity_pro2(String quantity2) {
	driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
	driver.findElement(By.id("input-quantity")).sendKeys(quantity2);
	}
	public void addtocart_pro2() {
	driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
	}

}
