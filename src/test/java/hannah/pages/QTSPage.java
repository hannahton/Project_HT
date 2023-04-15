package hannah.pages;

import hannah.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QTSPage {
    public QTSPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        }

    @FindBy(xpath = "//button[@class='drift-widget-naked-button drift-widget-message-close-button drift-widget-close-button--align-right']")
        public WebElement messageButton;
    @FindBy(xpath = "(//a[@href='/data-centers'])[1]")
    public WebElement dataCenterModule;

@FindBy(xpath = "(//div[text()='United States'])[1]")
    public WebElement uniteState;

@FindBy(xpath = "//div[@class='dropdown-subcategory-label']")
public List<WebElement> listOfDataCenter;

    }

