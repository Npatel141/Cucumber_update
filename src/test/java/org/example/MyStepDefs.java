package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs  {
    HomePage homePage =new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrtionSuccessPAge registrtionSuccessPAge=new RegistrtionSuccessPAge();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.ClickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.VerifyUserpresentOnRegistration();
        registrationPage.userEntersRegistrationDetails();
    }
    @When("I click on registration Submit button")
    public void i_click_on_registration_submit_button() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I should be able to registered successfully")
    public void i_should_be_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registrtionSuccessPAge.VerifyUserRegistredsuccessully();    }

   //--------------------------------------------------------**********************************--------------------------------------------------------------
   @Given("I am on homepage")
   public void i_am_on_homepage() {
       // Write code here that turns the phrase above into concrete actions
   }
    @When("I click on {string} link from top menu header")
    public void i_click_on_link_from_top_menu_header(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test " + string);
        homePage.clickOnCategorname(string);
    }
    @Then("I should be able to successfully navigae to related {string} category page")
    public void i_should_be_able_to_successfully_navigae_to_related_category_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentUrl(string);
    }
//-----------------------------------------------------************************************************--------------------------------------------------


}
