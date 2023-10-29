import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("Open browser")
    public void openBrowser() {
    }

    @And("I open login page")
    public void iOpenLoginPage() {
    }

    @When("I type {string} as login")
    public void iTypeAsLogin(String arg0) {
    }

    @And("I type {string} as password")
    public void iTypeAsPassword(String arg0) {
    }

    @And("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
    }

    @Then("I am NOT logged in")
    public void iAmNOTLoggedIn() {
    }
}
