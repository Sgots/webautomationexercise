package webautomation.pages;

import webautomation.data.UserDataBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.peer.SystemTrayPeer;
import java.util.List;

import static webautomation.utils.AssertionUtils.assertEquals;
import static webautomation.utils.AssertionUtils.assertPresent;
import static webautomation.utils.DriverUtils.getDriver;
import static webautomation.utils.WebElementUtils.waitForVisible;

public class OrderPage {
    LoginPage loginpage = new LoginPage();

    public OrderPage() {
        PageFactory.initElements(getDriver(), this);
    }

}

