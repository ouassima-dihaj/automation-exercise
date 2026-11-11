package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubscriptionPage {
    private WebDriver driver;
    private By subscriptionTexte = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");

    private By emailTextBox= By.xpath("//input[@id='susbscribe_email']");
    private By subscribeButton= By.xpath("//button[@id='subscribe']");
    private By alertMessage= By.xpath("//*[@id=\"success-subscribe\"]/div");
    public SubscriptionPage(WebDriver driver){
        this.driver= driver;
    }
    public void isSubscriptionTexteVisible(String title){
        Assert.assertEquals(driver.findElement(subscriptionTexte).getText(),title);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void clickSubscribeButton(){
        driver.findElement(subscribeButton).click();
    }
    public void isAlertMessageVisible(String message){
       Assert.assertEquals( driver.findElement(alertMessage).getText(), message);
    }
}
