package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
public class Singletone_crossbrowser {
public WebDriver driver;
	
	public Singletone_crossbrowser(WebDriver driver1) {
		this.driver=driver1;
		
	}
	private Login_crossbrowser login;
	public Login_crossbrowser login() {
		if(login==null) {
			login=new Login_crossbrowser(driver);
		}
		return login;
	}
	private Search_crossbrowser search;
	public Search_crossbrowser search() {
		if(search==null) {
			search=new Search_crossbrowser(driver);
		}
		return search;
	}
	
	private Unavailability_crossbrowser  Unavailability;
	public Unavailability_crossbrowser  Unavailability() {
		if( Unavailability==null) {
			 Unavailability=new Unavailability_crossbrowser(driver);
		}
		return  Unavailability;
	}

}
