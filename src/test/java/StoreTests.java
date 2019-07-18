import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    @Test
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
