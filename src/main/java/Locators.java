import org.openqa.selenium.By;

public class Locators {

    //Main page
    public static final By LINK_VIDEO_YOUTUBE = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_PLAY = By.cssSelector("button.ytp-large-play-button.ytp-button");
    public static final By LINKS_FROM_NAVBAR = By.xpath("//ul[@class='navbar-nav']//li");

    //BookNow
    public static final By LINK_BOOKNOW = By.xpath("//a[text()='BOOK NOW ']");

    //Content page (How We Work)
    public static final By LINK_CONTENT = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By LINKS_ON_CONTENT = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");
    public static final By LINKS_ON_BLOG = By.xpath("//div[@class='col-xs-12 col-md-9 content-page']//li//a");



    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By LINK_KHARKOV = By.xpath("//a[@href='https://romanceabroad.com/content/view/kharkov-dating-agency']");
    public static final By LINK_BACK = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By IMG_WOMAN = By.xpath("//div[@class='info-content-block wysiwyg']//img");


    //Search page (Pretty Women)
    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By LINK_LIST_VIEW = By.cssSelector("a[title='List view']");
    public static final By LINK_LIST_GALLERY = By.cssSelector("a[title='Gallery view']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_SORT_BY_MIN = By.xpath("//div[@class='col-xs-5 no-padding-left']//select");
    public static final By DROP_DOWN_LIST_SORT_BY_MAX = By.cssSelector("select#age_max");
    public static final By RIGHT_CLICK = By.xpath("//i[@class='fa fa-caret-right']");
    public static final By LEFT_CLICK = By.xpath("//i[@class='fa fa-caret-left']");
    public static final By BUTTON_SEARCH = By.xpath("//input[@type='button']");

    //Media page (Photos)
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    /*public static final By LINK_PHOTO = By.cssSelector("a[href='https://romanceabroad.com/media/photo']");
    public static final By LINK_VIDEO = By.cssSelector("a[href='https://romanceabroad.com/media/video']");
    public static final By LINK_ALBUMS = By.cssSelector("a[href='https://romanceabroad.com/media/albums']");
    public static final By LINK_ALL = By.cssSelector("a[href='https://romanceabroad.com/media/all']");*/
    public static final By LINK_LIST_ON_MEDIA_PAGE = By.xpath("//ul[@class='b-tabs']//li");
    public static final By DROP_DOWN_LIST_SORT_BY_ON_MEDIA = By.xpath("//span[@class='form-group ']//select");

    //Store page (Gift)
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By LINK_SEARCH_PRODUCT = By.cssSelector("input[id='search_product']");
    public static final By BUTTON_SEARCH_PRODUCT = By.cssSelector("button#search_friend");
    public static final By CURRENT_TEXT_PRODUCT = By.xpath("//div[@class='title-block pt5']");
    public static final By IMG_FLOWER_BASKET = By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/12/big-8837694dae.jpg']");
    public static final By IMG_SPA = By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/2/big-c907aa3b7e.jpg']");
    public static final By IMG_TEDDY_BEAR = By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/11/big-ffd05e6dee.jpg']");
    public static final By IMG_TOURS_TO_UKRAINE = By.xpath("//img[@src='https://romanceabroad.com/uploads/store/0/0/0/20/big-c26f195dec.jpg']");

    //Registration page (JOIN FOR FREE NOW)
    public static final By BUTTON_REGISTRATION = By.cssSelector("a[data-action='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_NICKNAME = By.cssSelector("#nickname");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By SELECT_DAY = By.cssSelector("#daySelect");
    public static final By SELECT_DAY_TEXT = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By SELECT_MONTH = By.cssSelector("#monthSelect");
    public static final By SELECT_MONTH_TEXT = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']");
    public static final By SELECT_YEAR = By.cssSelector("#yearSelect");
    public static final By SELECT_YEAR_TEXT = By.xpath("//li[@data-handler='selectYear']//a[text()='1986']");

    public static final By CHECKBOX = By.cssSelector("input#confirmation");
    public static final By BUTTON_NEXT_ON_GET_STARTED = By.xpath("//button[@data-action='update-profile']");

    //Tour
    public static final By LINK_TOUR = By.xpath("//a[text()='TOUR TO UKRAINE']");
    public static final By LINK_MINI_LOGO = By.xpath("//img[@src='/application/views/flatty/logo/mini_logo.png']");
    public static final By LINK_SEARCH_TOUR = By.xpath("//input[@id='search_product']");
    public static final By BUTTON_SEARCH_TOUR = By.cssSelector("button[id='search_friend']");
    public static final By BUTTON_PAYPAL = By.cssSelector("a[href='https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CNUP836ZN9G36']");
    public static final By CLICK_ITEM = By.xpath("//div[@class='col-xs-6 col-sm-6 col-md-3 b-store-list__item']");
    public static final By CURRENT_TEXT_TOUR = By.xpath("//h1[@class='title']");
    public static final By CURRENT_TEXT_ON_LOGIN_BUTTON = By.xpath("//a[@id='ajax_login_link']");

    //for each page
    public static final By TITLE_OF_PAGE = By.xpath("//h1");


}
