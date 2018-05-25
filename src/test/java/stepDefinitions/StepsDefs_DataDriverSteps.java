package stepDefinitions;

import cucumber.api.java.en.Then;
import seleniumPages.Page_GoogleHomepage;

/**
 * Created by andie on 23/05/2018.
 */
public class StepsDefs_DataDriverSteps {

    Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

    @Then("^I search for \"([^\"]*)\" on Google$")
    public void i_search_for_on_Google(String arg1) throws InterruptedException {
        googleHomepage.searchOnGoogleHomepage(arg1);
    }

}
