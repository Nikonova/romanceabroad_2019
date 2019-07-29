import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    public static final boolean testCase1002 = false;
    public static final boolean testCase1001 = true;

    @Test(priority = 2, enabled = testCase1002, groups = {"ie","admin", "user"})
    public void verifyLinksOnMediaPage() {
        storePage.clickGift();

        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test(priority = 1, enabled = testCase1001, groups = {"admin", "user"})

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
