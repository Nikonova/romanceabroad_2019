import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    String currentTitle;
    String currentUrl;
    String currentText;

    @Test
    public void testTour() {

        driver.findElement(Locators.LINK_TOUR).click();

        currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertEquals(currentTitle, ExpectedData.expectedTitle);

        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, ExpectedData.expectedUrlTourToUkraine);

        driver.findElement(Locators.LINK_MINI_LOGO).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, ExpectedData.expectedMainUrl);

        driver.findElement(Locators.LINK_BOOKNOW).click();
        currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertEquals(currentTitle, ExpectedData.expectedTitle);
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, ExpectedData.expectedUrlTourToUkraine);

        driver.findElement(Locators.LINK_SEARCH_TOUR).sendKeys("personal");
        driver.findElement(Locators.BUTTON_SEARCH_TOUR).click();
        driver.findElement(Locators.CLICK_ITEM).click();

        currentText = driver.findElement(CurrentLocators.currentTextTour).getText();
        System.out.println(currentText);
        Assert.assertEquals(currentText, ExpectedData.expectedText);

        driver.findElement(Locators.BUTTON_PAYPAL).click();

        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, ExpectedData.expectedUrlTourToUkraine);





    }


}
