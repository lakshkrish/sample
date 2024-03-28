package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

public class SampleTestng {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void before() {
		System.out.println("Before method");

	}
	@Test
	public void tc2() {
		System.out.println("tc2");


	}
	@AfterMethod
	public void after() {
		System.out.println("after");

	}
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");


	}
	public void tc1() {
		System.out.println("tc1");


	}

}
