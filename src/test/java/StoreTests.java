import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    @Test
    public void testStore() {

        storePage.clickGift();
        storePage.enterKeysToSearch();
        storePage.clickSearchButton();
        String productName = storePage.verifyNameOfProduct();
        System.out.println(productName);
        Assert.assertEquals(productName, Data.expectedTextProduct);

    }
}
