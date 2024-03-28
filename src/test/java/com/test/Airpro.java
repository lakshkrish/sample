package com.test;

import java.awt.AWTException;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import com.testing.framework.EmailUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.jar.asm.Handle;

public class Airpro {
	public static void main(String[] args) throws AWTException, InterruptedException,NullPointerException {
		//String userProfile= "C:\\Users\\user\\AppData\\Local\\Google\\Firefox\\User Data\\";
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications");
        //option.addArguments("--user-data-dir="+userProfile);
        //option.addArguments("--profile-directory=Default");
        //option.addArguments("--start-maximized");
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement From=driver.findElement(By.xpath("//input[@placeholder='From']"));
		From.sendKeys("Tirupati");
		Thread.sleep(1000);
	    From.sendKeys(Keys.ARROW_DOWN);
	    From.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='To']")).click();
	    WebElement To=driver.findElement(By.xpath("//input[@placeholder='To']"));
	    To.click();
	    To.sendKeys("Mumbai");
	    To.sendKeys(Keys.ARROW_DOWN);
	    To.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    WebElement cal=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 24 2024')]"));
	    cal.click();
	    driver.findElement(By.xpath("//*[text()='Search']")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter right']//button")).click();
	    driver.findElement(By.xpath("//div[@class='priceSection priceLockPersuasionExists']//button//span")).click();
	    Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='fareFamilyCardWrapper cta-wrapper glider-slide visible right-1']//div[3]//div//button")).click();
	  //driver.findElement(By.xpath("//div[@class='fareFamilyCardWrapper cta-wrapper glider-slide center visible']//button")).click();
	  //driver.findElement(By.xpath("//div[@class='makeFlex spaceBetween center cta-container']//button")).click();

	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testcode429@gmail.com");
	    driver.findElement(By.xpath("//div[@class='btnContainer appendBottom25']//button")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter OTP here']"));
	    //EmailUtils emailUtils=new EmailUtils();
	    //Properties prop=new properties();
	    //prop.load(new FileInputStream("C:\\Users\\mailm\\eclipse\\java-2023-03\\eclipse\\configuration"));
	    //store connection=emailUtils.connectToGmail(prop);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.xpath("//div[@class='header__aside']//div//a[2]")).click();
      driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testcode429@gmail.com");
      driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
      WebElement pass=driver.findElement(By.xpath("//div[@class='CYBold']//div[@id='password']"));
      pass.sendKeys("hellojava123");
      //js.executeScript("arguments[0].click()",enter);

	    //driver.switchTo().defaultdiv[@]Content();

	    
	    
	    //Thread.sleep(1000);
	    //driver.findElement(By.xpath("//div[@class='button buttonSecondry buttonBig fontSize12 relative']//button")).click();
	    //driver.switchTo().defaultContent();


	    //driver.findElement(By.xpath("//div[@class='commonOverlay']//button")).click(); 
	}

	private static JavascriptExecutor javascriptexcecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
