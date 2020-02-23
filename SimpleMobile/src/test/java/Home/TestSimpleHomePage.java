package Home;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSimpleHomePage extends WebAPI {

    @Test
    public void testSearchInfo()
    { SimpleHomePage hp= PageFactory.initElements(driver,SimpleHomePage.class);
    hp.searchInfo("package");
    Assert.assertEquals("package","package");

  }

   @Test
    public void testSearchMultipleItems() {
       SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);

       List<String> items = new ArrayList<>();
       items.add("apple");
       items.add("samsung");
       items.add("package");
       for (String item : items) {
           hp.searchInfo(item);
           hp.clrarItem();
       }


   }

   @Test
   public void testScrollSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
      hp.simpleHelp();
      Thread.sleep(5000);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)");
   }

   @Test
   public void testScrollIntoViewSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
      hp.simpleHelp();
      Thread.sleep(5000);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true)", hp.brands);
   }

   @Test
   public void testScrollTillTheEndSimpleHelp() throws InterruptedException {
      SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
     hp.simpleHelp();
     JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      Thread.sleep(5000);
   }

   @Test
    public void testDropDownMenulgByTextSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("lg");
   }

    @Test
    public void testDropDownMenuByTextalactelSimpleHelp() throws InterruptedException {
     SimpleHomePage hp = PageFactory.initElements(driver, SimpleHomePage.class);
    hp.simpleHelp();
    Select sel= new Select(hp.brands);
    sel.selectByVisibleText("alcatel");


}


}
