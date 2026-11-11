package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.amelioration.*;

public class E2ETest01 extends BaseTest {

    //Test Case 1: Register User : changer l'mail
    @Test
    public void registerUser (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickSignUpLoginButton();

        SignupLoginPage signupLoginPage= new SignupLoginPage(driver);
        signupLoginPage.isSignUpFormTitleVisible("New User Signup!");
        signupLoginPage.enterName("eman");
        signupLoginPage.enterEmail("eman5@gmail.com");
        signupLoginPage.clickSignUpButton();

        AccountPage accountPage= new AccountPage(driver);
        accountPage.isAccountCreationFormTitleVisible("ENTER ACCOUNT INFORMATION");
        accountPage.genderChoice("Mrs");
        accountPage.enterPassword("1234");
        accountPage.selectDateOfBirth("11","July","2002");
        accountPage.checkNewsletter();
        accountPage.checkPartner();
        accountPage.enterFirstName("emma");
        accountPage.enterLastName("dj");
        accountPage.enterCompany("IT");
        accountPage.enterAddress("add 1");
        accountPage.enterAddress2("add 2");
        accountPage.choiceCountry("Canada");
        accountPage.enterState("AB state");
        accountPage.enterCity("Montreal");
        accountPage.enterZipCode("14200");
        accountPage.enterMobileNumber("3294328253");
        accountPage.clickCreateAccountButton();


        accountPage.isAccountCreatedMessageVisible();
        accountPage.clickContinueButton();
        accountPage.isConnectedUserNameVisible("eman");
        accountPage.clickDeleteAccountButton();
        accountPage.isAccountDeletedMessageVisible();

    }

    //Test Case 2: Login User with correct email and password
    @Test
    public void loginUserValidEmailPassword (){
        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickSignUpLoginButton();

        SignupLoginPage signupLoginPage= new SignupLoginPage(driver);
        signupLoginPage.isLoginFormTitleVisible("Login to your account");
        signupLoginPage.enterEmailLogin("test25@olmas.com");
        signupLoginPage.enterPasswordLogin("test123");
        signupLoginPage.clickLoginButton();

        AccountPage accountPage=new AccountPage(driver);
        accountPage.isConnectedUserNameVisible("ouassima");
    }
    //Test Case 3: Login User with incorrect email and password
    @Test
    public void loginUserInvalidEmailPassword (){
        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickSignUpLoginButton();

        SignupLoginPage signupLoginPage= new SignupLoginPage(driver);
        signupLoginPage.isLoginFormTitleVisible("Login to your account");
        signupLoginPage.enterEmailLogin("test25@olmas.com");
        signupLoginPage.enterPasswordLogin("wrong");
        signupLoginPage.clickLoginButton();
        signupLoginPage.isErrorMessageIncorrectEmailPasswordVisible("Your email or password is incorrect!");


    }
    //Test Case 4: Logout User
    @Test
    public void logoutUser (){
        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickSignUpLoginButton();

        SignupLoginPage signupLoginPage= new SignupLoginPage(driver);
        signupLoginPage.isLoginFormTitleVisible("Login to your account");
        signupLoginPage.enterEmailLogin("test25@olmas.com");
        signupLoginPage.enterPasswordLogin("test123");
        signupLoginPage.clickLoginButton();

        AccountPage accountPage=new AccountPage(driver);
        accountPage.isConnectedUserNameVisible("ouassima");
        accountPage.clickLogoutButton();
    }
    //Test Case 5: Register User with existing email
    @Test
    public void registerUserWithExistingEmaill (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickSignUpLoginButton();

        SignupLoginPage signupLoginPage= new SignupLoginPage(driver);
        signupLoginPage.isSignUpFormTitleVisible("New User Signup!");
        signupLoginPage.enterName("eman");
        signupLoginPage.enterEmail("test25@olmas.com");
        signupLoginPage.clickSignUpButton();
        signupLoginPage.isErrorMessageExistingEmailVisible("Email Address already exist!");


    }

