package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SelectedProductAccordingtoCurrency extends Utils {
    public void selectedProductInUSD() {
        //To check price in USD on build your on computer page
        clickOnElement(By.xpath("//span[@id='price-value-1']"));
        //assign string value
        String expectedResult = "$1,315.00";
        //Get actual result
        String actualResult = getTextFromElement(By.xpath("//span[@id='price-value-1']"));

        System.out.println("actual result is:" + actualResult);
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void selectedProductInEuro(){
        //To check price in Euro on build your on computer page
        clickOnElement(By.xpath("//span[@id='price-value-1']"));
        //assign string value
        String expectedResult1 = "€1130.90";
        //Get actual result
        String actualResult1= getTextFromElement(By.className("price-value-1"));

        System.out.println("actual result is:" + actualResult1);
        //compare actual and expected result
        Assert.assertEquals(actualResult1,expectedResult1);
    }
}