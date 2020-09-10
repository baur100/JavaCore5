package PageObgects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    //CONSTRUCTOR
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
        return driver.findElement(By.xpath("//*[@type='email']"));
    }
    private WebElement getPassword(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    public void open() {
        driver.get("https://koelapp.testpro.io");
    }

    public MainPage logIn(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
}
