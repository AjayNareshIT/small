
Feature: Validate screenshot feature
I want to Validate reports feature


  Scenario Outline: To Validate that user is able to login with multiple login details testng
   Given user is on login page1
   When user enters valid username12"<username>"
   And user enters valid password12"<password>"
   And clicks on submit12


 Examples: 
      | username  | password |
      | Testing@gmail.com |P234222 |
      | Selenium@gmail.com |P3vvvd34 |
   