import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class MediaTests extends BaseUI {

    public static final boolean testCase1002 = true;
    public static final boolean testCase1001 = true;
    public static final boolean testCase1003 = true; //

    @Test(priority = 3, enabled = testCase1003, groups = {"user", "admin"})
    public void verifyLinksOnMediaPageTestCase1003() {
        mediaPage.clickMedia();

        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }


    //simple Test for IE, but doesn't work, I need to download 32bit IE and I can't
    @Test(priority = 2, enabled = testCase1002, groups = {"ie"})
    public void testMediaPageTestCase1002() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        mediaPage.clickMedia();
        mainPage.javaWaitSec(10);
        String mediaUrl = mediaPage.verifyMediaUrl();
        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);
    }

   @Test(priority = 1, enabled = testCase1001, groups = {"admin", "user"})
    public void testMediaTestCase1001() {

        mediaPage.clickMedia();
        String mediaUrl = mediaPage.verifyMediaUrl();
        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);

        List<WebElement> listOnMediaPage = driver.findElements(Locators.LINK_LIST_ON_MEDIA_PAGE);
        System.out.println(listOnMediaPage.size());

        for (int i = 0; i < 4; i++) {
            String info = listOnMediaPage.get(i).getText();
            System.out.println(info);

            listOnMediaPage.get(i).click();
            driver.get(mediaUrl);
            listOnMediaPage = driver.findElements(Locators.LINK_LIST_ON_MEDIA_PAGE);
        }

        int sizeOfDropDownListSortBy = mediaPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY_ON_MEDIA);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mediaPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY_ON_MEDIA, "Sort by");
            mainPage.javaWaitSec(3);
        }

        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);
    }
}
