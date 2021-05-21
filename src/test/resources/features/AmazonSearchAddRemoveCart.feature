@UI
Feature: Amazon Search, Add to Cart, Remove from Cart Features

  @amazon
  Scenario: Test user is able to search an item and add/remove that item to/from cart
    Given I am on the amazon home page 'https://www.amazon.com'
    When I search for the book "Ender's Game by Orson Scott Card"
    And I click on the book from the search
    And I add the book to the cart
    And I navigate to the cart
    Then I should see the book in the cart
    When I remove the book from the cart
    Then The book should no longer be present in the cart