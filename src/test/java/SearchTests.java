import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    String currentUrlSearch;

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();

        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 3);
        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MIN, 0);
        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY_MAX, 20);

        driver.findElement(Locators.BUTTON_SEARCH).click();
        driver.findElement(Locators.LINK_LIST_VIEW).click();
        driver.findElement(Locators.RIGHT_CLICK).click();
        driver.findElement(Locators.LEFT_CLICK).click();

        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, ExpectedData.expectedUrlSearch);


    }


}
