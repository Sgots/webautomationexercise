package webautomation.pages;

import webautomation.data.UserDataBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static webautomation.utils.AssertionUtils.assertPresent;
import static webautomation.utils.CommonUtils.clickOnElement;
import static webautomation.utils.CommonUtils.sendKeysTo;
import static webautomation.utils.ConfigUtils.getPropertyByKey;
import static webautomation.utils.DriverUtils.getDriver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "email_create")
    private WebElement emailAddressBtn;
    @FindBy(id = "SubmitCreate")
    private WebElement createBtn;
    @FindBy(id = "login_form")
    private WebElement loginformPage;
    @FindBy(id = "email")
    private WebElement enterEmailAddress;
    @FindBy(id = "passwd")
    private WebElement Enterpassword;
    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;
    @FindBy(xpath = "//*[@class=\"alert alert-danger\"]//li[text()='Authentication failed.']")
    private WebElement authenticationErrorMessage;

    public void verifyUserIsOnLoginPage() {
        assertPresent(loginformPage);
    }

    public void login() {
        sendKeysTo(enterEmailAddress, getPropertyByKey("username"));
        sendKeysTo(Enterpassword, getPropertyByKey("password"));
        clickOnElement(signInBtn);
    }

    public void login(String userid, String password) {
        sendKeysTo(enterEmailAddress, userid);
        sendKeysTo(Enterpassword, password);
        clickOnElement(signInBtn);
    }

    public UserDataBean getRandomUserData() {
        UserDataBean userdatabean = new UserDataBean();
        userdatabean.generateRandomUserData();
        return userdatabean;
    }

    public void userLogsinwithInvalidCredentials() {
        assertPresent(authenticationErrorMessage);
    }

    public UserDataBean enterEmailFOrRegistration() {
        UserDataBean userdatabean = getRandomUserData();

        //Enter random Email Address on login page
        sendKeysTo(emailAddressBtn, userdatabean.getUserEmail());
        clickOnElement(createBtn);
        return userdatabean;
    }
}