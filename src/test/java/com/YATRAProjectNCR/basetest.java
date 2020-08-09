package com.YATRAProjectNCR;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class basetest {
	
	public Logger log = Logger.getLogger(basetest.class);
	WebDriver driver;
	homepage1 Homepage1;
	

	@BeforeTest
	public void initialTest() {
		configureLogging();
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Driver Initialized !!!");

		driver.get("http://yatra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage1 = new homepage1(driver);
		log.info("Navigate to Yatra Page");
		
		
	}
	

	public void configureLogging() {
		String log4jConfigFile ="C:\\Users\\Javd\\eclipse-workspace\\YatraProject\\log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}