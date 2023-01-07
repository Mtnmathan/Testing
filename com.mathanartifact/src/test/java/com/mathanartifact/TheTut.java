package com.mathanartifact;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TheTut {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String title = driver.getTitle();
	System.out.println(title);
<<<<<<< HEAD
	System.out.println("Changes tried from IDE");
=======
	System.out.println("Edited in github")
>>>>>>> 7838b76fe6a3f9697c74f78b5b648e4fc800f8c5
	driver.close();
	driver.quit();
	
	}
}
