import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrlSearch;

    public void clickPrettyWomen() {
        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void searchByDropDownLists() {
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 3);
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MIN, 0);
        getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MAX, 20);
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }

    public void selectListAndGalleryViews() {
        driver.findElement(Locators.LINK_LIST_VIEW).click();
        driver.findElement(Locators.LINK_LIST_GALLERY).click();
    }

    public void selectRightAndLeftClick() {
        driver.findElement(Locators.RIGHT_CLICK).click();
        driver.findElement(Locators.LEFT_CLICK).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, ExpectedData.expectedUrlSearch);
    }
}
