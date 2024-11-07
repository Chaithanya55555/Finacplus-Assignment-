package Exercise1.example.baseUtilites;

import Exercise1.example.pageObjects.cartPage;
import Exercise1.example.pageObjects.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import Exercise1.example.pageObjects.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseClass {
    public WebDriver driver;
    public loginPage login;
    public WebDriverWait wait;
    public homePage home;
    public cartPage cart;


    @BeforeMethod
    public void  setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        login = new loginPage(driver);
        home = new homePage(driver);
        cart = new cartPage(driver);


    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
