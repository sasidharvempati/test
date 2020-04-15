package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addresspage {
	 WebDriver  driver;


	 By Edit_address = By.xpath("/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[2]/a[1]");
	 By Address1 = By.id("input-address-1");
	 By Address2 = By.id("input-address-2");
	 By City = By.id("input-city");
	 By PostCode = By.id("input-postcode");
	 By Country = By.id("input-country");
	 By Country_select = By.xpath("/html/body/div[2]/div/div/form/fieldset/div[8]/div/select/option[107]");
	 By Region = By.id("input-zone");
	 By Region_select = By.xpath("/html/body/div[2]/div/div/form/fieldset/div[9]/div/select/option[31]");
	 By Default_btn = By.xpath("/html/body/div[2]/div/div/form/fieldset/div[10]/div/label[1]");
	 By Addresscontinue_btn = By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input");


	    public addresspage(WebDriver driver)
	    {
	 this.driver=driver;
	    }
	  
	  public void addresspage_Edit_address() {
	  driver.findElement(Edit_address).click();
	   }
	  public void Change_Address1(String Address1) {
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[4]/div/input")).clear();
	 driver.findElement(By.id("input-address-1")).sendKeys(Address1);

	  }
	  
	     public void Change_Address2(String Address2){
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[5]/div/input")).clear();
	 driver.findElement(By.id("input-address-2")).sendKeys(Address2);

	 }

	 public void Change_City(String City){
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[6]/div/input")).clear();
	 driver.findElement(By.id("input-city")).sendKeys(City);

	 }

	 public void Change_PostCode(String PostCode){
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[7]/div/input")).clear();
	 driver.findElement(By.id("input-postcode")).sendKeys(PostCode);
	 }
	 public void Change_Country() {
	 driver.findElement(Country).click();
	 driver.findElement(Country_select).click();
	 }

	 public void Change_Region() {
	 driver.findElement(Region).click();
	 driver.findElement(Region_select).click();

	 }

	  public void Change_Default() {
	 driver.findElement(Default_btn).click();
	 }

	 public void Change_continue_btn() {
	 driver.findElement(Addresscontinue_btn).click();
	 }
	


}
