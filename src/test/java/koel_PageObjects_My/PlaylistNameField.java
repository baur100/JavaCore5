package koel_PageObjects_My;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlaylistNameField extends BasePage {
    public PlaylistNameField(WebDriver driver) {
        super(driver);
    }

    public void createPlaylist(String playlist_name) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@placeholder, 'to save')]")));
        WebElement playlistNameField = driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
        playlistNameField.click();
        playlistNameField.clear();
        playlistNameField.sendKeys(playlist_name);
        playlistNameField.sendKeys(Keys.ENTER);
        fluentWait.until(x -> x.findElement(By.xpath("//*[contains(span,'BestSong')]")));

    }
}
