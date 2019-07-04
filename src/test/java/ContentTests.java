import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentTests extends BaseUI {

    String currentUrl;

    @Test
    public void testContent() {

        driver.findElement(Locators.LINK_CONTENT).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, ExpectedData.expectedUrlContent);
    }
}
