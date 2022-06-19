Feature: category

  @smoke
  Scenario Outline: User should be able to successfully navigate to the desire category page from top header menu
    Given  I am on homepage
    When I click on "<categoty_name>" link from top menu header
    Then I should be able to successfully navigae to related "<category_url>" category page
    Examples:
      | categoty_name     | category_url                                   |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |

