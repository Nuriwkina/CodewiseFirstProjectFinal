package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/kairatfarkhatov/Desktop/Selenium resorses/chromedriver");
        WebDriver chrome = new ChromeDriver();

        chrome.get("https://google.com");     //==> navigates to url

        chrome.manage().window().fullscreen();
        chrome.navigate().to("https://sephora.com");  //==> same
        chrome.navigate().refresh();  //===> refreshes the page
        //chrome.navigate().forward();  //==> forward
        chrome.navigate().back();   //===>  backward
       // chrome.close();    //===> closes the window of chrome
        chrome.quit();    //====> kills all windows for that opened chrome

    }
}
