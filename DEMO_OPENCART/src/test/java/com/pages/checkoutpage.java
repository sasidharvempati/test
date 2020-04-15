package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutpage {
	WebDriver driver;
	By radiobuttonbilling = By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label");
	By firstname = By.id("input-payment-firstname");
	By lastname = By.id("input-payment-lastname");
	   By address1 = By.id("input-payment-address-1");
	   By city = By.id("input-payment-city");
	  //country and state drop down
	 
	   By country = By.xpath("//*[@id=\"input-payment-country\"]");
	   By country1 = By.xpath("//*[@id=\"input-payment-country\"]/option[107]");
	   By state = By.xpath("//*[@id=\"input-payment-zone\"]");
	   By state1 = By.xpath("//*[@id=\"input-payment-zone\"]/option[3]");
	   By newaddresscontinue = By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[5]/div");

	   By radiobuttondlry = By.xpath("//*[@id=\"collapse-shipping-address\"]/div/form/div[3]/label");
	   By firstnamedlry = By.id("input-shipping-firstname");
	   By lastnamedlry = By.id("input-shipping-lastname");
	   By address1dlry = By.id("input-shipping-address-1");
	   By citydlry = By.xpath("//*[@id=\"button-shipping-address\"]");
	  //country and state drop down
	 
	 
	   By countrydlry = By.xpath("//*[@id=\"input-shipping-country\"]");
	   By countrydlry1 = By.xpath("//*[@id=\"input-shipping-country\"]/option[107]");
	   By statedlry = By.xpath("//*[@id=\"input-shipping-zone\"]");
	   By statedlry1 = By.xpath("//*[@id=\"input-shipping-zone\"]/option[3]");
	   By newaddresscontinuedlry = By.xpath("//*[@id=\"collapse-shipping-address\"]/div/form/div[5]/div");
	   By dlrycontinue = By.xpath("//*[@id=\"collapse-shipping-method\"]/div/div[2]/div");
	   By clickcheckbox = By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
	   By paymentcontinue = By.xpath("//*[@id=\"button-payment-method\"]");
	   By confirmsubmit = By.xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[2]/div");
	 
	 
	public checkoutpage(WebDriver driver)
	{
	this.driver=driver;
	}
	public void click_radiobutton()
	{
	driver.findElement(radiobuttonbilling).click();
	}
	public void enter_firstname(String firstname1)
	{
	      driver.findElement(firstname).sendKeys(firstname1);
	}
	public void enter_lastname(String lastname1)
	{
	      driver.findElement(lastname).sendKeys(lastname1);
	}
	public void enter_address1(String ab123)
	{
	      driver.findElement(address1).sendKeys(ab123);
	}
	public void enter_city(String city1)
	{
	      driver.findElement(city).sendKeys(city1);
	}

	//state and country


	public void enter_country()
	{
	driver.findElement(country).click();
	driver.findElement(country1).click();
	}
	public void enter_state()
	{
	      driver.findElement(state).click();
	      driver.findElement(state1).click();
	}
	public void click_addresscontinue()
	{
	driver.findElement(newaddresscontinue).click();
	}
	   

	public void click_radiobuttondlry()
	{
	driver.findElement(radiobuttondlry).click();
	}
	public void enter_firstnamedlry(String firstname11)
	{
	      driver.findElement(firstnamedlry).sendKeys(firstname11);
	}
	public void enter_lastnamedlry(String lastname11)
	{
	      driver.findElement(lastnamedlry).sendKeys(lastname11);
	}
	public void enter_address1dlry(String ab123123)
	{
	      driver.findElement(address1dlry).sendKeys(ab123123);
	}
	public void enter_citydlry(String city11)
	{
	      driver.findElement(citydlry).sendKeys(city11);
	}

	// state and country


	public void enter_countrydlry()
	{
	driver.findElement(countrydlry).click();
	driver.findElement(countrydlry1).click();
	}
	public void enter_statedlry()
	{
	      driver.findElement(statedlry).click();
	      driver.findElement(statedlry1).click();
	}
	public void click_addresscontinuedlry()
	{
	driver.findElement(newaddresscontinuedlry).click();
	}
	public void click_deliverycontinue()
	{
	driver.findElement(dlrycontinue).click();
	}
	public void clickcheckbox()
	{
	driver.findElement(clickcheckbox).click();
	}
	public void click_paymentcontinue()
	{
	driver.findElement(paymentcontinue).click();
	}
	public void click_submit()
	{
	driver.findElement(confirmsubmit).click();
	}

}
