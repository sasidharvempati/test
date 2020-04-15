package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.differentproducts;
import com.pages.productpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class categoryaddtocart {
	WebDriver driver;
	accountpage ap;
	differentproducts dp;
	productpage pp;
	
	@Given("^user is on account page to select a product$")
	public void user_is_on_account_page_to_select_a_product() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
	    driver= new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	    driver.findElement(By.id("input-email")).sendKeys("sasidharvempati@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("sasiopencart");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
	    //throw new PendingException();
	}

	@When("^user navigates to product page by clicking on the product$")
	public void user_navigates_to_product_page_by_clicking_on_the_product() throws Throwable {
	    ap = new accountpage(driver);
	    ap.laptops();
	    ap.showlaptops();
	    dp = new differentproducts(driver);
	    dp.select_product1();
	    //throw new PendingException();
	}

	@When("^user enters the details of the product$")
	public void user_enters_the_details_of_the_product() throws Throwable {
	    pp = new productpage(driver);
	    pp.deliverydate_pro1("2020-04-22");
	    pp.quantity_pro1("1");
	    //throw new PendingException();
	}

	@When("^user clicks on add to cart$")
	public void user_clicks_on_add_to_cart() throws Throwable {
	    pp = new productpage(driver);
	    pp.addtocart_pro1();
	    //throw new PendingException();
	}

	@Then("^product gets added to cart$")
	public void product_gets_added_to_cart() throws Throwable {
	    System.out.println("product is added to cart");
	}	

}
