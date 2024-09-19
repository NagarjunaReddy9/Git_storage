
package E_domain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class admin {
	WebDriver driver;
	@Test
	public void adminlaunch() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://admin.bltestapp.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
		 driver.findElement(By.xpath("//*[@formcontrolname=\"Password\"]")).sendKeys("blulife#2024");
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class=\"swal2-confirm swal2-styled\"]")).click();
		 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sidebar-nav\"]/li[6]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"141\"]/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type=\"submit\"][1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div[4]/textarea")).sendKeys("yes approved");
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-xs\"][1]")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class=\"swal2-confirm swal2-styled\"]")).click();
	}
}
