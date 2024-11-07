package Exercise1.example.pageObjects;

import Exercise1.example.baseUtilites.pomBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pomBaseClass {
    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public loginPage(WebDriver driver){
        super(driver);
    }
    public void login(String userName , String password){
        usernameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
