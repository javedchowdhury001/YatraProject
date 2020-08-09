package com.YATRAProjectNCR;

import org.testng.annotations.Test;

public class LoginTest extends basetest {
	@Test

	public void MyAccountLogin() {
		log.info("Inside the MyAccountLogin");
		
		Homepage1.myaccountname();
		
		log.info("MyAccountLogin done Successfully");
	}

}
