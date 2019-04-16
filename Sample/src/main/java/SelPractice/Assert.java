package SelPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Assert {
	
	public void softAssertionTest(){
	   SoftAssert softAssert= new SoftAssert();
		
	   //Assertion failing
	
	   
	 //  softAssert.fail();
	   softAssert.assertNotEquals(1, 2);
	   System.out.println("Failing");
	   
	   //Assertion passing
	   softAssert.assertEquals(1, 1);
	   System.out.println("Passing");
	 
	   
	   //Collates test results and marks them pass or fail
	   softAssert.assertAll();
	}
}
