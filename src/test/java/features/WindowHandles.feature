Feature: Window handles feature
  I am a user
  I want to access the window handle page
  To verify that it works

  Scenario: Window handles
    When I select the "Multiple Windows" link and click it
    Then the Click Here link is displayed
    When I click the Click here link
    Then The header of the opened tab is New Window
    When I go back to the main page using the browser navigation
    Then the main page is displayed
