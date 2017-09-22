package first.testNG.example;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class GroupTest {

	
	@Test (groups= {"group1"})
	public void firstGroup() {
		System.out.println("I am in the first group TestNG test");
	}
	
	//compared to After in JUNIT
	@Test (groups= {"group2"})
	public void secondGroup() {
		System.out.println("I am after each methods TestNG test");	
	}
}
