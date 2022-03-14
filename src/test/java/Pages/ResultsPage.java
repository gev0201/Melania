package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class ResultsPage {
    WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".price.bold.blue-text")
    List<WebElement> searchResults;

    public boolean checkPrice(String price) {
        boolean priceCheck = false;
        for (WebElement element : searchResults) {
            if (element.getText().contains(price)) {
                priceCheck = true;
                return priceCheck;
            }
        }
        return priceCheck;
    }

    public void isPriceCorrect(String price){
        Assert.assertTrue(checkPrice(price));

    }
}
