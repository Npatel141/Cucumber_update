@test
  Feature: Registration
    Scenario: As a user, I should be able to register successfully so that, I cn use all the features on demonopcommerce website

      Given I am on registration page
      When  I enter required registration details
      And I click on registration Submit button
      Then I should be able to registered successfully
