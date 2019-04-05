package wdMethods;

import org.testng.IExecutionListener;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Listeners implements IExecutionListener ,IRetryAnalyzer {
	public long   startTime ;
	
    private int retryCnt = 0;
    //You could mentioned maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
    private int maxRetryCnt = 3;
    
	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		startTime = System.currentTimeMillis();
	        System.out.println("TestNG is going to start"); 
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		  System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");

	}
	
	@Override
	//This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		 if (retryCnt < maxRetryCnt) {
	            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
	            retryCnt++;
	            return true;
	        }
	        
		return false;
	}

}
