package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlazeDemo {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");

        // WebElement info = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[4]"));
        // System.out.println(info.getText()); //-> returns us Aer Lingus naimenivanie, rezulyaty naimenovanie

        WebElement time = getTableData(1, 5); //-> Utility methods
        System.out.println(time.getText());

        System.out.println(getTableData(5, 3).getText());


        String expectedPrice = "$200.98";
        if (getTableData(3, 6).getText().equals(expectedPrice)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        String expectindDeparture = "11:00 am";
        if ( getDepartureTime("12").equals(expectindDeparture)){
            System.out.println("Departure Passed");
        }else{
            System.out.println("Departure Failed");
        }

        for (WebElement airline: getColumn(3)){
            System.out.println(airline.getText());
        }

        getTableData(5, 1).findElement(By.tagName("input")).click();
        Thread.sleep(2000);


        driver.quit();
    }

    public static WebElement getTableData(int row, int column) {
        String xpath = "//table[@class='table']/tbody/tr[" + row + "]/td[" + column + "]";
        WebElement data = driver.findElement(By.xpath(xpath));


        return data;



    }

    public static String getDepartureTime(String flightNumber) {
        String xpath = "//td[.= '" + flightNumber+ "']/../td[4]";
        WebElement departure = driver.findElement(By.xpath(xpath));

        String departureText = departure.getText();

        return departureText;


    }

    public static List<WebElement> getColumn(int column){
        String xpath = "//table[@class='table']/tbody/tr/td[" + column + "]";
        List<WebElement> columnData= driver.findElements(By.xpath(xpath));
        return columnData;
    }

}