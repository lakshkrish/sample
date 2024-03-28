package com.gen;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import java.lang.String;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	public static void main(String[] args)throws ClassNotFoundException,NoSuchElementException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		WebElement start=driver.findElement(By.id("src"));
		start.sendKeys("Perungalathur,Chennai");
		driver.findElement(By.id("dest")).sendKeys("Hopes College,Coimbatore");

		driver.findElement(By.id("onwardCal")).click();
		String mon="Feb";
		String yea="2024";
		String dat="23";
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
		
		List<WebElement> s=driver.findElements(By.xpath(""));
		for(WebElement w:s) {
			String text=w.getText();
			if(text.equals(dat)) {
				w.click();
				break;
			}
		}
		//s.click();
		WebElement submit=driver.findElement(By.id("search_button"));
		submit.click();
		WebElement filter=driver.findElement(By.xpath("//*[@id='filter-block']/div/div[2]/ul[3]/li[4]/label[1]"));
        filter.click();
        WebElement seats=driver.findElement(By.xpath("//*[@id='24325440']/div/div[2]/div[1]"));
        seats.click();
        driver.findElement(By.xpath("//*[@id='rt_24325440']/div/div/div/div[2]/div[3]/div[2]/canvas")).click();
        driver.findElement(By.xpath("//*[@id='24325440']/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("//div[@class='modal-body oa-y'//ul//li[10]//div")).click();
        driver.findElement(By.xpath("//div[@class='other-container']//div[2]//div[4]//div[4]//h3")).click();
        driver.findElement(By.xpath("//div[@class='continue-container']")).click();
        driver.findElement(By.xpath("//*[@id='seatno-04']")).sendKeys("lakshmi");
        driver.findElement(By.xpath("//*[@id='div_23_0']")).click();
        driver.findElement(By.xpath("//*[@name='Age_0']")).sendKeys("34");
        WebElement n1=driver.findElement(By.id("200"));
        Select si=new Select(n1);
        si.selectByVisibleText("Coimbatore");
        driver.findElement(By.xpath("//*[@id='seatno-05']")).sendKeys("mail.myfrnd@gmail.com");
        driver.findElement(By.id("seatno-06")).sendKeys("9629227953");
        driver.findElement(By.xpath("//*[@id='travel-ins']/div[3]/div[1]/label[2]/span")).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[3]/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id='Credit Card']")).click();
        driver.findElement(By.name("cardNo")).sendKeys("12345679023457");
        driver.findElement(By.xpath("//*[@name='NAME ON CARD']")).sendKeys("muthu");
        WebElement cho=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[1]"));
        Select sil=new Select(cho);
        sil.selectByValue("4");
        WebElement chow=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]"));
        Select sili=new Select(chow);
        sili.selectByValue("2025");
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/input")).sendKeys("667");
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/label/div/div")).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[1]/div[2]/div/div[3]/div[1]")).click();





 
 
 

}
	}