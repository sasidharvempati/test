package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pages.accountpage;
import com.pages.cartpage;
import com.pages.checkoutpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkout {
	WebDriver driver;
	cartpage cp;
	checkoutpage ckp;
	accountpage ap;

	@Given("^A product is added to cart$")
	public void a_product_is_added_to_cart() throws Throwable {
	// System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	// driver=new ChromeDriver();
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

	@Given("^user proceeds to checkout page$")
	public void user_proceeds_to_checkout_page() throws Throwable {
	ap = new accountpage(driver);
	ap.shoppingcart();
	//ap.checkout();
	cp=new cartpage(driver);
	cp.click_checkout();
	}

	@When("^user enters delivery details$")
	public void user_enters_delivery_details() throws Throwable {
	ckp = new checkoutpage(driver);
//	driver.findElement(By.xpath("//*[@id=\"payment-existing\"]")).click();
//	driver.findElement(By.xpath("//*[@id=\"payment-existing\"]/select/option")).click();
	driver.manage().timeouts().implicitlyWait(05,  TimeUnit.SECONDS);
	 ckp.click_addresscontinue();
	ckp.click_addresscontinuedlry();
	  ckp.click_deliverycontinue();
	}

	@When("^user selects the payment method$")
	public void user_selects_the_payment_method() throws Throwable {
	ckp = new checkoutpage(driver);
	ckp.clickcheckbox();
	 ckp.click_paymentcontinue();
	}

	@When("^user clicks confirm order$")
	public void user_clicks_confirm_order() throws Throwable {
	ckp = new checkoutpage(driver);
	ckp.click_submit();
	}

	@Then("^product order is placed$")
	public void product_order_is_placed() throws Throwable {
	String acctualdisplay = driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]")).getText();
	     String expecteddisplay="Your order has been successfully processed!";
	     assertEquals(expecteddisplay,acctualdisplay);
	     {
	     System.out.println("product is being checked out");
	     }
	} 

}
