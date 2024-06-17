package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormPage extends BaseTest {

    public FormPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "userEmail")
    public WebElement userEmailField;

    @FindBy(id = "userNumber")
    public WebElement userNumberField;

    @FindBy(name = "gender")
    public List<WebElement> gender;

    @FindBy(id = "submit")
    public WebElement submitButton;

//    @FindBy (name = "gender-radio-2")
//    public WebElement femaleGender;
    //-------------------------------------------

//    public void clickOnGender(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", femaleGender);
//    }

    public void clickOnGenderRadioButton(String genderName){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        switch (genderName){
            case "Male":
                js.executeScript("arguments[0].click();", gender.get(0));
                break;
            case "Female":
                js.executeScript("arguments[0].click();", gender.get(1));
                break;
            case "Other":
                js.executeScript("arguments[0].click();", gender.get(2));
                break;

            default:
                System.out.println("Wrong gender input");
        }
    }

    public void inputFirstName(String firstName){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void inputMobile(String mobileNumber){
        userNumberField.clear();
        userNumberField.sendKeys(mobileNumber);
    }

    public void clickOnSUmbitButton(){
       //  scrollOnElement(submitButton); // visak jer smo u test stavili scroll on elements
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
        submitButton.click();
    }
}
