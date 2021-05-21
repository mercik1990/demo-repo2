package com.virginpulse.pages;

import com.virginpulse.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
