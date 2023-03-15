package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LocateHoverOver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.manage().window().maximize();
        driver.get("https://courses.letskodeit.com/practice");

        List<WebElement> menu = driver.findElements(By.xpath("//div[@id='navbar-inverse-collapse"));
        System.out.println(menu.size());

        Actions actions = new Actions(driver);

        for (WebElement link: menu){
            Thread.sleep(1000);
            actions.moveToElement(link).perform();


        }


    }
}

