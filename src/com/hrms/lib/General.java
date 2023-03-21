package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global{
	public void openApp() {
		//System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.navigate().to(url);
		System.out.println("Applicaton Opened");
		Log.info("Application Opened ");
	}
	public void closeApp() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application Closed ");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Successful");
		Log.info("Login Completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	
	//Add Employee
	public void frameEnter() {
		driver.switchTo().frame(frame_atr);
		System.out.println("Enter into frame");
		Log.info("Enter into frame");
	}
	public void addEmp() {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_lstname)).sendKeys(ln);
		driver.findElement(By.name(txt_fstname)).sendKeys(fn);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Add Employee details");
		Log.info("Employee Added");
	}
	public void frameExit() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
	}
	public void searchEmpId() {
		Select sa = new Select(driver.findElement(By.name(drpdwn_name)));
		sa.selectByIndex(1);
		driver.findElement(By.name(txt_searchnm)).sendKeys(eid);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("Employee Search Completed");
		Log.info("Employee Search Completed");
	}
	public void searchEmpFn() {
		Select sa = new Select(driver.findElement(By.name(drpdwn_name)));
		sa.selectByIndex(2);
		driver.findElement(By.name(txt_searchnm)).sendKeys(fn);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("Employee Search Completed");
		Log.info("Employee Search Completed");
	}
	public void dltEmp() {
		driver.findElement(By.xpath(check_clk)).click();
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("Selected Employee Deleted ");
		Log.info("Employee Deleted");
	}
	
	public void clickEmpname()
	{
		driver.findElement(By.xpath(link_name)).click();
		System.out.println("Employee name clicked");
		Log.info("Employee name clicked");
	}
	public void editEmp()
	{
		driver.findElement(By.xpath(btn_edit)).click();
		System.out.println("Clicked on Edit button");
		driver.findElement(By.xpath(txt_EmpFstNm)).clear();
		System.out.println("First name clear");
		driver.findElement(By.xpath(txt_EmpLstNm)).clear();
		System.out.println("Last name clear");
		driver.findElement(By.xpath(txt_EmpFstNm)).sendKeys(fn1);;
		System.out.println("First name entered");
		driver.findElement(By.xpath(txt_EmpLstNm)).sendKeys(ln1);;
		System.out.println("Last name entered");
		driver.findElement(By.xpath(btn_saveEdit));
		System.out.println("Save button clicked");
		Log.info("Employee Edited Successfully");
	}

}
