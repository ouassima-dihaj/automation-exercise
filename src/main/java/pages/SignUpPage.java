package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpPage {
    private WebDriver driver ;

    private By nameTextBox = By.xpath("//input[@data-qa='signup-name']");
    private By emailTextBox = By.xpath("//input[@data-qa='signup-email']");
    private By loginButton = By.xpath("//button[@data-qa='signup-button']");
    private By titleSignUpForm= By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
    private By emailElreadyExistMessage= By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");
    //a constructor  is a function take the same name as the class and have no return type
    //whenever any object of this class will be created the constructor will be called by default
    public SignUpPage(WebDriver driver){
        this.driver= driver;
    }

    public void titleVerification(){
        Assert.assertEquals(driver.findElement(titleSignUpForm).getText(), "New User Signup!");
    }
    public void enterName(String username){
        driver.findElement(nameTextBox).sendKeys(username);
    }

    public void enterEmail(String password){
        driver.findElement(emailTextBox).sendKeys(password);
    }
    public void clickSignUp(){
        driver.findElement(loginButton).click();
    }

    public void emailAlreadyExist(){
        Assert.assertEquals(driver.findElement(emailElreadyExistMessage).getText(),"Email Address already exist!");
    }
}