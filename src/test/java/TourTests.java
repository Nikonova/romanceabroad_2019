import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    @Test
    public void testTourPage() {
        tourPage.clickTour();
        tourPage.clickLogoHeart();
        String mainUrl = tourPage.verifyMainUrl();
        Assert.assertEquals(mainUrl, Data.expectedMainUrl);
        tourPage.clickBookNow();
        String tourTitle = tourPage.verifyTitle();
        System.out.println(tourTitle);
        Assert.assertEquals(tourTitle, Data.expectedTitleTourPage);
        tourPage.implementSearchByTour();
        tourPage.clickFirstItem();
        String tourText = tourPage.verifyText();
        System.out.println(tourText);
        Assert.assertEquals(tourText, Data.expectedText);
        tourPage.clickPayPal();
        String tourUrl = tourPage.verifyUrlTourToUkraine();
        Assert.assertEquals(tourUrl, Data.expectedUrlTourToUkraine);
        Assert.assertTrue(driver.findElement(Locators.CURRENT_TEXT_ON_LOGIN_BUTTON).isDisplayed());

    }
}
