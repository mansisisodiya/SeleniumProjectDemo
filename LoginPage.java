package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
  public static void main(String args[])
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rs700\\Mansi\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://profile.w3schools.com/login?redirect_url=https%3A%2F%2Fwww.w3schools.com%2F");
      driver.findElement(By.name("email")).sendKeys("mansisisodiya677@gmail.com");
      driver.findElement(By.name("password")).sendKeys("Pass@123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      
  }
}
