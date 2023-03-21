package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General ob = new General();
		ob.openApp();
		Thread.sleep(3000);
		ob.login();
		Thread.sleep(3000);
		ob.frameEnter();
		Thread.sleep(3000);
		ob.addEmp();
		Thread.sleep(3000);
		ob.frameExit();
		Thread.sleep(3000);
		ob.logout();
		Thread.sleep(3000);
		ob.closeApp();
	}

}
