import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage extends BaseActions {

    String currentText;

    public StorePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickGift() {
        driver.findElement(Locators.LINK_STORE).click();
    }

    public void implementSearchByProduct() {
        driver.findElement(Locators.LINK_SEARCH_PRODUCT).sendKeys(Data.searchProduct);
        driver.findElement(Locators.BUTTON_SEARCH_PRODUCT).click();
    }

    public String verifyNameOfProduct() {
        currentText = driver.findElement(Locators.CURRENT_TEXT_PRODUCT).getText();
        return currentText;
    }

}
