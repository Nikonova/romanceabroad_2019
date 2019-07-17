import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContentTests extends BaseUI {

    @Test
    public void testContent() {

        contentPage.clickHowWeWork();
        String contentUrl = contentPage.verifyContentUrl();
        System.out.println(contentUrl);
        Assert.assertEquals(contentUrl, Data.expectedUrlContent);

        List<WebElement> ListOnContentPage = driver.findElements(Locators.LINKS_ON_CONTENT);
        System.out.println(ListOnContentPage.size());

        for (int i = 0; i < 22; i++) {
            String info = ListOnContentPage.get(i).getText();
            System.out.println(info);
        }

    }
}
