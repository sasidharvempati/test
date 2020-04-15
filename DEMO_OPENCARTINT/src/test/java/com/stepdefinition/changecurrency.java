package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class changecurrency {
	WebDriver driver;
	accountpage ap;
	seleniumutility util;

	@Given("^user is on account page and wants to change currency type$")
	public void user_is_on_account_page_and_wants_to_change_currency_type() throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	//driver=new ChromeDriver();
	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.id("input-email")).sendKeys("manojrj18@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("manojmanu");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]")).click();
	}

	@When("^user chooses the required curency in dropdown box$")
	public void user_chooses_the_required_curency_in_dropdown_box() throws Throwable {
	       ap = new accountpage(driver);
	       ap.currency();
	       ap.euro();
	}

	@Then("^required currency is selected$")
	public void required_currency_is_selected() throws Throwable {
	String acctualcurrency = driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/strong")).getText();
	   String expectedcurrency="€";
	   assertEquals(expectedcurrency,acctualcurrency);
	   {
	   System.out.println("currency is changed");
	  }
	   util = new seleniumutility(driver);
		util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\currency.png");

	}

}
