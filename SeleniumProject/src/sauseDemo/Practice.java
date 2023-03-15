package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        List<WebElement> LoginButtons = driver.findElements(By.className("input"));
        LoginButtons.get(0).sendKeys("standard_user");
        LoginButtons.get(1).sendKeys("secret_sauce");
        LoginButtons.get(2).click();

        int expectedItemCount = 1;

        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='pricebar']button"));
        WebElement checkCart = driver.findElement(By.className("shopping_cart_link"));

        for (WebElement addToCartButton : addToCartButtons){
            addToCartButton.click();
            Thread.sleep(1000);

            if (expectedItemCount == Integer.parseInt(checkCart.getText())){
                System.out.println("Passed");
                expectedItemCount ++;
            }else{
                System.out.println("Failed");
                System.out.println("Expected " + expectedItemCount);
                System.out.println("Actual " + checkCart.getText());

            }
        }
    }
}
