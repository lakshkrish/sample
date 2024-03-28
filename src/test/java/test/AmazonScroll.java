    package test;

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.JavascriptExecutor;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class AmazonScroll {
		
		public static void main(String[] args)throws IOException, InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote--allow--origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement down1=driver.findElement(By.xpath("//*[contains(text(),'Back to top')]"));
			WebElement up=driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].scrollIntoView(false)",down1);
			System.out.println("Scrolled down");
			Thread.sleep(5000);
			js.executeScript("arguments[0].scrollIntoView(true)",up);
			System.out.println("Scrolled up");
			
	        driver.quit();
			

	}
		
	}


