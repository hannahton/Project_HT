
Feature: Verify homepage of QTS website

  Background:
    Given user at the QTS home page


  @wip
  Scenario: User should be able to click on the Data Centers module and see data center page
    When user click to cancel the message dialog
    And user click on the data centers module
    Then user will see new page with title contains "QTS Data Centers"

  @wip
  Scenario:User should be able to see all 11 states in data centers dropdown
    When user hovers over the data centers module
    Then user can see all the following locations of the Data center
      | ARIZONA    |
      | CALIFORNIA |
      | COLORADO   |
      | FLORIDA    |
      | GEORGIA    |
      | ILLINOIS   |
      | KANSAS     |
      | NEW JERSEY |
      | OREGON     |
      | TEXAS      |
      | VIRGINIA   |


