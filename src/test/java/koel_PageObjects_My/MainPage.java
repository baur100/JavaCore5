package koel_PageObjects_My;

import org.openqa.selenium.*;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean plusButton() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath("//*[@id='playlists']/h1/i")));

        } catch (TimeoutException error) {
            return false;
        }
        return true;
    }


}
