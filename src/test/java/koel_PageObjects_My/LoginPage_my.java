package koel_PageObjects_My;

import org.openqa.selenium.*;

public class LoginPage_my extends BasePage_my {

    public LoginPage_my(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmail() {
        fluentWait.until(x -> x.findElement(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }

    private WebElement getPassword() {
        return driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getLogInButton() {
        return driver.findElement(By.cssSelector("[type='submit']"));
    }

    public void open() {
        driver.get("https://koelapp.testpro.io/");
    }

    public MainPage_my logIn(String email, String passwort) throws InterruptedException {
        getEmail().sendKeys(email);
        getPassword().sendKeys(passwort);
        getLogInButton().click();
        return new MainPage_my(driver);

    }
}
