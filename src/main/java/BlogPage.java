import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {

    String currentUrlBlog;

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
    }

    public void clickKharkov() {
        driver.findElement(Locators.LINK_KHARKOV).click();
    }

    public void clickBack() {
        driver.findElement(Locators.LINK_BACK).click();
        currentUrlBlog = driver.getCurrentUrl();
    }

    public String verifyBlogUrl() {
        currentUrlBlog = driver.getCurrentUrl();
        return currentUrlBlog;
    }
}
