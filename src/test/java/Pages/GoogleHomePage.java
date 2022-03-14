package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name = 'q']")
    WebElement googleSearchField;

    @FindBy(css = "[name = 'btnK']")
    WebElement googleSearchButton;

    @FindBy(css = "a[href='https://auto.am/']")
    WebElement autoAmLink;

    public void searchGoogle(String searchText){
        googleSearchField.clear();
        googleSearchField.sendKeys(searchText);
        googleSearchButton.click();
    }

    public void autoAmClick(){
        autoAmLink.click();
    }


}
