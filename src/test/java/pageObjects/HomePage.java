package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fa.fa-plus-circle")));
//        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create creating']")));
        return driver.findElement(By.cssSelector(".fa.fa-plus-circle"));
    }
    public void createNewPlaylist() {
        getPlusButton().click();
        getnewplaylistnamefield().sendKeys("Denis");
        getnewplaylistnamefield().sendKeys(Keys.ENTER);
    }

    private WebElement getnewplaylistnamefield() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='create']/*")));
        return driver.findElement(By.xpath("//*[@class='create']/*"));
    }
    private String getPlaylistnameXpath(String name) {
        return "//a[text()='" + name + "']";
    }
    public boolean isplaylistcreated(String name) {
        var list = driver.findElements(By.xpath(getPlaylistnameXpath(name)));
        return list.size() > 0;
    }
}
