package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class AmazonActn {
public static void main(String[] args)throws IOException, AWTException, InterruptedException
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote--allow--origins=*");
	WebDriver driver= new ChromeDriver(options);
	driver.get("https://www.amazon.in");
	WebElement mob=driver.findElement(By.xpath("//*[text()='Mobiles']"));
	
	Actions acc = new Actions(driver);
	acc.contextClick(mob).perform();
	
	Thread.sleep(1000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(1000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
	
	
	

}
}