package com.stepdefinition;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.myaccountpage;
import com.pages.newsletterpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class subscribenewsletter {
	WebDriver driver;
	accountpage ap;
	myaccountpage map;
	newsletterpage np;
	seleniumutility util;
	
	@Given("^user is on account page and wants to subscribe newsletter$")
	public void user_is_on_account_page_and_wants_to_subscribe_newsletter() throws Throwable {
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

	@Given("^user navigates to my account page to subscribe newsletter$")
	public void user_navigates_to_my_account_page_to_subscribe_newsletter() throws Throwable {
	    ap = new accountpage(driver);
	    ap.myaccount();
	    ap.Myaccount();
	    //throw new PendingException();
	}

	@When("^user clicks newsletter$")
	public void user_clicks_newsletter() throws Throwable {
	    map = new myaccountpage(driver);
	    map.click_newsletter();
	    //throw new PendingException();
	}

	@When("^user clicks yes$")
	public void user_clicks_yes() throws Throwable {
		np = new newsletterpage(driver);
		np.newsletter_radiobtn_yes();
	    //throw new PendingException();
	}

	@When("^user clicks submit to subscribe$")
	public void user_clicks_submit_to_subscribe() throws Throwable {
		np = new newsletterpage(driver);
		np.newsletter_Newsletter_Continue();
	    //throw new PendingException();
	}

	@Then("^newsletter is subscribed$")
	public void newsletter_is_subscribed() throws Throwable {
	    String actmessage = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]")).getText();
	    String expmessage = "Success: Your newsletter subscription has been successfully updated!";
	    assertEquals(expmessage, actmessage);
	    {
	    	System.out.println("newsletter is subscribed");
	    }
	    util = new seleniumutility(driver);
		util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\newsletter.png");
	    //throw new PendingException();
	}

}
