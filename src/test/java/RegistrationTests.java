import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);

        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();

        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + ", checkbox was selected!");
        checkboxConfirmation.click();





    }
}
