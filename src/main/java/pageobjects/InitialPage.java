package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitialPage{

    private WebDriver driver;

    public InitialPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTheInsertAdvertiseLink(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement advertiseLink;
        advertiseLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"___gatsby\"]/div[2]/div[1]/header/div[3]/div")));
        advertiseLink.click();
    }

    public void clickOnChat(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement chatLink;
        chatLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"___gatsby\"]/div[2]/div[1]/header/div[3]/a[3]")));
        chatLink.click();
    }

    public void clickOnMyAccount(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement accountLink;
        accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"___gatsby\"]/div[2]/div[1]/header/div[3]/a[4]")));
        accountLink.click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

}