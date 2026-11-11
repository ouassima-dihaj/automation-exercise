package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Log;

public class ProductDetailsPage {
    private WebDriver driver;
    private By productName = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2");
    private By productCategory = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]");
    private By productPrice = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span");

    public ProductDetailsPage(WebDriver driver){
        this.driver= driver;
    }
    public void isProductNameVisible(){
        Assert.assertTrue(driver.findElement(productName).isDisplayed(),"product name is not visible");
        Log.info(driver.findElement(productName).getText());
    }
    public void isProductCategoryVisible(){
        Assert.assertTrue(driver.findElement(productCategory).isDisplayed(),"product cat is not visible");
        Log.info(driver.findElement(productCategory).getText());

    }

    public void isProductPriceVisible(){
        Assert.assertTrue(driver.findElement(productPrice).isDisplayed(),"product price is not visible");
        Log.info(driver.findElement(productPrice).getText());

    }
}
