package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void tc004() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General ob = new General();
		ob.openApp();
		ob.login();
		ob.frameEnter();
		Thread.sleep(3000);
		ob.searchEmpFn();
		Thread.sleep(3000);
		ob.dltEmp();
		Thread.sleep(3000);
		ob.frameExit();
		ob.logout();
		ob.closeApp();
	}

}
