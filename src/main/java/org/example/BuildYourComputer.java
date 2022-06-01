package org.example;

import org.openqa.selenium.By;

public class BuildYourComputer extends Utils {
    public void selectBuildYourOwnComputerSubMenu(){
        //select processsor
        org.openqa.selenium.support.ui.Select processor=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@name='product_attribute_1']")));
        processor.selectByIndex(1);
        //select RAM
        org.openqa.selenium.support.ui.Select ram=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@name=\'product_attribute_2\']")));
        ram.selectByVisibleText("2 GB");
        //select hdd radio button
        clickOnElement(By.xpath("//input[@id=\"product_attribute_3_6\"]"));
        //select OS radio button
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));

        //select software tick all the checkboxes
//
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        clickOnElement(By.xpath("//input[@id=\"product_attribute_5_12\"]"));
        //add item to cart
        clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]"));
        //shopping cart
       // clickOnElement(By.xpath("//a[@href=\"/cart\"]/span[2]"));
        clickOnElement(By.xpath("//a[@href='/cart']"));

    }
}
