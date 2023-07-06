package tests;

import org.testng.annotations.Test;

import pages.NaveenRegister;

public class Registrationtest extends Baseclass {
	
	@Test
	public void test() {
		NaveenRegister ob=new NaveenRegister(driver);	
		
		ob.register();
		ob.firstname("AADITHYAN");
		ob.lastname("NARAYANAN");
		ob.email("aadithyannr@gmail.com");
		ob.phonenumber("8089728151");
		ob.password("A@cd123");
		ob.confirmpassword("A@cd123");
		ob.checkbox();
		ob.continu();
		ob.continu2();
	}

}
