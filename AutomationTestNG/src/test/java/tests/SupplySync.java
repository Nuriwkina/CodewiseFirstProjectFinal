package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.SupplySyncLoginPage;
import utilites.Config;
import utilites.Driver;
import utilites.Flow;

public class SupplySync {

    SupplySyncLoginPage supplySyncLoginPage = new SupplySyncLoginPage();

    @Test
    public void loginPositive(){
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("codewise@gmail.com", "123456");
        String expectedURL = "https://supplysync.us/dashboard/companies";
        Flow.wait(1500);
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void loginNegative(){
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncLoginPage.login("random@whatever.com", "123456");
        String errorMessage = supplySyncLoginPage.errorMessage.getText();

        String expectedMessage = "Incorrect login and/or password.";
        Assert.assertEquals(expectedMessage, errorMessage);
    }

    @AfterMethod
    public void cleanUp(){
        Flow.wait(1500);
        Driver.quitBrowser();
    }

    }

