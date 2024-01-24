package com.test.stepdefinitions;

public class Login_stepdefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {

        Driver.getDriver().get("https://www.bing.com");

    }
    @When("user enters orange in the Bing search box")
    public void user_enters_orange_in_the_bing_search_box() {
        bingSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
    }


    @When("user enters {string} in the Bing search box")
    public void userEntersInTheBingSearchBox(String searchKey) {

        bingSearchPage.searchBox.sendKeys(searchKey + Keys.ENTER);

    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);
        //BrowserUtils.verifyTitleContains(expectedTitle);

    }

    @Then("user should see orange in the title")
    public void userShouldSeeOrangeInTheTitle() {
        BrowserUtils.verifyTitle("orange - Search");

    }
}
