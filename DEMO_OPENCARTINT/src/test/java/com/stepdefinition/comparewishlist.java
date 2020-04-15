package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.wishlistpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class comparewishlist {
    WebDriver driver;
	accountpage ap;
	wishlistpage wp;
	seleniumutility util;


	@Given("^user is on account page and wants to compare a product in the wishlist$")
	public void user_is_on_account_page_and_wants_to_compare_a_product_in_the_wishlist() throws Throwable {
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


	@Given("^user clicks wishlist$")
	public void user_clicks_wishlist() throws Throwable {
	// launch_browser("chrome", "https://demo.opencart.com/");

	ap = new accountpage(driver);
	ap.wishlist();
	}
	 
	@When("^user compares product in wishlist$")
	public void user_compares_product_in_wishlist() throws Throwable {
	wp =  new wishlistpage(driver);
	wp.wishlist_product_box();
	String expectedelement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul[1]/li[2]")).getText();
	String actualelement = "Product Code: Product 18";
	assertEquals(expectedelement,actualelement);{
	System.out.println("product is in the wishlist");
	}

	}

	@Then("^selected product is compared$")
	public void selected_product_is_compared() throws Throwable {
		util = new seleniumutility(driver);
		util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\compare.png");
	System.out.println("product is compared");
	 


	}

}
