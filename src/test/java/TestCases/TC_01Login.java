package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import BaseTest.BaseTest_01;
import PageObjects.LoginPage;

public class TC_01Login extends BaseTest_01 {
	LoginPage login;
	
	private static Logger log = Logger.getLogger(TC_01Login.class);

	public TC_01Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		login=new LoginPage();
		
	}
	

	/*public void LoginTest_01() {
		login.LogininProcedure(prop.getProperty("email"), prop.getProperty("password"));
	}*/
	
	@Test(priority=1)
	public void VerifyTitleTest_01() {
		String titlename=login.gettile();
		Assert.assertEquals(titlename,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		log.info("**********Completed Test Case-1");
	}
	
	@Test
	public void VerifyMoneyPage_02() throws IOException {
		log.info("**********Started Test Case-2");
		login.moneypage();
		log.info("**********Completed Test Case-2");
	}

}
