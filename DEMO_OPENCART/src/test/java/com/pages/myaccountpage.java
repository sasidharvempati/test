package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myaccountpage {
	WebDriver driver;
public myaccountpage(WebDriver driver) {
	this.driver=driver;
}
public void click_editaccount() {
	driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click();
}
public void click_password() {
	driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[3]")).click();
}
public void click_addressbook() {
	driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[4]")).click();
}
public void click_newsletter() {
	driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[12]")).click();
}
}
