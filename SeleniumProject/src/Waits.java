import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {

       // WebElement wen = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By))
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[.='Start']"))));

        driver.findElement(By.tagName("button")).click();
        wait.until((ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='finish']")))));
        System.out.println("End");

        //wait.until(ExpectedConditions.alertIsPresent());
        //driver.get("https://amazon.com");

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//button[.='Start']"))));
        System.out.println("End");
    }
}
