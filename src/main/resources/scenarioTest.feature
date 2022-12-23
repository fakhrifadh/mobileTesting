@User
Feature: User can buy Sauce Lab Back Packs.
  @DoTest
  Scenario: User try to buy product without login
    Given Sauce Lab Back Packs is in the Products screen
    When User click Sauce Lab Back Packs product
    And User click add quantity item to 2
    And User click select the blue color
    And User click add to cart button
    And User click cart
    And User click Proceed to checkout button
    Then User is on login page
