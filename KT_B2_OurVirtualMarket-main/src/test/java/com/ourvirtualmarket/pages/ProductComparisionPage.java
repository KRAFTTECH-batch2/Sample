package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ProductComparisionPage extends BasePage{


    public static void productAddedComparisionListAssertion(String productExactName){
        Assert.assertTrue(Driver.get().findElement(By.xpath("//tr/td/a/*[.='" + productExactName + "']")).getText().contains(productExactName));
    }

}
