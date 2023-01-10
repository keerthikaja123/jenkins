package com.swaglabs.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	 public Login(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   @FindBy(name="user-name")
	   private WebElement untb;
	   @FindBy(name="password")
	   private WebElement pwdtb;
	   @FindBy(name="login-button")
	   private WebElement logbtn;
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwdtb() {
		return pwdtb;
	}
	public WebElement getLogbtn() {
		return logbtn;
	}
	public void login(String username,String password) {
		untb.sendKeys(username);
		pwdtb.sendKeys(password);
		logbtn.click();
	}

}
