package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.differentproducts;
import com.pages.loginpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtowishlist {
	WebDriver driver;
	accountpage ap;
	seleniumutility util;
	differentproducts  dp;
	loginpage login;

	@Given("^user is on account page and wants to add a product to wishlist$")
	public void user_is_on_account_page_and_wants_to_add_a_product_to_wishlist() throws Throwable {
	// launch_browser("chrome", "https://demo.opencart.com/");
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.id("input-email")).sendKeys("saikunchala.kumar@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Sai@9052");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a/i")).click();
	}
	 

	@When("^user navigates to product page by selecting a product$")
	public void user_navigates_to_product_page_by_selecting_a_product() throws Throwable {
	// driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("MACBOOK");
	// driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
	ap = new accountpage(driver);
	ap.search("MACBOOK");
	ap.search_click();
	}

	@When("^user clicks add to wishlist$")
	public void user_clicks_add_to_wishlist() throws Throwable {
	dp=new differentproducts(driver);
	dp.addtowishlist_pro3();

	}
	 

	@Then("^product is added to wishlist$")
	public void product_is_added_to_wishlist() throws Throwable {
	util = new seleniumutility(driver);
	util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\wishlist.png");
	}



}
