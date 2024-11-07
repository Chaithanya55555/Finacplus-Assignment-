package Exercise1.example.pageObjects;


import Exercise1.example.baseUtilites.pomBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class homePage extends pomBaseClass {
    @FindBy(css = "span.title")
    WebElement productTitle;

    @FindBy(css = "div.inventory_item")
    List<WebElement> productList;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    WebElement firstItemName;

    @FindBy(xpath = "(//div[@class = 'inventory_item_price'])[1]")
    WebElement firstItemPrice;

    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    WebElement addCartButton;

    @FindBy(name = "remove-sauce-labs-backpack")
    WebElement removeButton;

    @FindBy(className = "shopping_cart_badge")
    WebElement oneImageOnCart;

    @FindBy(className = "shopping_cart_link")
    WebElement cartButton;

    public homePage(WebDriver driver){
        super(driver);
    }
    public boolean isProductTitleDisplayed(){
       return productTitle.isDisplayed();
    }
    public boolean areAllProductsDisplayed(){
        return productList.stream().allMatch(WebElement::isDisplayed);
    }

    public String getFirstItemNameAndPrice(){
        return firstItemName.getText() + " " + firstItemPrice.getText();
    }

    public void clickOnAddCartButton(){
        addCartButton.click();
    }

    public boolean areRemoveButtonAndOneImageDisplayed(){
        return removeButton.isDisplayed() && oneImageOnCart.isDisplayed();
    }

    public void clickOnCartButton(){
        cartButton.click();
    }
}
