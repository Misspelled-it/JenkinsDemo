package first.testNG.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	//before test is a feature does not count toward total overall for tests
	
	//this is like beforeClass
	@BeforeTest
	public void beforeTest() {
		System.out.println("Im before TestNG test");	
	}
	//compared to Before in JUNIT
	//this is like before class
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("I am before each methods TestNG test");	
	}
	
	
	@Test
	public void makeit() {
		System.out.println("I am the first time TestNG test");	
	}
	
	@Test
	public void makeitTwo() {
		System.out.println("I am the second time TestNG test");
	}
	
	//compared to After in JUNIT
	@AfterMethod
	public void afterEachMethod() {
		System.out.println("I am after each methods TestNG test");	
	}
	
	//compared to AfterClass in JUNIT
	@AfterTest
	public void afterTesting() {
			System.out.println("I am after everything in TestNG test");	
		}
		
		
	

}
