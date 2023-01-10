package com.swaglabs.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	WebDriver driver;
	
	public WebDriverUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	public void maximizewindow()
	{
		driver.manage().window().maximize();
	}
	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
