package TestHome;

import Home.PageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    static HomePage hp;
    public static void getInElement() {
        hp=PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public static void clickOnRadioButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);

    }

     @Test
    public static void clickOnSelectButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        selectFromDrop(webElemetSelectButton, "benz");
        sleepFor(3);

    }

    @Test
    public static void clickOnSelectMultiButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);

    }

    @Test
    public static void clickOnCheckButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }

    @Test
    public static void newWindowOpen() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }
    @Test
    public static void newWindowOpen1() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);

    }
    @Test
    public static void alertHandleAccept() throws InterruptedException {
        getInElement();
        sleepFor(2);
        searchBoxSend();
        for (int i = 0;i<namelist().size();i++){
            System.out.println(namelist());
        }
        alertNewHandle();
        sleepFor(2);
        okAlert();

    }

    @Test
    public static void alertHandleCancle() throws InterruptedException {
        getInElement();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        cancelAlert();
    }

    @Test
    public static void getTable() throws InterruptedException {
        getInElement();
        sleepFor(2);
        scrollUpDown(2500);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);

    }
@Test
    public void testiFrame() {
        getInElement();
        iframeHandle(hp.iFrameName);
        hp.useSearchbar("Java");
        goBackToHomeWindow();
    }
}