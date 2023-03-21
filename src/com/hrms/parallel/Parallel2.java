package com.hrms.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallel2 {
	WebDriver driver;
	@Test
	public void openFF()throws Exception{
		driver.navigate().to("http://google.com");
		Reporter.log("Opened google page in Chrome browser ");
		Thread.sleep(4000);
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(opt);
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
