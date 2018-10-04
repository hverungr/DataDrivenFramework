package scripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_constant;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class flipkart implements Auto_constant
{
	public static void main(String[] args)
	{
			System.setProperty(key, value);
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			driver.findElement(By.name("q")).sendKeys("Kama Ayurveda Facewash");
			driver.findElement(By.className("vh79eN")).click();
			driver.findElement(By.linkText("Kama Ayurveda Rose Jasmine Face Cleanser Face Wash")).click();
			
			Set<String> child=driver.getWindowHandles();
			System.out.println(child);
			//driver.findElement(By.className("_2AkmmA _2Npkh4 _2MWPVK")).click();
			
			driver.close();
			
	}
	
	

}
