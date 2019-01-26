package com.DataDrivenTesting.datadriven;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDriven {

	String url="http://newtours.demoaut.com/";
	@Test
	@Parameters({"username","password"})
	 public void Project(String username, String password) throws InterruptedException
	 {
		WebDriverManager.chromedriver().setup();
	
	  ChromeDriver driver = new ChromeDriver();
	  driver.get(url);
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).click();
	  
	 } 
}          

 



