package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {
    public void clickOnEmailAFriendButton(){
        //click Email a friend
        clickOnElement(By.xpath("//div[@class=\"email-a-friend\"]//button[@class='button-2 email-a-friend-button']"));



    }
}
