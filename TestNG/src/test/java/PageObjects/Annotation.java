package PageObjects;

import org.testng.annotations.Test;

public class Annotation {

	@Test(priority = -10)
	public void aomkng() {
		System.out.println("-10");
	}

	@Test(priority = -1)
	public void aomKng() {
		System.out.println("-1");
	}

	@Test(priority = 0)
	public void huall() {
		System.out.println("0");
	}

	@Test
	public void z() {
		System.out.println("z");
	}

	@Test(priority = 1)
	public void csk() {
		System.out.println("1");
	}

	@Test(priority = -8)
	public void dog() {
		System.out.println("-8");
	}
	@Test
	public void sun()
	{
		System.out.println("no pri");
	}

}
