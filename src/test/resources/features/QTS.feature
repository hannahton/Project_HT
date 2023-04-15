Feature: Verify homepage of QTS website

  Scenario:
    Given user at the QTS home page
    When user click to cancel the message dialog
    And user click on the "data centers" module
    Then user will see new page with title"data centers"