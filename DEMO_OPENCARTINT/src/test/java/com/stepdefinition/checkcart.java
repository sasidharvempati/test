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

public class checkcart {
	WebDriver driver;
	accountpage ap;
	seleniumutility util;

	@Given("^user is on account page and wants to check the cart$")
	public void user_is_on_account_page_and_wants_to_check_the_cart() throws Throwable {
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
	}

	@Given("^user navigates to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
	      ap = new accountpage(driver);
	      ap.shoppingcart();
	}

	@When("^user checks the product in the cart$")
	public void user_checks_the_product_in_the_cart() throws Throwable {
	       String acctualproductincart = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).getText();
	       String expectedproductincart="HP LP3065";
	       assertEquals(expectedproductincart,acctualproductincart);
	      {
	     System.out.println("product is present in cart");
	    }
	}

	@Then("^confirms product is present or not$")
	public void confirms_product_is_present_or_not() throws Throwable {
    util = new seleniumutility(driver);
    util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\cart.png");

	}
}
