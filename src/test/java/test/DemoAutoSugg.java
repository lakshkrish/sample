package test;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DemoAutoSugg {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--Remote--allow--origin=*");
			WebDriver driver = new ChromeDriver(options);
	        driver.get("https://www.google.com/");
	        driver.findElement(By.name("q")).sendKeys("chennai");
	        Thread.sleep(1000);
	        List <WebElement> autoSuggestion = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
	        int size = autoSuggestion.size();
	        System.out.println(size);
	        autoSuggestion.get(size-2).click();
	        
		}

	}





	