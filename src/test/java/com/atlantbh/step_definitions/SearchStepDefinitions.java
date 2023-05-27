package com.atlantbh.step_definitions;

import com.atlantbh.pages.SearchPage;
import com.atlantbh.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class SearchStepDefinitions {

    SearchPage searchPage = new SearchPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user should see the search button and click it")
    public void user_should_see_the_search_button_and_click_it() {
        assertTrue(searchPage.searchButton.isDisplayed());
        searchPage.searchButton.click();
    }
    @When("user search for {string}")
    public void user_search_for(String product) {
        searchPage.searchLine.sendKeys(product + Keys.ENTER);
    }
    @When("user confirms searched product is displayed")
    public void user_confirms_searched_product_is_displayed() {
        assertTrue(searchPage.productHeader.isDisplayed());
        assertTrue(searchPage.productDescription.isDisplayed());
        assertTrue(searchPage.colorDropdown.isDisplayed());
        assertTrue(searchPage.sizeDropdown.isDisplayed());
    }
    @Then("user sees related products are displayed")
    public void user_sees_related_products_are_displayed() {
        assertTrue(searchPage.relatedProducts.isDisplayed());
    }
    @When("user sees the {string} message")
    public void user_sees_the_message(String expectedMessage) {
        String actualMessage = searchPage.productNotFoundMessage.getText();
        assertEquals(expectedMessage, actualMessage);
    }


    @Then("user confirms opening time is displayed")
    public void userConfirmsOpeningTimeIsDisplayed() {
        assertTrue(searchPage.openingTime.isDisplayed());
    }

    @And("user sees filter dropdowns")
    public void userSeesFilterDropdowns() {
        assertTrue(searchPage.filterDropdown1.isDisplayed());
        assertTrue(searchPage.filterDropdown2.isDisplayed());
        assertTrue(searchPage.filterDropdown3.isDisplayed());
        assertTrue(searchPage.filterDropdown4.isDisplayed());
    }

    @Then("user confirms shown products have the {string} in their text")
    public void userConfirmsShownProductsHaveTheKeywordInTheirText(String keyword) {

        for (WebElement eachProduct : searchPage.products) {

             String elementText = eachProduct.getText();

             assertTrue("Keyword not found in the product ", elementText.contains(keyword));

        }



    }


}