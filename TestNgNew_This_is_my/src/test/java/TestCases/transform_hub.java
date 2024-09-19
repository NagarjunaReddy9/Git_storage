package TestCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class transform_hub {
	
	public int  add( int a,int b) {
		return a+b;
		
	}
	@Test
	public void sum() {
int print=add(5, 10);
Assert.assertEquals(print,15);
	}

}
