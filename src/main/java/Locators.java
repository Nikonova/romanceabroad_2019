import org.openqa.selenium.By;

public class Locators {

    //Main page
    public static final By LINK_BOOKNOW = By.xpath("//a[text()='BOOK NOW ']");

    //Content page (How We Work)
    public static final By LINK_CONTENT = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");


    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //Search page (Pretty Women)
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By LINK_LIST_VIEW = By.cssSelector("a[title='List view']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_SORT_BY_MIN = By.xpath("//div[@class='col-xs-5 no-padding-left']//select");
    public static final By DROP_DOWN_LIST_SORT_BY_MAX = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    public static final By RIGHT_CLICK = By.xpath("//i[@class='fa fa-caret-right']");
    public static final By LEFT_CLICK = By.xpath("//i[@class='fa fa-caret-left']");
    public static final By BUTTON_SEARCH = By.xpath("//input[@type='button']");

    //Media page (Photos)
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By LINK_PHOTO = By.cssSelector("a[href='https://romanceabroad.com/media/photo']");
    public static final By LINK_VIDEO = By.cssSelector("a[href='https://romanceabroad.com/media/video']");
    public static final By LINK_ALBUMS = By.cssSelector("a[href='https://romanceabroad.com/media/albums']");
    public static final By LINK_ALL = By.cssSelector("a[href='https://romanceabroad.com/media/all']");

    //Store page (Gift)
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    //Registration page (JOIN FOR FREE NOW)
    public static final By BUTTON_REGISTRATION = By.cssSelector("a[data-action='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input[id='password']");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");

    //Tour
    public static final By LINK_TOUR = By.xpath("//a[text()='TOUR TO UKRAINE']");







}
