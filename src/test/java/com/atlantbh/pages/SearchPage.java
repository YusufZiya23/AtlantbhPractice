package com.atlantbh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends TestBase{

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    public WebElement searchLine;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
    public WebElement productHeader;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/div[1]")
    public WebElement productDescription;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    public WebElement colorDropdown;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    public WebElement sizeDropdown;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[3]/h2")
    public WebElement relatedProducts;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/p")
    public WebElement productNotFoundMessage;

    @FindBy(xpath = "/html/body/p/a")
    public WebElement dismiss;

    @FindBy(xpath = "//*[@id=\"text-1\"]")
    public WebElement openingTime;

    @FindAll(@FindBy(tagName = "h3"))
    public List<WebElement> products;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[1]/div/div[2]/form[1]/select")
    public WebElement filterDropdown1;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[1]/div/div[2]/form[2]/select")
    public WebElement filterDropdown2;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[1]/div/div[2]/form[3]/select")
    public WebElement filterDropdown3;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[1]/div/form/select")
    public WebElement filterDropdown4;

}
