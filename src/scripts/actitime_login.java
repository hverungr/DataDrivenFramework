package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Excel;

public class actitime_login implements generics.Auto_constant
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty(key, value);
		
		//Excel.abc("./Selenium/Data/excel.xlsx", "Sheet1", 0, 0);
		
		String m_un = Excel.abc(excelpath,"Sheet1",0,0);
		String m_pwd = Excel.abc(excelpath,"Sheet1", 1, 0);
		String u_un = Excel.abc(excelpath,"Sheet1", 0, 1);
		String u_pwd = Excel.abc(excelpath,"Sheet1", 1, 1);
		
		/*System.out.println(m_un);
		System.out.println(m_pwd);
		System.out.println(u_un);
		System.out.println(u_pwd);*/
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("m_un");
		driver.findElement(By.name("pwd")).sendKeys("m_pwd");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("u_un");
		driver.findElement(By.name("pwd")).sendKeys("u_pwd");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
