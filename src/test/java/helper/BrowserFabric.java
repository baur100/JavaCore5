package helper;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFabric {
    public static WebDriver getDriver(BrowserType browserType) throws NoSuchMethodException {
        switch (browserType){

            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case EDGE:
                return getEdgeDriver();
            default:
                throw new NoSuchMethodException("Browser not exist");
        }
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        return new EdgeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        return new ChromeDriver(options);
    }
}
