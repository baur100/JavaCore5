package koel_Helpers_my;

import enums_my.BrowserType_my;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.awt.*;


public class BrowserFabric_my {
    public static WebDriver getDriver(BrowserType_my browserTypeMy) throws NoSuchMethodException {
        switch (browserTypeMy) {

            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case EDGE:
                return getEdgeDriver();
            case OPERA:
                return getOperaDriver();

            default:
                throw new NoSuchMethodException("Browser not exist");
        }
    }


    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.opera.driver", "operadriver");
        OperaOptions options = new OperaOptions();
        options.addArguments("headless");
        return new OperaDriver();
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver", "msedgedriver");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        return new EdgeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1000");
        options.addArguments("--height=600");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        return new ChromeDriver(options);
    }
}
