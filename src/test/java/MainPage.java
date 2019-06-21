import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlSignIn;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlSignIn = "https://romanceabroad.com/users/login_form";
    By LINK_CONTENT = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_TOUR = By.xpath("//a[text()='TOUR TO UKRAINE']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGNIN = By.xpath("//a[text()='SIGN IN']");
    By LINK_BOOKNOW = By.xpath("//a[text()='BOOK NOW ']");
    By LINK_REGISTRATION = By.cssSelector("a[data-action='show-registration-block']");

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }








    @Test
    public void testContent(){
        driver.findElement(LINK_CONTENT).click();
    }

    @Test
    public void testSearchPage(){
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testMedia(){
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
        driver.findElement(By.cssSelector("a[href='https://romanceabroad.com/media/photo']")).click();
        driver.findElement(By.cssSelector("a[href='https://romanceabroad.com/media/video']")).click();
        driver.findElement(By.cssSelector("a[href='https://romanceabroad.com/media/albums']")).click();
        driver.findElement(By.cssSelector("a[href='https://romanceabroad.com/media/all']")).click();
    }

    @Test
    public void testStore(){
        driver.findElement(LINK_STORE).click();
    }

    @Test
    public void testTour(){
        driver.findElement(LINK_TOUR).click();
    }

    @Test
    public void testBlog(){
        driver.findElement(LINK_BLOG).click();
    }

    // How to check 'SIGN IN' page where URL is https://romanceabroad.com/users/login_form
    // I got with URL just ones, when open first time browser and click on'SIGN IN' tab on main page
    @Test
    public void testSignIn(){
        driver.findElement(LINK_SIGNIN).click();
 //       System.out.println(currentUrlSignIn);
 //       Assert.assertEquals(currentUrlSignIn, expectedUrlSignIn);
    }

    @Test
    public void testBookNow(){
        driver.findElement(LINK_BOOKNOW).click();
    }

    @Test
    public void testRegistration(){
        driver.findElement(LINK_REGISTRATION).click();
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ex123@gmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password123");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();

    }







    @AfterMethod
    public void afterActions(){
        driver.quit();
    }

}
