package hannah.stepDefinitions;

import hannah.pages.GoogleSearchPage;
import hannah.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDef {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user at the Google search page")
    public void user_at_the_google_search_page() {
      Driver.getDriver().get("https://www.google.com");
    }
    @When("user enter {string} at the search box and enter")
    public void user_enter_at_the_search_box_and_enter(String searchKeyWord) {
    googleSearchPage.searchBox.sendKeys(searchKeyWord + Keys.ENTER);

    }
    @Then("user will see {string} is in google title.")
    public void user_will_see_is_in_google_title(String ExpectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("the ", ExpectedTitle,actualTitle );

    }


}
