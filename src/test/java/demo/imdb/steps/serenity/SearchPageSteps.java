package demo.imdb.steps.serenity;

import demo.imdb.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchPageSteps {
    SearchPage searchPage;

    public SearchPage selectOption(String option) {
        return searchPage.selectCategory(option);
    }

    public SearchPage searchFor(String searchText) {
        return searchPage.searchFor(searchText);
    }

    public SearchPage selectSuggestedLink(String suggested_link) {
        return searchPage.selectLink(suggested_link);
    }

    @Test
    public void verifyTitleISEqualTo(String title) {
        String actualTitle = searchPage.getTextTitle();
        Assert.assertEquals("Title is not same", title, actualTitle);
    }

    @Test
    public void verifyReviewsIsEqualTo(String reviews) {
        String actualTitle = searchPage.getReviews();
        Assert.assertEquals("Title is not same", reviews, actualTitle);

    }

    @Test
    public void verifyRatingIsEqualTo(String rating) {
        String actualTitle = searchPage.getRatings();
        Assert.assertEquals("Title is not same", rating, actualTitle);
    }
}
