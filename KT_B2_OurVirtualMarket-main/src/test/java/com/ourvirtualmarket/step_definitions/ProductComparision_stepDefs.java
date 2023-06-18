package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.CategoriesPage;
import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.ProductComparisionPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductComparision_stepDefs {

    HomePage homePage = new HomePage();
    CategoriesPage categoriesPage= new CategoriesPage();


    @When("The user selects a category {string}")
    public void the_user_selects_a_category(String Category) {
        HomePage.clickCategory(Category);
        BrowserUtils.scrollToElement(categoriesPage.tableViewButton_loc);


    }

    @When("the user clicks HomePage")
    public void the_user_clicks_home_page() {
        homePage.homeButton_loc.click();
        HomePage.closePopup_mtd();
    }

    @When("The user adds the product {string} to Product Comparision List")
    public void the_user_adds_the_product_led_backlit_lcd_tv_to_product_comparison_list(String exactProductName) {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(categoriesPage.tableViewButton_loc);
        BrowserUtils.waitFor(1);
        HomePage.addToCompareList(exactProductName);

    }
    @When("The user clicks Product Comparision Button")
    public void the_user_clicks_product_comparison_button() {
        BrowserUtils.clickWithJS(homePage.compareButton_loc);
        BrowserUtils.waitFor(1);
    }

    @Then("The user verifies the product {string} added to the Product Comparision List")
    public void the_user_verifies_the_product_added_to_the_product_comparision_list(String exactProductName) {
        ProductComparisionPage.productAddedComparisionListAssertion(exactProductName);

    }


}
