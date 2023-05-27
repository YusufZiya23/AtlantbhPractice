package com.atlantbh.step_definitions;

import com.atlantbh.pages.PurchasePage;
import com.atlantbh.pages.RemoveFromCartPage;
import com.atlantbh.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RemoveFromCartStepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    // The reason I created a purchase page object is the purchasing process for the first product is the same.
    PurchasePage purchasePage = new PurchasePage();
    RemoveFromCartPage removeFromCartPage = new RemoveFromCartPage();


    @When("user adds a product to cart")
    public void user_adds_a_product_to_cart() {
        // In this step, user scrolls down until the desired product is visible in the home page
        actions.moveToElement(purchasePage.product).perform();

        // In this step, user clicks to desired product and waits until it's displayed just in case for a bad internet connection
        wait.until(ExpectedConditions.visibilityOf(purchasePage.product));
        purchasePage.product.click();
        wait.until(ExpectedConditions.visibilityOf(purchasePage.productHeader));

        // User sees the header of a product
        assertTrue(purchasePage.productHeader.isDisplayed());

        // User scrolls down to see add to cart button
        actions.moveToElement(purchasePage.addToCartButton).perform();
        assertTrue(purchasePage.addToCartButton.isDisplayed());


        Select select = new Select(purchasePage.colorDropdown);
        select.selectByVisibleText("Pink");

        Select select1 = new Select(purchasePage.sizeDropdown);
        select1.selectByValue("36");

        // User clicks to add to cart button
        purchasePage.addToCartButton.click();

        // User should see "product" has been added to your cart message
        String actualMessage = purchasePage.confirmMessage.getText();
        String expectedMessage = "“pink drop shoulder oversized t shirt”" + " has been added to your cart.";
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @When("user adds another product to cart")
    public void user_adds_another_product_to_cart() {
        removeFromCartPage.logo.click();

        actions.moveToElement(removeFromCartPage.product2).perform();

        wait.until(ExpectedConditions.visibilityOf(removeFromCartPage.product2));
        removeFromCartPage.product2.click();

        actions.moveToElement(removeFromCartPage.addToCartButton).perform();
        assertTrue(removeFromCartPage.addToCartButton.isDisplayed());

        Select select = new Select(removeFromCartPage.colorDropdown);
        select.selectByVisibleText("Black");

        Select select2 = new Select(removeFromCartPage.sizeDropdown);
        select2.selectByVisibleText("32");

        removeFromCartPage.addToCartButton.click();

        String actualMessage = removeFromCartPage.addedToCartMessage.getText();
        String expectedMessage = "“black lux graphic t-shirt” has been added to your cart.";
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Then("user removes any product by clicking x button")
    public void user_removes_any_product_by_clicking_x_button() {
        removeFromCartPage.xButton.click();
    }

    @Then("user confirms removal message {string} is displayed")
    public void userConfirmsRemovalMessageIsDisplayed(String expectedRemovalMessage) {

        String actualRemovalMessage = removeFromCartPage.removedConfirmingMessage.getText();
        assertEquals(expectedRemovalMessage, actualRemovalMessage);

    }

    @When("user removes a product")
    public void userRemovesAProduct() {
        removeFromCartPage.viewCartButton.click();
        actions.moveToElement(removeFromCartPage.xButton2).perform();
        removeFromCartPage.xButton2.click();
    }

    @And("user sees {string} message")
    public void userSeesMessage(String expectedMessage) {

        actions.moveToElement(removeFromCartPage.cartIsEmptyMessage).perform();

        String actualMessage = removeFromCartPage.cartIsEmptyMessage.getText();
        assertEquals(expectedMessage,actualMessage);

    }

    @Then("user sees return to shop button and click it")
    public void userSeesReturnToShopButtonAndClickIt() {
        actions.moveToElement(removeFromCartPage.returnToShopButton).perform();
        removeFromCartPage.returnToShopButton.click();
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedKeyword = "shop";

        assertTrue(currentUrl.contains(expectedKeyword));

    }
}
