package uk.co.heartbingo.pages;

import uk.co.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesButton;

    @CacheLookup
    @FindBy(linkText = "Log In")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//iframe[@class='oneauth-iframe']")
    WebElement iFrame;

    @CacheLookup
    @FindBy(id = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(className = "login_errorMessageWrapper__2ZcGx")
    WebElement errorText;

    @CacheLookup
    @FindBy(linkText = "Deposit")
    WebElement depositText;

    @CacheLookup
    @FindBy(className = "site-header__my-account")
    WebElement myAccountButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log Out')]")
    WebElement logoutButton;

    public void clickOnCookiesButton() {
        clickOnElement(cookiesButton);
        log.info("Clicking on Cookies Button " + cookiesButton.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on Login Button at top of Page " + loginLink.toString());
    }

    public void switchToFrame() {
        driver.switchTo().frame(iFrame);
        log.info("Switching into iFrame " + iFrame.toString());
    }

    public void enterUsername(String username) {
        switchToFrame();
        sendTextToElement(usernameField, username);
        log.info("Entering Username into username field " + username.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering Password into password field " + password.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login Button on Login Page " + loginButton.toString());
    }

    public String getErrorMessageText() {
        log.info("Getting Error message text " + errorText.toString());
        return getTextFromElement(errorText);
    }

    public String getDepositText() {
        log.info("Getting Deposit text " + depositText.toString());
        return getTextFromElement(depositText);
    }

    public void clickOnMyAccountButton() {
        clickOnElement(myAccountButton);
        log.info("Click on MyAccount Button " + myAccountButton.toString());
    }

    public String getLogoutText() {
        log.info("Getting Logout text " + logoutButton.toString());
        return getTextFromElement(logoutButton);
    }

    public void clickOnLogoutButton() {
        clickOnElement(logoutButton);
        log.info("Click on logout Button Button " + logoutButton.toString());
    }

}