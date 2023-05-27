package com.atlantbh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterPage extends TestBase{
/*
    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
 */



    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//*[@id=\"reg_username\"]")
    public WebElement registerUserName;

    @FindBy(xpath = "//*[@id=\"reg_email\"]")
    public WebElement registerEmail;

    @FindBy(xpath = "//*[@id=\"reg_password\"]")
    public WebElement registerPassword;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    public WebElement usernameConfirm;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    public WebElement registerButton;

    @FindBy(xpath = "/html/body/p/a")
    public WebElement dismiss;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div[1]/ul/li")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement loginUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div[1]/ul/li")
    public WebElement invalidCredentialsErrorMessage;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div[1]/ul/li")
    public WebElement passwordEmptyMessage;

}