import org.testng.annotations.Test;

public class ContentTests extends BaseUI {

    @Test
    public void testContent() {

        driver.findElement(Locators.LINK_CONTENT).click();
    }
}
