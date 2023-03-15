package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thinkific {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://codewise-s-school.thnkific.com/");

        driver.manage().window().fullscreen();


        String expectedURL = ("https://codewise-s-school.thnkific.com/courses/sdet-course");

        String actualURL = driver.getCurrentUrl();

        if (actualURL.trim().equals(expectedURL)){
            System.out.println("PASSED");
        }else{

            System.out.println("FAILED");
            System.out.println("Expected: " + expectedURL);
            System.out.println("Actual: " + actualURL);

        }
        driver.findElement(By.linkText("Sign in")).click();
        System.out.println(driver.getCurrentUrl());





    }
}
