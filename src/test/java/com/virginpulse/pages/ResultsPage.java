package com.virginpulse.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends PageBase {



    @FindBy(xpath = "(//span[contains(text(), ' Game ')])[2]")
    public WebElement book;


}
