package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CrossBrowseDemo {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyTitle(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			System.out.println("welcome to chrome");
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			System.out.println("welcome to edge");
		}
		driver.get("https://www.softwaretestingmaterial.com/stale-element-reference-exeception-selenium-webdriver/");
		driver.manage().window().maximize();
		
	}
	

}
