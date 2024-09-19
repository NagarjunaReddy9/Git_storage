package E_domain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Driver;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

     public class BluLife_Project {
	WebDriver driver;
		Random random = new Random();
		 int min = 10000;
	        int max = 99999;
	@Test
	public void launch() throws InterruptedException, AWTException {

		driver = new ChromeDriver();
		driver.get("https://bltestapp.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]"));
		a.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath(
				"/html/body/app-root/app-public-content-layout/app-header-one/header/div[3]/div/div/div/div[2]/div[2]/app-public-settings/div/ul/li[4]/div[2]/ul/li/a"));
		ele1.click();

		driver.findElement(By.xpath("//input[@formcontrolname=\"emailid\"]")).sendKeys("289023845");

		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("naveen@123");
		driver.findElement(By.xpath("//button[@class=\"btn btn-solid btn-block btn-sign\"]")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/app-content-layout/div/div/div/div[1]/app-sidebar/div[2]/ul/li[8]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-content-layout/div/div/div/div[1]/app-sidebar/div[2]/ul/li[8]/ul/li[2]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Amount\"]")).sendKeys("10000");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Reference No\"]")).sendKeys(String.valueOf(random.nextInt(max - min + 1) + min));
		driver.findElement(By.xpath("//*[@formcontrolname=\"transactionsource\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Wallet_Request_Form\"]/div/div/div/form/div[3]/div/select/option[3]"))
				.click();
		driver.findElement(By.xpath("//*[@type=\"date\"]")).sendKeys("11/03/2024");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"btn btn-solid btn-xs\"][1]")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		Thread.sleep(4000);
		File file = new File("D:\\Screenshots\\Screenshot (2).png");
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"btn btn-solid btn-xs\"][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"swal2-confirm swal2-styled\"]")).click();
		Thread.sleep(2000);

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
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div[4]/textarea"))
				.sendKeys("yes approved");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div[5]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"swal2-confirm swal2-styled\"]")).click();

	}
}