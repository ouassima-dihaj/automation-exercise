package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignupLoginPage {

    private WebDriver driver ;
    private By signUpFormTitle = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    private By nameSignUpTextBox = By.xpath("//input[@data-qa='signup-name']");
    private By emailSignUpTextBox = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[@data-qa='signup-button']");
    private By emailLoginTextBox = By.xpath("//input[@data-qa=\"login-email\"]");
    private By passwordLoginTextBox = By.xpath("//input[@data-qa=\"login-password\"]");
    private By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");
    private By loginFormTitle = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");
    //Negative Scenario
    private By errorMessageIncorrectEmailPassword = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");
    private By errorMessageExistingEMail=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");

    public SignupLoginPage(WebDriver driver){
        this.driver= driver;
    }
    //SignUp form
    public void isSignUpFormTitleVisible (String title){
        Assert.assertEquals(driver.findElement(signUpFormTitle).getText(),title);
    }
    public void enterName(String name){
        driver.findElement(nameSignUpTextBox).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(emailSignUpTextBox).sendKeys(email);
    }
    public void clickSignUpButton(){
        driver.findElement(signupButton).click();
    }
    // Login Form
    public void isLoginFormTitleVisible (String title){
        Assert.assertEquals(driver.findElement(loginFormTitle).getText(),title);
    }
    public void enterEmailLogin(String email){
        driver.findElement(emailLoginTextBox).sendKeys(email);
    }
    public void enterPasswordLogin(String password){
        driver.findElement(passwordLoginTextBox).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void isErrorMessageIncorrectEmailPasswordVisible(String errorMessage){
        Assert.assertEquals(driver.findElement(errorMessageIncorrectEmailPassword).getText(),errorMessage);
    }
    public void isErrorMessageExistingEmailVisible (String errorMessage){
        Assert.assertEquals(driver.findElement(errorMessageExistingEMail).getText(),errorMessage);
    }
}
