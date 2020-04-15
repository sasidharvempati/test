package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.enquirypage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class enquiry {
	WebDriver driver;
	accountpage ap;
	enquirypage ep;
	seleniumutility util;

	@Given("^user is on account page to enquire$")
	public void user_is_on_account_page_to_enquire() throws Throwable {
	// launch_browser("chrome","https://demo.opencart.com/");
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

	@Given("^user clicks contact us$")
	public void user_clicks_contact_us() throws Throwable {
	      ap = new accountpage(driver);
	      ap.contactus();
	}

	@When("^user enters queries$")
	public void user_enters_queries() throws Throwable {
	        ep = new enquirypage(driver);
	        ep.enter_enq("about my order");

	}

	@When("^user clicks submit$")
	public void user_clicks_submit() throws Throwable {
	ep = new enquirypage(driver);
	       ep.click_enquirysubmit();
	       ep.click_enquirycontinue();
	}

	@Then("^query is submitted$")
	public void query_is_submitted() throws Throwable {
	util = new seleniumutility(driver);
	util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\myaccpage.png");

	  System.out.println("enquiry is done");
	 }

}
