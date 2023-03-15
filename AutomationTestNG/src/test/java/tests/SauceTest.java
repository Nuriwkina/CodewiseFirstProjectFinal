package tests;

import org.testng.annotations.Test;
import utilites.Driver;
import utilites.Flow;

public class SauceTest {
    @Test(groups = {"Smoke"})
    public void login(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        Flow.wait(1000);
    }
    @Test(priority = 2, groups = {"Smoke", "products", "regression"})
    public void sort(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        Flow.wait(1000);

    }
    @Test(priority = 3)
    public void logout(){
        Driver.getDriver().get("https://www.saucedemo.com/");
        Flow.wait(1000);
    }
}






