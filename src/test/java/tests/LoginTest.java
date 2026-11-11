package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin (){
        String title =driver.getTitle();

        Assert.assertEquals(title, "Automation Exercise");

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterName("test");
        signUpPage.enterEmail("test19@olmas.com");
        signUpPage.clickSignUp();
        System.out.println("title of this page is: "+ driver.getTitle());
    }

}
