package utils;

import enums.Browser;
import enums.Pages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class ManageBrowser {
    private WebDriver driver;

    public void setDriver(Browser browser) {

        switch (browser) {
            case FIREFOX_BROWSER:
                System.setProperty("webdriver.gecko.driver", Browser.FIREFOX_PATH.getValue());
                this.driver = new FirefoxDriver();
                break;
            case CHROME_BROWSER:
                System.setProperty("webdriver.chrome.driver", Browser.CHROME_PATH.getValue());
                this.driver = new ChromeDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", Browser.CHROME_PATH.getValue());
                this.driver = new ChromeDriver();
        }
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

    public void navigateTo(Pages page){
        if(this.driver != null){
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get(page.getPathPage());
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

    public void toCloseDriver(){
        if(this.driver != null){
            driver.close();
            driver.quit();
            driver = null;
        }
    }

    public void fluentWait(long millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
