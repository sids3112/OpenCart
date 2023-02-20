package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.BaseTest_01;
import PageObjects.LoginPage;
import PageObjects.NazaraPage;
import PageObjects.NiftyPage;

public class TC_03NazaraPage extends BaseTest_01{
	LoginPage login=new LoginPage();
	NiftyPage nifty=new NiftyPage();
	NazaraPage nz= new NazaraPage();

	public TC_03NazaraPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		login=new LoginPage();
		nifty=login.moneypage();
		nz=nifty.dropdown();
	}
	
	@Test
	public void VerifyNazara() {
		nz.enteramt();
		
	}

}
