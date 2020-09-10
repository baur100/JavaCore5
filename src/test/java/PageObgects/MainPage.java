package PageObgects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }
        public boolean isLogOutButton(){
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
                //   return true;
            } catch (NoSuchElementException error) {
                return false;
            }
            return true;
        }
    }