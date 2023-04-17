package hannah.pages;

import hannah.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class QTSDataCenterPage extends QTSPage{
    public QTSDataCenterPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='dropdown-subcategory-label']")
    public List<WebElement> listOfDataCenter ;

    @FindBy(xpath = "(//iframe[@aria-hidden='true'])[1]")
    public WebElement mapIframe;

    @FindBy(xpath = "//button[@title='Zoom in']")
    public WebElement zoomInButton;

    @FindBy(xpath = "//button[@title='Zoom out']")
    public WebElement zoomOutButton;

    @FindBy(xpath = "//button[@title='Toggle fullscreen view']")
    public WebElement fullScreenButton;

    public List<String> getDataCenterLocation(){
        List<String> dataCenterLocations = new ArrayList<>();
        for (int i = 0; i<listOfDataCenter.size(); i++){
            dataCenterLocations.add(listOfDataCenter.get(i).getText());
        }
        return dataCenterLocations;
    }



}
