package hannah.stepDefinitions;

import hannah.pages.QTSDataCenterPage;
import hannah.pages.QTSPage;
import hannah.utilities.ConfigReader;
import hannah.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class QTS_StepDef {
QTSPage qtsPage = new QTSPage();
QTSDataCenterPage qtsDataCenterPage = new QTSDataCenterPage();

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


    @When("user hovers over the data centers module")
    public void userHoversOverTheDataCentersModule() {
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(qtsPage.dataCenterModule).pause(2000).perform();

    }

    @Then("user can see all the following locations of the Data center")
    public void user_can_see_all_the_following_locations_of_the_data_center(List<String> expectedDataCenterLocations) {

       Assert.assertEquals(expectedDataCenterLocations, qtsDataCenterPage.getDataCenterLocation());
    }
}
