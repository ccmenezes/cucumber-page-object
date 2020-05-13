import cucumber.api.PendingException;
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
import pageobjects.ForgotMyPassword;
import utils.ManageBrowser;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ForgotMyPasswordStepDefitions {

    public static WebDriver driver;
    private static ManageBrowser browser;
    private static ForgotMyPassword page;

    @Before
    public static void seUp() throws Exception {
        browser = new ManageBrowser();
        browser.setDriver(Browser.CHROME_BROWSER);
        driver = browser.getWebDriver();
        page = new ForgotMyPassword(driver);
    }

    @After
    public static void tearDownAfterClass() throws Exception {
        browser.toCloseDriver();
    }

    @Given("^The user is on RecoveryPassword Page$")
    public void the_user_is_on_RecoveryPassword_Page() throws Throwable {
        String expectedTitle = PageTitle.LOGINPAGE_TITLE.getTitle();
        String actualTitle;
        browser.navigateTo(Pages.ESQUECIMINHASENHA_PAGE);
        actualTitle = page.getTitleForgotMyPasswordPage();
        Assert.assertThat(expectedTitle, equalToIgnoringCase(actualTitle));
    }

    @When("^The user clicks on Send button$")
    public void the_user_clicks_on_Send_button() throws Throwable {
        page.clickSendButton();
    }

    @When("^The user types the email \"([^\"]*)\"$")
    public void the_user_types_the_email(String invalidEmail) throws Throwable {
        page.setEmail(invalidEmail);
    }

    @Then("^The system shows the error message$")
    public void the_system_shows_the_error_message() throws Throwable {
        page.verifyErrorMessage();
    }

    @Then("^The system shows the success message$")
    public void the_system_shows_the_success_message() throws Throwable {
        String expectedMessage = "Enviamos um email para";
        String actualMessage = page.getSuccessMessage();

        Assert.assertThat(expectedMessage, containsString(expectedMessage));
    }

}

