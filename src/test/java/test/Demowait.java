package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demowait {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote--allow--origins=*");
	WebDriver driver = new ChromeDriver(options );
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='nav-imageHref']")));
	driver.findElement(By.xpath("//*[@class='nav-imageHref']")).click();
	
}
}
