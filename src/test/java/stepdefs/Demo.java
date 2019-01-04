package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.util.concurrent.TimeUnit;
public class Demo {
    @Given("^I launch the app$")
    public void i_launch_the_app() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driverStart();

    }

    @Then("^I tap on identifier with id \"([^\"]*)\"$")
    public void iTapOnIdentifierWithId(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById(arg0).click();


    }

    @Then("^text \"([^\"]*)\" is entered in the identifier with id \"([^\"]*)\"$")
    public void textIsEnteredInTheIdentifierWithId(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById(arg1).sendKeys(arg0);
    }

    @And("^I hide the keyboard$")
    public void iHideTheKeyboard() {
        Main.driver.hideKeyboard();
    }

    @Then("^identifier with id \"([^\"]*)\" is asserted$")
    public void identifierWithIdIsAsserted(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById(arg0);
    }

    @And("^value should match \"([^\"]*)\" for the identifier with id \"([^\"]*)\"$")
    public void valueShouldMatchForTheIdentifierWithId(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String Valueoftheelement = Main.driver.findElementById(arg1).getText();
        System.out.println(Valueoftheelement);
        Valueoftheelement.contentEquals(arg0);
    }
    @Then("^verify keyboard is hidden$")
    public void verifyheyboardishidden() {
        System.out.println(Main.driver.isKeyboardShown());
    }
    @Then("^I shut down the server$")
    public void ishutdowntheserver() {
        Main.driver.close();
    }

    @And("^I scroll to identifier with text \"([^\"]*)\"$")
    public void iScrollToIdentifierWithId(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+arg0+"\").instance(0))");
    }

    @Then("^BT app is pointed to the server \"([^\"]*)\"$")
    public void btAppIsPointedToTheServer(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById("TextInput-MobileServiceWebAddress").clear();
        Main.driver.findElementById("TextInput-MobileServiceWebAddress").sendKeys("");
        Main.driver.findElementById("TextInput-MobileServiceWebAddress").sendKeys(arg0);
    }

    @Then("^I verify if SignIn button is disabled$")
    public void iVerifyIfSignInButtonIsDisabled() {
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById("Button-disabled-primary");
    }

    @And("^I verify if SignIn button is enabled$")
    public void iVerifyIfSignInButtonIsEnabled() {
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById("Button-enabled-primary");
    }

    @Then("^I assert for the element with id \"([^\"]*)\"$")
    public void iAssertForTheElementWithId(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById(arg0);
    }

    @Then("^element with id \"([^\"]*)\" is clicked$")
    public void elementWithIdIsClicked(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Main.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Main.driver.findElementById(arg0).click();
    }

    @And("^the BTApp is closed$")
    public void theBTAppIsClosed() {
        Main.driver.quit();
    }

    @And("I click on done button")
    public void iClickOnDoneButton() {
        ((AndroidDriver) Main.driver).pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
    }
}

