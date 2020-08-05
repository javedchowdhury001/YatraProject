package com.YATRAProjectNCR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class basetest {
	WebDriver driver;
	homepage1 Homepage1;

	@BeforeTest
	public void initialTest() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://yatra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage1 = new homepage1(driver);
	}
}