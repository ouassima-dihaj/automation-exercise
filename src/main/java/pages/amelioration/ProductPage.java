package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductPage {private WebDriver driver;
    private By productPageTitle = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By productNameTextBox= By.xpath("//input[@id=\"search_product\"]");
    private By searchButton = By.xpath("//button[@id='submit_search']");
    private By searchProductsTitle= By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
    private By productsList =
            By.cssSelector(".features_items .productinfo p");
    private By viewProductButton= By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    private By add1ProductToCardButton= By.xpath("//a[@data-product-id=\"1\"]");
    private By continueShoppingButton=By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    private By add2ProductToCardButton= By.xpath("//a[@data-product-id=\"2\"]");
    private By viewCardButton=By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");

    public ProductPage(WebDriver driver){
        this.driver= driver;
    }
    public void isProductPageTitleVisible(String title){
        Assert.assertEquals(driver.findElement(productPageTitle).getText(),title);
    }
    public void searchProduct(String name){
        driver.findElement(productNameTextBox).sendKeys(name);
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void isSearchedProductsTitleVisible(String title){
        Assert.assertEquals(driver.findElement(searchProductsTitle).getText(),title);
    }
    public void areAllSearchedProductsVisible() {

        List<WebElement> products =
                driver.findElements(productsList);
        System.out.println(products);
        Assert.assertTrue(
                products.size() > 0,
                "No searched products were found"
        );

        for (WebElement product : products) {
            Assert.assertTrue(
                    product.isDisplayed(),
                    "A searched product is not visible"
            );
        }
    }

    public void isProductsListVisible() {
        List<WebElement> products =
                driver.findElements(productsList);

        for (WebElement product : products) {
            Assert.assertTrue(
                    product.isDisplayed(),
                    "A product is not visible"
            );
        }
    }
    public void clickViewProductButton(){

        driver.findElement(viewProductButton).click();
    }
    public void clickAddFirstProductToCard(){
        driver.findElement(add1ProductToCardButton).click();
    }

    public void clickContinueShoppingButton(){
        driver.findElement(continueShoppingButton).click();
    }
    public void clickAddSecondProductToCard(){
        driver.findElement(add2ProductToCardButton).click();
    }
    public void clickViewCardButton(){
        driver.findElement(viewCardButton).click();
    }
}
