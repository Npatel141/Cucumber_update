package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class RegistrtionSuccessPAge {
    public void VerifyUserRegistredsuccessully(){
        String expectedResult="Your registration completed";
        String actualResult=getTextFromElement(By.className("result"));
        System.out.println("actual result is:"+actualResult);
       Assert.assertEquals(actualResult,expectedResult);

    }
}
