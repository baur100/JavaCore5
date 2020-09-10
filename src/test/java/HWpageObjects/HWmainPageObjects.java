package HWpageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.NoSuchElementException;

public class HWmainPageObjects extends HWbasePageObjects {

    public HWmainPageObjects (WebDriver myDriver) {
        super(myDriver);
    }
    public WebElement plusButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'create')]")));
        return myDriver.findElement(By.xpath("//i[@class='fa fa-plus-circle control create']"));
    }
    public WebElement nameField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='↵ to save']")));
        return myDriver.findElement(By.xpath("//*[@placeholder='↵ to save']"));
    }
    public void clickPlusButton(){
        WebElement plusButton= plusButton();
        Actions action= new Actions(myDriver);
        action.moveToElement(plusButton).perform();
        plusButton().click();
    }
    public void createList(String nameList){
        nameField().clear();
        nameField().sendKeys(nameList);
        nameField().sendKeys(Keys.ENTER);
    }

    public boolean listIsCreated() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AF LIST')]")));
            //   return true;
        } catch (NoSuchElementException error) {
            return false;
        }
        return true;
    }
}

