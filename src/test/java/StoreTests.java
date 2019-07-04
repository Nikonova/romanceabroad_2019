import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    String currentText;

    @Test
    public void testStore() {

        driver.findElement(Locators.LINK_STORE).click();
        driver.findElement(Locators.LINK_SEARCH_PRODUCT).sendKeys(Data.searchProduct);
        driver.findElement(Locators.BUTTON_SEARCH_PRODUCT).click();

        currentText = driver.findElement(CurrentLocators.currentTextProduct).getText();
        System.out.println(currentText);
        Assert.assertEquals(currentText, ExpectedData.expectedTextProduct);

    }
}
