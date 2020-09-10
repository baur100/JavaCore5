package koel_PageObjects_My;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(NoSuchWindowException.class)
                .ignoring(TimeoutException.class);

        wait = new WebDriverWait(driver, 20);
    }
}
