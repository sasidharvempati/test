package com.baseclass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class library {
    static WebDriver  driver;
	public static WebDriver launch_browser(String browser, String url)
	   {
	    
	    String chrome_driver_path="chromedriver.exe";
	    String firefox_driver_path="geckodriver.exe";
	  switch(browser)
	   {
	  case "chrome":
	      System.setProperty("webdriver.chrome.driver", chrome_driver_path);
	         driver = new ChromeDriver();
	 break;
	  case "firefox":
	       System.setProperty("webdriver.gecko.driver", firefox_driver_path);
	        driver = new FirefoxDriver();
	 break;
	 default:
	        System.out.println("Supported browser optios:chrome & firefox");
	break;
	   }
	       driver.get(url);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(05,  TimeUnit.SECONDS);
	 return driver;
	 
	   }

	   public void quit()
	    {
	driver.close();
	}

}
