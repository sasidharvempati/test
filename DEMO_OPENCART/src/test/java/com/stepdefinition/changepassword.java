package com.stepdefinition;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.myaccountpage;
import com.pages.passwordpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class changepassword {
	WebDriver driver;
	accountpage ap;
	myaccountpage map;
	passwordpage pdp;
	
	@Given("^user is on account page and wants to change password$")
	public void user_is_on_account_page_and_wants_to_change_password() throws Throwable {
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

	@Given("^user navigates to my account page to change password$")
	public void user_navigates_to_my_account_page_to_change_password() throws Throwable {
	    ap = new accountpage(driver);
	    ap.myaccount();
	    ap.Myaccount();
	    //throw new PendingException();
	}

	@When("^user clicks password$")
	public void user_clicks_password() throws Throwable {
	    map = new myaccountpage(driver);
	    map.click_password();
	    //throw new PendingException();
	}

	@When("^user gives valid password$")
	public void user_gives_valid_password() throws Throwable {
	    pdp = new passwordpage(driver);
	    pdp.enter_password("sasiopencart");
	    pdp.enter_newpassword("sasiopencart");
	    //throw new PendingException();
	}

	@When("^user clicks continue to change password$")
	public void user_clicks_continue_to_change_password() throws Throwable {
	    pdp = new passwordpage(driver);
	    pdp.click_passwordcontinue();
	    //throw new PendingException();
	}

	@Then("^account password is changed$")
	public void account_password_is_changed() throws Throwable {
	    String actmsg = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]")).getText();
	    String expmsg = "Success: Your password has been successfully updated.";
	    assertEquals(expmsg, actmsg);
	    {
	    	System.out.println("password is changed");
	    }
	    //throw new PendingException();
	}

}
