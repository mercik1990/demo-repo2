package com.virginpulse.utilities;


import com.virginpulse.pages.*;

public class Pages {
    private HomePage homePage;
    private ResultsPage resultsPage;
    private ChosenItemPage chosenItemPage;
    private AddedToCartPage addedToCartPage;
    private CartPage cartPage;



    public Pages() {
        this.homePage = new HomePage();
        this.resultsPage = new ResultsPage();
        this.chosenItemPage = new ChosenItemPage();
        this.addedToCartPage = new AddedToCartPage();
        this.cartPage = new CartPage();

    }

    public HomePage homePage() {
        return homePage;
    }

    public ResultsPage resultsPage() {
        return resultsPage;
    }


    public ChosenItemPage chosenItemPage() {
        return chosenItemPage;
    }

    public AddedToCartPage addedToCartPage() {
        return addedToCartPage;
    }

    public CartPage cartPage() {
        return cartPage;
    }


}
