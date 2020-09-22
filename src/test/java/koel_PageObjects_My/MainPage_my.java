package koel_PageObjects_My;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainPage_my extends BasePage_my {

    public MainPage_my(WebDriver driver) {
        super(driver);
    }


    private WebElement getPlusButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa-plus-circle")));
        WebElement button = driver.findElement((By.cssSelector(".fa-plus-circle")));
        Actions action1 = new Actions(driver);
        action1.moveToElement(button).perform();
        return button;
    }

    private WebElement getNewPlaylistField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@placeholder, 'to save')]")));
        return driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }

    public String createPlaylist(String name) {
        getPlusButton().click();
        getNewPlaylistField().sendKeys(name);
        getNewPlaylistField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }
// With custom wait:

//    public String createPlaylist(String name) {
//    *********************************************************
//        for(int i=0; i<20; i++){
//            try{
//                getPlusButton().click();
//                break;
//            } catch (ElementClickInterceptedException ignored){
//
//            }
//        }
//        *********************************************************
//        getNewPlaylistField().sendKeys(name);
//        getNewPlaylistField().sendKeys(Keys.ENTER);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
//        return driver.getCurrentUrl().split("/")[5];
//    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='playlist playlist editing']/*[last()]")));
        WebElement inputField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/*[last()]"));
        actions.doubleClick(inputField).perform();
        inputField.sendKeys(newName);
        inputField.sendKeys(Keys.ENTER);
    }

    public boolean isPlaylistExist1(String playlistId, String newName) {
        List<WebElement> list = driver.findElements(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return list.size() > 0 && list.get(0).getText().equals(newName);
    }

    public boolean isPlaylistExist(String playlistId) {
        List<WebElement> list = driver.findElements(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
        return list.size() > 0;
    }

//    public boolean isPlaylistExist1(String playlistId, String newName){
//        WebElement element = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistId + "']"));
//        Actions actions = new Actions(driver);
//        actions.doubleClick(element).perform();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='playlist playlist editing']/a")));
//        WebElement field = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/a"));
//        field.getText().contains(newName);
//        return isPlaylistExist1(playlistId,newName);
//    }

    public boolean plusButton() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath("//*[@id='playlists']/h1/i")));

        } catch (TimeoutException error) {
            return false;
        }
        return true;
    }
}