package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {


    public void VerifyUserpresentOnRegistration(){

        //verify user is on registration page
        WaitUntilExpectedURL(20,"https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
    public void userEntersRegistrationDetails(){
        //select gender
        driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();

        //enter first name
        // driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Automation");
        typeElement(By.xpath("//input[@name='FirstName']"),"Nipa");

        //enter last name
        //driver.findElement(By.id("LastName")).sendKeys("Patel");
        typeElement(By.id("LastName"),"Patel");

        System.out.println(randomDate());
        //select day of the birthday
        Select birthday=new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")));
        birthday.selectByVisibleText("5");

        //select month of the birthdate
        Select birthmonth=new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")));
        birthmonth.selectByVisibleText("February");

        //select year of the birthdate
        Select birthyear=new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")));
        birthyear.selectByVisibleText("1920");

        //enter Email
        typeElement(By.xpath("//input[@name='Email']"),"nipa1234"+randomDate()+"@gmail.com");
        // driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("nip12@gmail.com");

        //password
        //driver.findElement(By.id("Password")).sendKeys("abc123");
        typeElement(By.id("Password"),"abc123");

        //confirm password
        typeElement(By.id("ConfirmPassword"),"abc123");
        // driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");

        //click on registration button
        clickOnElement(By.id("register-button"));
        //driver.findElement((By.id("register-button"))).click();


    }
}
