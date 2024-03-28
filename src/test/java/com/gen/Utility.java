package com.gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;


 public static void browserLaunch() 
  {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote--allow--origins=*");
	driver = new ChromeDriver(option);

	driver.get("https://www.facebook.com/");
   }

 public static void maxi() 
 {
	driver.manage().window().maximize();
}
 public static void getTitle()
 {
	 String title=driver.getTitle();
	 System.out.println(title);
 }
 public static void getUrl() 
 {
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
 }
 public static void close() {
	 driver.quit();
 }
 //public static void type(WebElement element,String value) 
 //{
	 //element.sendKeys(value);
 //}
 //public static void click(WebElement element)
 //{
	 //element.click();
 //}
}


