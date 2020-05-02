import PageFactory.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class MainTest {
    static WebDriver driver;
    static Actions actions;

    @BeforeTest
    public void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RISHAB\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@class=\"login\"]")).click();

        LoginPage login = new LoginPage(driver);

        login.emailId().sendKeys("rishabagrawal7@gmail.com");
        login.password().sendKeys("12345");
        login.signIn().click();
    }

    @AfterTest
    public void closeBrowser() {
            driver.quit();
        }

}