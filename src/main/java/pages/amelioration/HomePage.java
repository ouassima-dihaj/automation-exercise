package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver ;
    private By signupLoginButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    private By contactUsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    private By testCaseButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By productButton= By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    private By cartButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public void clickSignUpLoginButton(){
        driver.findElement(signupLoginButton).click();
    }
    public void isHomePageVisible(String title){
        Assert.assertEquals(driver.getTitle(),title);
    }
    public void clickContactUsButton(){
        driver.findElement(contactUsButton).click();
    }
    public void clickTestCaseButton(){
        driver.findElement(testCaseButton).click();
    }
    public void clickProductButton(){
        driver.findElement(productButton).click();
    }
    public void clickCartButton(){

        driver.findElement(cartButton).click();
    }
}
