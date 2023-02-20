package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTest_01;
import PageObjects.LoginPage;
import PageObjects.NiftyPage;

public class TC_02NiftyPage extends BaseTest_01{
	LoginPage login=new LoginPage();
	NiftyPage nifty=new NiftyPage();

	public TC_02NiftyPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		login=new LoginPage();
		nifty=login.moneypage();
	}
	
	
	
	@Test(priority=1)
	public void VerifyMoneyPage() throws IOException {
		nifty.dropdown();
	}
	
	@Test(priority=2)
	public void VerifyMoneyTitle() {
		String title=nifty.Niftypagetitle();
		Assert.assertEquals(title, "Indian Market BSE, NSE, Stock quotes, share market, stock market, stock tips: Rediff Stocks");
	}

}
