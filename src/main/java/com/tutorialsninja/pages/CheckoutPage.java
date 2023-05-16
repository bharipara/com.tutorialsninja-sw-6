package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName ;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonguest;
  ;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsandCondition;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonpayment;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Warning: Payment method required!']")
    WebElement warningMessageText;

    @CacheLookup
    @FindBy(tagName = "textarea")
    WebElement textArea;


    public void enterFirstname(){
            log.info("Enter FirstName" + firstName.toString());
            sendTextToElement(firstName,"Jenny");
        }

    public void enterLastName(){

        log.info("Enter LastName" + lastname.toString());
        sendTextToElement(lastname,"Smith");
    }
    public void enterEmail(){

        log.info("Enter Email" + email.toString());
        sendTextToElement(email,"Jane123S@gmail.com");
    }
    public void enterTelephone(){

        log.info("Enter Telephone" + telephone.toString());
        sendTextToElement(telephone,"07568349672");
    }
    public void enterAddress() {

        log.info("Enter Address" + address.toString());
        sendTextToElement(address, "Hollin Street");
    }
    public void enterCity(){

        log.info("Enter City" + city.toString());
        sendTextToElement(city,"London");
    }
    public void enterPostcode(){

        log.info("Enter Postcode" + postcode.toString());
        sendTextToElement(postcode,"A12 3BC");
    }
    public void enterCountry(){

        log.info("Enter Country" + country.toString());
        sendTextToElement(country,"United Kingdom");
    }
    public void enterState(){

        log.info("Enter State" + state.toString());
        sendTextToElement(state,"Surrey");
    }
    public void clickContinueButtonguest(){

        log.info("Click on continue guest button" + continueButtonguest.toString());
        clickOnElement(continueButtonguest);
    }
    public void enterCommentInTextAea(){

        log.info("Enter comment in text area" + textArea.toString());
        sendTextToElement(textArea,"Thank You");
    }

    public void checkTermsAndCondtionCheckBox(){

        log.info("Check terms and condition checkbox" + termsandCondition.toString());
        clickOnElement(termsandCondition);
    }

    public void clickContinueButtonpayment(){

        log.info("Click on continue payment button" + continueButtonpayment.toString());
        clickOnElement(continueButtonpayment);
    }

    public String GetWarningMessageText(){

        log.info("Get warning message text" + warningMessageText.toString());
        return getTextFromElement(warningMessageText);
    }
}
