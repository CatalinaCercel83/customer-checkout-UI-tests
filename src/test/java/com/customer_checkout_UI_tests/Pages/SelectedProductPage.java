package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedProductPage {

    public SelectedProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = " //button[@name='Submit']")
    public WebElement addToCart;
}
