package SimpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VkTest {
        @Test
        public void vkSearch(){
            //Arrange
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");

            WebDriver driver=new ChromeDriver();
            driver.get("https://www.vkontakte.com");

            //Act

            WebElement searchField=driver.findElement(By.xpath("//*[@id='ts_input']"));
            searchField.sendKeys("Anna Fomina");
            searchField.sendKeys(Keys.ENTER);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement searchField1=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
            searchField1.click();
            WebElement searchField2=driver.findElement(By.xpath("//*[@title='Russia']"));
            searchField2.click();

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
