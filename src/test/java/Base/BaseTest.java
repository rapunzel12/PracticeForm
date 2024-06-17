package Base;

import Pages.FormPage;
import Pages.HomePage;
import Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static WebDriver driver;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public FormPage formPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(); // ne prosledjujemo driver
        sidebarPage = new SidebarPage();
        formPage = new FormPage();
    }

    public void scrollOnElement(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
}
