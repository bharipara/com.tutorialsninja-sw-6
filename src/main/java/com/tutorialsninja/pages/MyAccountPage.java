package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement MyAccountTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id ='top-links']//li[@class='hidden-xs hidden-sm hidden-md']/ul/li")
    WebElement MyAccountOptions;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement RegisterAccountText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement ReturningCustomerText;
    public void clickOnMyAccountTab(){

       log.info("Click on My Account Tab" + MyAccountTab.toString());
        clickOnElement(MyAccountTab);
    }
    public String getRegisterAccountText(){

       log.info("Get Register Account Text" + RegisterAccountText.toString());
        return getTextFromElement(RegisterAccountText);
    }
    public String getReturningCustomerText(){

       log.info("Get Returning customer text" + ReturningCustomerText.toString());
        return getTextFromElement(ReturningCustomerText);
    }

    /*
     * 1.1 create method with name "selectMyAccountOptions" it has one parameter name
     * "option" of type string
     * 1.2 This method should click on the options whatever name is passed as parameter.
     * (Hint: Handle List of Element and Select options)
     */
    public void selectMyAccountOptions(String option) {
        try {
            List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']//li"));
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(option)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']//li"));
        }
    }
}
