package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://saucedemo.com");
        List<WebElement> loginButtons=driver.findElements(By.tagName("input"));
        loginButtons.get(0).sendKeys("standard_user");
        loginButtons.get(1).sendKeys("secret_sauce");
        loginButtons.get(2).click();
        Thread.sleep(2000);


        WebElement button = driver.findElement(By.id("react-burger-menu-btn"));
        Actions actions = new Actions(driver);
        button.click();

        WebElement about = driver.findElement(By.id("about_sidebar_link"));
        Thread.sleep(1000);
        about.click();

        for (int i = 0; i < 20; i++) {
            actions.scrollByAmount(0, 45).perform();
            Thread.sleep(40);
        }

    }
}
