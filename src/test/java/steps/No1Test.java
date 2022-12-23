package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import setups.Capabilities;

public class No1Test extends Capabilities {
    @Before({"@User"})
    public void setup()throws Exception{
        preparation();
    }
    @Given("^Sauce Lab Back Packs is in the Products screen$")
    public void findProduct() {
        androidDriver.findElementByAccessibilityId("Sauce Lab Back Packs");
    }
    @When("^User click Sauce Lab Back Packs product$")
    public void selectProduct() {
        androidDriver.findElementByAccessibilityId("Sauce Lab Back Packs").click();
    }
    @And("^User click add quantity item to 2$")
    public void addQuantity() {
        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Add to cart\").instance(0))");
        androidDriver.findElementByAccessibilityId("Increase item quantity").click();
    }
    @And("^User click select the blue color$")
    public void selectColor() {
        androidDriver.findElementByAccessibilityId("Blue color").click();
    }
    @And("^User click add to cart button$")
    public void addToCart() {
        androidDriver.findElementByAccessibilityId("Tap to add product to cart").click();
    }
    @And("^User click cart$")
    public void selectCart() {
        androidDriver.findElementByAccessibilityId("Displays number of items in your cart").click();
    }
    @And("^User click Proceed to checkout button$")
    public void checkoutProduct() {
        androidDriver.findElementByAccessibilityId("Confirms products for checkout").click();
    }
    @Then("^User is on login page$")
    public void login() {
        androidDriver.findElementByAccessibilityId("Tap to login with given credentials");
    }

    @After({"@User"})
    public void stop(){
        stopServer();
    }
}