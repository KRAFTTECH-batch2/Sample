package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.LogoutPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutPage_stepDefs {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    LogoutPage logoutPage=new LogoutPage();

    @Given("The user should be login")
    public void the_user_should_be_login() {
        Driver.get().get(ConfigurationReader.get("url"));
        HomePage.closePopup_mtd();
        loginPage.loginUser();


    }
    @When("The user clicks on logout button")
    public void the_user_clicks_on_logout_button() {
        homePage.logoutButton_loc.click();
        Assert.assertTrue(logoutPage.text1_loc.isDisplayed());
        Assert.assertTrue(logoutPage.text2_loc.isDisplayed());
        Assert.assertTrue(logoutPage.text3_loc.isDisplayed());

        String actualText1 = logoutPage.text1_loc.getText();
        String expectedText1="Account Logout";
        Assert.assertEquals(expectedText1,actualText1);
        String actualText2 = logoutPage.text2_loc.getText();
        String expectedText2="You have been logged off your account. It is now safe to leave the computer.";
        Assert.assertEquals(expectedText2,actualText2);
        String actualText3 = logoutPage.text3_loc.getText();
        String expectedText3="Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account.";
        Assert.assertEquals(expectedText3,actualText3);



    }
    @Then("The user clicks on continue button")
    public void the_user_clicks_on_continue_button() {
        logoutPage.continueButton_loc.click();
        HomePage.closePopup_mtd();
        Driver.get().navigate().back();
        Assert.assertTrue(logoutPage.text1_loc.isDisplayed());


    }
}
