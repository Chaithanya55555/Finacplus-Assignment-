package Exercise1.example.pageObjects;


import Exercise1.example.baseUtilites.pomBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends pomBaseClass {
    @FindBy(className = "inventory_item_name")
    WebElement itemName;

    @FindBy(className = "inventory_item_price")
    WebElement itemPrice;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    @FindBy(id= "logout_sidebar_link")
    WebElement logoutButton;

    public cartPage(WebDriver driver){
        super(driver);
    }

    public boolean areNameAndPriceDisplayed(){
        return itemName.isDisplayed() && itemPrice.isDisplayed();
    }

    public String getItemName(){
        return itemName.getText();
    }

    public String getItemPrice(){
        return itemPrice.getText();
    }

    public void clickOnMenuButton(){
        menuButton.click();
    }

    public void clickOnLogOutButton(){
        logoutButton.click();
    }



}
