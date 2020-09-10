package koel_PageObjects_My;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlusButton extends BasePage {
    public PlusButton(WebDriver driver) {
        super(driver);
    }

    public void clickOn() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlists']/h1/i")));
        WebElement plusButton = driver.findElement(By.xpath("//*[@id='playlists']/h1/i"));
        plusButton.click();
        fluentWait.until(x -> x.findElement(By.cssSelector("[class='create']")));

    }
}
