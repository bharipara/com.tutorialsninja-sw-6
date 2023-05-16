package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MyAccountLoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id= "input-email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText;



    public void enterEmailAddress(){

        log.info("Enter Email address" + emailAddress.toString());
        sendTextToElement(emailAddress,"JennyS123@gmail.com");

    }
    public void enterValidPassword(){

        log.info("Enter Valid Password" + enterPassword.toString());
        sendTextToElement(enterPassword,"Abc@123");
    }
    public void clickOnLoginButton(){

        log.info("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){

        log.info("Get my account text" + myAccountText.toString());
        return getTextFromElement(myAccountText);
    }
}
