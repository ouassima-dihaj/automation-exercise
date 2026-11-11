package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Month;

public class AccountCreationPage {
    private WebDriver driver ;

   private By accountCrationFormTitle= By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
    private By genderMr= By.id("id_gender1");
    private By genderMrs= By.id("id_gender2");
    private By  nameTextBox = By.xpath("//input[@data-qa='name']");
    private By  emailTextBox = By.xpath("//input[@data-qa='email']");
    private By  passwordTextBox = By.xpath("//input[@data-qa='password']");
    private By Days = By.xpath("//select[@data-qa='days']");
    private By months = By.xpath("//select[@data-qa='months']");
    private By years = By.xpath("//select[@data-qa='years']");
    private  By newsletter  = By.id("newsletter");
    private  By partner  = By.id("optin");
    private By firstNameTextBox= By.xpath("//input[@data-qa=\"first_name\"]");
    private By lastNameTextBox = By.xpath("//input[@data-qa=\"last_name\"]");
    private By companyTextBox = By.xpath("//input[@data-qa=\"company\"]");
    private By addressTextBox = By.xpath("//input[@data-qa=\"address\"]");
    private By address2TextBox = By.xpath("//input[@data-qa=\"address2\"]");
    private By countrySelect = By.xpath("//select[@data-qa=\"country\"]");
    private By stateTextBox = By.xpath("//input[@data-qa=\"state\"]");
    private By cityTextBox = By.xpath("//input[@data-qa=\"city\"]");
    private By zipTextBox = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By mobileNumberTextBox = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By createAccountButton = By.xpath("//button[@data-qa='create-account']");
    private By accountCreatedMessage = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By deleteAccountButton =By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By loggedName = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    private By logout = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    public AccountCreationPage(WebDriver driver){
        this.driver= driver;
    }
    public void accountCreationFormVisibility(){
        Assert.assertEquals(driver.findElement(accountCrationFormTitle).isDisplayed(),true);
        Assert.assertEquals(driver.findElement(accountCrationFormTitle).getText(),"ENTER ACCOUNT INFORMATION");
    }
    public void genderChoice(String gender){
        if(gender.equals("Male")){
            driver.findElement(genderMr).click();
        } else if (gender.equals("Female")) {
            driver.findElement(genderMrs).click();
        }
    }
    public void enterName(String name){
        driver.findElement(nameTextBox).sendKeys(name);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }
    public void selectDay(String day){
        Select select= new Select(driver.findElement(Days));
        select.selectByVisibleText(day);
    }
    public void selectMonth(String month){
        Select select= new Select(driver.findElement(months));
        select.selectByVisibleText(month);
    }
    public void selectYear(String year){
        Select select= new Select(driver.findElement(years));
        select.selectByVisibleText(year);
    }
    public void checkNewsletter(){
        driver.findElement(newsletter).click();
    }
    public void checkPartner(){
        driver.findElement(partner).click();
    }
    public void enterFirstName(String firstName){
        driver.findElement(firstNameTextBox).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        driver.findElement(lastNameTextBox).sendKeys(lastName);
    }
    public void enterCompany(String company){
        driver.findElement(companyTextBox).sendKeys(company);
    }
    public void enterAddress(String address){
        driver.findElement(addressTextBox).sendKeys(address);
    }
    public void enterAddress2(String address){
        driver.findElement(address2TextBox).sendKeys(address);
    }
    public void choiceCountry(String country){
        Select select = new Select(driver.findElement(countrySelect));
        select.selectByVisibleText(country);
    }
    public void enterState(String state){
        driver.findElement(stateTextBox).sendKeys(state);
    }
    public void enterCity(String city){
        driver.findElement(cityTextBox).sendKeys(city);
    }
    public void enterZipCode(String zipcode){
        driver.findElement(zipTextBox).sendKeys(zipcode);
    }
    public void enterMobileNumber(String mobileNumber){
        driver.findElement(mobileNumberTextBox).sendKeys(mobileNumber);
    }

    public void clickCreationAccountButton(){
        driver.findElement(createAccountButton).click();
    }

    public void checkMessageAccountCreated(){
        Assert.assertEquals(driver.findElement(accountCreatedMessage).isDisplayed(), true);
        Assert.assertEquals(driver.findElement(accountCreatedMessage).getText(),"ACCOUNT CREATED!");

    }
    public void clickContinue (){
        driver.findElement(continueButton).click();
    }
    public void checkLoggedInName(String username){
        Assert.assertEquals(driver.findElement(loggedName).getText(),"Logged in as "+username);
        System.out.println(driver.findElement(loggedName).getText());
    }
    public void clickDeleteAccountButton (){
        driver.findElement(deleteAccountButton).click();
    }
    public void checkMessageAccountDeleted(){
        Assert.assertEquals(driver.findElement(accountCreatedMessage).isDisplayed(), true);
        Assert.assertEquals(driver.findElement(accountCreatedMessage).getText(),"ACCOUNT DELETED!");

    }
    public void clickLogout(){
        driver.findElement(logout).click();
    }

}
