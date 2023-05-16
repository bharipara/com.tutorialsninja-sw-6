package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopSteps {
    @And("^I can Mouse hover on Desktops Tab and click$")
    public void iCanMouseHoverOnDesktopsTabAndClick() {
        new DesktopPage().mouseHoverAndClickDesktops();
    }

    @And("^I can Click on “Show All Desktops”$")
    public void iCanClickOnShowAllDesktops() {
        new DesktopPage().clickOnShowAllDeskTops();
    }

    @And("^I can Select Sort By position \"([^\"]*)\"$")
    public void iCanSelectSortByPosition(String arg0)  {
        new DesktopPage().selectSortByAToZ();

    }

    @Then("^I can Verify the Product will arrange in Descending order\\.$")
    public void iCanVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().verifyProductArrangeInDescendingOrder();
    }

    @And("^I can Select product “HP LP(\\d+)”$")
    public void iCanSelectProductHPLP(int arg0) {
     new DesktopPage().selectProduct();
    }

//    @Then("^I can Verify the Text \"([^\"]*)\"$")
//    public void iCanVerifyTheText(String arg0)  {

   // }

    @And("^I can Select Delivery Date \"([^\"]*)\"$")
    public void iCanSelectDeliveryDate(String arg0)  {
     new DesktopPage().selectDeliveryDate();

    }

    @And("^I Enter Qty \"(\\d+)” using Select class\\.$")
    public void iEnterQtyUsingSelectClass(int arg0)  {

    }

    @And("^I can Click on “Add to Cart” button$")
    public void iCanClickOnAddToCartButton() {
    }

    @Then("^I can Verify the Message “Success: You have added HP LP(\\d+) to your shopping cart!”$")
    public void iCanVerifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart(int arg0) {
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
         String actualMessage = new DesktopPage().getHPText();
         Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
         new DesktopPage().getSuccessMessageText();
    }

    @And("^I can Click on link “shopping cart” display into success message$")
    public void iCanClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
       new ShoppingCartPage().shoppingCartClick();
    }

    @Then("^I can Verify the text \"([^\"]*)\"$")
    public void iCanVerifyTheText(String arg0)  {
        new DesktopPage().getShoppingcartText();
    }

    @Then("^I can Verify the Product name \"([^\"]*)\"$")
    public void iCanVerifyTheProductName(String arg0)  {
        new DesktopPage().getHPProdcutText();

    }

    @Then("^I can Verify the Delivery Date \"([^\"]*)\"$")
    public void iCanVerifyTheDeliveryDate(String arg0)  {
        new DesktopPage().selectDeliveryDate();

    }

    @Then("^I can Verify the Model \"([^\"]*)\"$")
    public void iCanVerifyTheModel(String arg0)  {
        new DesktopPage().getProdcut21Text();

    }

    @Then("^I can Verify the Todal \"([^\"]*)\"$")
    public void iCanVerifyTheTodal(String arg0)  {
        new DesktopPage().getTotalCostText();

    }

//    @Then("^I can Verify the Text \"([^\"]*)\"$")
//    public void iCanVerifyTheText(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
   // }
}
