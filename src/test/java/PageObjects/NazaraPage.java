package PageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseTest_01;

public class NazaraPage extends BaseTest_01{

	public NazaraPage() throws IOException {
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"in_money\"]")
	WebElement amtbox;
	
	@FindBy(xpath="//*[@id=\"selPer\"]")
	WebElement period;
	
	public void enteramt() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		amtbox.click();
		amtbox.sendKeys("7000");
		Select select = new Select(period);
		select.selectByVisibleText("1 Year");
		
	}

}
