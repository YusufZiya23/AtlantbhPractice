package com.atlantbh.step_definitions;

import com.atlantbh.pages.PurchasePage;
import com.atlantbh.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PurchaseStepDefinitions {
    PurchasePage purchasePage = new PurchasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Select select = new Select(purchasePage.colorDropdown);
    Select select1 = new Select(purchasePage.sizeDropdown);



    @When("user should click on to the desired product")
    public void user_should_click_on_to_the_desired_product() {
        // In this step, user scrolls down until the desired product is visible in the home page
        actions.moveToElement(purchasePage.product).perform();

        // In this step, user clicks to desired product and waits until it's displayed just in case for a bad internet connection
        wait.until(ExpectedConditions.visibilityOf(purchasePage.product));
        purchasePage.product.click();
        wait.until(ExpectedConditions.visibilityOf(purchasePage.productHeader));
    }

    @Then("user selects a color, size and quantity")
    public void user_selects_a_color_size_and_quantity() {
        // User sees the header of a product
        assertTrue(purchasePage.productHeader.isDisplayed());

        // User scrolls down to see add to cart button
        actions.moveToElement(purchasePage.addToCartButton).perform();
        assertTrue(purchasePage.addToCartButton.isDisplayed());

        select.selectByVisibleText("Pink");

        select1.selectByValue("36");
    }

    @And("user adds product to cart")
    public void userAddsProductToCart() {
        // User clicks to add to cart button
        purchasePage.addToCartButton.click();

        // User should see "product" has been added to your cart message
        String actualMessage = purchasePage.confirmMessage.getText();
        String expectedMessage = "“pink drop shoulder oversized t shirt” has been added to your cart.";
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @And("user opens the cart")
    public void userOpensTheCart() {
        purchasePage.viewCartButton.click();

        // User verifies cart is displayed
        assertTrue(purchasePage.cartTitle.isDisplayed());
        assertTrue(purchasePage.subtotalPrice.isDisplayed());
        assertTrue(purchasePage.totalPrice.isDisplayed());
        assertTrue(purchasePage.applyCouponButton.isDisplayed());
        assertTrue(purchasePage.proceedToCheckOutButton.isDisplayed());
    }

    @Then("user buys the product by entering necessary information")
    public void userBuysTheProductByEnteringNecessaryInformation() {
        // User clickcs to proceed to check out button
        purchasePage.proceedToCheckOutButton.click();

        // User fills the necessary information
        String firstName = faker.name().firstName();
        purchasePage.firstNameLine.sendKeys(firstName);

        String lastName = faker.name().lastName();
        purchasePage.lastNameLine.sendKeys(lastName);

        purchasePage.countryDropdown1.click();
        String country = "Bosnia and Herzegovina";
        purchasePage.countryDropdown2.sendKeys(country + Keys.ENTER);

        String address = faker.address().streetAddress();
        purchasePage.addressLine.sendKeys(address);

        String postcode = "71000";
        purchasePage.zipcodeLine.sendKeys(postcode);

        String city = "Sarajevo";
        purchasePage.cityLine.sendKeys(city);

        String phoneNumber = faker.phoneNumber().cellPhone();
        purchasePage.phoneLine.sendKeys(phoneNumber);

        String emailAddress = faker.internet().emailAddress();
        purchasePage.emailLine.sendKeys(emailAddress);

        actions.moveToElement(purchasePage.termsCheckbox).perform();
        purchasePage.termsCheckbox.click();
        assertTrue(purchasePage.termsCheckbox.isSelected());

        //actions.moveToElement(homePage.placeOrderButton).perform();
        purchasePage.placeOrderButton.click();

        assertTrue(purchasePage.thankYouMessage.isDisplayed());

    }

    @And("user clicks to add to cart button")
    public void userClicksToAddToCartButton() {
        purchasePage.addToCartButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
    }


    @Then("user confirms pop up appears with a {string} message")
    public void userConfirmsPopUpAppearsWithAMessage(String expectedAlertText) {
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertText = alert.getText();
        assertTrue(alertText.contains(expectedAlertText));
    }
}