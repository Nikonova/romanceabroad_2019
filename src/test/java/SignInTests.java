import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    String currentUrlSignIn;
    String expectedUrlSignIn = "https://romanceabroad.com/users/login_form";
    By LINK_SIGNIN = By.xpath("//a[text()='SIGN IN']");

    // How to check 'SIGN IN' page where URL is https://romanceabroad.com/users/login_form
    // I got with URL just ones, when open first time browser and click on'SIGN IN' tab on main page
    @Test
    public void testSignIn() {
        driver.findElement(LINK_SIGNIN).click();
        //       System.out.println(currentUrlSignIn);
        //       Assert.assertEquals(currentUrlSignIn, expectedUrlSignIn);
    }
}
