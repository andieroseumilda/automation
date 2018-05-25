package stepDefinitions;

import seleniumPages.Page_GoogleHomepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by andie on 23/05/2018.
 */
public class StepsDefs_GoogleHomepage
{
    Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

    @Given("^I launch Chrome browser$")
    public void i_launch_Chrome_browser()  {
        System.out.println("test");
        googleHomepage.launchBrowser();
    }

    @When("^I open Google Homepage$")
    public void i_open_Google_Homepage() throws InterruptedException {
        googleHomepage.openGoogleURL();
    }

    @Then("^I verify that the page displays search text box$")
    public void i_verify_that_the_page_displays_search_text_box() {
            googleHomepage.checkSearchBoxIsDisplayed();
    }

    @Then("^the page displays Google Search button$")
    public void the_page_displays_Google_Search_button() {
        googleHomepage.checkGoogleSearchButtonIsDisplayed();
    }

    @Then("^the page displays Im Feeling Lucky button$")
    public void the_page_displays_Im_Feeling_Lucky_button()  {
        googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
    }

}
