package com.virginpulse.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedToCartPage extends PageBase {



    @FindBy(xpath="//div[@id='nav-cart-count-container']")
    public WebElement Cart;
}
