import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    String currentTitle;

    @Test
    public void testTour() {

        driver.findElement(Locators.LINK_TOUR).click();
        currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        Assert.assertEquals(currentTitle, Data.verifyTitle);
    }
}
