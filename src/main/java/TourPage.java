import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourPage extends BaseActions {

    String currentUrl;
    String currentTitle;
    String currentText;

    public TourPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickTour() {
        driver.findElement(Locators.LINK_TOUR).click();
    }

    public void clickLogoHeart() {
        driver.findElement(Locators.LINK_MINI_LOGO).click();
    }

    public String verifyMainUrl() {
        currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public void clickBookNow() {
        driver.findElement(Locators.LINK_BOOKNOW).click();
    }

    public String verifyTitle() {
        currentTitle = driver.getTitle();
        return currentTitle;
    }

    public void implementSearchByTour() {
        driver.findElement(Locators.LINK_SEARCH_TOUR).sendKeys(Data.enterKeysToSearch);
        driver.findElement(Locators.BUTTON_SEARCH_TOUR).click();
    }

    public void clickFirstItem() {
        driver.findElement(Locators.CLICK_ITEM).click();
    }

    public String verifyText() {
        currentText = driver.findElement(Locators.CURRENT_TEXT_TOUR).getText();
        return currentText;
    }

    public void clickPayPal() {
        driver.findElement(Locators.BUTTON_PAYPAL).click();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_PAYPAL).isDisplayed());
    }

    public String verifyUrlTourToUkraine() {
        currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }


}
