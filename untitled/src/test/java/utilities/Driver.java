package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
        private static WebDriver driver;
        private static String browser=Config.getValue("browser");
        ////one to launch the browser

        public static WebDriver getDriver() {
            if (driver == null) {/// is it the fist time this line is getting triggered.
                if(browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driver.manage().window().maximize();
                    return driver;
                }else if (browser.equalsIgnoreCase("firefox")){
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driver.manage().window().maximize();
                    return driver;
                }
                else{
                    System.out.println("Invalid Browser Type. Launching Default Browser");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driver.manage().window().maximize();
                    return driver;
                }

            }else{
                return driver;

                ////if the driver is null
            }
        }
        ////the second to quit the browser
        public static void quitBrowser(){
            if(driver != null){
                driver.quit();
                driver=null;
            }
        }
///one for checking the browser
        // the second for the driver itself(when checking if it is null or not)
    }
