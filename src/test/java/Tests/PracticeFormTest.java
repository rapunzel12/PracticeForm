package Tests;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }

    @Test
    public void userCanSubmitFormWithOnlyMandatoryFields() throws InterruptedException {
        //homePage.clickOnElements();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='0.5'");
        // scrollOnElement(homePage.cards); // lista se ne moze konvertovati u jedan WebElement
        Thread.sleep(5000);
        homePage.clickOnCard("Forms"); // card-body is not clickable // oduvak je ova linija bila problem
        sidebarPage.clickOnSidebarButton("Practice Form");

        Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.body.style.zoom='0.5'");

        formPage.inputFirstName("Milica");
        formPage.inputLastName("Petrovic");
        formPage.clickOnGenderRadioButton("Female");
        // Thread.sleep(5000);
        //formPage.clickOnGender();
        formPage.inputMobile("789456123");



        // scrollOnElement(formPage.submitButton); // ne pomaze ni ovo
        formPage.clickOnSUmbitButton();

    }
}
