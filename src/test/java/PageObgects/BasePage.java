package PageObgects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected FluentWait<WebDriver> fluentWait;

    //CONSTRUCTOR
    public BasePage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 10);
//        fluentWait=new FluentWait<WebDriver>(driver)
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(NoSuchElementException.class)
//                .pollingEvery(Duration.ofMillis(100))
//                .withTimeout(Duration.ofSeconds(10));

    }
}
