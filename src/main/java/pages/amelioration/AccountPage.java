package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AccountPage {

    private WebDriver driver ;
    private By accountCrationFormTitle= By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
    private By genderMr= By.xpath("//input[@id='id_gender1']");
    private By genderMrs= By.xpath("//input[@id='id_gender2']");
    private By passwordTextBox= By.xpath("//input[@data-qa=\"password\"]");
    private By newsletter= By.xpath("//input[@id='newsletter']");
    private By partner= By.xpath("//input[@id='optin']");
    private By days = By.xpath("//select[@data-qa=\"days\"]");
    private By months = By.xpath("//select[@data-qa=\"months\"]");
    private By years = By.xpath("//select[@data-qa=\"years\"]");
    private By firstNameTextBox= By.xpath("//input[@data-qa=\"first_name\"]");
    private By lastNameTextBox = By.xpath("//input[@data-qa=\"last_name\"]");
    private By companyTextBox = By.xpath("//input[@data-qa=\"company\"]");
    private By addressTextBox = By.xpath("//input[@data-qa=\"address\"]");
    private By address2TextBox = By.xpath("//input[@data-qa=\"address2\"]");
    private By countries = By.xpath("//select[@data-qa=\"country\"]");
    private By stateTextBox = By.xpath("//input[@data-qa=\"state\"]");
    private By cityTextBox = By.xpath("//input[@data-qa=\"city\"]");
    private By zipTextBox = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By mobileNumberTextBox = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By createAccountButton = By.xpath("//button[@data-qa='create-account']");
    private By logoutButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    // this i can do it in a new page but i prefer to let it here
    private By accountCreatedDeletedMessage= By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By connectedUserName = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
    private By deleteAccountButton=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");

    public AccountPage(WebDriver driver){
        this.driver= driver;
    }
    public void isAccountCreationFormTitleVisible(String title){
        Assert.assertEquals(driver.findElement(accountCrationFormTitle).getText(), title);
    }
    public void genderChoice(String gender){
        if(gender.equals("Mr")){
            driver.findElement(genderMr).click();
        }else  {
            driver.findElement(genderMrs).click();
        }
    }

    public void enterPassword(String password){
        driver.findElement(passwordTextBox).sendKeys(password);
    }
    public void checkNewsletter(){
        driver.findElement(newsletter).click();
    }
    public void checkPartner(){
        driver.findElement(partner).click();
    }

    public void selectDateOfBirth(String day, String month, String year){
        Select allDays = new Select(driver.findElement(days));
        allDays.selectByVisibleText(day);

        Select allMonths= new Select(driver.findElement(months));
        allMonths.selectByVisibleText(month);

        Select allYears= new Select(driver.findElement(years));
        allYears.selectByVisibleText(year);
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
        Select allCountries = new Select(driver.findElement(countries));
        allCountries.selectByVisibleText(country);
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
    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }

    // this i can do it in a new page but i prefer to let it here
    public void isAccountCreatedMessageVisible(){
        Assert.assertEquals(driver.findElement(accountCreatedDeletedMessage).getText(),"ACCOUNT CREATED!");
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public void isConnectedUserNameVisible(String username){
        Assert.assertEquals(driver.findElement(connectedUserName).getText(),"Logged in as "+username);
    }
    public void clickDeleteAccountButton(){
        driver.findElement(deleteAccountButton).click();
    }
    public void isAccountDeletedMessageVisible(){
        Assert.assertEquals(driver.findElement(accountCreatedDeletedMessage).getText(),"ACCOUNT DELETED!");
    }
    public void clickLogoutButton(){
        driver.findElement(logoutButton).click();
    }
}
