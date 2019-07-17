import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContentPage extends BaseActions {

    public ContentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrl;

    public void clickHowWeWork() {
        driver.findElement(Locators.LINK_CONTENT).click();
    }

    public String verifyContentUrl() {
        currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }


}
