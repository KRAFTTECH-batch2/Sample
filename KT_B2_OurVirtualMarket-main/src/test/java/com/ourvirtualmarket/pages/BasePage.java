package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {



    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void loginOrRegister(String loginOrRegister){


        Driver.get().findElement(By.xpath("//li[@class='log login']//a[contains(text(),'" + loginOrRegister + "')]")).click();


    }
}
