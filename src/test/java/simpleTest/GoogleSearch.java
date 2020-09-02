package simpleTest;

import org.testng.annotations.Test;

import java.security.KeyStore;

public class GoogleSearch {


    @Test
    public void searchJavaInGoogle_Result() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new Chromedriver();


        driver.get("http://wwww.google.com");

        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);





        try{
            Thread.sleep( 5000);
        }catch(interruptedException ignored){
            driver.close();
        }


//        Thread.sleep(5000);
//        driver.close();



    }



}
