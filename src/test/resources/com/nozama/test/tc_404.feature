# language: en
Feature: Gerer les commandes client SA Gherkin
  Scenario: the storekeeper deletes an order
    Given the user is authentified as a storekeeper
    When the user clicks on "orders list"
    And clicks on "delete an order"
    Then the system asks for confirmation
    And deletes the selected order with a confirmation message
    