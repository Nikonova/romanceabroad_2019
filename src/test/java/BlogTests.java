import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogPage() {
        blogPage.clickBlog();

        List<WebElement> listOfBlog = driver.findElements(Locators.LINKS_ON_BLOG);
        Assert.assertEquals(15, listOfBlog.size());
        System.out.println("!!! Page contains " + listOfBlog.size() + " links !!!");

        for (int j = 12; j < listOfBlog.size(); j++) {
            String element = listOfBlog.get(j).getText();
            listOfBlog.get(j).click();


//Why CLICK doesn't work? How to click on link and check title there?
            if (element.equals("Slavic women for marriage")) {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, "Slavic women for marriage");
                System.out.println(actualTitle + " !!! Title is right !!!");
            }
            if (element.contains("How to marry Ukrainian lady")) {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, "How to marry Ukrainian lady");
                System.out.println(actualTitle + " !!! Title is right !!!");
            }
            if (element.contains("Free Ukrainian dating site")){
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, "Free Ukrainian dating site");
                System.out.println(actualTitle + " !!! Title is right !!!");
            }
            if (element.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, "9 Factors to Keep in Mind When Dating a Ukrainian Woman");
                System.out.println(actualTitle + " !!! Title is right !!!");
            }
            if (element.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman")) {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, "Is There a Difference Between Dating or Courting a Ukrainian Woman");
                System.out.println(actualTitle + " !!! Title is right !!!");

            }else{
                driver.findElement(By.xpath("//img[@alt='Is There a Difference Between Dating or Courting a Ukrainian Woman?']"));
                System.out.println("!!! TITLE doesn't match !!!");
            }


            driver.get("https://romanceabroad.com/content/view/blog");
            listOfBlog = driver.findElements(Locators.LINKS_ON_BLOG);

        }

        String blogUrl = blogPage.verifyBlogUrl();
        Assert.assertEquals(blogUrl, Data.expectedUrlBlog);
    }

}
