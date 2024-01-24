package com.test.stepdefinitions;

public class Login_stepdefinitions {


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for {word}")
    public void user_searches_for_apple(String word) {

        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);

    }

    @Then("user should see {word} in the title")
    public void user_should_see_apple_in_the_title(String word) {

        BrowserUtils.verifyTitle(word+" - Google Search");
}
