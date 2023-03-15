package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS13 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TS_Bonus_name: Print product names
Summary: Print each product name in the console
Steps:
1. Go to Sauce Demo application
2. Login to application using standard user
3. Print each product name in the console


TS_Bonus_price: Print product price
Summary: Print each product price in the console in double data type.(Hint: Double wrapper class has parseDouble method to convert from String to double)
Steps:
1. Go to Sauce Demo application
2. Login to application using standard user
3. Print each product price in the console

Requirement:
When using loop, use for loop.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.name("login-button"));
        Thread.sleep(3000);
        loginButton.click();

        List<WebElement> printPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        for (int i = 0; i < printPrice.size(); i++) {
            System.out.println(printPrice.get(i).getText());
        }
    }
}
