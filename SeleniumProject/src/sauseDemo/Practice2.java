package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
    }
}