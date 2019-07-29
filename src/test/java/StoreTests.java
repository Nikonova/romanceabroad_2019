import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    public static final boolean testCase1002 = false;
    public static final boolean testCase1001 = true;

    @Test(priority = 2, enabled = testCase1002, groups = {"ie","admin", "user"})
    public void verifyLinksOnMediaPage() {
        storePage.clickGift();

        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test(priority = 1, enabled = testCase1001, groups = {"admin", "user"})
    public void testStore() {

        storePage.clickGift();
        Assert.assertTrue(driver.findElement(Locators.IMG_FLOWER_BASKET).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_SPA).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_TEDDY_BEAR).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_TOURS_TO_UKRAINE).isDisplayed());
        storePage.implementSearchByProduct();
        String productName = storePage.verifyNameOfProduct();
        System.out.println(productName);
        Assert.assertEquals(productName, Data.expectedTextProduct);
        Assert.assertTrue(driver.findElement(Locators.IMG_FLOWER_BASKET).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_SPA).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_TEDDY_BEAR).isDisplayed());
        Assert.assertTrue(driver.findElement(Locators.IMG_TOURS_TO_UKRAINE).isDisplayed());


    }
}
