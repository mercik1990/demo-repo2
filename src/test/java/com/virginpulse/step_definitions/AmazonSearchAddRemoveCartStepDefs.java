package com.virginpulse.step_definitions;

import com.virginpulse.utilities.Driver;
import com.virginpulse.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AmazonSearchAddRemoveCartStepDefs extends StepBase{

    private String expectedBookName;

    @Given("I am on the amazon home page {string}")
    public void i_am_on_the_amazon_home_page(String url) {
        Driver.getDriver().get(url);
    }

    @When("I search for the book {string}")
    public void i_search_for_the_book(String string)  {
        pages.homePage().searchBox.sendKeys(string + Keys.ENTER);

    }

    @When("I click on the book from the search")
    public void i_click_on_the_book_from_the_search()  {


        pages.resultsPage().book.click();

    }
    @When("I add the book to the cart")
    public void i_add_the_book_to_the_cart()  {
        expectedBookName = pages.chosenItemPage().bookTitle.getText();
        pages.chosenItemPage().addToCart.click();


    }
    @When("I navigate to the cart")
    public void i_navigate_to_the_cart()  {

        pages.addedToCartPage().Cart.click();
    }
    @Then("I should see the book in the cart")
    public void i_should_see_the_book_in_the_cart() {

        Assert.assertEquals(expectedBookName, pages.cartPage().addedItem.getText() );

        Assert.assertTrue(pages.cartPage().numberOfItemInSubTotal.getText().contains("1"));



    }
    @When("I remove the book from the cart")
    public void i_remove_the_book_from_the_cart() {

        pages.cartPage().delete.click();
    }
    @Then("The book should no longer be present in the cart")
    public void the_book_should_no_longer_be_present_in_the_cart() {
        Assert.assertTrue(pages.cartPage().cartEmptyMessage.isDisplayed());
    }

}
