package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountCreationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class E2ETest extends BaseTest {
    @Test
    public void testValidSignup (){

        HomePage homePage= new HomePage(driver);
        homePage.HomePageTitleVerification();
        homePage.clickSigUpButton();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.titleVerification();
        String username="ouassima";
        signUpPage.enterName(username);
        String email = "test29@olmas.com" ;
        signUpPage.enterEmail(email);
        signUpPage.clickSignUp();

        AccountCreationPage accountCreationPage= new AccountCreationPage(driver);
        accountCreationPage.accountCreationFormVisibility();
        accountCreationPage.genderChoice("Male");
        accountCreationPage.enterPassword("test123");
        accountCreationPage.selectDay("1");
        accountCreationPage.selectMonth("January");
        accountCreationPage.selectYear("2000");
        accountCreationPage.checkNewsletter();
        accountCreationPage.checkPartner();
        accountCreationPage.enterFirstName("emma");
        accountCreationPage.enterLastName("dj");
        accountCreationPage.enterCompany("IT");
        accountCreationPage.enterAddress("add 1");
        accountCreationPage.enterAddress2("add 2");
        accountCreationPage.choiceCountry("Canada");
        accountCreationPage.enterState("AB state");
        accountCreationPage.enterCity("Montreal");
        accountCreationPage.enterZipCode("14200");
        accountCreationPage.enterMobileNumber("3294328253");
        accountCreationPage.clickCreationAccountButton();
        accountCreationPage.checkMessageAccountCreated();
        accountCreationPage.clickContinue();
        accountCreationPage.checkLoggedInName(username);
        accountCreationPage.clickDeleteAccountButton();
        accountCreationPage.checkMessageAccountDeleted();
        accountCreationPage.clickContinue();
        accountCreationPage.clickLogout();

    }
    //Test Case 2: Login User with correct email and password
    @Test
    public void testValidLogin(){
        HomePage homePage= new HomePage(driver);
        homePage.HomePageTitleVerification();
        homePage.clickSigUpButton();


        LoginPage loginPage= new LoginPage(driver);
        loginPage.titleVerification();
        String email = "test25@olmas.com" ;
        loginPage.enterEmail(email);
        loginPage.enterPassword("test123");
        loginPage.clickLoginButton();

        AccountCreationPage accountCreationPage= new AccountCreationPage(driver);
        accountCreationPage.checkLoggedInName("wrongName");
        //Test Case 4: Logout User
        accountCreationPage.clickLogout();
    }
    //Test Case 3: Login User with incorrect email and password
    @Test
    public void testInValidLogin(){
        HomePage homePage= new HomePage(driver);
        homePage.HomePageTitleVerification();
        homePage.clickSigUpButton();


        LoginPage loginPage= new LoginPage(driver);
        loginPage.titleVerification();
        String email = "test45@olmas.com" ;
        loginPage.enterEmail(email);
        loginPage.enterPassword("test123");
        loginPage.clickLoginButton();
        loginPage.invalidLoginMessage();
    }

    //Test Case 5: Register User with existing email
    @Test
    public void testSignUpWithExistEmail (){

        HomePage homePage= new HomePage(driver);
        homePage.HomePageTitleVerification();
        homePage.clickSigUpButton();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.titleVerification();
        String username="ouassima";
        signUpPage.enterName(username);
        String email = "test25@olmas.com" ;
        signUpPage.enterEmail(email);
        signUpPage.clickSignUp();
        signUpPage.emailAlreadyExist();
    }

}

