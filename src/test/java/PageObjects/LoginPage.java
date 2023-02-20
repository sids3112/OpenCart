package PageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest_01;

public class LoginPage extends BaseTest_01 {
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="/html/body/div[2]/div/div[2]/a[2]")
	WebElement money;
	
	@FindBy(xpath="//*[@id=\"signin_info\"]/a[1]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"useremail\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"userpass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginsubmit\"]")
	WebElement signinbtn;
	
	@FindBy(xpath="//*[@id=\"div_nseindices\"]/div/div/div/ul[2]/li[1]/a")
	WebElement nifty;
	
	
	public void LogininProcedure(String usremail,String usrpass) {
		money.click();
		signin.click();
		email.click();
		email.sendKeys(usremail);
		password.click();
		password.sendKeys(usrpass);
		signin.click();
		
		
	}
	
	public String gettile() {
		return driver.getTitle();
	}
	
	public NiftyPage moneypage() throws IOException {
		money.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		nifty.click();
		
		return  new NiftyPage();
	}

	
}
