package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchFieldId;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    public void amazonSearch(String searchText){
        searchFieldId.sendKeys(searchText);
        searchButton.click();
    }

}
