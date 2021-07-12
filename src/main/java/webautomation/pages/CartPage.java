package webautomation.pages;

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
import static org.junit.Assert.assertTrue;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "icon-ok")
    private  WebElement productSuccessfullyadded;

    @FindBy(id = "layer_cart")
    private WebElement productConfiramationOverlay;

    @FindBy(id = "layer_cart_product_title")
    private WebElement productNameOnCart;

    @FindBy(xpath = "//span[@class='product-name']")
    private WebElement addedproductTocart;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private  WebElement proceedBtn;

    public void verifyAddedProductToCartPage(String productName) {
        waitForVisible(productConfiramationOverlay);
       assertEquals(productNameOnCart, productName);
    }
    public void clickOnProceedToCheckoutbutton(){
        clickOnElement(proceedBtn);
    }
}
