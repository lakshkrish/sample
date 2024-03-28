package com.gen;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.lang.String;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Redbus {
	public static void main(String[] args)throws ElementNotInteractableException, AWTException, InterruptedException,TimeoutException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement start=driver.findElement(By.id("src"));
		start.sendKeys("Perungalathur");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Coimbatore");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
         
		driver.findElement(By.id("onwardCal")).click();
		String mon="Jul";
		String yea="2025";
		String dat="12";
		while(true) {
		WebElement title=driver.findElement(By.xpath("//*[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"));
		String t=title.getText();
		String arr1[]=t.split("\n");
		//System.out.println(t);
		System.out.println(arr1[0]);
		String arr2[]=arr1[0].split(" ");
		String month=arr2[0];
		String year=arr2[1];
		
		
		if(month.equalsIgnoreCase(mon)&&year.equals(yea)) {
			break;
			
		}else {
			driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]")).click();
			
		}
		}

		
        //System.out.println("Date Selected to book ticket");
		//WebElement v=driver.findElement(By.id("search_button"));
		//v.click();
        
       }
}

