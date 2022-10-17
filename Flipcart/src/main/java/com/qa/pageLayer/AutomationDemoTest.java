package com.qa.pageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemoTest {
	
 public static void main(String args[]) throws InterruptedException
 {
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("http://demo.automationtesting.in/Register.html");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.navigate().refresh();
	 
 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rohit");
 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sawant");
 WebElement address = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']"));
		address.click();
		 //address.sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohiteawant19695@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9529892968");
		
		 driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		 driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		 
		 driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//a[text()='English']")).click(); 
		 driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[8]")).click();
		 driver.findElement(By.xpath("(//select[@type='text'])[1]")).click();
		 driver.findElement(By.xpath("//option[text()='APIs']")).click();
		 
		 driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[10]")).click();
		 
		 driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("window.scrollBy(0,300)");
		 driver.findElement(By.xpath("//li[text()='India']")).click();
		 
		 driver.findElement(By.xpath("//select[@id='yearbox']")).click();
		 driver.findElement(By.xpath("//option[text()='1995']")).click();
		 
		 driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).click();
		 driver.findElement(By.xpath("//option[text()='June']")).click();
		 
		 driver.findElement(By.xpath("//select[@placeholder=\"Day\"]")).click();
		 driver.findElement(By.xpath("//option[text()='19']")).click();
		 driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Rohit.123");
		 driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Rohit.123");
		
		 driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		 
		 Thread.sleep(5);
		 
		 driver.quit();
		 
		 
 }
}
