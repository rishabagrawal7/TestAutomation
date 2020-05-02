package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    WebDriver driver;
    public PaymentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@title=\"Proceed to checkout\"])[2]")
    WebElement checkoutBtn;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    WebElement tncChkbox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    WebElement checkoutBtn1;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    WebElement checkoutBtn2;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]//p/a[@title=\"Pay by bank wire\"]")
    WebElement payBtn;

    @FindBy(xpath = "//*[@title=\"View my customer account\"]")
    WebElement viewCustomerBtn;

    @FindBy(xpath = "//*[@title=\"My wishlists\"]")
    WebElement wishlistsBtn;

    @FindBy(xpath = "//*[contains(@id,\"wishlist\")]/td[1]/a")
    WebElement verifyWishlist;

    @FindBy(xpath = "//*[@id=\"total_price\"]")
    WebElement amtBeforePay;

    @FindBy(xpath = " //*[@id=\"amount\"]")
    WebElement amtAfterPay;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    WebElement deliveryAddress;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]/li[4]")
    WebElement billingAddress;

    @FindBy(xpath = "//*[contains(@id,product)]/td[2]/p/a")
    WebElement productSelected;

    @FindBy(xpath = "//*[@id=\"total_price\"]")
    WebElement totalAmt;

    public WebElement checkoutBtn(){
        return checkoutBtn;
    }

    public WebElement tncChkbox(){
        return tncChkbox;
    }

    public WebElement checkoutBtn1(){
        return checkoutBtn1;
    }

    public WebElement checkoutBtn2(){
        return checkoutBtn2;
    }

    public WebElement payBtn(){
        return payBtn;
    }

    public WebElement viewCustomerBtn(){
        return viewCustomerBtn;
    }

    public WebElement wishlistsBtn(){
        return wishlistsBtn;
    }

    public WebElement verifyWishlist(){
        return verifyWishlist;
    }

    public WebElement amtBeforePay(){
        return amtBeforePay;
    }

    public WebElement amtAfterPay(){
        return amtAfterPay;
    }

    public WebElement deliveryAddress(){ return deliveryAddress;}

    public WebElement billingAddress(){ return billingAddress;}

    public WebElement productSelected(){
        return productSelected;
    }

    public WebElement totalAmt(){
        return totalAmt;
    }
}

