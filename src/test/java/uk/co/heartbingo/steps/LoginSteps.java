package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.heartbingo.pages.LoginPage;

public class LoginSteps {
    @When("User clicks on Login Link")
    public void userClicksOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @And("User enters valid Username {string}")
    public void userEntersValidUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("User enters valid Password {string}")
    public void userEntersValidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User clicks on Login Button")
    public void userClicksOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User should see Deposit link at the top")
    public void userShouldSeeDepositLinkAtTheTop() {
        Assert.assertEquals(new LoginPage().getDepositText(), "Deposit");
    }

    @And("User clicks on My Account Button")
    public void userClicksOnMyAccountButton() {
        new LoginPage().clickOnMyAccountButton();
    }

    @Then("User should see the Logout Button")
    public void userShouldSeeTheLogoutButton() {
        Assert.assertEquals(new LoginPage().getLogoutText(), "Log Out");
    }

    @Then("User clicks the Logout Button")
    public void userClicksTheLogoutButton() {
        new LoginPage().clickOnLogoutButton();
    }

    @And("User enters Invalid Username {string}")
    public void userEntersInvalidUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("User enters Invalid Password {string}")
    public void userEntersInvalidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("User should see error message for invalid Username and Password")
    public void userShouldSeeErrorMessageForInvalidUsernameAndPassword() {
        Assert.assertEquals(new LoginPage().getErrorMessageText(), "The username or password you entered is incorrect. Please try again.");
    }

    @When("User clicks on Accept Cookies")
    public void userClicksOnAcceptCookies() {new LoginPage().clickOnCookiesButton();}
}
