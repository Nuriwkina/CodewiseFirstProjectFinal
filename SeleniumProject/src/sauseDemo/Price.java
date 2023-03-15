package sauseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Price {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().fullscreen();
        List<WebElement> items = driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        Select sort = new Select(dropdown);

        sort.selectByIndex(2);

        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        for (int i = 0; i < prices.size()-1; i++){
String price1 = prices.get(i).getText().replace("$", "");
String price2 = prices.get(i+1).getText().replace("$", "");

double p1 = Double.parseDouble(price1);
double p2 = Double.parseDouble(price2);

if (p1 <= p2){
    System.out.println("PASSED");
}
driver.quit();
        }
    }
}
