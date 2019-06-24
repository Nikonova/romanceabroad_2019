import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select select = new Select(driver.findElement(By.xpath("//div[@class='form-inline']//select")));
        select.selectByVisibleText("Views");*/


    getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 3);



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
