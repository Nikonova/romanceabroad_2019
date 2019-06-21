import org.testng.annotations.Test;

public class BookNowTests extends BaseUI {

    @Test
    public void testBookNow() {
        driver.findElement(Locators.LINK_BOOKNOW).click();
    }

}
