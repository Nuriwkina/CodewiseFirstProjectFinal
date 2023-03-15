package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Cup {
    public static void main(String[] args) throws Exception {
         //value of name
        String name = "James";

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();
        WebElement username = driver.findElement(By.id("user-name"));



       // What happens if locator is not correct?
        // Element Not Found Exception

        //How to type something in the input box?

        // WebElement.sendKeys("");

        username.sendKeys("hello@codewise.com");

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.name("login-button"));

        loginButton.click();

        WebElement input = driver.findElement(By.tagName("input"));

       // input.sendKeys("Test@test.com");

        List<WebElement> inputs = driver.findElements(By.tagName("input"));

        System.out.println(inputs.size());

       // inputs.get(1).sendKeys("password");

        WebElement errorMessage = driver.findElement(By.tagName("h3"));
 String actualMessage=errorMessage.getText();
        System.out.println(actualMessage);

        String expectedMessage=" TRY AGAIN";
        if(actualMessage.trim().equals(expectedMessage)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected: "+expectedMessage );
            System.out.println("Actual: "+ actualMessage);
        }





    }
}
