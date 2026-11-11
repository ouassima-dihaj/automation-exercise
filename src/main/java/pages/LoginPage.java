package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver ;
    private  By titleLoginForm =  By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    private By emailTextBox = By.xpath("//input[@data-qa='login-email']");
    private By passwordTextBox = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By invalidLoginMessage= By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    public void titleVerification(){
        Assert.assertEquals(driver.findElement(titleLoginForm).getText(), "Login to your account");
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void invalidLoginMessage(){
        Assert.assertEquals(driver.findElement(invalidLoginMessage).getText(),"Your email or password is incorrect!");
    }

}
