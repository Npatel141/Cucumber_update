package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYYourOwnComputerAddedSuccessfully extends Utils{

    public void verifyBuildyourowncomputeraddedsuccessfyllyInShoppingCart(){

        //Verifying build your own computer is added to shopping cart
        clickOnElement(By.xpath("//td[@class='product']/a"));
        String actualaddcartURL=driver.getCurrentUrl();
        Assert.assertTrue(actualaddcartURL.contains("build-your-own-computer"),"you ar on the right page");
        //veriyfing shopping cart
        clickOnElement(By.xpath("//div[@class=\"page-title\"]/h1"));
        String actualShoppingCartURL=driver.getCurrentUrl();
        Assert.assertTrue(actualShoppingCartURL.contains("cart"),"you are on shopping cart");
    }
}
