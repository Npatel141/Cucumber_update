package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.example.Utils.clickOnElement;
import static org.example.Utils.getTextFromElement;

public class SelectCurrency {

    public void SelectCurrencyUSD()
    {
        //select USDollar from dropdown
        org.openqa.selenium.support.ui.Select USDOllar = new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        USDOllar.selectByVisibleText("US Dollar");
        //verifying the price of build our own computer is in UsD
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
        //To check price in Euro on build your on computer page
        clickOnElement(By.xpath("//span[@id='price-value-1']"));
        //assign string value
        String expectedResult = "$1,315.00";
        //Get actual result
        String actualResult = getTextFromElement(By.xpath("//span[@id='price-value-1']"));

        System.out.println("actual result is:" + actualResult);
        Assert.assertEquals(actualResult, expectedResult);

        //Select Euro from Drop Down
        org.openqa.selenium.support.ui.Select Euro = new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        Euro.selectByVisibleText("Euro");
        //verifying the price of build our own computer is in Euro
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
        //To check price in Euro on build your on computer page
        clickOnElement(By.xpath("//span[@id='price-value-1']"));
        //assign string value
        String expectedResult1 = "€1130.90";
        //Get actual result
        String actualResult1= getTextFromElement(By.xpath("//span[@id='price-value-1']"));

        System.out.println("actual result is:" + actualResult1);
        //compare actual and expected result
        Assert.assertEquals(actualResult1, expectedResult1);

    }
}
