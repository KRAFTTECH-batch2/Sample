package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.WishListPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishList_stepDefs {

    HomePage homePage = new HomePage();
    WishListPage wishListPage = new WishListPage();

    @When("The user should go to homepage and add at least two products at the My Wish List")
    public void the_user_should_go_to_homepage_and_add_at_least_two_products_at_the_my_wish_list() {

        homePage.homeButton_loc.click();
        HomePage.closePopup_mtd();
        wishListPage.hairDryer_loc.click();
        wishListPage.addToWishListButtonOnProductPage_loc.click();
        Driver.get().navigate().back();
        wishListPage.bodyScale_loc.click();
        wishListPage.addToWishListButtonOnProductPage_loc.click();
    }

    @When("The user click wish list button on home page")
    public void the_user_click_wish_list_button_on_home_page() {
        wishListPage.wishListButton_loc.click();
    }

    @When("The user click Add to cart button of any product")
    public void the_user_click_add_to_cart_button_of_any_product() {
        wishListPage.addToCartButtonOnWishListPage_loc.click();
        BrowserUtils.waitFor(3);
    }


    @Then("The user should be able to see message as {string}")
    public void the_user_should_be_able_to_see_message_as(String expectedMessage) {
        String actualMessage = wishListPage.addToCartSuccessfullyHeader_loc.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("The user click remove button of any product")
    public void the_user_click_remove_button_of_any_product() {
        wishListPage.removeButtonOnWishListPage_loc.click();
    }

    @Then("The user should be able to see success message")
    public void the_user_should_be_able_to_see_success_message() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(wishListPage.removeToListSuccessMessage_loc.isDisplayed());
    }

}
