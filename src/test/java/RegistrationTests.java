import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration() {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        Assert.assertTrue(driver.findElement(Locators.BUTTON_NEXT_ON_GET_STARTED).isDisplayed());



    }
}
