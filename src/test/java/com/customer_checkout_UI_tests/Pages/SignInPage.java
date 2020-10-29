package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//input[@id='email']")
    public WebElement yourEmail;

    @FindBy (xpath = "//input[@id='passwd']")
    public WebElement yourPassword;

    @FindBy (xpath = "//button[@id='SubmitLogin']")
    public WebElement signInButton;


    public void login(String userNameStr, String passwordStr) {
        yourEmail.sendKeys(userNameStr);
        yourPassword.sendKeys(passwordStr);
        signInButton.click();
    }
}
