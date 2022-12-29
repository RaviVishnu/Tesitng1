package org.insta;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"H:\\Selenium\\Greens\\Workspace\\Selenium Day3 task\\Amazon\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Duration duration = Duration.ofSeconds(100);
		driver.manage().timeouts().implicitlyWait(duration);
		
		driver.get("https://www.instagram.com/accounts/login/");

		Thread.sleep(4000);
		//WebElement findElement = driver.findElement(By.xpath(""));
		//WebElement findElement = driver.findElement(By.xpath(""));
		//WebElement findElement = driver.findElement(By.xpath(""));
		//WebElement findElement = driver.findElement(By.xpath(""));
		//WebElement findElement = driver.findElement(By.xpath(""));
		driver.findElement(By.name("username123")).sendKeys("87654321");
		
	}

}
