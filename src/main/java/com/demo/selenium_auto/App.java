package com.demo.selenium_auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/Users/debjotysil/Documents/software/chromedriver");
    	WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        // Navigate to Facebook
        driver.get("https://www.facebook.com");

        // Find the email/phone input field and enter your email/phone
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("abc@yahoo.com");

        // Find the password input field and enter your password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("abc");

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Sleep for a few seconds to see the result (You should use explicit waits instead)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();

    }
}
