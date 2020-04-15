package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.logoutpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logout {
	WebDriver driver;
	accountpage ap;
	logoutpage lo;
	seleniumutility util;


	@Given("^user is on account page$")
	public void user_is_on_account_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.id("input-email")).sendKeys("sasidharvempati@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("sasiopencart");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
	}
	@When("^user clicks my account$")
	public void user_clicks_my_account() throws Throwable {
	ap=new accountpage(driver);
	ap.myaccount();
	}

	@When("^user clicks logout$")
	public void user_clicks_logout() throws Throwable {
	ap=new accountpage(driver);
	ap.logout();
	}

	@When("^user clicks continue$")
	public void user_clicks_continue() throws Throwable {
	lo=new logoutpage(driver);
	lo.logout_contunie_btn();
	}

	@Then("^user is logged out of his account$")
	public void user_is_logged_out_of_his_account() throws Throwable {
	ap=new accountpage(driver);
	String accpage = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText();
	String exppage ="Your Store";
	assertEquals(accpage,exppage);
	{
	System.out.println("user is logged out");
	}
	}

}
