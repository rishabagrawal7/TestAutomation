import PageFactory.DashboardPage;
import PageFactory.PaymentPage;
import PageFactory.PurchaseItem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ProductDetailsTest extends MainTest {

    static DashboardPage ds;
    static PurchaseItem ps;
    static PaymentPage pay;

    @Test
    public void selectProduct() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        actions = new Actions(driver);
        ds = new DashboardPage(driver);

        actions.moveToElement(ds.dressesBtn()).perform();
        ds.summerDresses().click();

        ds.listView().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        Assert.assertTrue(ds.inStockBtn().isEnabled());

        ds.quickViewBtn().click();
        Thread.sleep(5000);

        driver.switchTo().frame(ds.switchFrame());
        ds.changeColor().click();
        ds.facebookBtn().click();

        String parentWindow = driver.getWindowHandle();

        Set<String> fb = driver.getWindowHandles();
        Iterator<String> itr =  fb.iterator();

        while (itr.hasNext()){
            String string = itr.next();
            driver.switchTo().window(string);
        }

        Assert.assertEquals(driver.getTitle(),"Facebook");
        driver.switchTo().window(parentWindow);
        driver.switchTo().frame(ds.switchFrame());
    }

    @Test
    public void purchaseProduct(){

        ps = new PurchaseItem(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        ps.addBtn().click();
        ps.wishlistBtn().click();
        ps.closeBtn().click();
        ps.addToCartBtn().click();

        Assert.assertEquals(ds.verifyAmt().getText(),"$28.98");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]//div[4]/a")));
        ps.proceedToCheckoutBtn().click();

    }

    @Test
    public void paymentSection() {
        pay = new PaymentPage(driver);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        String productSelected = pay.productSelected().getText();
        Assert.assertEquals(productSelected,"Printed Summer Dress");

        String totalAmt = pay.totalAmt().getText();
        Assert.assertEquals(totalAmt,"$59.96");

        pay.checkoutBtn().click();

        String deliveryAdd = pay.deliveryAddress().getText();
        String billingAdd = pay.billingAddress().getText();

        Assert.assertEquals(deliveryAdd,billingAdd);

        pay.checkoutBtn1().click();
        pay.tncChkbox().click();
        pay.checkoutBtn2().click();

        String amtBeforePay = pay.amtBeforePay().getText();
        pay.payBtn().click();
        String amtAfterPay = pay.amtAfterPay().getText();

        Assert.assertEquals(amtBeforePay,amtAfterPay);

        pay.viewCustomerBtn().click();
        pay.wishlistsBtn().click();

        Assert.assertEquals(pay.verifyWishlist().getText(),"My wishlist");
    }
}

