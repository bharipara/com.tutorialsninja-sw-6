Feature: Desktop Test
  As a user veriy product arrange in alphabetical order

  @sanity @regression
  Scenario: verify Product Arrange In AlphaBeticalOrder
    Given I am On homepage
    And I can Mouse hover on Desktops Tab and click
    And I can Click on “Show All Desktops”
    And I can Select Sort By position "Name: Z to A"
    Then I can Verify the Product will arrange in Descending order.

    @smoke @regression
    Scenario:  verify Product Added To ShoppingCart SuccessFully
      Given I am On homepage
   When I can Mouse hover on Desktops Tab and click
   And I can Click on “Show All Desktops”
  And I can Select Sort By position "Name: A to Z"
   And I can Select product “HP LP3065”
   And I can Select Delivery Date "2023-11-30"
   And I Enter Qty "1” using Select class.
   And I can Click on “Add to Cart” button
   Then I can Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
   And I can Click on link “shopping cart” display into success message
   Then I can Verify the text "Shopping Cart"
  Then I can Verify the Product name "HP LP3065"
   Then I can Verify the Delivery Date "2023-11-30"
   Then I can Verify the Model "Product21"
   Then I can Verify the Todal "£74.73"