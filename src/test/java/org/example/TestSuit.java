package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrtionSuccessPAge registrtionSuccessPAge=new RegistrtionSuccessPAge();
    SelectDesktop selectDesktop=new SelectDesktop();
    AddDesktopToCart addDesktopToCart=new AddDesktopToCart();
    BuildYYourOwnComputerAddedSuccessfully buildYYourOwnComputerAddedSuccessfully=new BuildYYourOwnComputerAddedSuccessfully();
    BuildYourComputer buildYourComputer=new BuildYourComputer();
    EmailAFriend emailAFriend=new EmailAFriend();
    ProductReferToAFriendSuccessfully productReferToAFriendSuccessfully=new ProductReferToAFriendSuccessfully();
   SelectedProductAccordingtoCurrency selectedProductAccordingtoCurrency=new SelectedProductAccordingtoCurrency();
   NopCommerceFacebookPAage nopCommerceFacebookPAage=new NopCommerceFacebookPAage();
   SelectedProductList selectedProductList=new SelectedProductList();

   @Test
    public void verifyUserShouldAbleToRegisterSuccessufully(){
//click in register button
        homePage.ClickOnRegisterButton();
 //verify user is on registration page
        registrationPage.VerifyUserpresentOnRegistration();
 //enter registration details
        registrationPage.userEntersRegistrationDetails();
 //verify user registered successfully
registrtionSuccessPAge.VerifyUserRegistredsuccessully();
    }
    @Test
    public void VerifyUserShouldBeAbleToAddDesktopInShoppingCart(){
//        1.Mouseover Computers
        homePage.selectDesktopFromComputer();
        //3.Click on Build your own computer
        selectDesktop.selectBuildyourowncomputer();
        //        4.Click on dropdown to
//        select processor
//        5.Click on drop down to select RAM
//        6.Select HDD
//        7. Select OS
//        8.Click on all checkbox to select all checkboxes
//        9. Click on ADD TO CARt button
//        10.Click on Shopping cart(1)
        buildYourComputer.selectBuildYourOwnComputerSubMenu();
//        11. Verify Build your own computer in Shopping cart"
        buildYYourOwnComputerAddedSuccessfully.verifyBuildyourowncomputeraddedsuccessfyllyInShoppingCart();

    }
@Test
    public void verifyUserShouldAbleToReferProductToFriend(){
   // click in register button
    homePage.ClickOnRegisterButton();
    //verify user is on registration page
    registrationPage.VerifyUserpresentOnRegistration();
    //enter registration details
    registrationPage.userEntersRegistrationDetails();
    //verify user registered successfully
    registrtionSuccessPAge.VerifyUserRegistredsuccessully();
    //click on continue
    clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
    // select the product
   homePage.selectDesktopFromComputer();
    //click on build your computer
    selectDesktop.selectBuildyourowncomputer();
    //click on email a friend
    emailAFriend.clickOnEmailAFriendButton();
    //enter your friend email address
    typeElement(By.xpath("//input[@class=\"friend-email\"]"),"abc123@gmail.com");
    //enter your message
    typeElement(By.id("PersonalMessage"),"This is a very nice product");
    // send email to friend
    clickOnElement(By.name("send-email"));
    productReferToAFriendSuccessfully.usersuccessfullyRefferProductToFriend();
}
@Test
public void verifyUserSuccessfullyBuyProductInUSD()
{
//    1. Hoover mouse on currency 1.Select US Dollar
//    2.Select currency
//    3. Mouseover Computer
//    4.Select Desktop
//    5. Click on Build your own
//        computer

        homePage.selectCurrencyUSD();
        //verifying the price of build our own computer is in UsD
        selectedProductAccordingtoCurrency.selectedProductInUSD();
}
@Test
public void verifyUserSuccessfullyBuyProductInEuro() {
//    7.Hoover mouse on currency
//    8.Select US Dollar
//    9.Select currency
//    10. Mouseover Computer
//    11.Select Desktop
//    12. Click on Build your own computer
    homePage.selectCurrencyEuro();
    selectedProductAccordingtoCurrency.selectedProductInEuro();
}
@Test
public void VerifyUserCanVote(){
    //1.Click Good
    //2.Click Vote
        homePage.communityyPoll();
        //click on registe button
        homePage.ClickOnRegisterButton();
        //Enter details to register user
        registrationPage.userEntersRegistrationDetails();
        //veryify user is successfully registered
        registrtionSuccessPAge.VerifyUserRegistredsuccessully();
        //click on continue
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
        //1.Click Good
        //2.Click Vote
        //Verify message
        homePage.communityPollVoteSuccessfully();
}

@Test
public void getProductTitles(){
        homePage.getProductTitles();
}
@Test
public void userShouldBeAbleToClickOnFacebook(){
       //To Verify user should be able to click on facebook page
        homePage.verifyUserShouldbeAbleToClickOnFacebookPage();

        nopCommerceFacebookPAage.handleMultiWindow();
}
@Test
public void userShouldBeAbleToSeeListOfSearchProduct(){
       homePage.verifyUserShouldbeAbletoEnterProductInSearchbox();
        selectedProductList.listOfSelectedProducts();

    }


}