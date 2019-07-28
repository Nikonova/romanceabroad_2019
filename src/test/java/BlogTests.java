import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogLinks3() {
        By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
        By LINK_BLOG_LIST = By.xpath("//div[@class='col-xs-12 col-md-9 content-page']//li//a");

        //Add blog link in variable on main page
        WebElement linkBlog = driver.findElement(LINK_BLOG);

        //Click blog link on main page
        linkBlog.click();

        List<WebElement> links = driver.findElements(LINK_BLOG_LIST);
        for (int i = 0; i < links.size(); i++) {

            String linkText = links.get(i).getText();
            System.out.println(linkText);
            links.get(i).click();
            mainPage.javaWaitSec(3);

            if (linkText.contains("Kharkov dating agency")) {
                Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Kharkov Dating & Marriage Agency"));
            }
            else if (linkText.contains("Kiev dating agency")) {
                Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Kiev marriage agency"));
            }
            {

                //Add link "Back" to same variable  with same locator as Blog link on Blog page
                linkBlog = driver.findElement(LINK_BLOG);

                //Click link "Back"
                linkBlog.click();

                //Refresh list of web elements
                links = driver.findElements(LINK_BLOG_LIST);
            }
        }
    }


    @Test
    public void testBlogPage() {

        blogPage.clickBlog();

        List<WebElement> listOfBlog = driver.findElements(Locators.LINKS_ON_BLOG);
        Assert.assertEquals(listOfBlog.size(), 15);
        System.out.println("!!! Page contains " + listOfBlog.size() + " links !!! We will check some of them");

        for (int j = 0; j < listOfBlog.size(); j++) {
            String element = listOfBlog.get(j).getText();
            System.out.println(element);
            listOfBlog.get(j).click();
            mainPage.javaWaitSec(3);

            if (element.equals("Kharkov dating agency")) {
                Assert.assertTrue(driver.findElement(Locators.TITLE_OF_PAGE).getText().contains("Kharkov Dating & Marriage Agency"));
            }
            if (element.equals("Kiev dating agency")) {
                Assert.assertTrue(driver.findElement(Locators.TITLE_OF_PAGE).getText().contains("Kiev marriage agency"));
            }
            if (element.contains("Mail order girls")) {
                Assert.assertTrue(driver.findElement(Locators.TITLE_OF_PAGE).getText().contains("Mail Order Girls Catalog"));
            }
            if (element.contains("Free Ukrainian dating site")){
                Assert.assertTrue(driver.findElement(Locators.TITLE_OF_PAGE).getText().contains("Ukrainian dating website for singles"));
            }
            if (element.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
                Assert.assertTrue(driver.findElement(Locators.IMG_WOMAN).isDisplayed());
            }
            if (element.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")) {
                Assert.assertTrue(driver.findElement(Locators.IMG_WOMAN).isDisplayed());
            }

            driver.findElement(Locators.LINK_BACK).click();
            listOfBlog = driver.findElements(Locators.LINKS_ON_BLOG);

        }

        String blogUrl = blogPage.verifyBlogUrl();
        Assert.assertEquals(blogUrl, Data.expectedUrlBlog);
        System.out.println(blogUrl);
    }

}
