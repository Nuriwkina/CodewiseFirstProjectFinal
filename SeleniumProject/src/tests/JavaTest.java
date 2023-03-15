package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTest {
    public static void main(String[] args) {
        //set property

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().fullscreen();
        WebElement searchBar = driver.findElement(By.name("q"));//--.SEARCH PART

       // searchBar.sendKeys("Cristiano Ronaldo" + Keys.ENTER);

       // List<WebElement>links = driver.findElements(By.tagName());
        //for (WebElement link: links){
           // links
        }


    }

