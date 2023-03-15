package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com");
        driver.manage().window().fullscreen();

        List<WebElement>items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("problem_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        List<WebElement> addToCarts= driver.findElements(By.xpath("//div[@class='inventory_list']//button"));

        for (WebElement cart: addToCarts){
            Thread.sleep(800);
            cart.click();
        }
    }
}
