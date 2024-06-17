package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> sidebarButton;

//    id =
//    name =
//    xpath =
//    css =
//    linkText =
    //_______________________________________________________


    public void clickOnSidebarButton(String buttonName){
        for(int i=0; i< sidebarButton.size(); i++){
            if(sidebarButton.get(i).getText().equals(buttonName)){
                sidebarButton.get(i).click();
                break;
            }
        }
    }

}
