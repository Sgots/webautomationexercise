package webautomation.utils;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import static webautomation.utils.DriverUtils.getDriver;
import static webautomation.utils.WebElementUtils.waitForVisible;

public class CommonUtils {
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void clickOnElement(WebElement element) {
        waitForVisible(element);
        element.click();
    }

    public static void sendKeysTo(WebElement element, String text){
        waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }
}
