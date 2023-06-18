package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

    @FindBy(xpath= "//h1[text()='Account Logout']")
    public WebElement text1_loc;
   @FindBy(xpath = "//p[contains(text(),'You have been logged off your account.')]")
    public WebElement text2_loc;
   @FindBy(xpath = "//p[contains(text(),'Your shopping cart has been saved')]")
    public WebElement text3_loc;
   @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButton_loc;



}
