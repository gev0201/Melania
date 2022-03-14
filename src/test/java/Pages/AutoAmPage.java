package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutoAmPage {
    WebDriver driver;

    public AutoAmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id='filter-make']")
    WebElement teslaMark;

    @FindBy(css = "[id='v-model']")
    WebElement teslaModel;

    @FindBy(css = "[name='year[gt]']")
    WebElement teslaYear;

    @FindBy(css = ".switch.bold")
    List<WebElement> customCleared;

    @FindBy(css = "[id='search-btn']")
    WebElement teslaSearchButton;


    public void selectDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectMark(String mark){
        selectDropDown(teslaMark, mark);
    }

    public void selectModel(String model) {
        selectDropDown(teslaModel, model);
    }

    public void selectYear(String year) {
        selectDropDown(teslaYear, year);
    }

    public void customCheck(String opt) {
        for (WebElement elem:customCleared) {
            if(elem.getText().contains(opt)){
                elem.click();
            }

        }



//        if(!customCleared.isSelected()){
//            customCleared.click();
//        }
    }

    public void searchButton(){
        teslaSearchButton.click();
    }
}
