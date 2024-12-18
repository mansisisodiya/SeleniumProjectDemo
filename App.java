package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rs700\\Mansi\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the test page
            driver.get("https://demo.automationtesting.in/");

            // Locate the email input field by its ID and enter a value
            WebElement emailInput = driver.findElement(By.id("email"));
            emailInput.sendKeys("test@example.com");

            // Locate the button by its XPath and click it
            WebElement signUpButton = driver.findElement(By.xpath("//img[@id='enterimg']"));
            signUpButton.click();

            // Verify if redirected to the registration page
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("Register.html")) {
                System.out.println("Test passed: Successfully navigated to the registration page.");
            } else {
                System.out.println("Test failed: Navigation to the registration page was unsuccessful.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
