import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        searchPage.clickPrettyWomen();
        searchPage.searchByDropDownLists();
        searchPage.selectListAndGalleryViews();
        searchPage.selectRightAndLeftClick();
        String searchUrl = searchPage.verifySearchUrl();
        System.out.println(searchUrl);
        Assert.assertEquals(searchUrl, Data.expectedUrlSearch);
    }

}
