import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        searchPage.clickPrettyWomen();
        searchPage.searchByDropDownLists();
        searchPage.selectListAndGalleryViews();
        searchPage.selectRightAndLeftClick();
    }

}
