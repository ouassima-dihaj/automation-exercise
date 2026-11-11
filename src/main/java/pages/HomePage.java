package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver ;

    private By loginSignUpButton = By.cssSelector("a[href=\"/login\"]");

    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public void HomePageTitleVerification(){
         Assert.assertEquals(driver.getTitle(), "Automation Exercise");
    }
    public void clickSigUpButton(){
        driver.findElement(loginSignUpButton).click();
    }

}
