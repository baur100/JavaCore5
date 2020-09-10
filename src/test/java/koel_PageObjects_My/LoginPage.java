package koel_PageObjects_My;

import org.openqa.selenium.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
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

    public MainPage logIn(String email, String passwort) throws InterruptedException {
        getEmail().sendKeys(email);
        getPassword().sendKeys(passwort);
        getLogInButton().click();
        return new MainPage(driver);

    }
}
