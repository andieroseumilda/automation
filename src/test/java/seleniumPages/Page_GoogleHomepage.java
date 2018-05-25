package seleniumPages;

import common.Page_BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by andie on 23/05/2018.
 */
public class Page_GoogleHomepage extends Page_BasePage{

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\andie\\Documents\\automation\\seleniumWebBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void openGoogleURL() throws InterruptedException {
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        System.out.println("hello");
    }

    public void checkSearchBoxIsDisplayed() {
        if(driver.findElement(By.name("q")).isDisplayed()) {
            System.out.println("Search text box is displayed");
        } else {
            System.out.println("Search text box is NOT displayed");
        }
    }

    public void checkGoogleSearchButtonIsDisplayed() {
        if(driver.findElement(By.name("btnK")).isDisplayed()) {
            System.out.println("Google Search button is displayed");
        } else {
            System.out.println("Google Search button is NOT displayed");
        }
    }

    public void checkImFeelingLuckyButtonIsDisplayed() {
        if(driver.findElement(By.name("btnI")).isDisplayed()) {
            System.out.println("I'm Feeling Lucky button is displayed");
        } else {
            System.out.println("I'm Feeling Lucky button is NOT displayed");
        }
    }

    public void searchOnGoogleHomepage(String keyword) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(keyword);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
