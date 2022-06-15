package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends Utils {
    private By _regitrationButton = By.className("ico-register");


    public void ClickOnRegisterButton() {
        //click on registration button
        clickOnElement(By.className("ico-register"));


    }

    public void selectDesktopFromComputer() {
        WebElement ele = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));   //Create object to store x-path
        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();//create object to perform mouse hoover
        //submenu
        WebElement submenu = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/ul/li[1]/a"));
        //To mouseover on submenu
        act.moveToElement(submenu);
        //build(); method is use to compile all actions in single step
        act.click().build().perform();

    }

    public void selectCurrencyUSD() {
        //select USDollar from dropdown
        Select USDOllar = new Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        USDOllar.selectByVisibleText("US Dollar");
        //verifying the price of build our own computer is in UsD
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
    }

    public void selectCurrencyEuro() {
        //Select Euro from Drop Down
        Select Euro = new Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        Euro.selectByVisibleText("Euro");
        //verifying the price of build our own computer is in Euro
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
    }

    public void communityyPoll() {
        clickOnElement(By.id("pollanswers-2"));
        clickOnElement(By.id("vote-poll-1"));

    }

    public void communityPollVoteSuccessfully() {
        clickOnElement(By.id("pollanswers-2"));
        clickOnElement(By.id("vote-poll-1"));
        String expectedvote = "34 vote(s)...";
        String actualvote = getTextFromElement(By.className("poll-total-votes"));
        System.out.println(actualvote);
        Assert.assertNotSame(actualvote, expectedvote);
    }

    public void getProductTitles()
    {
        driver.get("https://demo.nopcommerce.com/");
        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));
        System.out.println(productTitles.size());
        List<String> expectedProductTitles = Arrays.asList("Build your", "Apple MacBook Pro 13-inch", "HTC One M8 Android L 5.0 Lollipop", "$25 Virtual Gift Card");
        List<String> actualProductTitles = new ArrayList<String>();
        for (WebElement e : productTitles)
        {
            actualProductTitles.add(e.getText());

        }

        Assert.assertEquals(actualProductTitles, expectedProductTitles, "Procuts are not in oreder as expected");


    }
    public void verifyUserShouldbeAbleToClickOnFacebookPage()
    {
        clickOnElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public void verifyUserShouldbeAbletoEnterProductInSearchbox(){
        typeElement(By.id("small-searchterms"),"Nike");
        clickOnElement(By.className("button-1 search-button"));

    }
}

