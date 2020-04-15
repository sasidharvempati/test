package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newsletterpage {
	WebDriver driver;
	By radiobtn_yes = By.xpath("/html/body/div[2]/div/div/form/fieldset/div/div/label[1]");
	By Newsletter_Continue =By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input");

	public newsletterpage(WebDriver driver)
	{
	this.driver=driver;
	}
	public void newsletter_radiobtn_yes() {
	driver.findElement( radiobtn_yes).click();
	}
	public void newsletter_Newsletter_Continue() {
	driver.findElement(Newsletter_Continue).click();
	}

}
