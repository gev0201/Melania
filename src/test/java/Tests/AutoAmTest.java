package Tests;

import BaseTest.SeleniumBase;
import Pages.AutoAmPage;
import Pages.GoogleHomePage;
import Pages.ResultsPage;
import org.testng.annotations.Test;

public class AutoAmTest extends SeleniumBase {
    GoogleHomePage googleHomePage;
    AutoAmPage autoAmPage;
    ResultsPage resultsPage;

    @Test
    public void teslaTest() throws InterruptedException {
        googleHomePage = new GoogleHomePage(driver);
        autoAmPage = new AutoAmPage(driver);
        resultsPage = new ResultsPage(driver);
        driver.get("https://www.google.com/");
        googleHomePage.searchGoogle("Auto.am");
        googleHomePage.autoAmClick();
        autoAmPage.selectMark("Tesla");
        autoAmPage.selectModel("Model Y");
        autoAmPage.selectYear("2018");
        autoAmPage.customCheck("Մաքսազերծված");
        autoAmPage.searchButton();
        resultsPage.isPriceCorrect("$ 67 000");
    }
}
