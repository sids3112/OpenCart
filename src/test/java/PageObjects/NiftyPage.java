package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseTest_01;

public class NiftyPage extends BaseTest_01 {

	public NiftyPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"indices-sectoral\"]/div/div/select")
	WebElement indexDropdown;
	
	@FindBy(xpath="//*[@id=\"leftcontainer\"]/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")
	WebElement nazara;
	
	
	public String Niftypagetitle() {
		return driver.getTitle();
	}
	public NazaraPage dropdown() throws IOException {
		Select select = new Select(indexDropdown);
		select.selectByVisibleText("NIFTY MEDIA");
		nazara.click();
		
		return new NazaraPage();
	}

}
