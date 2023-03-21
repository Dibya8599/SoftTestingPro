package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Global {
	ChromeOptions opt;
	public WebDriver driver;
	//test data
	public String url="http://183.82.103.245//nareshit//login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String fn="Dibya";
	public String ln="Prakash";
	public String eid="4452";
	public String fn1="Chinmay";
	public String ln1="Sahoo";
	
	//Objects/elements
	public String txt_loginname= "txtUserName";
	public String txt_password= "txtPassword";
	public String btn_login= "Submit";
	public String link_logout= "Logout";
	
	public String btn_add="//input[@value='Add']";
	public String txt_lstname="txtEmpLastName";
	public String txt_fstname="txtEmpFirstName";
	public String btn_save="btnEdit";
	public String frame_atr="rightMenu";
	
	public String drpdwn_name="loc_code"; 
	public String drpdwn_option="Emp. ID";
	public String txt_searchnm="loc_name";
	public String btn_search="//input[@value='Search']";
	public String check_clk="//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input";
	public String btn_delete="//input[@value='Delete']";
	
	public String link_name="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String btn_edit="//input[@title='Edit'][@type='button']";
	public String txt_EmpFstNm="//input[@type='text'][@id='txtEmpFirstName']";
	public String txt_EmpLstNm="//input[@type='text'][@id='txtEmpLastName']";
	public String btn_saveEdit="//input[@type='button'][@title='Save']";

}
