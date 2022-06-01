package org.example;

import org.openqa.selenium.By;

public class SelectDesktop extends Utils{
    public void selectBuildyourowncomputer() {
        //clickk on build your own computer
        clickOnElement(By.xpath("//h2[@class=\"product-title\"]/a[@href='/build-your-own-computer']"));
    }
}
