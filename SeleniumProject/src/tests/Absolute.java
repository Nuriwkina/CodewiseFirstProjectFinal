package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement passwordLabel = driver.findElement(By.xpath("//body/div/div/div[2]/div[2]/div/div[2]/h4"));
        System.out.println(passwordLabel.getText());

        WebElement users = driver.findElement(By.id("login_credentials"));
//        System.out.println(users.getText());

        String userText = users.getText();

        int startIndex = userText.indexOf("problem");

        String target = userText.substring(startIndex, startIndex + 12);
        System.out.println("Here: " + target);


    }
}