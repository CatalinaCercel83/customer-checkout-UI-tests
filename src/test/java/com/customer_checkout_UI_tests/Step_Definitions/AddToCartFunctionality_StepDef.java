package com.customer_checkout_UI_tests.Step_Definitions;

import com.customer_checkout_UI_tests.Pages.*;
import com.customer_checkout_UI_tests.Utilities.BrowserUtils;
import com.customer_checkout_UI_tests.Utilities.ConfigurationReader;
import com.customer_checkout_UI_tests.Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddToCartFunctionality_StepDef {

    HomePage homePage = new HomePage();
    WebDriver driver = Driver.get();
    Actions actions = new Actions(driver);
    SelectedProductPage selectedProductPage = new SelectedProductPage();
    LayerCartPage layerCartPage = new LayerCartPage();
    CartPage cartPage = new CartPage();
    IFramePage iFramePage = new IFramePage();

    @Given("the user is on the home page and search for {string}")
    public void the_user_is_on_the_home_page_and_search_for(String string) {

        String url = ConfigurationReader.get("URL_LOW_ENVIRONMENT");
        driver.get(url);

        homePage.searchInputField.sendKeys(string);
        homePage.searchButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user is selecting the {string} PICTURE  directly")
    public void the_user_is_selecting_the_PICTURE_directly(String string) {

        WebElement pictureImage = homePage.printedChiffonDressImg;
        actions.moveToElement(pictureImage).perform();
        BrowserUtils.waitFor(1);

        Assert.assertTrue(pictureImage.isDisplayed());
        BrowserUtils.waitFor(1);
        pictureImage.click();
    }

    @When("visiting the selected product page is choosing {string} option")
    public void visiting_the_selected_product_page_is_choosing_option(String string) {

        if(string.equals("ADDTOCART"))
        selectedProductPage.addToCart.click();

        BrowserUtils.waitForClickablility(By.xpath("//div[@id='layer_cart']"), 5);
        Assert.assertTrue("THE PRODUCT HAS NOT BEEN SUCCESSFULLY ADDED TO THE CART!", layerCartPage.successfullyAddedCheckMark.isDisplayed());
    }

    @Then("the user is about to choose {string} from the Layer Cart Dialog")
    public void the_user_is_about_to_choose_from_the_Layer_Cart_Dialog(String string) {


        if(string.equals("PROCEED TO CHECKOUT")){
            layerCartPage.proceedToCheckout.click();
        }else if(string.equals("CONTINUE SHOPPING")){
            layerCartPage.continueShopping.click();
        }

        String actualProducts = cartPage.totalProducts.getText();
        String expectedProducts = "1 Product";
        Assert.assertEquals("YOU HAVE MORE THAN 1 PRODUCT ADDED TO THE CART!",expectedProducts,actualProducts);
    }

    @Then("verifying the TOTAL price is correct")
    public void verifying_the_TOTAL_price_is_correct() {

        BrowserUtils.waitFor(1);
        String totalPrice = cartPage.totalPrice.getText();
        String expectedPrice = "$18.40";
        Assert.assertEquals("TOTAL PRICE IS NOT CORRECT !!! ", expectedPrice,totalPrice);

    }

    @When("the user is holding over the {string} PICTURE and press {string}")
    public void the_user_is_holding_over_the_PICTURE_and_press(String string, String string2) {

        String actualSearchText = homePage.searchResultsPageHeading.getText();
        actualSearchText = actualSearchText.toUpperCase();
        string = "\""+string.toUpperCase()+"\"";

        Assert.assertEquals("SEARCHING RESULTS ARE WRONG !!! ", string, actualSearchText);

        WebElement pictureImage = homePage.printedChiffonDressImg;
        actions.moveToElement(pictureImage).perform();
        BrowserUtils.waitFor(2);

        if(string2.equals("ADDTOCART")) {
            homePage.addToCartSelectedIProduct.click();
        }else if(string2.equals("MORE")){
            homePage.pressMore.click();
        }
    }

    @When("the user is holding over the {string} PICTURE and press {string} option")
    public void the_user_is_holding_over_the_PICTURE_and_press_option(String string, String string2) {

        BrowserUtils.waitFor(2);
        WebElement pictureImage = homePage.printedChiffonDressImg;
        WebElement quickViewOption = homePage.quickViewPictureOption;

        actions.moveToElement(pictureImage).perform();
        BrowserUtils.waitFor(2);

        if(string2.contains("QUICKVIEW")){

            BrowserUtils.waitForClickablility(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]"),5);
            quickViewOption.click();
            //quickViewOption.click();
        }
    }

    @When("visiting the selected product iFrame Fancybox is choosing {string} option")
    public void visiting_the_selected_product_iFrame_Fancybox_is_choosing_option(String string) {

        WebElement addToCartIFrame = iFramePage.addToCart;
        WebElement selectingIFrame = iFramePage.iFrameDynamicPresenece;

        BrowserUtils.waitFor(2);
        driver.switchTo().frame(selectingIFrame);

        BrowserUtils.waitFor(2);

        if(string.equals("ADDTOCART")) {
           addToCartIFrame.click();
        }

        driver.switchTo().defaultContent();
        BrowserUtils.waitFor(2);
    }
}
