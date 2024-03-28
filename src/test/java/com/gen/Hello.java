package com.gen;

import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;
import java.io.IOException;

public class Hello {

	@Test
	public void brokenlink()throws IOException {
	
		//browserLaunch(); 
		//maxi();
		//getTitle();
		//getUrl();
		//FbloginPage f= new FbloginPage();
		//f.getUser().sendKeys("muthulakshmi");
		//f.getPass().sendKeys("1234456");
		//f.getLogin().click();
		//System.out.println("login successful");
		//close();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote--allow--origin*=");
			WebDriver driver=new ChromeDriver(options);
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int size=((CharSequence) links).length();
			System.out.println(size);
			for(WebElement w:links)
			{
			String alllinks = w.getAttribute("href");
			URL url = new URL(alllinks);
			URLConnection urlConnection=url.openConnection();
			HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode() == 200)
			{
			System.out.println(alllinks+"-"+httpURLConnection.getResponseCode()+"-"+httpURLConnection.getResponseMessage());
			} else 
			{
			System.err.println(alllinks+"-"+httpURLConnection.getResponseCode()+"-"+httpURLConnection.getResponseMessage());
			}

	        }
}
}

