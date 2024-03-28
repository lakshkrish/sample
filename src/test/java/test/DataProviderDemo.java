package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	@Test(dataProvider= "logindata")
	public void dummy(String user,String pass) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote--allow--origin*=");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("opened FB");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
		}
	@DataProvider(name="logindata") 
	public Object[][] login() {
		Object[][] data = new Object[3][2];
		data[0][0]="muthu";
		data[0][1]="ABCDEF";
		
		data[1][0]="gugan";
		data[1][1]="GOOD";
		
		data[2][0]="madhu";
		data[2][1]="HAPPY";
		return data;
		
	}
}
