import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    String currentUrlBlog;

    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        driver.findElement(Locators.LINK_KRAKOV).click();
        driver.findElement(Locators.LINK_BACK).click();

        currentUrlBlog = driver.getCurrentUrl();
        System.out.println();
        Assert.assertEquals(currentUrlBlog, ExpectedData.expectedUrlBlog);
    }

}
