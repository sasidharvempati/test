package com.seleniumutil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class seleniumutility {
	WebDriver driver;
public seleniumutility(WebDriver driver) {
	this.driver=driver;
}
public void implicit_wait(long time) {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(time,  TimeUnit.SECONDS);
}
public void takeSnapShot(String path1) 
{

	TakesScreenshot screenshot = ((TakesScreenshot)driver);
    File Source = screenshot.getScreenshotAs(OutputType.FILE);
    try {
		FileUtils.copyFile(Source, new File(path1));
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}
