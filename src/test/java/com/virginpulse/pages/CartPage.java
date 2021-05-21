package com.virginpulse.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

    @FindBy(xpath="//li/span/a/span")
    public WebElement addedItem;

    @FindBy(id="sc-subtotal-label-activecart")
    public WebElement numberOfItemInSubTotal;

    @FindBy(xpath="//input[@data-action='delete']")
    public WebElement delete;

    @FindBy(xpath="//div[@id='sc-active-cart']//h1")
    public WebElement cartEmptyMessage;







}
