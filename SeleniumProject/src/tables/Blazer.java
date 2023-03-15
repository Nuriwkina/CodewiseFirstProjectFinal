package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Blazer {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        flightNumberEmptyVerification();
        flightNumberLengthVerification();
        verifyingFlightNumberDigitVerification();
        flightAirlineValidityVerification();
        verifyingFlightNumberDigitVerification();
        numberUniqueness();
        driver.quit();
    }


    //This method gets one specific cell data from web table

    public static WebElement getCellData(int row, int column) {
        String xpath = "//table[@class='table']/tbody/tr[" + row + "]/td[" + column + "]";
        WebElement cellData = driver.findElement(By.xpath(xpath));
        return cellData;


    }

    public static List<WebElement> getRowCells(int row) {
        //  "table[@class='table']/tbody/tr[" + row + "]/td[" + column + "]"
        String xpath = "//table[@class='table']/tbody/tr[" + row + "]/td";
        List<WebElement> rowCells = driver.findElements(By.xpath(xpath));
        //rowCells.remove(0);
        return rowCells;
    }


    public static List<WebElement> getColumnCells(int column) {

        String xpath = "//table[@class='table']/tbody/tr/td[" + column + "]";
        List<WebElement> columnCells = driver.findElements(By.xpath(xpath));
        return columnCells;

    }

    public static void flightNumberEmptyVerification() {
        System.out.println("\nVerifying if flight number is empty scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);
        int counter = 1;
        for (WebElement flightNum : flightNumbers) {
            String flight = flightNum.getText().trim();
            if (flight.isEmpty()) {
                System.out.println("Failed" + ": Row: " + counter);
            } else {
                System.out.println("Passed");
            }
        }
    }


    public static void flightNumberLengthVerification() {
        System.out.println("\nVerifying if flight number length scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);
        int counter = 1;

        for (WebElement flightNum : flightNumbers) {
            String flight = flightNum.getText().trim();

            if (flight.length() >= 2 && flight.length() <= 3) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed row: " + counter);
            }
            counter++;
        }
    }


    public static void verifyingFlightNumberDigitVerification() {
        System.out.println("\nVerifying if flight number length scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);
        int counter = 1;

        for (WebElement flightNum : flightNumbers) {
            String flight = flightNum.getText();

            boolean flightIsDigit = true;

            for (int i = 0; i < flight.length(); i++) {
                char c = flight.charAt(i);

                if (!Character.isDigit(c)) {
                    flightIsDigit = false;
                    break;
                }
            }
            if (flightIsDigit == true) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
                System.out.println("Flight: " + flight);
            }
        }
    }

    public static void flightAirlineValidityVerification() {
        System.out.println("\nVerifying if flight number length scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightAirLines = getColumnCells(3);
        List<String> expectedAirlines = new ArrayList<>();

        expectedAirlines.add("Virgin America");
        expectedAirlines.add("United Airlines");
        expectedAirlines.add("Lufthansa");
        expectedAirlines.add("Aer Lungas");


        for (WebElement airline : flightAirLines) {
            String airlineText = airline.getText().trim();

            if (expectedAirlines.contains(airlineText)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
                System.out.println("Airline: " + airlineText);
            }
        }
    }

    public static void verifyFlightNumberUniqness() {
        System.out.println("\nVerifying if flight number length scenario");
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightAirLines = getColumnCells(3);
        List<String> expectedAirlines = new ArrayList<>();

    }

    public static void numberUniqueness() {
        System.out.println("\nVerifying flight number uniqueness scenario");
        driver.get("https://blazedemo.com/reserve.php");
        List<WebElement> flightNumbers = getColumnCells(2);

        Set<String> flightNums = new HashSet<>();

        for (WebElement flightNum : flightNumbers) {
            String flights = flightNum.getText().trim();
            flightNums.add(flights);
        }
        if (flightNums.size() == flightNumbers.size()) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }

}