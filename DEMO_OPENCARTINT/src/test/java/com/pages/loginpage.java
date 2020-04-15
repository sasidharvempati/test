package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	By emailid = By.id("input-email");
	By password = By.id("input-password");
	By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	public loginpage(WebDriver driver)
	       {
	        this.driver=driver;
	       }
	public void enter_emailid(String emailid1)
	  {
	driver.findElement(emailid).sendKeys(emailid1);
	  }
	    public void enter_password(String password1)
	       {
	          driver.findElement(password).sendKeys(password1);
	       }
	    public void click_loginbtn()
	       {
	           driver.findElement(loginbutton).click();
	       }
//	    public void do_login(String emailid1, String password1)
//	      {
//	          this.enter_emailid(emailid1);
//	          this.enter_password(password1);
//	          this.click_loginbtn();
//	      }

}
