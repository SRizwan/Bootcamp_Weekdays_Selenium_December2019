package Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageClass {


    @FindBy(xpath = "//span[@class='context-menu-one btn btn-neutral']")
    WebElement rightButton;

    @FindBy(xpath = "//button[contains(text(),'Double-Click Me To See Alert')]")
    WebElement doubleClick;




    public void rightClick(){
        rightButton.click();
    }

    public void doubleClick(){
        doubleClick.click();
        }


}







