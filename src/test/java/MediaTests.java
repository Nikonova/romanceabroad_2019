import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class MediaTests extends BaseUI {

    //simple Test for IE, but doesn't work, I need to download 32bit IE and I can't
    @Test
    public void testMediaPage() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_MEDIA));
        mediaPage.clickMedia();
        mainPage.javaWaitSec(5);
        String mediaUrl = mediaPage.verifyMediaUrl();
        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);
    }

   /* @Test
    public void testMedia() {

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
    }*/
}
