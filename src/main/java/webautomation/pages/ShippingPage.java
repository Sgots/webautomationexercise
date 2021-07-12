package webautomation.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static webautomation.utils.AssertionUtils.assertPresent;
import static webautomation.utils.CommonUtils.clickOnElement;
import static webautomation.utils.DriverUtils.getDriver;

public class ShippingPage {
    public ShippingPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "iframe")
    private WebElement serviceTerms;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement checkBox;

    @FindBy(name = "processCarrier")
    private WebElement checkOutButton;

    public void verifyServiceTermsOnshippingPage(){
        assertPresent(serviceTerms);
    }

    public void clickOncheckBox(){
        clickOnElement(checkBox);
    }

    public void clickOnProceedToCheckOutbutton(){
        clickOnElement(checkOutButton);
    }


















}
