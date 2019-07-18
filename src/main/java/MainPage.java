import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String buttonDisplaed;

    public void clickJoinButton() {

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);

        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 4));



        driver.findElement(Locators.SELECT_DAY).click();
        driver.findElement(Locators.SELECT_DAY_TEXT).click();
        driver.findElement(Locators.SELECT_MONTH).click();
        driver.findElement(Locators.SELECT_MONTH_TEXT).click();
        driver.findElement(Locators.SELECT_YEAR).click();
        driver.findElement(Locators.SELECT_YEAR_TEXT).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.CHECKBOX).click();

    /*public void clickValueOfList (By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size(); i++) {
            WebElement elementOfList = elements.get(i);
            String value = elements.get(i).getText();
            {
                if (value.contains(text)) ;
            }*/


    }



        /*WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + ", checkbox was selected!");
        checkboxConfirmation.click();*/


}
