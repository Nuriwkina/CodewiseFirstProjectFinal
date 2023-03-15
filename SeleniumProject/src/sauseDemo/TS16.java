package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TS16 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TS16: Order automation
Summary: Completing the order

Steps:
1. Go to Sauce Demo application and login
2. Select 2 random products to Cart
3. Go to cart and click Checkout
4. Fill out information for First Name, Last Name and Zip code
5. Click next
6. Click Finish
7. Verify the Order Placement Page

         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        List<WebElement> items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();



       List<WebElement> checkout = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
       checkout.get(2).click();
       checkout.get(4).click();
        Thread.sleep(300);


       WebElement checkout2 = driver.findElement(By.className("shopping_cart_link"));
       checkout2.click();


       WebElement checkout3 = driver.findElement(By.id("checkout"));
       checkout3.click();
        driver.quit();


       List<WebElement> checkout4 = driver.findElements(By.tagName("input"));
       checkout4.get(0).sendKeys("Nuriia");
       checkout4.get(1).sendKeys("Abdrakhmanova");
       checkout4.get(2).sendKeys("60016");
       checkout4.get(3).click();


       WebElement checkout5 = driver.findElement(By.id("finish"));
       checkout5.click();
    }
}
