package webautomation.utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import static webautomation.utils.ConfigUtils.getPropertyByKey;
import static webautomation.utils.ConfigUtils.loadProperties;


public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("application.url"));
    }



    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
