package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Config;
import utilites.Driver;
import utilites.Flow;

public class SupplySyncNuri {
    private WebDriver driver;

    public SupplySyncNuri() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(tagName = "button")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[.='Branches']")
    public WebElement branchesButton;



}
