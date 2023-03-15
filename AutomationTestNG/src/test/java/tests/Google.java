package tests;

import com.github.javafaker.Faker;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilites.Driver;

public class Google {

    @Test(groups = {"smoke"})
    public void search() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);

    }

    @Test
    public void login() {
        Driver.getDriver().get("https://google.com");
        System.out.println(Driver.getDriver().getTitle());

    }

    @AfterMethod
    public void cleanUp() {
        Driver.quitBrowser();
    }

}