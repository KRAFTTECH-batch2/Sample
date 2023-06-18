package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@class='popup-close']")
    public static WebElement closePopup_loc;

    @FindBy(xpath = "//li[@class='log logout']//a[contains(text(),'Logout')]")
    public WebElement logoutButton_loc;

    @FindBy(xpath = "//li[@class='menu-layouts']//strong[contains(text(),'Home')]")
    public WebElement homeButton_loc;

    @FindBy(xpath = "//a[@title='Compare ']")
    public WebElement compareButton_loc;




    public static void closePopup_mtd(){

        closePopup_loc.click();
    }

    public static void clickCategory(String categoryName){
        Driver.get().findElement(By.xpath("(//ul[@class='megamenu'])[2]/li[contains(.,'"+categoryName+"')]")).click();
    }

    public static void addToCompareList(String exactProductName){
        Driver.get().findElement(By.xpath("//a[.='"+exactProductName+"']/ancestor::div[@class='product-item-container']" +
                "//div[@class='list-block']//button[@title='Compare this Product']")).click();
    }

    public static void addToCart(String exactProductName){
        Driver.get().findElement(By.xpath("(//a[.='"+exactProductName+"']/ancestor::div[@class='product-item-container']//button[@title='Compare this Product'])[2]")).click();
    }
    public static void addToWishList(String exactProductName){
        Driver.get().findElement(By.xpath("//a[.='"+exactProductName+"']/ancestor::div[@class='product-item-container']" +
                "//div[@class='list-block']//button[@title='Add to Wish List']")).click();
    }












}
