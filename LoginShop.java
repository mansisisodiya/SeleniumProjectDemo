package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginShop {
	public static void main(String args[])
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rs700\\Mansi\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://demo.virtuemart.net/");
	      driver.findElement(By.cssSelector("img[alt='male-tshirt-white-no-stamp@2x']")).click();
	      //driver.findElement( By.xpath("//a[text()='Create an account']")).click();
	      //driver.findElement(By.id("jform_name")).sendKeys("John Doe");
	      //driver.findElement(By.id("jform_username")).sendKeys("John123");
	      //driver.findElement(By.id("jform_password1")).sendKeys("John@123");
	      //driver.findElement(By.id("jform_password2")).sendKeys("John@123");
	      //driver.findElement(By.id("jform_email1")).sendKeys("test@example.com");
	      //driver.findElement(By.cssSelector("button.com-users-registration__register.btn.btn-primary.validate")).click();
	      //System.out.println("Registered Successfully");
	 
	      
	  }
}
