package diceJobSearch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class JobSearch {
@Test
    public void search() throws InterruptedException {
    //open Dice
    System.setProperty("webdriver.chrome.driver","chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.dice.com");
    Thread.sleep(5000);


    WebElement loginRegister = driver.findElement(By.id("navbarDropdown-11"));
    loginRegister.click();

    WebElement login = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li[3]/div/a[1]"));
    login.click();
    Thread.sleep(5000);

    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("password"));
    WebElement signIn = driver.findElement(By.xpath("//*[@id=\"loginDataSubmit\"]/div[3]/div/button"));

    email.sendKeys("shamasovaiaz@gmail.com");
    password.sendKeys("");
    signIn.click();
    Thread.sleep(5000);

    WebElement searchTerm = driver.findElement(By.xpath("//*[@id=\"searchInput-div\"]/form/div/div[1]/div/dhi-new-typeahead-input/div/input"));
    WebElement searchJobs = driver.findElement(By.xpath("//*[@id=\"searchInput-div\"]/form/div/div[3]"));
    searchTerm.sendKeys("QA Engineer");
    searchJobs.click();
    Thread.sleep(5000);

    WebElement easyApply = driver.findElement(By.xpath("//*[@id=\"facets\"]/dhi-accordion[6]/div[2]/div/js-single-select-filter/div/div/span"));
    easyApply.click();
    Thread.sleep(3000);

    WebElement qaJob = driver.findElement(By.xpath("/html/body/dhi-js-dice-client/div/dhi-search-page-container/dhi-search-page/div/dhi-search-page-results/div/div[3]/js-search-display/div/div[2]/dhi-search-cards-widget/div/dhi-search-card[5]/div/div[1]/div/div[2]/div[1]/h5/a"));
    qaJob.click();

}

}
