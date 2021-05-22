Feature: Compose and Send Email using Gmail
  Scenario: Compose email
    Given I am logged in to gmail with valid email "test123@gmail.com" and password "test@123"
    And I have a compose button on Home Page
    When I click on compose button
    Then Compose popup should be displayed

#    Scenario: Send Email
#      Given Compose popup is displayed
#      When I enter To email Id
#      And I enter Subject
#      And I enter email body
#      And I click on Send
#      Then Email should be sent successfully and compose popup shoudl be closed
#      Then Email should be received in Inbox