Feature: Compose and Send Email

Background:
    Given User is on gmail login page
    When User enters email address "TestUser.Sel123@gmail.com" and press Enter
    And User enter password "TestUserSel@123" and press Enter
    Then User is navigated to Inbox page

  Scenario: Compose button opens up a popup
    Given Compose button is visible
    When User clicks on Compose button
    Then Compose popup is displayed
    When User enter To email ID as "TestUser.Sel123@gmail.com"
    And User enters Subject as "Incubyte"
    And User enters email body as "Automation QA test for Incubyte"
    And User clicks on Send
    Then Email is Send successfully