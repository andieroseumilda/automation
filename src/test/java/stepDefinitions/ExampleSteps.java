package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ExampleSteps {
//    You can implement missing steps with the snippets below:
    @Given("^I am officiating a FizzBuzz game$")
    public void I_am_officiating_a_FizzBuzz_game() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\andie\\Documents\\automation\\seleniumWebBrowser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://aspen.reservations.com/property/1/#/stay-dates");
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Print me");
    }
    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int arg1) throws Throwable {
        System.out.println(arg1);
    }
    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void I_should_be_told_the_correct_answer_is(String arg1) throws Throwable {
        System.out.println(arg1);
    }
}
