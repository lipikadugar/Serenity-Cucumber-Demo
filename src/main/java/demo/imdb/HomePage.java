package demo.imdb;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;


@DefaultUrl("https://www.imdb.com")
public class HomePage extends PageObject {

    @FindBy(id = "home_img")
    private WebElement home;

    @FindBy(id = "imdbHeader-navDrawerOpen--desktop")
    public WebElement menu;

    @FindBy(xpath = "//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/div")
    WebElement signIn;

    public void openApplication() {
        open();
        waitForTheApplicationToLoad();
    }

    private void waitForTheApplicationToLoad() {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor((By) home);
    }

    public HomePage navigateToMenu() {
        openApplication();
        menu.click();
        return this;
    }


    public HomePage navigateToSignIn() {
        signIn.click();
        return this;
    }
}
