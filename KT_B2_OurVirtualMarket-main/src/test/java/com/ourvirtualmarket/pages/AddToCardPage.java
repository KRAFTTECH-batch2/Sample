package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCardPage extends BasePage{

    @FindBy(css = ".autosearch-input.form-control")
    public WebElement searchBox_loc;

    @FindBy(css = "#input-search")
    public WebElement searchCriteria_loc;

    @FindBy(xpath = "//h1[.='Search - cello']")
    public WebElement searchCello_loc;

    @FindBy(id = "product-image-7403979")
    public WebElement productCello_19_loc;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    public WebElement addToCartButton_loc;

    @FindBy(xpath = "//input[@class='btn btn-checkout '][1]")
    public WebElement buyNowButton_loc;

    @FindBy(xpath = "//h4[.=' Added to cart successfully. What is next?']")
    public WebElement addedSuccessfully_loc;

    public void searchProductMethod(){
        searchBox_loc.click();
        searchBox_loc.sendKeys("cello", Keys.ENTER);
    }
    public void getSearchTextMethod(){
        System.out.println(searchCriteria_loc.getAttribute("value"));
    }
    public void verifySearchingMethod(){
        String expectedSearch="Search - cello";
        System.out.println("expectedSearch = " + expectedSearch);
        String actualSearch= Driver.get()
                .findElement(By.xpath("//h1[.='Search - cello']"))
                .getText();
        System.out.println("actualSearch = " + actualSearch);
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actualSearch, expectedSearch);
    }
    public void clickProductMethod(){
        productCello_19_loc.click();
        BrowserUtils.waitFor(2);
    }
    public void verifyAddToCardAndBuyNowText(String expectedText1, String expectedText2){
        String actualText1=(addToCartButton_loc.getAttribute("value"));
        String actualText2=buyNowButton_loc.getAttribute("value");
        System.out.println("actualText1 = " + actualText1);
        System.out.println("actualText2 = " + actualText2);
        Assert.assertEquals(actualText1, expectedText1);
        Assert.assertEquals(actualText2, expectedText2);
    }
    public void addToCardMethod(String addToCard){
        addToCartButton_loc.click();
    }
    public void verifyAddedProductMethod(){
        BrowserUtils.waitForVisibility(addedSuccessfully_loc, 10);
        System.out.println("addedSuccessfully_loc.getText() = " + addedSuccessfully_loc.getText());
    }

}
