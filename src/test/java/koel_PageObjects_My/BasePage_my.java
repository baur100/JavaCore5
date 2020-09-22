package koel_PageObjects_My;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage_my {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;
    protected WebDriverWait wait;

    public BasePage_my(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(5));
        fluentWait.pollingEvery(Duration.ofMillis(5));
        fluentWait.ignoring(ElementClickInterceptedException.class);
        fluentWait.ignoring(ElementNotVisibleException.class);
        fluentWait.ignoring(NoSuchElementException.class);
        fluentWait.ignoring(NoSuchWindowException.class);
        fluentWait.ignoring(TimeoutException.class);


        wait = new WebDriverWait (driver, 5);
    }
}
