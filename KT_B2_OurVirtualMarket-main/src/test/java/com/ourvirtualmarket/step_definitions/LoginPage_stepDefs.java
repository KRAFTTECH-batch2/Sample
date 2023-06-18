package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage_stepDefs {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        HomePage.closePopup_mtd();
    }
    @When("The user should fill in valid credentials")
    public void the_user_should_fill_in_valid_credentials() {

        loginPage.loginUser();

    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        String actual = homePage.logoutButton_loc.getText();
        String expected = "Logout";
        Assert.assertEquals(expected,actual);
    }

    @When("The user should input {string} and {string}")
    public void the_user_should_input_and(String email, String password) {
        loginPage.loginUser(email, password);
    }

    @Then("The user should be able to see warning message as {string}")
    public void the_user_should_be_able_to_see_warning_message_as(String expectedMessage) {

            String actual = loginPage.wrongMailOrPasswordMessage_loc.getText();
            Assert.assertEquals(expectedMessage,actual);
    }
}
