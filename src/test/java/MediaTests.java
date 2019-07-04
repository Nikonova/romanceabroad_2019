import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {

    String currentUrlMedia;

    @Test
    public void testMedia() {

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, ExpectedData.expectedUrlMedia);
        driver.findElement(Locators.LINK_PHOTO).click();
        driver.findElement(Locators.LINK_VIDEO).click();
        driver.findElement(Locators.LINK_ALBUMS).click();
        driver.findElement(Locators.LINK_ALL).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, ExpectedData.expectedUrlMediaAll);
    }
}
