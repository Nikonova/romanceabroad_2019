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
        Assert.assertEquals(ListOnContentPage.size(), 22);
        System.out.println("Page contains " + ListOnContentPage.size() + " links.");
        System.out.println("//We check only some of them.");

        for (int i = 5; i < 7; i++) {
            String info = ListOnContentPage.get(i).getText();
            ListOnContentPage.get(i).click();

            if (info.equals(Data.expectedTitleBlog)) {

                String blogTitle = contentPage.verifyBlogTitle();
                Assert.assertEquals(blogTitle, Data.expectedTitleBlog);
                System.out.println(blogTitle + " - wright TITLE of Page");

            }
            contentPage.clickBackOnContent();
            ListOnContentPage = driver.findElements(Locators.LINKS_ON_CONTENT);


        }

    }

}
