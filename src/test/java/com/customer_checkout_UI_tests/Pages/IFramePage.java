package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IFramePage {

    public IFramePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    public WebElement addToCart;

    @FindBy(xpath = "//iframe[@id='fancybox-frame1603931828848']")
    public WebElement iFramePresenece;
}
