package com.customer_checkout_UI_tests.Pages;

import com.customer_checkout_UI_tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInHeader;

    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement searchInputField;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/h1[1]/span[1]")
    public WebElement searchResultsPageHeading;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement homePageCart;

    @FindBy(xpath = "//a[@title='Printed Chiffon Dress']")
    public WebElement printedChiffonDressImg;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[2]")
    public WebElement pressMore;

//    @FindBy(xpath = "//a[@id='color_37']")
//    public WebElement printedChiffonDressGreenOption;
//
//    @FindBy(xpath = "//a[@id='color_34']")
//    public WebElement printedChiffonDressYellowOption;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]")
    public WebElement quickViewPictureOption;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    public WebElement addToCartSelectedIProduct;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/span[1]/span[1]/link[1]")
    public WebElement verifyInStockAvailability;








}
