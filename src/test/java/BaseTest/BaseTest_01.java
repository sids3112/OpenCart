package BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest_01 {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest_01() throws IOException {
		prop=new Properties();
		FileReader fr = new FileReader("C:\\Eclipse-workspace\\OpenCartTest\\src\\test\\resources\\ConfigFile\\config.properties");
		prop.load(fr);
		
		
	}
	
	public static  void initialize() {
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		else if(BrowserName.equals("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
