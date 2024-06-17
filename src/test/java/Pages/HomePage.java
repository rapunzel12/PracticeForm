package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {
    // ovo je konstruktor
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    // ovo je lokator, ovako trazimo elemente
    @FindBy(className = "card-body")
    public List<WebElement> cards;
    //public WebElement elements;

    //--------------------------------------------------
//    public void clickOnElements(){
//       // elements.click();
//        for(int i=0; i< cards.size(); i++){
//            if(cards.get(i).getText().equals("Elements")){
//                cards.get(i).click();
//            }
//        }
//    }

    //ova metoda vazi za bilo koju karticu
    public void clickOnCard(String cardName){
        // scrollOnElement(cards);
        for(int i=0; i< cards.size(); i++){
            if(cards.get(i).getText().equals(cardName)){
                cards.get(i).click();
                break;
            }
        }
    }
}
