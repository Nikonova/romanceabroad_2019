import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    By LINK_TOUR = By.xpath("//a[text()='TOUR TO UKRAINE']");

    @Test
    public void testTour() {

        driver.findElement(LINK_TOUR).click();
    }
}
