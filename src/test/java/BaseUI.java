import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    SearchPage searchPage;
    TourPage tourPage;
    BlogPage blogPage;
    StorePage storePage;
    MediaPage mediaPage;
    ContentPage contentPage;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        tourPage = new TourPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        storePage = new StorePage(driver, wait);
        mediaPage = new MediaPage(driver, wait);
        contentPage = new ContentPage(driver, wait);


        driver.manage().window().maximize();
        driver.get(mainUrl);
    }


    @AfterMethod
    public void afterActions() {

        //  driver.quit();
    }



}
