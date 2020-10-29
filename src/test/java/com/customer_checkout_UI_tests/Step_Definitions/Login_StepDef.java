package com.customer_checkout_UI_tests.Step_Definitions;

import com.customer_checkout_UI_tests.Pages.HomePage;
import com.customer_checkout_UI_tests.Pages.SignInPage;
import com.customer_checkout_UI_tests.Utilities.BrowserUtils;
import com.customer_checkout_UI_tests.Utilities.ConfigurationReader;
import com.customer_checkout_UI_tests.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef {

    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();

    @Given("the user  should open the login shopping webPage url")
    public void the_user_should_open_the_login_shopping_webPage_url() {

        String url = ConfigurationReader.get("URL_LOW_ENVIRONMENT");
        Driver.get().get(url);

    }

    @When("the user is inserting valid credentials")
    public void the_user_is_inserting_valid_credentials() {

        String userName = ConfigurationReader.get("ACCOUNT_EMAIL");
        String passWord = ConfigurationReader.get("ACCOUNT_PASSWORD");

        BrowserUtils.waitFor(1);
        homePage.signInHeader.click();
        signInPage.login(userName,passWord);
    }


    @Then("the home page should be display ready for shopping")
    public void the_home_page_should_be_display_ready_for_shopping() {

        String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";
        String actualUrl = Driver.get().getCurrentUrl();

        BrowserUtils.waitFor(1);
        Assert.assertEquals("THE EXPECTED URL COULD NOT BEEN FOUND" , expectedUrl,actualUrl);

    }


}
