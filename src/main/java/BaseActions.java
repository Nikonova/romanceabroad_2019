import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public static String generateNewNumber(String name, int lenght) {
        return name + RandomStringUtils.random(lenght, "51351513513");
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

    public void ajaxSendKeys(WebElement element, String text){
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '" + text +"')", element);
    }

    public void ajaxClick(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void javaWaitSec(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void javaWait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static String generateRandomString(){
        return new BigInteger(120, new SecureRandom()).toString(32);
    }

    //Method for random choice from dropdown list
    public void selectItemDropDownRandomOption(By locator, String dropDownName){
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Select select = new Select(driver.findElement(locator));
            select.selectByIndex((int) (Math.random() * (select.getOptions().size() - 1)) + 1);
            System.out.println(dropDownName + ": " + select.getFirstSelectedOption().getText());
        } catch (NoSuchElementException e){

        }
    }

    public void checkLinksOnWebPage(String typeElement, String attribute){

        List<WebElement> links = driver.findElements(By.xpath(typeElement));

        System.out.println("I start taking  attributes on page");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute(attribute);
            verifyLinkActive(url);
        }

        System.out.println("Total links are " + links.size());
    }
    // Method for link verification
    public void verifyLinkActive (String linkUrl){
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() == 200){
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            else  if (httpURLConnect.getResponseCode() >=400 && httpURLConnect.getResponseCode()<= 504){
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + httpURLConnect.getResponseMessage());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public int getSizeDropDownList(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Select select = new Select(driver.findElement(locator));
            return select.getOptions().size();

        } catch (NoSuchElementException e) {
            System.out.println("getSizedropDownList error");

        }
        return 0;

    }

}

