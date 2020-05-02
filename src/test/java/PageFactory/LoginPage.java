package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"email\"] ")
    WebElement emailId;

    @FindBy(name = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement signIn;

    public WebElement emailId(){
        return emailId;
    }

    public WebElement password(){
        return password;
    }

    public WebElement signIn(){
        return signIn;
    }

}
