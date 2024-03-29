package sauceDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SauceDemoLoginPage;
import pages.SauceDemoProductPage;
import utilities.Driver;

public class Sauce {
    SauceDemoLoginPage sauceLoginPage = new SauceDemoLoginPage();
    SauceDemoProductPage sauceProductPage = new SauceDemoProductPage();

    @Test
    public void loginSauce() {
        Driver.getDriver().get("https://saucedemo.com");
        sauceLoginPage.login("standard_user", "secret_sauce");
        String expectedURL = "https://www.saucedemo.com/inventory.html";

        Assertions.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl(), "Login failed with URL");

    }
}
/*
    @Test
    public void sort(){
        Driver.getDriver().get("https://saucedemo.com");
        sauceLoginPage.login("standard_user", "secret_sauce");
        sauceProductPage.selectSortDropdown("Price (high to low)");

        // //header/button
    }


}

 */
