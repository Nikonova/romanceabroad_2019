import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public void enterKeysToSearch() {
        driver.findElement(Locators.LINK_SEARCH_TOUR).sendKeys(Data.enterKeysToSearch);
    }

    public void clickSearchButton() {
        driver.findElement(Locators.BUTTON_SEARCH_TOUR).click();
    }

    public void clickFirstItem() {
        driver.findElement(Locators.CLICK_ITEM).click();
    }

    public String verifyText() {
        currentText = driver.findElement(Locators.currentTextTour).getText();
        return currentText;
    }

    public void clickPayPal() {
        driver.findElement(Locators.BUTTON_PAYPAL).click();
    }

    public String verifyUrlTourToUkraine() {
        currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }


}
