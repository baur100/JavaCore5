package koel_PageObjects_My;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

//    public void clickOn() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlists']/h1/i")));
//        WebElement plusButton = driver.findElement(By.xpath("//*[@id='playlists']/h1/i"));
//        Actions action = new Actions(driver);
//        action.moveToElement(plusButton).perform();
//        plusButton.click();
//        fluentWait.until(x -> x.findElement(By.cssSelector("[class='create']")));
//    }
//
//    public void createPlaylist(String playlist_name) throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@placeholder, 'to save')]")));
//        WebElement playlistNameField = driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
//        playlistNameField.click();
//        playlistNameField.sendKeys(playlist_name);
//        playlistNameField.sendKeys(Keys.ENTER);
//        fluentWait.until(x -> x.findElement(By.xpath("//*[contains(span,'BestSongs')]")));
//
//    }

    public boolean plusButton () {
        try {
            fluentWait.until(x -> x.findElement(By.xpath("//*[@id='playlists']/h1/i")));

        } catch (TimeoutException error) {
            return false;
        }
        return true;
    }

}