package Deals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleDealsPage {
    private @FindBy(xpath = "//a[contains(text(),'DEALS')]")
    WebElement deals;

    private @FindBy (xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_293507_link_9b_sku_name']")
    WebElement lg;

    private @FindBy(xpath = "//button[@class='btn btn-circle']")
    WebElement lgBtn;

    private @FindBy(xpath = "//a[@id='select_phone_bundles_btn_nozip']")
    WebElement addToCart;

    private @FindBy(xpath = "//input[@id='zipPopup_zc']")
    WebElement zip;

    private @FindBy(xpath = "//button[@id='pdp_zipbutton']")
    WebElement cont;

    private @FindBy(xpath = "//button[@id='tcChat_btnCloseChat_img']")
    WebElement closeChat;

    private @FindBy(xpath = "//td[@id='tcChat_btnMinimize_span']")
    WebElement minimizeChat;

    private @FindBy(xpath = "//div[@id='inqC2CImgContainer_Anchored']//img")
    WebElement launchChat;

     @FindBy(xpath = "//div[@id='inqC2CImgContainer_Anchored']//img")
    WebElement galaxy10e;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_293504_link_9b_sku_name']")
     WebElement galaxy20;

     @FindBy(xpath ="//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_305002_link_9b_sku_name']" )
     WebElement lgStylo;

     @FindBy (xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_218003_link_9b_sku_name']")
     WebElement motoE5;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_218003_link_9b_sku_name']")
     WebElement galaxyJ2;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_124529_link_9b_sku_name']")
     WebElement iPoneSE;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_170501_link_9b_sku_name']")
     WebElement iPhone6s;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_332001_link_9b_sku_name']")
     WebElement lgFiesta;

     @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_243502_link_9b_sku_name']")
     WebElement tclLx;

    @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_141001_link_9b_sku_name']")
    WebElement iPhone7;

    @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_261501_link_9b_sku_name']")
    WebElement tclRaven;

    @FindBy(xpath = "//h3[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_218002_link_9b_sku_name']")
    WebElement motoG6;
















    public void navigateToDeals(){
        deals.click();
    }

    public void lg(){
        lg.click();
    }

    public void lgBtn(){
        lgBtn.click();
    }
    public void addToCart(){
        addToCart.click();

    }
    public void zipCode(){
        zip.sendKeys("10456");
    }

    public void cont(){
        cont.click();
    }

    public void launchChat(){
        launchChat.click();
    }
    public void closeChat(){
        closeChat.click();
    }

}
