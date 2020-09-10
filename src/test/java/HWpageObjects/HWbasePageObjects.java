package HWpageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HWbasePageObjects {
    protected WebDriver myDriver;
    protected WebDriverWait wait;
    protected FluentWait<WebDriver> fluentWait;

    //CONSTRUCTOR
    public HWbasePageObjects (WebDriver myDriver) {
        this.myDriver=myDriver;
        wait = new WebDriverWait(myDriver, 10);
//        fluentWait=new FluentWait<WebDriver>(driver)
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(NoSuchElementException.class)
//                .pollingEvery(Duration.ofMillis(100))
//                .withTimeout(Duration.ofSeconds(10));

    }
}

