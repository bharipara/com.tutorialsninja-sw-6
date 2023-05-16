package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public LaptopsAndNoteBooksPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement clickOnShowAllLaptopsandNoteBooks;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPrice;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macbookClick;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macbookText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
     WebElement successText ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macbooknameText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement clearQty;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updatetab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement modifiedSuccessText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueLink;

    //1.2 Click on “Show AllLaptops & Notebooks”
    public void clickOnShowAllLaptopAndNoteBooks() {

        log.info("Click on show all laptop and notebooks" + clickOnShowAllLaptopsandNoteBooks.toString());
        clickOnElement(clickOnShowAllLaptopsandNoteBooks);
    }

    // Get all the products price and stored into array list
    public void originalProductPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }

    //1.3 Select Sort By "Price (High > Low)"

    public void sortByPriceHightoLow() {

        log.info("Sort by price High to Low" + sortByPrice.toString());
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    // After filter Price (High > Low) Get all the products price and stored into array list
    public void afterSortByPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
    }
    public void clickOnMacbook() {

        log.info("Click on Macbook" + macbookClick.toString());
        clickOnElement(macbookClick);
    }
    public String getMacbooktext() {

        log.info("Get Macbook text" + macbookText.toString());
        return getTextFromElement(macbookText);
    }
    public void addToCart() {

        log.info("Add to cart" + cartButton.toString());
        clickOnElement(cartButton);
    }
    public String getSuccesstext() {

        log.info("Get success text" + successText.toString());
        return getTextFromElement(successText);
    }
    public void clickShoppingCart(){

        log.info("Click on shopping cart" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText() {

        log.info("Get shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public String getMacbookNameText() {

        log.info("Get Macbook name text" + macbooknameText.toString());
        return getTextFromElement(macbooknameText);
    }
    public void clearQty(){

        log.info("Clear Qty" + clearQty.toString());
        driver.findElement((By)clearQty).clear();
    }
    public void changeQty(){

        log.info("Change Qty" + changeQty.toString());
        sendTextToElement(changeQty,"2");
    }
    public void clickUpdateTab(){

        log.info("Click on Update Tab" + updatetab.toString());
        clickOnElement(updatetab);
    }
    public String getModifiedSuccessText(){

        log.info("Get Modified success text" + modifiedSuccessText.toString());
        return getTextFromElement(modifiedSuccessText);
    }
    public String getTotaltext(){

        log.info("Get Total text" + totalText.toString());
        return getTextFromElement(totalText);
    }
    public void clickCheckout(){

        log.info("Click on checkout" + checkoutLink.toString());
        clickOnElement(checkoutLink);
    }
    public String getCheckoutText(){

        log.info("Get checkout text" + checkoutText.toString());
        return getTextFromElement(checkoutText);
    }
    public String getNewCustomerText(){

        log.info("Get new customer text" + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutButton(){

        log.info("Click on Guest checkout button" + guestCheckoutButton.toString());
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueButton(){

        log.info("Click on continue button" + continueLink.toString());
        clickOnElement(continueLink);
    }
}
