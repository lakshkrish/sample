package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Client {
	@Test(threadPoolSize = 4, invocationCount = 10)
	private void tc1() {
		System.out.println("tc1");
		System.out.println("Thread-"+Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		System.out.println("tc2");
		System.out.println("Thread-"+Thread.currentThread().getId());
		
	}
	@Test
	private void tc3() {
		System.out.println("tc3");
		System.out.println("Thread-"+Thread.currentThread().getId());	
	}
	@Test(timeOut=15000)
	private void tc4() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote--allow--origins*=");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		System.out.println("tc4 success");
		driver.quit();
	}
	
	
	}
