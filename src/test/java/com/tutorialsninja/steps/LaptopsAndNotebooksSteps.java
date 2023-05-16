package com.tutorialsninja.steps;

import com.tutorialsninja.pages.CheckoutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopsAndNotebooksSteps {
    @When("^I can Mouse hover on Laptops & Notebooks Tab and click$")
    public void iCanMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverAndClickLaptopsAndNotebooks();
    }

    @And("^I can Click on “Show All Laptops & Notebooks”$")
    public void iCanClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNoteBooksPage().clickOnShowAllLaptopAndNoteBooks();
    }

    @And("^I can Select Sort By \"([^\"]*)\"$")
    public void iCanSelectSortBy(String arg0)  {
        new LaptopsAndNoteBooksPage().sortByPriceHightoLow();
    }

    @Then("^I can Verify the Product price will arrange in High to Low order\\.$")
    public void iCanVerifyTheProductPriceWillArrangeInHighToLowOrder() {
//        String expectedMessage = "Welcome, Please Sign In!";
//        String actualMessage = new DesktopPage().verifyProductArrangeInDescendingOrder();
//         Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @And("^I can Select Product “MacBook”$")
    public void iCanSelectProductMacBook() {
        new LaptopsAndNoteBooksPage().clickOnMacbook();

    }

    @And("^I can Click on ‘Add To Cart’ button$")
    public void iCanClickOnAddToCartButton() {
        new LaptopsAndNoteBooksPage().addToCart();
    }

    @Then("^I can Verify the message “Success: You have added MacBook to your shopping cart!”$")
    public void iCanVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        new LaptopsAndNoteBooksPage().getSuccesstext();
    }

    @And("^I can Change Quantity \"([^\"]*)\"$")
    public void iCanChangeQuantity(String arg0)  {
        new LaptopsAndNoteBooksPage().changeQty();
    }

    @And("^I can Click on “Update”Tab$")
    public void iCanClickOnUpdateTab() {
        new LaptopsAndNoteBooksPage().clickUpdateTab();
    }

    @Then("^I can Verify the message “Success: You have modified your shopping cart!”$")
    public void iCanVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        new LaptopsAndNoteBooksPage().getSuccesstext();
    }

    @Then("^I can Verify the Total £(\\d+)\\.(\\d+)$")
    public void iCanVerifyTheTotal£(int arg0, int arg1) {
       new LaptopsAndNoteBooksPage().getTotaltext();
    }

    @And("^I can Click on “Checkout” button$")
    public void iCanClickOnCheckoutButton() {
        new LaptopsAndNoteBooksPage().clickCheckout();

    }

    @Then("^I can Verify the text “Checkout”$")
    public void iCanVerifyTheTextCheckout() {
        new LaptopsAndNoteBooksPage().getCheckoutText();
    }

    @Then("^I can Verify the Text “New Customer”$")
    public void iCanVerifyTheTextNewCustomer() {
        new LaptopsAndNoteBooksPage().getNewCustomerText();
    }

    @And("^I can Click on “Guest Checkout” radio button$")
    public void iCanClickOnGuestCheckoutRadioButton() {
        new LaptopsAndNoteBooksPage().clickOnGuestCheckoutButton();
    }

    @And("^I can Click on “Continue” tab$")
    public void iCanClickOnContinueTab() {
        new LaptopsAndNoteBooksPage().clickOnContinueButton();
    }

    @And("^I can Fill the mandatory fields$")
    public void iCanFillTheMandatoryFields() {
       new CheckoutPage().enterFirstname();
        new CheckoutPage().enterLastName();
        new CheckoutPage().enterEmail();
        new CheckoutPage().enterTelephone();
        new CheckoutPage().enterAddress();
       new CheckoutPage().enterCity();
        new CheckoutPage().enterPostcode();
        new CheckoutPage().enterCountry();
        new CheckoutPage().enterState();
    }

//    @And("^I can Click on “Continue” Button$")
//    public void iCanClickOnContinueButton() {
//    }

    @And("^I can Add Comments About your order into text area$")
    public void iCanAddCommentsAboutYourOrderIntoTextArea() {
     new CheckoutPage().enterCommentInTextAea();
    }

    @And("^I can Check the Terms & Conditions check box$")
    public void iCanCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().checkTermsAndCondtionCheckBox();
    }

    @And("^I can Click on “Continue” button$")
    public void iCanClickOnContinueButton() {
        new CheckoutPage().clickContinueButtonpayment();
    }

    @Then("^I can Verify the message “Warning: Payment method required$")
    public void iCanVerifyTheMessageWarningPaymentMethodRequired() {
        new CheckoutPage().GetWarningMessageText();
    }
}
