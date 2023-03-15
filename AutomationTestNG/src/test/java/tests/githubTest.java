package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GithubHomePage;
import utilites.Config;
import utilites.Driver;
import utilites.Flow;

public class githubTest {
GithubHomePage githubHomePage = new GithubHomePage();
    @Test
    public void search(){
        Driver.getDriver().get(Config.getValue("githuburl"));
        String testData = "java";
        githubHomePage.searchInput.sendKeys(testData + Keys.ENTER);
        for (WebElement result: githubHomePage.resultList){
            String resultStr = result.getText().toLowerCase();
            Assert.assertTrue(resultStr.contains(testData), "Result in Github search");
        }

    }
    @Test
    public void  socialMediaTest(){
        Driver.getDriver().get(Config.getValue("githuburl"));
        Flow.scrollDown(13000);

        for (WebElement link: githubHomePage.socialMediaLinks){
            String currentURL = Driver.getDriver().getCurrentUrl();
            link.click();
            Flow.wait(600);
            String url = Driver.getDriver().getCurrentUrl();
            Assert.assertFalse(url.equalsIgnoreCase(currentURL));
            Driver.getDriver().navigate().back();
            Flow.wait(600);
        }
    }
}
