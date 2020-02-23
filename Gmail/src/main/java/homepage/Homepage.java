package homepage;

import org.openqa.selenium.chrome.ChromeDriver;
import webelements.WebElement;

public class Homepage extends WebElement {
    public static void setBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/rizwan/IdeaProjects/framework.piit/Shah_Mahbub_Selenium/Generic/BrowserDriver/chromedriver");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
    }
}

