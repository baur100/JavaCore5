package helper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GetScreenShot {
    public static void capture(WebDriver driver, String filename){
        try{
            TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
            File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("./screenshots/"+filename+".png"));
        } catch (IOException exception){
            System.out.println("File write error " +exception.getMessage());
        }
    }
}
