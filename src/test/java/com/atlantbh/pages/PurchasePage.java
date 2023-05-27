package com.atlantbh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage extends TestBase{

    // initialize the driver instance and this class' instance using PageFactory.initElements

    // Search button locator
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a")
    public WebElement searchButton;

    // Cart button locator
    @FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/span[2]")
    public WebElement cartButton;

    // Secure payment text locator
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/h3")
    public WebElement securePaymentText;

    // User scrolls down until this text & element is displayed on the page. User does that for seeing the desired product
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[1]/h3/span")
    public WebElement forLadiesText;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3")
    public WebElement product;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
    public WebElement productHeader;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/table/tbody/tr[1]/th")
    public WebElement colorText;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/table/tbody/tr[2]/th")
    public WebElement sizeText;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    public WebElement colorDropdown;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    public WebElement sizeDropdown;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div")
    public WebElement confirmMessage;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
    public WebElement cartTitle;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/table/tbody/tr[1]/td")
    public WebElement subtotalPrice;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/table/tbody/tr[2]/td/strong/span/bdi")
    public WebElement totalPrice;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[1]/button")
    public WebElement applyCouponButton;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@id=\"billing_first_name\"]")
    public WebElement firstNameLine;

    @FindBy(xpath = "//*[@id=\"billing_last_name\"]")
    public WebElement lastNameLine;

    @FindBy(xpath = "//*[@id=\"billing_country_field\"]/span/span/span[1]")
    public WebElement countryDropdown1;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    public WebElement countryDropdown2;

    @FindBy(xpath = "//*[@id=\"billing_address_1\"]")
    public WebElement addressLine;

    @FindBy(xpath = "//*[@id=\"billing_postcode\"]")
    public WebElement zipcodeLine;

    @FindBy(xpath = "//*[@id=\"billing_city\"]")
    public WebElement cityLine;

    @FindBy(xpath = "//*[@id=\"billing_phone\"]")
    public WebElement phoneLine;

    @FindBy(xpath = "//*[@id=\"billing_email\"]")
    public WebElement emailLine;

    @FindBy(xpath = "//*[@id=\"terms\"]")
    public WebElement termsCheckbox;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]")
    public WebElement thankYouMessage;

}