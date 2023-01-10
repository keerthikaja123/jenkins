package com.swaglabs.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info {
	public Info(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	@FindBy(name="firstName")
	private WebElement fntb;
	@FindBy(name="lastName")
    private WebElement lntb;
	@FindBy(name="postalCode")
    private WebElement pctb;
	@FindBy(name="continue")
    private WebElement clickcont;
	@FindBy(name="finish")
	private WebElement clickfin;
	public WebElement getFntb() {
		return fntb;
	}
	public WebElement getClickcont() {
		return clickcont;
	}
	public WebElement getLntb() {
		return lntb;
	}
	public WebElement getPctb() {
		return pctb;
	}
	public WebElement getClickfin() {
		return clickfin;
	}
	public void custInfo()
	{
		fntb.sendKeys("abhi");
		lntb.sendKeys("kaja");
		pctb.sendKeys("500072");
		clickcont.click();
		
	}
	public void fin()
	{
		clickfin.click();
	}
	
}
