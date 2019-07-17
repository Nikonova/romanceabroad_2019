import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlSearch;

    public void clickPrettyWomen() {
        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void searchByDropDownLists() {
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, Data.sortByNameViewsOrRegistration);
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MIN, Data.sortByAgeMin);
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MAX, Data.sortByAgeMax);
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }

    public void selectListAndGalleryViews() {
        driver.findElement(Locators.LINK_LIST_VIEW).click();
        driver.findElement(Locators.LINK_LIST_GALLERY).click();
    }

    public void selectRightAndLeftClick() {
        driver.findElement(Locators.RIGHT_CLICK).click();
        driver.findElement(Locators.LEFT_CLICK).click();
    }

    public String verifySearchUrl() {
        currentUrlSearch = driver.getCurrentUrl();
        return currentUrlSearch;
    }

}
