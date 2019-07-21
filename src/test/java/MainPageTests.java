import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {

    String currentUrlMainPage;

    @Test
    public void testMainPage() {

        List<WebElement> mainLinks = driver.findElements(Locators.LINKS_FROM_NAVBAR);
        System.out.println(mainLinks.size());

        for (int i = 0; i < mainLinks.size(); i++) {
            String info = mainLinks.get(i).getText();
            System.out.println(info);
            if (mainLinks.get(i).getText().contains("HOME")&& mainLinks.get(i).getText().contains("HOW WE WORK") && mainLinks.get(i).getText().contains("PHOTOS")&&mainLinks.get(i).getText().contains("GIFTS")&&mainLinks.get(i).getText().contains("TOUR TO UKRAINE")&&mainLinks.get(i).getText().contains("BLOG")&&mainLinks.get(i).getText().contains("SIGN IN")){
                System.out.println("We can make test");
            }

            /* we can use this too

            WebElement elementsOfList = mainLinks.get(i);
            String info = elementsOfList.getText();
            System.out.println(info);*/

            mainLinks.get(i).click();
            driver.get(mainUrl);
            mainLinks = driver.findElements(Locators.LINKS_FROM_NAVBAR);

        }

        WebElement ele = driver.findElement(Locators.LINK_VIDEO_YOUTUBE);
        driver.switchTo().frame(ele);

        driver.findElement(Locators.BUTTON_PLAY).click();

        currentUrlMainPage = driver.getCurrentUrl();
        System.out.println(currentUrlMainPage);
        Assert.assertEquals(currentUrlMainPage, Data.expectedMainUrl);

    }
}
