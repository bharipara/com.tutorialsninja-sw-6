Feature: AccountLogin
  As a user should Navigate to LoginPage Successfully
@sanity @regression
  Scenario: verify User Should Navigate To LoginPage Successfully
    When  I am On homepage
    And I can Click on My Account Link.
    And I can Call the method “selectMyAccountOptions” method and pass the parameter "Login"
    Then I can Verify the text “Returning Customer”
@smoke @regression
   Scenario: verify That User Should Login And Logout Successfully
     When I am On homepage
     And I can Click on My Account Link.
     And I can Call the method “selectMyAccountOptions” method and pass the parameter "login"
     And I Enter Email address
     And I Enter Password
     And I can Click on Login button
    Then I can Verify text “My Account”
    And I can Click on My Account Link.
    And I can Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
    Then I can Verify the text “Account Logout”
    And I can Click on Continue button