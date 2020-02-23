package testHome;

import Home.HomePageClass;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testHomePageClass extends WebAPI {

    static HomePageClass hp;

    public void getInitElements(){
        hp= PageFactory.initElements(driver, HomePageClass.class);
    }



   @Test
    public void actionRightClick() {
       getInitElements();
       Actions actions = new Actions(driver);
       hp.rightClick();
       actions.doubleClick().perform();
       actions.contextClick().sendKeys(Keys.ARROW_DOWN).build().perform();
   }









}
