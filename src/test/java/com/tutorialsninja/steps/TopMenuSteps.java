package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am On homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I can Mouse hover on “Desktops” Tab and click$")
    public void iCanMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverAndClickDesktops();
    }

    @And("^I can call selectMenu method and pass the menu = “Show AllDesktops”$")
    public void iCanCallSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("^I can Verify the text ‘Desktops’$")
    public void iCanVerifyTheTextDesktops() {
        String expectedMessage = "Desktops";
        String actualMessage = new HomePage().getDesktopText();
        Assert.assertEquals(expectedMessage, actualMessage, "page not displayed");
        new HomePage().getDesktopText();
    }

    @When("^I can Mouse hover on “Laptops & Notebooks” Tab and click$")
    public void iCanMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverAndClickLaptopsAndNotebooks();
    }

    @And("^I can call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”$")
    public void iCanCallSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("^I can Verify the text ‘Laptops & Notebooks’$")
    public void iCanVerifyTheTextLaptopsNotebooks() {
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = new HomePage().getLaptopsNotebooksText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new HomePage().getLaptopsNotebooksText();
    }

    @When("^I can Mouse hover on “Components” Tab and click$")
    public void iCanMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverAndClickComponents();
    }

    @And("^I can call selectMenu method and pass the menu = “Show AllComponents”$")
    public void iCanCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().selectMenu("Show AllComponents");
    }

    @Then("^I can Verify the text ‘Components’$")
    public void iCanVerifyTheTextComponents() {
        String expectedMessage = "Components";
        String actualMessage = new HomePage().getComponents();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new HomePage().getComponents();
    }
}
