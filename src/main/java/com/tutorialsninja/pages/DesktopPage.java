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

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement mouseHoverDesktop;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement clickDesktop;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortZToA;

    @CacheLookup
    @FindBy(id ="input-sort")
    WebElement selectSortAToZ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectProduct;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartClick;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement hpText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingcartText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')])[2]")
    WebElement hpProductText;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement product21Text;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-right'][normalize-space()='£74.73'])[4]")
    WebElement totalcostText;

    @CacheLookup
    @FindBy(xpath = "//small[normalize-space()='Delivery Date:2023-11-30']")
    WebElement deliveryDateText;


    public void selectSortByAToZ() {

        log.info("Select sort By A to Z" + selectSortAToZ.toString());
        selectByVisibleTextFromDropDown(selectSortAToZ, "Name (A - Z)");
    }

    public void mouseHoverAndClickDesktops() {

        log.info("Click on Desktops" + mouseHoverDesktop.toString());
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }

    public void clickOnShowAllDeskTops() {

        log.info("Click on show all Desktops" + clickDesktop.toString());
        clickOnElement(clickDesktop);
    }

    public void selectSortByZToA() {

        log.info("Select sort by Z to A" + selectSortZToA.toString());
        selectByVisibleTextFromDropDown(selectSortZToA, "Name (Z - A)");
    }

    public void selectProduct() {

        log.info("Select Product" + selectProduct.toString());
        clickOnElement(selectProduct);
    }
    public void addToCart() {

        log.info("Add to Cart" + addToCartClick.toString());
        clickOnElement(addToCartClick);
    }

    public String getHPText(){

        log.info("Get HP text" + hpText.toString());
        return getTextFromElement(hpText);
    }
    public String getSuccessMessageText(){

        log.info("Get success message text" + successText.toString());
        return getTextFromElement(successText);
    }

    public String getShoppingcartText(){

        log.info("Get shopping cart text" + shoppingcartText.toString());
        return getTextFromElement(shoppingcartText);
    }

    public String getHPProdcutText(){

        log.info("Get HP Product text" + hpProductText.toString());
        return getTextFromElement(hpProductText);
    }
    public String getProdcut21Text(){

        log.info("Get product 21 text" + product21Text.toString());
        return getTextFromElement(product21Text);
    }
    public String getTotalCostText(){

        log.info("Get Total cost text" + totalcostText.toString());
        return getTextFromElement(totalcostText);
    }
    public String getdeliveryDateText(){

        log.info("Get Delivery date text" + deliveryDateText.toString());
        return getTextFromElement(deliveryDateText);
    }

    public void verifyProductArrangeInDescendingOrder() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList< >();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }

        // log.info("Enter FirstName" + firstName.toString());
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
    }

    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

}
