Feature: Laptops And Notebooks Test

  @sanity @regression
  Scenario: verify Products Price Display High To Low Successfully
  Given I am On homepage
  When I can Mouse hover on Laptops & Notebooks Tab and click
 And I can Click on “Show All Laptops & Notebooks”
  And I can Select Sort By "Price (High > Low)"
  Then I can Verify the Product price will arrange in High to Low order.

    @smoke @regression
    Scenario:verify That User Place Order Successfully
      Given I am On homepage
   When I can Mouse hover on Laptops & Notebooks Tab and click
    And I can Click on “Show All Laptops & Notebooks”
    And I can Select Sort By "Price (High > Low)"
    And I can Select Product “MacBook”
   And I can Click on ‘Add To Cart’ button
   Then I can Verify the message “Success: You have added MacBook to your shopping cart!”
    And I can Click on link “shopping cart” display into success message
   Then I can Verify the text "Shopping Cart"
    Then I can Verify the Product name "MacBook"
    And I can Change Quantity "2"
    And I can Click on “Update”Tab
   Then I can Verify the message “Success: You have modified your shopping cart!”
   Then I can Verify the Total £737.45
   And I can Click on “Checkout” button
   Then I can Verify the text “Checkout”
    Then I can Verify the Text “New Customer”
   And I can Click on “Guest Checkout” radio button
 And I can Click on “Continue” tab
    And I can Fill the mandatory fields
    And I can Click on “Continue” Button
    And I can Add Comments About your order into text area
   And I can Check the Terms & Conditions check box
   And I can Click on “Continue” button
    Then I can Verify the message “Warning: Payment method required