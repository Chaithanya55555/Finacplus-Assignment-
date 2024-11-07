package Exercise1.example.Test;

import Exercise1.example.baseUtilites.baseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Ui extends baseClass {

    @Test
    public void successfulLogin(){
        try{
            login.login("standard_user","secret_sauce");

            String expectedHomeUrl = "https://www.saucedemo.com/inventory.html";

            wait.until(ExpectedConditions.urlToBe(expectedHomeUrl));

            String currentHomeUrl= driver.getCurrentUrl();

            Assert.assertEquals(currentHomeUrl,expectedHomeUrl);
            Assert.assertTrue(home.isProductTitleDisplayed(),"Title isn't display");
            Assert.assertTrue(home.areAllProductsDisplayed(),"All products aren't display");

            String ItemDetails = home.getFirstItemNameAndPrice();
            System.out.println(ItemDetails);


            home.clickOnAddCartButton();

            Assert.assertTrue(home.areRemoveButtonAndOneImageDisplayed(),"One image isn't display");

            home.clickOnCartButton();

            String expectedCartUrl = "https://www.saucedemo.com/cart.html";

            wait.until(ExpectedConditions.urlToBe(expectedCartUrl));

            String currentCartUrl = driver.getCurrentUrl();

            String itemName = "Sauce Labs Backpack";
            String itemPrice = "$29.99";

            Assert.assertEquals(currentCartUrl,expectedCartUrl);
            Assert.assertEquals(cart.getItemName(),itemName);
            Assert.assertEquals(cart.getItemPrice(),itemPrice);

            cart.clickOnMenuButton();

            cart.clickOnLogOutButton();

            String exceptedLoginUrl = "https://www.saucedemo.com/";

            wait.until(ExpectedConditions.urlToBe(exceptedLoginUrl));

            String currentLoginUrl = driver.getCurrentUrl();

            Assert.assertEquals(currentLoginUrl,exceptedLoginUrl);

        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
    }

}
