package studyMate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class StudyMateLoginPage {

    public StudyMateLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="email")
    public WebElement mailInputBox;

    @FindBy(name="password")
    public  WebElement passwordInputBox;

    @FindBy(xpath = "(//button)[3]")
    public  WebElement loginButton;
}
