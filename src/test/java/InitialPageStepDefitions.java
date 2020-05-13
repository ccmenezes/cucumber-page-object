
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Browser;
import enums.PageTitle;
import enums.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.InitialPage;
import utils.ManageBrowser;

import static org.hamcrest.Matchers.equalToIgnoringCase;

public class InitialPageStepDefitions {

    public static WebDriver driver;
    private static ManageBrowser browser;
    private static InitialPage page;

    @Before
    public static void seUp() throws Exception {
        browser = new ManageBrowser();
        browser.setDriver(Browser.CHROME_BROWSER);
        driver = browser.getWebDriver();
        page = new InitialPage(driver);
    }

    @After
    public static void tearDownAfterClass() throws Exception {
        browser.toCloseDriver();
    }

    @Given("^The user is the main page$")
    public void the_user_is_the_main_page() throws Throwable {
        String expectedTitle = PageTitle.INITIALPAGE_TITLE.getTitle();
        String actualTitle;
        browser.navigateTo(Pages.INITIAL_PAGE);
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("^The user clicks on the ad insert link$")
    public void the_user_clicks_on_the_ad_insert_link() throws Throwable {
        page.clickTheInsertAdvertiseLink();
    }

    @When("^The user clicks on the link Chat$")
    public void the_user_clicks_on_the_link_Chat() throws Throwable {
        page.clickOnChat();
    }

    @When("^The user clicks on the link My Account$")
    public void the_user_clicks_on_the_link_My_Account() throws Throwable {
        page.clickOnMyAccount();
    }

    @Then("^The system directs the user to login page$")
    public void the_system_directs_the_user_to_login_page() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String expectedTitle = PageTitle.LOGINPAGE_TITLE.getTitle();
        wait.until(ExpectedConditions.titleContains("Minha conta | OLX"));
        String actualTitle = page.getTitle();

        Assert.assertThat(expectedTitle, equalToIgnoringCase(actualTitle));
    }
}
