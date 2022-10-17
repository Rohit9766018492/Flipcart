package com.qa.pageLayer;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Elecronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(Elecronic).build().perform();
		driver.findElement(By.xpath("//a[text()='Laptop and Desktop']")).click();
		
		driver.findElement(By.xpath("//div[text()='Mi Notebook Horizon Edition 14 Core i7 10th Gen - (8 GB/512 GB SSD/Windows 10 Home/2 GB Graphics) JYU4...']")).click();
		
		String MainWindowId = driver.getWindowHandle();
		System.out.println(MainWindowId);
		
		Set<String> AllWindowId = driver.getWindowHandles();
		
		for(String child:AllWindowId)
		{
			System.out.println(child);
			
			if(!(MainWindowId.equals(child)))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}
		}
		driver.findElement(By.xpath("//input[@class='_253qQJ']")).sendKeys("2");
	}
}
