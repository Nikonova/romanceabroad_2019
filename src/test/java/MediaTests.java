import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class MediaTests extends BaseUI {

    @Test
    public void testMedia() {

        mediaPage.clickMedia();
        String mediaUrl = mediaPage.verifyMediaUrl();
        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);

        List<WebElement> ListOnMediaPage = driver.findElements(Locators.LINK_LIST_ON_MEDIA_PAGE);
        System.out.println(ListOnMediaPage.size());

        for (int i = 0; i < 4; i++) {
            String info = ListOnMediaPage.get(i).getText();
            System.out.println(info);

            ListOnMediaPage.get(i).click();
            driver.get(mediaUrl);
            ListOnMediaPage = driver.findElements(Locators.LINK_LIST_ON_MEDIA_PAGE);
        }

        System.out.println(mediaUrl);
        Assert.assertEquals(mediaUrl, Data.expectedUrlMedia);
    }
}
