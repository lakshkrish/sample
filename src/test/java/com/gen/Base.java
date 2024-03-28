package com.gen;

import org.testng.Assert;
import org.testng.asserts.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		public static WebDriver driver;


	 public static void browserLaunch(String url) 
	  {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote--allow--origins=*");
		driver = new ChromeDriver(option);
        

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String dem=driver.getCurrentUrl();
        Assert.assertEquals(dem,url);
        System.out.println(url+"launched");
        
	   }

	 public static void maxi() 
	 {
		driver.manage().window().maximize();
	}
	 public static void getTitle()
	 {
		 String title=driver.getTitle();
		 System.out.println(title);
		 SoftAssert s=new SoftAssert();
		 s.assertEquals(title,"Facebook","Title mismatched");
		 
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

