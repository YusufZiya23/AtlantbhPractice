package com.atlantbh.step_definitions;

import com.atlantbh.pages.LoginRegisterPage;
import com.atlantbh.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class LogoutStepDefinitions {

    LoginRegisterPage loginRegisterPage = new LoginRegisterPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("user already logged in to an account with email {string} and password {string}")
    public void userAlreadyLoggedInToAnAccount(String email, String password) {

        loginRegisterPage.dismiss.click();
        loginRegisterPage.myAccountBtn.click();
        loginRegisterPage.loginUsername.sendKeys(email);
        loginRegisterPage.loginPassword.sendKeys(password);
        loginRegisterPage.loginButton.click();

    }


    @And("user sees two log out buttons")
    public void userSeesTwoLogOutButtons() {

        assertTrue(logoutPage.logoutButton1.isDisplayed());
        assertTrue(logoutPage.logoutButton2.isDisplayed());

    }

    @Then("user clicks to any log out button")
    public void userClicksToAnyLogOutButton() {

        logoutPage.logoutButton1.click();

    }
}
