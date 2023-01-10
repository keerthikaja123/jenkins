package com.swaglabs.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	// private WebElement clickshirt;
	@FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement clickshirt;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addcartclick;
	@FindBy(xpath = "//button[@name='checkout']")
	private WebElement checkoutclick;
	@FindBy(id = "logout_sidebar_link")
	private WebElement clicklogout;
	@FindBy(id="react-burger-menu-btn")
	private WebElement clickmenu;

	public WebElement getClickshirt() {
		return clickshirt;
	}

	public WebElement getAddcartclick() {
		return addcartclick;
	}

	public WebElement getCheckoutclick() {
		return checkoutclick;
	}

	public WebElement getClickmenu() {
		return clickmenu;
	}

	public WebElement getClicklogout() {
		return clicklogout;
	}

	public void lout() throws InterruptedException {

		clickmenu.click();
		Thread.sleep(3000);
		clicklogout.click();

	}

	public void addShirt() {
		clickshirt.click();
		addcartclick.click();
		checkoutclick.click();
	}

}
