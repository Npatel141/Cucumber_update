package org.example;

import org.testng.Assert;

public class SelectedProductList extends Utils {
    public void listOfSelectedProducts(){
        String actualProductURL= driver.getCurrentUrl();
        System.out.println(actualProductURL);
        Assert.assertTrue(actualProductURL.contains("Nike"), "You have nike products ");
//        List<WebElement> productTitles = driver.findElements(By.className("item-grid"));
//        System.out.println(productTitles.size());
//        System.out.println(productTitles);
    }
}
