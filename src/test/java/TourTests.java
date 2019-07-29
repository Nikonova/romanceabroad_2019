import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {
    public static final boolean testCase1001 = true;
    public static final boolean testCase1002 = true;
    public static final boolean testCase1003 = true;



    @Test(priority = 1, enabled = testCase1001, groups = {"user", "admin"})
    public void verifyLinksOnMediaPageTestCase1001() {
        tourPage.clickTour();

        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test(priority = 3,enabled = testCase1003, groups = {"ie", "user", "admin"})
    public void verifyTopMenuItemsTestCase1003() {
        tourPage.clickTour();

        Assert.assertTrue(driver.findElement(Locators.PICTURE_OF_GIFT).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.PICTURE_OF_TOUR_TO_UKRAINE).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.PICTURE_INDIVIDUAL_TRIP_TO_UKRAINE).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.TEXT_OF_TOUR_TO_UKRAINE).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.TEXT_INDIVIDUAL_TRIP_TO_UKRAINE).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.TEXT_OF_GIFT).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.PICTURE_MAIN_DROPDOWN_MENU).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.PICTURE_SEARCH).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.PICTURE_FORM_FOR_SEARCH).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.TEXT_LOGIN).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.LINK_MINI_LOGO).isDisplayed());

    }

    @Test(priority = 2, enabled = testCase1002, groups = {"user", "admin"})
    public void testTourPageTestCase1002() {
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
