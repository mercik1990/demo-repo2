package com.virginpulse.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChosenItemPage extends PageBase {

    @FindBy(xpath="//input[contains(@id, 'add-to-cart-button')]")
    public WebElement addToCart;

    @FindBy(id="productTitle")
    public WebElement bookTitle;


}
