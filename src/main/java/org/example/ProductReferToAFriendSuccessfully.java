package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductReferToAFriendSuccessfully extends Utils {
    public void usersuccessfullyRefferProductToFriend() {
//Expected result
        String expectedEmailAFfriendResult1 = "Build your own computer";
        //Get actual result
        String actualEmailAFriendResult1 = getTextFromElement(By.className("product"));

        System.out.println("actual result is:" + actualEmailAFriendResult1);
        //compare actual and expected result
        Assert.assertEquals(actualEmailAFriendResult1, expectedEmailAFfriendResult1);


    }
}
