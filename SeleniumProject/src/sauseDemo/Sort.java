package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sort {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskdeit.com/practice");

        List<WebElement> LoginButtons = driver.findElements(By.className("input"));
        LoginButtons.get(0).sendKeys("standard_user");
        LoginButtons.get(1).sendKeys("secret_sauce");
        LoginButtons.get(2).click();

        List<WebElement> productNames = driver.findElements(By.className("inventory_item_name"));

        for (int i = 0; i < productNames.size()-1; i++){

            char first = productNames.get(i).getText().charAt(0);
            char second = productNames.get(i+1).getText().charAt(0);

            int firstInt = first;
            int secondInt = second;

            if (firstInt > secondInt){
                System.out.println("Passed");
            }
        }


    }
}
