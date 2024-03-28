package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class StepDefinition {
	WebDriver driver;
	@When("User is on fb page")
	public void launch(String url){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	}
	@When("user enter username and password")
	public void StringData(){
	driver.findElement(By.id("email")).sendKeys("muthu");
	driver.findElement(By.id("pass")).sendKeys("muthu123");
	}
	@When("user click <login>")
	public void user_click_login(){
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	}
	@Then("verify the error message")
	public void verifyErrorMsg(){
	WebElement verify=driver.findElement(By.xpath("//a[text()='Find your Account and Log in']"));
	verify.click();
	Assert.assertEquals(verify.getText(),"Find your Account and Log in");
	System.out.println(verify.getText());

}
}
