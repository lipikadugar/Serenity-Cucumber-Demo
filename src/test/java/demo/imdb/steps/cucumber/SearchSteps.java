package demo.imdb.steps.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.imdb.steps.serenity.SearchPageSteps;
import net.thucydides.core.annotations.Steps;


public class SearchSteps {

    @Steps
    demo.imdb.steps.serenity.HomePageSteps homePageSteps;
    SearchPageSteps searchPageSteps;

    @Given("I click on the Menu button")
    public void iClickOnTheMenuButton() {
        homePageSteps.navigateToMenu();
    }


    @Then("I should abbe able to verify tile, rating and number of reviews")
    public void iShouldAbbeAbleToVerifyTileRatingAndNumberOfReviews() {

    }

    @And("I click on Top Rated Shows")
    public void iClickOnTopRatedShows() {
        searchPageSteps.selectOption("Top Rated Shows");
    }


    @When("I select Game of Thrones: The Last Watch’ link from the suggestion window")
    public void iSelectGameOfThronesTheLastWatchLinkFromTheSuggestionWindow() {

    }


    @Given("I navigate to SignIn Page")
    public void iNavigateToSignInPage() {
        homePageSteps.navigateToSignIn();

    }

    @Then("I must be able to verify that I am logged in")
    public void iMustBeAbleToVerifyThatIAmLoggedIn() {

    }


    @And("I search for {string}")
    public void iSearchFor(String searchText) {
        searchPageSteps.searchFor(searchText);

    }

    @When("I select {string} link from the suggestion window")
    public void iSelectLinkFromTheSuggestionWindow(String suggested_link) {
        searchPageSteps.selectSuggestedLink(suggested_link);
    }

    @Then("the title should be {string}, number of reviews should be {string} and rating should be {string}")
    public void theTitleShouldBeNumberOfReviewsShouldBeAndRatingShouldBe(String title, String reviews, String rating) {
        searchPageSteps.verifyTitleISEqualTo(title);
        searchPageSteps.verifyReviewsIsEqualTo(reviews);
        searchPageSteps.verifyRatingIsEqualTo(rating);
    }
}
