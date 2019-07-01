import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookNowTests extends BaseUI {

    String currentText;
    String currentUrlPayPal;


    @Test
    public void testBookNow() {
        driver.findElement(Locators.LINK_BOOKNOW).click();
        driver.findElement(By.xpath("//input[@id='search_product']")).click();
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("personal");
        driver.findElement(By.cssSelector("button[id='search_friend']")).click();
        driver.findElement(By.xpath("//div[@class='col-xs-6 col-sm-6 col-md-3 b-store-list__item']")).click();

        currentText = driver.findElement(By.xpath("//h1[@class='title']")).getText();
        System.out.println(currentText);
        Assert.assertEquals(currentText, "TOURS TO UKRAINE");

        driver.findElement(By.cssSelector("a[href='https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CNUP836ZN9G36']")).click();

        currentUrlPayPal = driver.getCurrentUrl();
        System.out.println(currentUrlPayPal);
        Assert.assertEquals(currentUrlPayPal, "https://romanceabroad.com/store/sweets/20-tour_to_ukraine");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
