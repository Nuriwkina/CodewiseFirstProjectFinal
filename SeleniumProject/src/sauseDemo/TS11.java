package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS11 {
    public static void main(String[] args) {

   WebDriver driver = new ChromeDriver();
   driver.get("https://saucedemo.com");

   driver.manage().window().fullscreen();

        List<WebElement>items=driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        WebElement addToCarts=driver.findElement(By.id("add-to-cart_sauce-labs-bike-light"));
        addToCarts.click();

        System.out.println(addToCarts);
    }
}
