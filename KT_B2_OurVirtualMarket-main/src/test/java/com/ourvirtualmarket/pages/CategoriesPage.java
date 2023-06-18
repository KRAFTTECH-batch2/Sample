package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends BasePage{
    @FindBy(xpath = "//button[@id='table-view']")
    public WebElement tableViewButton_loc;
}