    //Test Case 6: Contact Us Form

    @Test
    public void testContactUsForm (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickContactUsButton();

        ContactUs contactUs=new ContactUs(driver);
        contactUs.isContactUsTitleVisible("GET IN TOUCH");
        contactUs.enterName("hello");
        contactUs.enterEmail("hello@world.com");
        contactUs.enterSubject("sayHey");
        contactUs.enterMessage("Hey Hey ..");
        contactUs.uploadFile("C:\\Users\\DELL\\Downloads\\passeport_redim_redimOK.pdf");
        contactUs.clickSubmit();
        contactUs.acceptAlert();
        contactUs.isSuccessMessageVisible("Success! Your details have been submitted successfully.");
        contactUs.clickHomeButton();

        homePage.isHomePageVisible("Automation Exercise");

    }
    //Test Case 7: Verify Test Cases Page
    @Test
    public void testCasesPage (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickTestCaseButton();

        TestCase testCase=new TestCase(driver);
        testCase.isTestCaseVisible("TEST CASES");

    }
    //Test Case 8: Verify All Products and product detail page
    @Test
    public void testProductPage (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickProductButton();

        ProductPage productPage= new ProductPage(driver);
        productPage.isProductPageTitleVisible("ALL PRODUCTS");
        productPage.isProductsListVisible();
        //7. Click on 'View Product' of first product
        productPage.clickViewProductButton();
      //  8. User is landed to product detail page
     //   9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        ProductDetailsPage productDetailsPage =new ProductDetailsPage(driver);
        productDetailsPage.isProductNameVisible();
        productDetailsPage.isProductCategoryVisible();
        productDetailsPage.isProductPriceVisible();


    }
   // Test Case 9: Search Product
   @Test
    public void testSearchProduct (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickProductButton();

        ProductPage productPage= new ProductPage(driver);
        productPage.isProductPageTitleVisible("ALL PRODUCTS");
        productPage.searchProduct("Dress");
        productPage.clickSearchButton();
        productPage.isSearchedProductsTitleVisible("SEARCHED PRODUCTS");
        productPage.areAllSearchedProductsVisible();

    }
    //Test Case 10: Verify Subscription in home page
    @Test
    public void testSubscriptionInHomePage (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");

       SubscriptionPage subscriptionPage= new SubscriptionPage(driver);
       subscriptionPage.isSubscriptionTexteVisible("SUBSCRIPTION");
       subscriptionPage.enterEmail("hello@world.com");
       subscriptionPage.clickSubscribeButton();
        subscriptionPage.isAlertMessageVisible("You have been successfully subscribed!");
    }
    //Test Case 11: Verify Subscription in Cart page
    @Test
    public void testSubscriptionInCartPage (){

        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickCartButton();

        SubscriptionPage subscriptionPage= new SubscriptionPage(driver);
        subscriptionPage.isSubscriptionTexteVisible("SUBSCRIPTION");
        subscriptionPage.enterEmail("hello@world.com");
        subscriptionPage.clickSubscribeButton();
        subscriptionPage.isAlertMessageVisible("You have been successfully subscribed!");
    }

    //Test Case 12: Add Products in Cart
    @Test
    public void testAddProductToCard(){
        HomePage homePage = new HomePage(driver);
        homePage.isHomePageVisible("Automation Exercise");
        homePage.clickProductButton();

        ProductPage productPage=new ProductPage(driver);
        productPage.clickAddFirstProductToCard();
        productPage.clickContinueShoppingButton();
        productPage.clickAddSecondProductToCard();
        productPage.clickViewCardButton();


        CartPage cartPage= new CartPage(driver);
        cartPage.print();
    }
    // Test Case 13: Verify Product quantity in Cart //LATER the button increase i cant locate it
    //Test Case 14: Place Order: Register while Checkout

}
