package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.CategoriesPage;
import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.ProductComparisionPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ProductComparision_Test {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        CategoriesPage categoriesPage = new CategoriesPage();

        Driver.get().get("https://ourvirtualmarket.com/");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
        HomePage.closePopup_mtd();
        loginPage.loginUser();
        homePage.homeButton_loc.click();
        HomePage.closePopup_mtd();
        HomePage.clickCategory("Television");
        BrowserUtils.clickWithJS(categoriesPage.tableViewButton_loc);
        BrowserUtils.waitFor(1);
        HomePage.addToCompareList("Cello C1920FS 19\" LED-backlit LCD TV ");
        BrowserUtils.waitFor(1);
        HomePage.addToCompareList("Cello C2420G 24\" LED-backlit LCD TV ");
        BrowserUtils.waitFor(1);
        HomePage.addToCompareList("Cello C3220G 32\" LED-backlit LCD TV ");
        BrowserUtils.waitFor(1);
        HomePage.addToCompareList("Cello C4020DVB 40\" LED-backlit LCD TV ");
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(homePage.compareButton_loc);
        BrowserUtils.waitFor(1);
        ProductComparisionPage.productAddedComparisionListAssertion("Cello C1920FS 19\" LED-backlit LCD TV");
    }
}
