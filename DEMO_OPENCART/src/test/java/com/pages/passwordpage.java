package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class passwordpage {
		WebDriver driver;
		By password = By.id("input-password");
		By newpassword = By.id("input-confirm");
		By pdcontinue = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
		public passwordpage (WebDriver driver)
		 {
		this.driver=driver;
		 }
		 public void enter_password(String password1)
		 {
		driver.findElement(password).sendKeys(password1);
		 }
		 
		  public void enter_newpassword(String newpassword1)
		     {
		         driver.findElement(newpassword).sendKeys(newpassword1);
		     }

		public void click_passwordcontinue()
		{
		driver.findElement(pdcontinue).click();
		}

}
