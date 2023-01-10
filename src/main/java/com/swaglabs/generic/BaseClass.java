package com.swaglabs.generic;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.swaglabs.pom.Home;
import com.swaglabs.pom.Login;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtil w;
	public ReadDataFromProp r = new ReadDataFromProp();
	@BeforeClass(groups= {"smoke","regression"})
	public void launchBrowser() throws IOException {
   driver=new ChromeDriver();
	
	w = new WebDriverUtil(driver);
	w.maximizewindow();
	w.waitForPageLoad();
	}
	@BeforeMethod(groups= {"smoke","regression"})
	public void setLogin() throws IOException, InterruptedException {

		
		String url = r.readdatafrompropfile("url");
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		String username = r.readdatafrompropfile("username");
		String password = r.readdatafrompropfile("password");
		Login ln=new Login(driver);
		ln.login(username,password);
	
	}
	@AfterMethod(groups= {"smoke","regression"})
	public void setLogout() throws InterruptedException {
		Home h=new Home(driver);
		h.lout();
	}

	@AfterClass(groups= {"smoke","regression"})
	public void closeBrowser() {
		driver.close();
	}


}
