package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class differentproducts {
	WebDriver driver;
	public differentproducts(WebDriver driver) {
	this.driver=driver;
	}
	public void select_product1() {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
	}
	public void select_product2() {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[1]/h4/a")).click();
	}
	public void addtowishlist_pro3() {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[2]")).click();
	}


}
