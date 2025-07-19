Feature: Checkbox selected
  I am a user
  I want to check the checkbox is selected
  To verify that it works

  Scenario: Checkbox 1 is selected
    When I select the "Checkboxes" link and click it
    Then Checkboxes page is open
    When I select Checkbox 1
    Then Checkbox 1 is selected
    When I refresh the page
    Then Checkbox 1 is not selected
