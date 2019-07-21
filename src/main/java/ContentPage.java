import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContentPage extends BaseActions {

    public ContentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentUrl;
    String currentTitle;

    public void clickHowWeWork() {
        driver.findElement(Locators.LINK_CONTENT).click();
    }

    public String verifyContentUrl() {
        currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public String verifyBlogTitle() {
        currentTitle = driver.getTitle();
        return currentTitle;
    }

    public void clickBackOnContent() {

        driver.get(Data.expectedUrlContent);

    }


}
