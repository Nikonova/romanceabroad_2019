import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {

    String currentUrlMainPage;

    @Test
    public void testMainPage() {

        List<WebElement> MainLinks = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(MainLinks.size());

        for (int i = 0; i < MainLinks.size(); i++) {
            String info = MainLinks.get(i).getText();
            System.out.println(info);
            if (MainLinks.get(i).getText().contains("HOME")&& MainLinks.get(i).getText().contains("HOW WE WORK") && MainLinks.get(i).getText().contains("PHOTOS")&&MainLinks.get(i).getText().contains("GIFTS")&&MainLinks.get(i).getText().contains("TOUR TO UKRAINE")&&MainLinks.get(i).getText().contains("BLOG")&&MainLinks.get(i).getText().contains("SIGN IN")){
                System.out.println("We can make test");
            }

            /* we can use this too

            WebElement elementsOfList = MainLinks.get(i);
            String info = elementsOfList.getText();
            System.out.println(info);*/

            MainLinks.get(i).click();
            driver.get(mainUrl);
            MainLinks = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));

        }

       /* WebElement ele = driver.findElement(Locators.LINK_VIDEO_YOUTUBE);
        driver.switchTo().frame(ele);

        driver.findElement(Locators.BUTTON_PLAY).click();

        currentUrlMainPage = driver.getCurrentUrl();
        System.out.println(currentUrlMainPage);
        Assert.assertEquals(currentUrlMainPage, "https://romanceabroad.com/"); */

    }
}
