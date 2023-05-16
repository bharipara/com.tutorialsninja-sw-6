package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClick;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTabClick;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundSterlingClick;

    //2.10 Click on link “shopping cart” display into success message
    public void shoppingCartClick() {

      log.info("Click on shopping cart" + shoppingCartClick.toString());
        clickOnElement(shoppingCartClick);
    }

    //currency tab click
    public void clickOnCurrencyTab() {

      log.info("Click on currency tab" + currencyTabClick.toString());
        clickOnElement(currencyTabClick);
    }

    public void clickOnPoundSterling() {

      log.info("Click on pound sterling" + poundSterlingClick.toString());
        clickOnElement(poundSterlingClick);
    }


}
