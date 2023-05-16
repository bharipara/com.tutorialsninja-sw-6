package com.tutorialsninja.steps;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.MyAccountRegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AccountRegisterSteps {
    @And("^I can Call the method “selectMyAccountOptions” method and pass the parameter Register$")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {

    }

    @Then("^I can Verify the text “Register Account”$")
    public void iCanVerifyTheTextRegisterAccount() {
        String expectedMessage = "Register Account";
        String actualMessage = new MyAccountPage().getRegisterAccountText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
        new MyAccountPage().getRegisterAccountText();
    }

    @Given("^I am on Register page$")
    public void iAmOnRegisterPage() {

    }

    @And("^I Enter First Name$")
    public void iEnterFirstName() {
        new MyAccountRegisterPage().enterFirstName();
    }

    @And("^I Enter Last Name$")
    public void iEnterLastName() {
        new MyAccountRegisterPage().enterLastName();
    }

    @And("^I Enter Email$")
    public void iEnterEmail() {
        new MyAccountRegisterPage().enterEmail();
    }

    @And("^I Enter Telephone$")
    public void iEnterTelephone() {
        new MyAccountRegisterPage().enterTelephone();
    }

    @And("^I Enter Password Confirm$")
    public void iEnterPasswordConfirm() {
        new MyAccountRegisterPage().enterConfirmPassword();
    }

    @And("^I can Select Subscribe Yes radio button$")
    public void iCanSelectSubscribeYesRadioButton() {
        new MyAccountRegisterPage().selectSubscribeYesRadioButton();
    }

    @And("^I can Click on Privacy Policy check box$")
    public void iCanClickOnPrivacyPolicyCheckBox() {
        new MyAccountRegisterPage().clickPrivacyPolicyCheckbox();
    }

    @Then("^I can Verify the message “Your Account Has Been Created!”$")
    public void iCanVerifyTheMessageYourAccountHasBeenCreated() {
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = new MyAccountRegisterPage().getAccountHasBeenCreatedText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
        new MyAccountRegisterPage().getAccountHasBeenCreatedText();
    }
}
