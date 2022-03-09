package Tests;

import BaseTest.SeleniumBase;
import Pages.AmazonHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstTest extends SeleniumBase{

    AmazonHomePage amazonHomePage;

    @Test
    public void test1(){
        amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.amazonSearch("mac book pro");
    }



}
