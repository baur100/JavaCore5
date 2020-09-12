package HWnewListTest;

import HWpageObjects.HWloginPageObjects;
import HWpageObjects.HWmainPageObjects;
import Helper.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class renamePlayList {
    private WebDriver myDriver;


    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        myDriver = new ChromeDriver();
    }

    @AfterMethod
    public void teatDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myDriver.quit();
    }

    @Test
    public void renamePlayList() {

        HWloginPageObjects loginPage = new HWloginPageObjects(myDriver);
        loginPage.open();
        HWmainPageObjects mainPage = loginPage.logIn("koeluser05@testpro.io", "te$t$tudent");

        mainPage.clickPlusButton();
        String namelist = TestDataGenerator.randomString(8);
        mainPage.createList(namelist);
        // Assert.assertTrue(mainPage.listIsCreated());

        String newNamelist = TestDataGenerator.randomString(8);
        String playListId=mainPage.renameList(newNamelist);
        //ASSERT RENAME LIST
        Assert.assertTrue(mainPage.isListRenamed(playListId));
    }

}

