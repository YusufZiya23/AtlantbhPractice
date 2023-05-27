package com.atlantbh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends TestBase{

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/a")
    public WebElement logoutButton1;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/nav/ul/li[6]/a")
    public WebElement logoutButton2;

}