package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import generics.Auto_constant;

public class vtu_achievements implements Auto_constant
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://vtu.ac.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions a=  new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("menu-item-325"))).perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[6]"))).perform();
		driver.findElement(By.linkText("PG Center Bengaluru")).click();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='ACHIEVEMENTS']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("FACULTY ACHIEVEMENTS")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='ACHIEVEMENTS']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("STUDENTS ACHIEVEMENTS")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
	}

}
