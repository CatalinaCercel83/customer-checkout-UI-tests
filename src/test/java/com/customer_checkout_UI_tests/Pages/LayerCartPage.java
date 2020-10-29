package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LayerCartPage {

    public LayerCartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@id='layer_cart']")
    public WebElement layerCartID;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
    public WebElement continueShopping;

    @FindBy(xpath = "//i[@class='icon-ok']")
    public WebElement successfullyAddedCheckMark;

}
