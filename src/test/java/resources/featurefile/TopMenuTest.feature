Feature: TopMenu
@sanity @regression
  Scenario: verify User Should Navigate To DesktopsPage Successfully
   Given I am On homepage
   When I can Mouse hover on “Desktops” Tab and click
   And I can call selectMenu method and pass the menu = “Show AllDesktops”
   Then I can Verify the text ‘Desktops’

@smoke @regression
 Scenario: verify User Should Navigate To Laptops And NotebooksPage Successfully
   Given I am On homepage
   When I can Mouse hover on “Laptops & Notebooks” Tab and click
   And I can call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
   Then I can Verify the text ‘Laptops & Notebooks’

@regression
   Scenario: verify User Should Navigate To ComponentsPage Successfully
     Given I am On homepage
    When I can Mouse hover on “Components” Tab and click
    And I can call selectMenu method and pass the menu = “Show AllComponents”
    Then I can Verify the text ‘Components’