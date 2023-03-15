package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Orange {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensoerce-demo.orangehrmlive.com");

        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());

        for (String id: windowHandles) {
           if (!id.equals(mainWindow)){
               driver.switchTo().window(id);
           }
        }
        System.out.println(driver.getCurrentUrl());
    }
}
