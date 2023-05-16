package com.tutorialsninja.steps;

import com.tutorialsninja.pages.MyAccountLoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AccountLoginSteps {
    @And("^I can Click on My Account Link\\.$")
    public void iCanClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountTab();
    }

    @And("^I can Call the method “selectMyAccountOptions” method and pass the parameter \"([^\"]*)\"$")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String arg0)  {
        new MyAccountPage().selectMyAccountOptions("selectMyAccountOptions");
    }

    @Then("^I can Verify the text “Returning Customer”$")
    public void iCanVerifyTheTextReturningCustomer() {
        String expectedMessage = "Returning Customer";
        String actualMessage = new MyAccountPage().getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
        new MyAccountPage().getReturningCustomerText();
    }

    @And("^I Enter Email address$")
    public void iEnterEmailAddress() {
        new MyAccountLoginPage().enterEmailAddress();
    }

    @And("^I Enter Password$")
    public void iEnterPassword() {
        new MyAccountLoginPage().enterValidPassword();
    }

    @And("^I can Click on Login button$")
    public void iCanClickOnLoginButton() {
        new MyAccountLoginPage().clickOnLoginButton();
    }

    @Then("^I can Verify text “My Account”$")
    public void iCanVerifyTextMyAccount() {
        String expectedMessage = "My Account";
        String actualMessage = new MyAccountPage().getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
        new MyAccountLoginPage().getMyAccountText();
    }

    @Then("^I can Verify the text “Account Logout”$")
    public void iCanVerifyTheTextAccountLogout() {
        String expectedMessage = "Account Logout";
        String actualMessage = new MyAccountPage().getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Text not displayed");
    }

    @And("^I can Click on Continue button$")
    public void iCanClickOnContinueButton() {
    }
}
