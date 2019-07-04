import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseUI {

    String currentUrlMainPage;

    @Test
    public void testMainPage() {

        WebElement ele = driver.findElement(Locators.LINK_VIDEO_YOUTUBE);
        driver.switchTo().frame(ele);

        driver.findElement(Locators.BUTTON_PLAY).click();

        currentUrlMainPage =driver.getCurrentUrl();
        System.out.println(currentUrlMainPage);
        Assert.assertEquals(currentUrlMainPage, "https://romanceabroad.com/");

    }
}
