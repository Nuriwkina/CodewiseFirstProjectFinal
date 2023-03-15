package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SupplySyncLoginPage;
import utilites.Config;
import utilites.Driver;
import utilites.Flow;

public class SupplySyncTestNuri {
    SupplySyncTestNuri supplySyncTestNuri = new SupplySyncTestNuri();

    @Test
    public void loginPositive() {
        Driver.getDriver().get(Config.getValue("supplySyncURL"));
        supplySyncTestNuri.login("codewise@gmail.com", "123456");
        String expectedURL = "https://supplysync.us/dashboard/companies";
        Flow.wait(1500);
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());

       

    }

}