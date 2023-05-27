package com.atlantbh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveFromCartPage extends TestBase{

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")
    public WebElement logo;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/h3")
    public WebElement product2;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    public WebElement colorDropdown;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    public WebElement sizeDropdown;

    @FindBy(xpath = "//*[@id=\"product-1485\"]/div[1]/div[2]/form/div/div[2]/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[2]/td[6]/a")
    public WebElement xButton;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div")
    public WebElement addedToCartMessage;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[1]")
    public WebElement removedConfirmingMessage;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[1]/td[6]/a")
    public WebElement xButton2;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/p[1]")
    public WebElement cartIsEmptyMessage;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/p[2]/a")
    public WebElement returnToShopButton;

}