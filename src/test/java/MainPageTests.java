import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTests extends BaseUI {

    String currentUrlMainPage;

    @Test
    public void smokeTestMainPage() {

        List<WebElement> mainLinks = driver.findElements(Locators.LINKS_FROM_NAVBAR);
        for (int i = 0; i < mainLinks.size(); i++) {
            mainLinks.get(i).click();
            driver.get(mainUrl);
            mainLinks = driver.findElements(Locators.LINKS_FROM_NAVBAR);

        }
    }


    @Test
    public void testMainPage() {

        List<WebElement> mainLinks = driver.findElements(Locators.LINKS_FROM_NAVBAR);
        System.out.println(mainLinks.size());

        for (int i = 0; i < mainLinks.size(); i++) {
            String info = mainLinks.get(i).getText();
            System.out.println(info);

            if (info.contains("HOME") && info.contains("HOW WE WORK") && info.contains("PHOTOS") && info.contains("GIFTS") && info.contains("TOUR TO UKRAINE") && info.contains("BLOG") && info.contains("SIGN IN")) {
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

    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");

        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");

        driver.findElement(Locators.LINK_MEDIA);



    }

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY);

        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

    @Test
    public void selectRandomDropDownListAge() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY_MAX);

        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY_MAX, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }


}
