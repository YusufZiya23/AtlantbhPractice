package com.atlantbh.pages;

import com.atlantbh.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    public TestBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
