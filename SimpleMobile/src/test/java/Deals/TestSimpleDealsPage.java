package Deals;

import common.WebAPI;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSimpleDealsPage extends WebAPI {


    @Test
    public void testAddDealsToCart() throws InterruptedException {
        SimpleDealsPage dp= PageFactory.initElements(driver, SimpleDealsPage.class);
        dp.navigateToDeals();
        Thread.sleep(5000);
        dp.lg();
        dp.lgBtn();
        dp.addToCart();
        dp.zipCode();
        dp.cont();
}

   @Test
    public void launchLiveChat(){
        SimpleDealsPage dp=PageFactory.initElements(driver, SimpleDealsPage.class);
        dp.navigateToDeals();
        dp.launchChat();
    }


    @Test
    public void testMouseHoverOnA10SimpleHelp() throws InterruptedException {
        SimpleDealsPage dp=PageFactory.initElements(driver, SimpleDealsPage.class);
    dp.navigateToDeals();
    Actions action = new Actions(driver);
    action.moveToElement(dp.galaxy10e).build().perform();
    System.out.println("Mouse hover is working");
   }
















}
