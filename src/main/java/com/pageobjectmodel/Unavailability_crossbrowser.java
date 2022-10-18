package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Unavailability_crossbrowser {
	
	public WebDriver driver;

	public Unavailability_crossbrowser (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement  send1;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement  search1;
	//a-size-medium a-color-base

	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	private WebElement  get1;
	
	public WebElement getSend1() {
		return send1;
	}

	public WebElement getSearch1() {
		return search1;
	}

	
	public WebElement getGet1() {
		return get1;
	}


}
