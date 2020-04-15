package com.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.accountpage;
import com.pages.mobilenumberpage;
import com.pages.myaccountpage;
import com.seleniumutil.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class changemobilenum {
	WebDriver driver;
    accountpage ap;
    myaccountpage map;
    mobilenumberpage mnp;
    seleniumutility util;

@Given("^user is on account page and wants to change mobile number$")
public void user_is_on_account_page_and_wants_to_change_mobile_number() throws Throwable {
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

@Given("^user navigates to my account page to change mobile number$")
public void user_navigates_to_my_account_page_to_change_mobile_number() throws Throwable {
ap=new accountpage(driver);
     ap.myaccount();
     ap.Myaccount();
}

@When("^user clicks on edit account$")
public void user_clicks_on_edit_account() throws Throwable {
map=new myaccountpage(driver);
map.click_editaccount();
}

@When("^user enters valid mobile number in edit box$")
public void user_enters_valid_mobile_number_in_edit_box() throws Throwable {
mnp= new mobilenumberpage(driver);
    mnp.enter_newmobilenum("8885737537");
}

@When("^user clicks continue to change mobile number$")
public void user_clicks_continue_to_change_mobile_number() throws Throwable {
mnp= new mobilenumberpage(driver);
    mnp.click_continue();
}

@Then("^mobile number is changed$")
public void mobile_number_is_changed() throws Throwable {
String acctualdisplay = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]")).getText();
    String expecteddisplay="Success: Your account has been successfully updated.";
    assertEquals(expecteddisplay,acctualdisplay);
    {
   System.out.println("mobile number is changed");
   }
    util = new seleniumutility(driver);
	util.takeSnapShot("E:\\cts\\projects in eclipse\\DEMO_OPENCARTINT\\src\\test\\resources\\screenshots\\mobile.png");

}


}
