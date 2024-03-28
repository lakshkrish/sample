package com.gen;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote--allow--origins=*");
	WebDriver driver = new ChromeDriver(options );
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	//print parent window id
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	driver.findElement(By.id("newWindowBtn")).click();
	//print all window id
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows);
	for(String allwindow : allwindows) {
		if(!allwindow.equals(parentwindow)) {
			driver.switchTo().window(allwindow);
			driver.manage().window().maximize();
			WebElement mov=driver.findElement(By.id("firstName"));
			mov.sendKeys("Helloworld");
			System.out.println("Values passed");
			driver.close();
		}
	}
	
}
}
