package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    @FindBy(xpath = "//a[@id='wishlist-total']")
    public WebElement wishListButton_loc;

    @FindBy(xpath = "(//table[@class='table table-bordered table-hover']//tbody//td[@class='text-right'])[3]//button")
    public WebElement addToCartButtonOnWishListPage_loc;

    @FindBy(xpath = "(//table[@class='table table-bordered table-hover']//tbody//td[@class='text-right'])[3]//a")
    public WebElement removeButtonOnWishListPage_loc;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement addToCartSuccessfullyHeader_loc;

    @FindBy(xpath = "//*[contains(text(),'Success: You have modified your wish list!')]")
    public WebElement removeToListSuccessMessage_loc;

    @FindBy(xpath = "//div[@id='so_listing_tabs_69']//a[@title='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer']")
    public WebElement hairDryer_loc;

    @FindBy(xpath = "(//div[@id='so_listing_tabs_69']//a[@title='Noerden Minimi Smart Body Scale'])[2]")
    public WebElement bodyScale_loc;

    @FindBy(xpath = "//li[@class='wishlist']")
    public WebElement addToWishListButtonOnProductPage_loc;


}
