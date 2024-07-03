package org.faild;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import net.bytebuddy.asm.Advice.Return;

public class WithKnown implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int mincount=0;
	final int maxcount=5;
		
		if(mincount<maxcount)
		{
			mincount++;
		
			return true;//condition true //testfail
		}
		return false;//testpass
	}



}

