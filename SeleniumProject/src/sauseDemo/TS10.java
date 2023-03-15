package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS10 {
    public static void main(String[] args) throws InterruptedException {

        //=========Task-10=========
        /*
         Verify price tags of the product
Summary: Verify prices have $ sign in front

1. Go to Sauce Demo app
2. Login to Application
3. Get all the Prices for all products
4. Verify they all have "$" in the beginning

Expected: Each price MUST have "$"

Test data:
username: standard_user
password: secret_sauce

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

        driver.get("https://www.saucedemo.com/inventory.html");


        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        for (WebElement product : prices) {
            System.out.println(product.getText());
        }



    }






    }
