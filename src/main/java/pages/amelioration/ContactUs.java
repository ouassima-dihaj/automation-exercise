package pages.amelioration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUs {

    private WebDriver driver;
    private By contactUsTitle = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2");
    private By nameTextBox =By.xpath("//input[@data-qa=\"name\"]");
    private By emailTextBox =By.xpath("//input[@data-qa=\"email\"]");
    private By subjectTextBox =By.xpath("//input[@data-qa=\"subject\"]");
    private By messageTextBox =By.xpath("//textarea[@data-qa=\"message\"]");
    private By submitButton = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
    private By file = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    private By successMessage = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    private By homeButton = By.xpath("//*[@id=\"form-section\"]/a");
    public ContactUs(WebDriver driver){
        this.driver= driver;
    }

    public void isContactUsTitleVisible(String title){
        Assert.assertEquals( driver.findElement(contactUsTitle).getText(),title);
    }
    public void enterName(String name){
        driver.findElement(nameTextBox).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void enterSubject(String subject){
        driver.findElement(subjectTextBox).sendKeys(subject);
    }
    public void enterMessage(String message){
        driver.findElement(messageTextBox).sendKeys(message);
    }
    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
    public void uploadFile(String fichier ){
        driver.findElement(file).sendKeys(fichier);
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
    public void isSuccessMessageVisible(String message){
        Assert.assertEquals(driver.findElement(successMessage).getText(),message);
    }
    public void clickHomeButton(){
        driver.findElement(homeButton).click();
    }

}
