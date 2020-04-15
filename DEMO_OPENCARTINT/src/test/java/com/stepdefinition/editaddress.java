package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.addresspage;
import com.pages.myaccountpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class editaddress {
	WebDriver driver;
	accountpage ap;
	myaccountpage map;
	addresspage adp;


	@Given("^user is on account page and wants to edit address$")
	public void user_is_on_account_page_and_wants_to_edit_address() throws Throwable {
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

	@Given("^user navigates to my account page to edit address$")
	public void user_navigates_to_my_account_page_to_edit_address() throws Throwable {
	ap = new accountpage(driver);
	ap.myaccount();
	ap.Myaccount();


	}

	@When("^user clicks on address book$")
	public void user_clicks_on_address_book() throws Throwable {
	map = new myaccountpage(driver);
	map.click_addressbook();


	}

	@When("^user changes the address$")
	public void user_changes_the_address() throws Throwable {
	adp = new addresspage(driver);
	adp.addresspage_Edit_address();
	adp.Change_Address1("2/2/3/5");
	adp.Change_Address2("Ashoknagar");
	adp.Change_City("Kadapa");
	adp.Change_PostCode("518990");
	        adp.Change_Country();
	        adp.Change_Region();
	    adp.Change_Default();
	     
	     
	   
	}

	@When("^user clicks submit to apply changes$")
	public void user_clicks_submit_to_apply_changes() throws Throwable {
	adp = new addresspage(driver);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input")).click();
	// adp.Change_continue_btn();
	//  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input")).click();
	}

	@Then("^address of user is changed$")
	public void address_of_user_is_changed() throws Throwable {
	adp = new addresspage(driver);
	String expecteddisplay = driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
	String actualdispaly="Your address has been successfully updated";
	assertEquals(expecteddisplay,actualdispaly);
	{
	System.out.println("Address has been edited");
	}
	}

}
