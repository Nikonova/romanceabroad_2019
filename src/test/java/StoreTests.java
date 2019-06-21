import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    @Test
    public void testStore() {

        driver.findElement(Locators.LINK_STORE).click();
    }
}
