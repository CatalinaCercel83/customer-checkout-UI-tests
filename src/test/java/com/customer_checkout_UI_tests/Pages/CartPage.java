package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    //span[@id='total_price']
    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@id='total_price']")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    public WebElement totalProducts;

}
