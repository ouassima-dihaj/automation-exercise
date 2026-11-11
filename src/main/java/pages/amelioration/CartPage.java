package pages.amelioration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Log;

import java.util.List;

public class CartPage {
    private WebDriver driver;
    private By trs = By.xpath("//*[@id=\"cart_info_table\"]/tbody/tr");
    private By product1=By.id("product-1");
    private By product2=By.id("product-2");
    public CartPage(WebDriver driver){
        this.driver= driver;
    }
   // 9. Verify both products are added to Cart

    public void print(){
        List <WebElement> rows= driver.findElements(trs);
         if(rows.size()==2){

             Log.info("both products are added to Cart");
             Assert.assertTrue(driver.findElement(this.product1).isDisplayed() , "product 1 is not displayed ");
             Assert.assertTrue(driver.findElement(this.product1).isDisplayed() , "product 2 is not displayed ");

         }else{
             Log.error("Error ");
         }
         //10. Verify their prices, quantity and total price// to do later
    }

}
