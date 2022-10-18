package com.runner_crossbrowser;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Library.Library;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources",glue="com.stepdefination_crossbrowser",tags="@validLogin",monochrome=true,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:Reports","pretty","html:Report/HTMLReport.html" })

public class Runner_crossbrowser {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		System.out.println("Browser will launch");
		}

	@AfterClass
	public static void tear_down() {
		System.out.println("close the browser");
		driver.close();
	}

}
