package demo_NG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int value=0;
		int range=4;
		if (value<range) {
			value++;
			return true;
			
		}
		return false;
	}
	

}
