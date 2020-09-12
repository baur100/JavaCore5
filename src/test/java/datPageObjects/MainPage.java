package datPageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.BasePage;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa-plus-circle")));
        return driver.findElement(By.cssSelector(".fa-plus-circle"));
    }
    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[contains(@placeholder,'to save')]"));
    }

    public String createPlaylist(String name){
        getPlusButton().click();
        getNewPlaylistField().sendKeys(name);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='success show']")));

        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId){
        List<WebElement> list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        return list.size() > 0;
    }

    public boolean isLogoutButton(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public void renamePlaylist(String playlistId, String newName) {
       // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",isPlaylistExist())
    }
}
