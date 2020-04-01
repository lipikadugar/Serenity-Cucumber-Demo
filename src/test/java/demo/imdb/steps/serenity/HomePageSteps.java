package demo.imdb.steps.serenity;

import demo.imdb.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;

public class HomePageSteps {
    HomePage homePage;

    @Step("Navigate to Menu")
    public HomePage navigateToMenu() {
        return homePage.navigateToMenu();
    }




    public HomePage navigateToSignIn() {
        return homePage.navigateToSignIn();
    }
}
