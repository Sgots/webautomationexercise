package webautomation.pages;

import static webautomation.utils.AssertionUtils.*;

import webautomation.utils.CommonUtils;
import webautomation.utils.ConfigUtils;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static webautomation.utils.AssertionUtils.assertEquals;
import static webautomation.utils.AssertionUtils.assertPresent;
import static webautomation.utils.CommonUtils.clickOnElement;
import static webautomation.utils.ConfigUtils.getPropertyByKey;
import static webautomation.utils.DriverUtils.getDriver;
import static webautomation.utils.WebElementUtils.createDynamicLocator;
import static webautomation.utils.WebElementUtils.waitForVisible;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement signInBtn;

    @FindBy(className = "account")
    private WebElement userNameText;

    @FindBy(xpath = "//*[@class='account']/span")
    private  WebElement registeredUserName;

    @FindBy(id = "header_logo")
    private  WebElement logoImage;

    public void verifyUserOnHomepage() {
        assertPageTitle(getPropertyByKey("homepage.title"));
    }

    public void navigateToLoginPage() {
        clickOnElement(signInBtn);
    }

    public void verifyUserNameAfterLogin() {
        assertEquals(userNameText, userNameText.getText(), getPropertyByKey("loggedin.user"));
    }

    public void verifyUserAfterRegistration(){
        String expectedText = System.getProperty("userdata.bean.firstName") + " " + System.getProperty("userdata.bean.lastName");
        assertEquals(registeredUserName, expectedText);
    }

    public void selectItemFromHOmePage(String itemName) {
        clickOnElement(logoImage);
        WebElement itemNameElement = createDynamicLocator("//*[contains(text(),'%s')]", itemName);
        clickOnElement(itemNameElement);
    }



}
