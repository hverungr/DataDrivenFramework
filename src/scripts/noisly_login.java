package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_constant;
import generics.Excel;

public class noisly_login implements Auto_constant
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty(key, value);
		String un = Excel.abc(excelpath,"Sheet1",0,2);
		String pwd = Excel.abc(excelpath,"Sheet1", 1, 2);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.noisli.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[41]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-modal-input-email")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("login-modal-input-password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("login-modal-input-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu-account-img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Log Out'])[1]")).click();

	}

}
