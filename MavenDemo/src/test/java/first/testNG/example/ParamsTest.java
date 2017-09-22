package first.testNG.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamsTest {

	//data provider needs 
	@Test (dataProvider ="getData")
  public void userID(String username, String subject) {
	  System.out.println("username" +username + "subject" + subject);
    }
	
	
	//in junit does 3 things
	//but here it only needs 2 things
	//check multiple things since no constructor is needed
	@DataProvider
	public Object[][] getData(){
		Object obj[][] = {
				{"Bairon", "Computer Science"},
				{"Math", "Math"}
	    };
		return obj;
	}

}
