Feature: AccountRegister

@snaity @regression
  Scenario: verify User Should Navigate To RegisterPage Successfully
    Given I am On homepage
    When I can Click on My Account Link.
    And I can Call the method “selectMyAccountOptions” method and pass the parameter Register
    Then I can Verify the text “Register Account”
@smoke @regression
    Scenario:  verify That User RegisterAccount Successfully
      Given I am on Register page
      When I can Click on My Account Link.
      And I can Call the method “selectMyAccountOptions” method and pass the parameter Register
      And I Enter First Name
      And I Enter Last Name
      And I Enter Email
      And I Enter Telephone
      And I Enter Password
      And I Enter Password Confirm
      And I can Select Subscribe Yes radio button
      And I can Click on Privacy Policy check box
      And I can Click on Continue button
      Then I can Verify the message “Your Account Has Been Created!”
      And I can Click on Continue button
      And I can Click on My Account Link.
      And I can Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
      Then I can Verify the text “Account Logout”
      And I can Click on Continue button