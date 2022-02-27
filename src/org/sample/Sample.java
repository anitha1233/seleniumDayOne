package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumDayOne\\Lib\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/ ");
		
		driver.switchTo().frame(0);

		driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
			
	}

}
