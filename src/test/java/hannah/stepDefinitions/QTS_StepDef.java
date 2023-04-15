package hannah.stepDefinitions;

import hannah.pages.QTSPage;
import hannah.utilities.ConfigReader;
import hannah.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QTS_StepDef {
QTSPage qtsPage = new QTSPage();
    @Given("user at the QTS home page")
    public void user_at_the_qts_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qts"));
    }
    @When("user click to cancel the message dialog")
    public void user_click_to_cancel_the_message_dialog() {
        Driver.getDriver().switchTo().frame(qtsPage.frame);
     qtsPage.messageButton.click();

        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user click on the data centers module")
    public void user_click_on_the_module() {
     qtsPage.dataCenterModule.click();
    }
    @Then("user will see new page with title contains {string}")
    public void user_will_see_new_page_with_title_contains(String partialTitle) {
      String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains(partialTitle));

    }



}
