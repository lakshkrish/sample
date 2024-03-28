package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookJs  {
	public static void main(String[] args)throws InterruptedException,IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote--allow--origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement login=driver.findElement(By.xpath("//*[@name='login']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arugments[0].setAttribute('value','helloworld')",user);
		js.executeScript("arugments[0].setAttribute('value','3456789')",pass);
		js.executeScript("arugments[0].click()",login);
		System.out.println("facebook success");
		
	}

}
