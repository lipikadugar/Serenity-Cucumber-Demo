package demo.imdb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage {

    @FindBy(id = "suggestion-search")
    WebElement search_bar;

    @FindBy(id = "suggestion-search-button")
    private WebElement search_button;

    @FindBy(className = "ipc-list-item__text")
    public List<WebElement> list;

    @FindBy(className = "result_text")
    public List<WebElement> search_result;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/h1/text()")
    public WebElement textTitle;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/a/span")
    WebElement reviews;

    @FindBy(xpath = "//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong/span")
    WebElement rating;


    public SearchPage selectCategory(String category) {
        for (WebElement webElement : list) {
            if (webElement.getText().equals(category)) {
                webElement.click();
                break;
            }
        }
        return this;
    }

    public SearchPage searchFor(String searchText) {
        search_bar.sendKeys(searchText);
        search_button.click();
        return this;
    }

    public SearchPage selectLink(String suggested_link) {
        for (WebElement webElement : search_result) {
            if (webElement.getAttribute("a").equals(suggested_link)) {
                webElement.click();
                break;
            }
        }
        return this;

    }

    public String getTextTitle() {
        return textTitle.getText();
    }

    public String getReviews() {
        return reviews.getText();
    }

    public String getRatings() {
        return rating.getText();
    }

}
