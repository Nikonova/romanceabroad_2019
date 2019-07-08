import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MediaTests extends BaseUI {

    String currentUrlMedia;

    @Test
    public void testMedia() {

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, ExpectedData.expectedUrlMedia);

        List<WebElement> ListOnMediaPage = driver.findElements(By.xpath("//ul[@class='b-tabs']//li"));
        System.out.println(ListOnMediaPage.size());

        for (int i = 0; i < 4; i++) {
            String info = ListOnMediaPage.get(i).getText();
            System.out.println(info);

            ListOnMediaPage.get(i).click();
            driver.get(currentUrlMedia);
            ListOnMediaPage = driver.findElements(By.xpath("//ul[@class='b-tabs']//li"));

        }

        /*driver.findElement(Locators.LINK_PHOTO).click();
        driver.findElement(Locators.LINK_VIDEO).click();
        driver.findElement(Locators.LINK_ALBUMS).click();
        driver.findElement(Locators.LINK_ALL).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, ExpectedData.expectedUrlMediaAll);*/
    }
}
