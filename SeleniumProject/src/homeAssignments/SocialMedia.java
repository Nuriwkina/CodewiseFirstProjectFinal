package homeAssignments;
/*

public class SocialMedia {
    public static void main(String[] args) {}
/*
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        List<WebElement> items=driver.findElements(By.tagName("input"));
        items.get(0).sendKeys("standard_user");
        items.get(1).sendKeys("secret_sauce");
        items.get(2).click();

        WebElement twitter = driver.findElement(By.linkText("Twitter"));
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        WebElement linkedIn = driver.findElement(By.linkText("LinkedIn"));

//        ========TWITTER==========
        twitter.click();
        String mainPageID = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();
        for (String id: handles){
            if(!id.equals(mainPageID)){
                driver.switchTo().window(id);
                break;
            }
        }

        String url = driver.getCurrentUrl();
        if(url.contains("twitter.com")){
            System.out.println("Twitter button PASSED");
        }else{
            System.out.println("Twitter button FAILED");
        }
        driver.close();
        driver.switchTo().window(mainPageID);//it will switch back to main page

        System.out.println(driver.getTitle());

//        ===========FACEBOOK=========

        facebook.click();

        Set<String> handles2 = driver.getWindowHandles();
        for (String id: handles2){
            if(!id.equals(mainPageID)){
                driver.switchTo().window(id);
                break;
            }
        }

        String facebookUrl = driver.getCurrentUrl();
        if(facebookUrl.contains("facebook.com")){
            System.out.println("Facebook button PASSED");
        }else{
            System.out.println("Facebook button FAILED");
        }
        driver.close();
        driver.switchTo().window(mainPageID);//it will switch back to main page

//  ============LINKEDIN===========

        linkedIn.click();

        Set<String> handles3 = driver.getWindowHandles();
        for (String id: handles3){
            if(!id.equals(mainPageID)){
                driver.switchTo().window(id);
                break;
            }
        }

        String linkedInUrl = driver.getCurrentUrl();
        if(linkedInUrl.contains("linkedin.com")){
            System.out.println("LinkedIn button PASSED");
        }else{
            System.out.println("LinkedIn button FAILED");
        }
        driver.close();
        driver.switchTo().window(mainPageID);//it will switch back to main page
        driver.quit();


    }
}



 */