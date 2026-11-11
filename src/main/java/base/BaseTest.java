package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver ;
    // Add this method for screenshoot
    public WebDriver getDriver() {
        return driver;
    }
  // whatever things we want to do before running a test we need to put it here
    @BeforeMethod
    public void setUp (){
//        driver=new ChromeDriver();
        // pour utiliser brave
        ChromeOptions options = new ChromeOptions();
        options.setBinary(
                "C:\\\\Program Files\\\\BraveSoftware\\\\Brave-Browser\\\\Application\\\\brave.exe"
        );
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
          driver.quit();
        }
    }
}

