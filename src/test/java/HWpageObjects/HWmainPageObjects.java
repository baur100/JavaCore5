package HWpageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

public class HWmainPageObjects extends HWbasePageObjects {
    private String nameList;

    public HWmainPageObjects(WebDriver myDriver) {
        super(myDriver);
    }

    private WebElement getPlusButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'create')]")));
        return myDriver.findElement(By.xpath("//i[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getNameField() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='↵ to save']")));
        return myDriver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }

    private WebElement getMyList() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text()," + nameList + ")]")));
        return myDriver.findElement(By.xpath("//a[contains(text(),"+nameList+")]"));
    }

    private WebElement getFieldMyList() {
        return myDriver.findElement(By.xpath("//a[@class='active']"));
    }

    public void clickPlusButton() {
        WebElement plusButton = getPlusButton();
        Actions action = new Actions(myDriver);
        action.moveToElement(plusButton).perform();
        getPlusButton().click();
    }

    public void createList(String nameList) {
        getNameField().clear();
        getNameField().sendKeys(nameList);
        getNameField().sendKeys(Keys.ENTER);
    }

    public String renameList(String newNameList) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text()," + nameList + ")]")));
        Actions action = new Actions(myDriver);
        ((JavascriptExecutor) myDriver).executeScript("arguments[0].scrollIntoView();", getMyList());
        action.doubleClick(getFieldMyList()).keyDown(Keys.CONTROL).sendKeys("a")
                .keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).sendKeys(newNameList)
                .sendKeys(Keys.ENTER).build().perform();
        return myDriver.getCurrentUrl().split("/")[5];

    }

    public boolean isListRenamed(String playListId) {
        List<WebElement> list = myDriver.findElements(By.xpath("//a[@href='#!/playlist/" + playListId + "']"));
        return list.size() > 0;
    }




    //    public boolean listIsCreated() {
//        try {
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text()," + nameList + ")]")));
//            //   return true;
//        } catch (NoSuchElementException error) {
//            return false;
//        }
//        return true;
//    }
}


