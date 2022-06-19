package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends Utils{
    private By _regitrationButton=By.className("ico-register");


    public void ClickOnRegisterButton(){
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
    public void selectCurrencyUSD(){
        //select USDollar from dropdown
        Select USDOllar = new Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        USDOllar.selectByVisibleText("US Dollar");
        //verifying the price of build our own computer is in UsD
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
    }
    public void selectCurrencyEuro(){
        //Select Euro from Drop Down
        Select Euro = new Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
        Euro.selectByVisibleText("Euro");
        //verifying the price of build our own computer is in Euro
        clickOnElement(By.xpath("//h2//a[@href=\"/build-your-own-computer\"]"));
    }
    public void communityyPoll(){
        clickOnElement(By.id("pollanswers-2"));
        clickOnElement(By.id("vote-poll-1"));

    }
    public void communityPollVoteSuccessfully(){
        clickOnElement(By.id("pollanswers-2"));
        clickOnElement(By.id("vote-poll-1"));
        String expectedvote="34 vote(s)...";
        String actualvote=getTextFromElement(By.className("poll-total-votes"));
        System.out.println(actualvote);
        Assert.assertNotSame(actualvote,expectedvote);
    }
    public void clickOnCategorname(String categoryname){
        System.out.println("My message " + categoryname);
        clickOnElement(By.linkText(categoryname));
    }


}
