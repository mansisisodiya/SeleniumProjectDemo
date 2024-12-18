package com.selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rs700\\Mansi\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the Flipkart login page
            driver.get("https://www.w3schools.com/");
            WebElement signUpLink = driver.findElement(By.cssSelector(".user-anonymous.tnb-signup-btn"));

            // Click on the 'Sign Up' link
            signUpLink.click();
            driver.findElement(By.className("SignUpForm_signup_input__6r1Lr")).sendKeys("mansisisodiya677@gmail.com");
            driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("Pass@123");
            driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("Mansi");
            driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("S");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            

           
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
        	driver.quit();
           
        }
    }
}
