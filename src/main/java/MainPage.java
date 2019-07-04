import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public MainPage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

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
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']")).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectYear']//a[text()='1986']")).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + ", checkbox was selected!");
        checkboxConfirmation.click();

    }
}
