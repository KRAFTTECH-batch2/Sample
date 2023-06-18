package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.AddToCardPage;
import com.ourvirtualmarket.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCard_stepDefs {
    AddToCardPage addToCardPage=new AddToCardPage();

    @When("The user should be able to search for any product")
    public void the_user_should_be_able_to_search_for_any_product() {
        //loginPage.loginUser("alp@gmail.com", "123456");
        //parametreli loginUser methodunu kullanınca hata aldım.
        addToCardPage.searchProductMethod();
    }
    @When("The user should be go to the page where the relevant products are presented")
    public void the_user_should_be_go_to_the_page_where_the_relevant_products_are_presented() {
        addToCardPage.getSearchTextMethod();
    }
    @Then("Verify the relevant product should be displayed")
    public void verify_the_relevant_product_should_be_displayed() {
        addToCardPage.verifySearchingMethod();
    }
    @When("The user click the relevant product")
    public void the_user_click_the_relevant_product() {
        addToCardPage.clickProductMethod();
    }
    @Then("The user should be see {string} and {string} buttons next to the product")
    public void the_user_should_be_see_and_buttons_next_to_the_product(String addToCard, String buyNow) {
        addToCardPage.verifyAddToCardAndBuyNowText(addToCard, buyNow);
    }
    @Then("The user should be click the {string} button")
    public void the_user_should_be_click_the_button(String expectedBttn) {
        addToCardPage.addToCardMethod(expectedBttn);
    }
    @Then("Verify the product is added to the user's shopping card")
    public void verify_the_product_is_added_to_the_user_s_shopping_card() {
        addToCardPage.verifyAddedProductMethod();
    }
}
