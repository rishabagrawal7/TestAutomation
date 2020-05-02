package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dressesBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    WebElement summerDresses;

    @FindBy(xpath = "//a[@title=\"List\"]")
    WebElement listView;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[1]/div/a[2]")
    WebElement quickViewBtn;

    @FindBy(xpath = "//*[@name='Blue']")
    WebElement changeColor;

    @FindBy(tagName = "iframe")
    WebElement switchFrame;

    @FindBy(xpath = "//*[@id=\"product\"]//button[2]")
    WebElement facebookBtn;

    @FindBy(xpath = "//*[@class='our_price_display']")
    WebElement verifyAmt;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div/div[2]/span/span/link")
    WebElement inStockBtn;

    public WebElement dressesBtn(){
        return dressesBtn;
    }

    public WebElement summerDresses(){
        return summerDresses;
    }

    public WebElement listView(){
        return listView;
    }

    public WebElement quickViewBtn(){
        return quickViewBtn;
    }

    public WebElement changeColor(){
        return changeColor;
    }

    public WebElement switchFrame(){
        return switchFrame;
    }

    public WebElement facebookBtn(){
        return facebookBtn;
    }

    public WebElement verifyAmt(){
        return verifyAmt;
    }

    public WebElement inStockBtn(){
        return inStockBtn;
    }
}


