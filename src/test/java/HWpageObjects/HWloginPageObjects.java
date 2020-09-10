package HWpageObjects;

import PageObgects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HWloginPageObjects extends HWbasePageObjects {
    //CONSTRUCTOR
    public HWloginPageObjects(WebDriver myDriver) {
        super (myDriver);
    }

    private WebElement getEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
        return myDriver.findElement(By.xpath("//*[@type='email']"));
    }
    private WebElement getPassword(){
        return myDriver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return myDriver.findElement(By.tagName("button"));
    }

    public void open() {
        myDriver.get("https://koelapp.testpro.io");
    }

    public HWmainPageObjects logIn(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new HWmainPageObjects(myDriver);
    }
}
