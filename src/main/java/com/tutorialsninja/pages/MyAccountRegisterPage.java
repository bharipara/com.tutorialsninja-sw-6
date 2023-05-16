package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MyAccountRegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id ="input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    WebElement subscribeRadioButton;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountHasBeenCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinueButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;


    public void enterFirstName(){

       log.info("Enter FirstName" + firstName.toString());
        sendTextToElement(firstName,"Jenny");
    }
    public void enterLastName(){

       log.info("Enter LastName" + lastName.toString());
        sendTextToElement(lastName,"Smith");
    }
    public void enterEmail(){

       log.info("Enter Email" + email.toString());
        sendTextToElement(email,"JennyS123@gmail.com");
    }
    public void enterTelephone(){

       log.info("Enter Telephone" + telephone.toString());
        sendTextToElement(telephone,"07899432156");
    }
    public void enterPassword(){

       log.info("Enter Password" + password.toString());
        sendTextToElement(password, "Abc@123");
    }
    public void enterConfirmPassword(){

       log.info("Enter Confirm Password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "Abc@123");
    }
    public void selectSubscribeYesRadioButton(){

       log.info("Select subscribe yes radio button" + subscribeRadioButton.toString());
        clickOnElement(subscribeRadioButton);
    }
    public void clickPrivacyPolicyCheckbox(){

       log.info("Click on Privacy policy checkout" + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){

       log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
    public String getAccountHasBeenCreatedText(){

       log.info("Get Account has been created text" + accountHasBeenCreatedText.toString());
        return getTextFromElement(accountHasBeenCreatedText);
    }
    public void clickOnContinueButtonAgain(){

       log.info("Click on continue button again" + clickContinueButton.toString());
        clickOnElement(clickContinueButton);
    }
    public void clickOnMyAccountLink(){

       log.info("Click on my account link" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public String getAccountLogoutText(){

       log.info("Get account logout text" + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }


}
