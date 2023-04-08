Feature: Google search functionality
  User story: user can search

  Scenario:
    Given user at the Google search page
    When user enter "apple" at the search box and enter
    Then user will see "apple - Google Search" is in google title.