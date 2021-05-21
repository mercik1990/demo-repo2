package com.virginpulse.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

}
