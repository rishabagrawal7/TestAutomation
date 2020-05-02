package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseItem {

    WebDriver driver;
    public PurchaseItem(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]")
    WebElement addBtn;

    @FindBy(id = "wishlist_button")
    WebElement wishlistBtn;

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/a")
    WebElement closeBtn;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]//div[4]/a")
    WebElement proceedToCheckoutBtn;

    public WebElement addBtn(){
        return addBtn;
    }

    public WebElement wishlistBtn(){
        return wishlistBtn;
    }

    public WebElement closeBtn(){
        return closeBtn;
    }

    public WebElement addToCartBtn(){
        return addToCartBtn;
    }

    public WebElement proceedToCheckoutBtn(){
        return proceedToCheckoutBtn;
    }
}
