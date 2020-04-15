package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.cartpage;
import com.pages.differentproducts;
import com.pages.productpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchaddtocart {
	WebDriver driver;
	cartpage cp;
	accountpage ap;
	productpage pp;
	differentproducts dp;

	@Given("^user is on account page to do a search$")
	public void user_is_on_account_page_to_do_a_search() throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();

	driver.get("https://demo.opencart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.id("input-email")).sendKeys("manojrj18@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("manojmanu");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
	}

	@When("^user searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
	ap=new accountpage(driver);
	         ap.search("HP LP3065");
	         ap.search_click();
	         
	}

	@When("^user gives required details in product page$")
	public void user_gives_required_details_in_product_page() throws Throwable {
	        dp = new differentproducts(driver);
	        pp = new productpage(driver);
	         dp.select_product2();
	         pp.quantity_pro2("1");
	}

	@When("^user clicks add to cart$")
	public void user_clicks_add_to_cart() throws Throwable {
	         pp.addtocart_pro2();

	}

	@Then("^selected product is added to cart$")
	public void selected_product_is_added_to_cart() throws Throwable {
	      ap= new accountpage(driver);
	      ap.shoppingcart();
	      String acctualproduct = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/table/tbody/tr/td[2]/a")).getText();
	      String expectedproduct="HP LP3065";
	      assertEquals(expectedproduct,acctualproduct);
	      {
	    System.out.println("product is added to cart");
	    }
	     
	}

}
