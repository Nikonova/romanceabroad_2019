import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }


    @AfterMethod
    public void afterActions() {

        //  driver.quit();
    }


    public void getDropDownListByIndex(By locator, int index){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void getDropDownListByText(By locator, int text){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(text);
    }

    public void getDropDownListByValue(By locator, int value){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(value);
    }

}
