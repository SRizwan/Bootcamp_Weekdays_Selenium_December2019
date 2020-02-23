package Home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleHomePage {


    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchBar;

    @FindBy(xpath = "/html/body/tf-root/tf-default-layout/div[1]/tf-default-navbar/header/div[1]/div/div/div[3]/div[2]/search-result/div/form/span")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='topbar']//p[1]")
    WebElement helpBar;

    @FindBy(xpath = " //select[@id='brands']")
    WebElement brands;

    @FindBy(xpath="//a[contains(text(),'REUP')]")
    WebElement reUP;

    @FindBy(xpath = "//button[@class='slick-next slick-arrow']")
    WebElement arrow;

    @FindBy(xpath = "//a[@class='language']")
    WebElement language;

    @FindBy(xpath = "//a[contains(text(),'SHOP')]")
    WebElement shop;

    @FindBy(xpath = "//a[contains(text(),'ACTIVATE')]")
    WebElement activate;

    @FindBy(xpath = "//a[contains(text(),'HELP')]")
    WebElement help;

    @FindBy(xpath = "//a[contains(text(),'DEALS')]")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'WHY SIMPLE MOBILE')]")
    WebElement why;
    @FindBy(xpath = "//button[@id='shop now']")
    WebElement shopNow;

    @FindBy(xpath = "//button[@id='learn more']")
    WebElement bringPhone;

    @FindBy(xpath = "//button[@id='get started']")
    WebElement learnMore;

    @FindBy(xpath = "//a[@id='lnk_simplemobile']")
    WebElement Smb;

    @FindBy(xpath = "//a[@id='lnk_coveragemap']")
    WebElement coverage;

    @FindBy(xpath = "//a[@id='lnk_findaretailer']")
    WebElement findStore;

    @FindBy(xpath = "//a[@id='lnk_howitworks']")
    WebElement simpleWorks;

    @FindBy(xpath = "//a[@id='lnk_tfhome_activate']")
    WebElement activePhone;

    @FindBy(xpath = "//a[@id='lnk_refill_footer']")
    WebElement reUPPlan;

    @FindBy(xpath = "//a[@id='lnk_autorefill_footer']")
    WebElement autoReup;

    @FindBy(xpath = "//a[@id='lnk_trackorder_footer']")
    WebElement trackOrder;

    @FindBy(xpath = "//a[contains(text(),'Get Support')]")
    WebElement getSupport;

    @FindBy(xpath = "//a[contains(text(),'Refer a Friend')]")
    WebElement refrFriend;

    @FindBy(xpath = "//a[@id='lnk_phones_footer']")
    WebElement shopAllPhones;

    @FindBy(xpath = "//a[@id='lnk_bringyourphone_footer']")
    WebElement buySim;

    @FindBy(xpath = "//a[@id='lnk_airtimeplans_footer']")
    WebElement allPlans;

    @FindBy(xpath = "//li[@id='footernav-Phone Payment Plan']//a[@id='lnk_shop_vert_extras']")
    WebElement paymentPlan;

    @FindBy(xpath = "//li[@id='footernav-Apps And More']//a[@id='lnk_shop_vert_extras']")
    WebElement apps;

    @FindBy(xpath = "//a[@id='lnk_total_wireless_stores']")
    WebElement retail;

    @FindBy(xpath = "//a[@id='lnk_student-discounts']")
    WebElement students;

    @FindBy(xpath = "//a[@id='lnk_facebook']")
    WebElement facebook;

    @FindBy(xpath = "//a[@id='lnk_twitter']")
    WebElement twitter;

    @FindBy(xpath = "//a[@id='lnk_youtube']")
    WebElement youtube;

    @FindBy(xpath = "//a[@id='lnk_blog']")
    WebElement blog;
    @FindBy(xpath = "//a[@id='lnk_aboutus_footer_misc']")
    WebElement aboutUs;
    @FindBy(xpath = "//a[@id='lnk_sitemap_footer_misc']")
    WebElement siteMap;
    @FindBy(xpath = "//a[@id='lnk_codeofconduct_footer_misc']")
    WebElement code;
    @FindBy(xpath = "//a[@id='lnk_codeofconduct_footer_misc']")
    WebElement terms;

    @FindBy(xpath = "//a[@id='lnk_unlockpolicy_footer_misc']")
    WebElement unlocking;

    @FindBy(xpath = "//a[@id='lnk_simplemobileblog_footer_misc']")
    WebElement simpleBlog;

    @FindBy(xpath = "//a[@id='lnk_simplemobileblog_footer_misc']")
    WebElement Return;

    @FindBy(xpath = "//a[contains(text(),'ACCESSIBILITY')]")
    WebElement accesibility;

    @FindBy(xpath = "//a[@id='lnk_becomeadealer_footer_misc']")
    WebElement dealer;

    @FindBy(xpath = "//a[@id='lnk_privacypolicy_footer_misc']")
    WebElement privacyPolicy;

    @FindBy(xpath = "//a[contains(text(),'MOBILE IDENTITY PROTECTION')]")
    WebElement mobileIdentity;

    @FindBy(xpath = "//a[@id='lnk_affiliateprogram_footer_misc']")
    WebElement aflProgram;

    @FindBy(xpath = "//a[@id='lnk_hearingaid_footer_misc']")
    WebElement hearingAid;
    @FindBy(xpath = "//a[@id='lnk_termsofuse_footer_misc']")
    WebElement use;

    @FindBy(xpath = "//a[contains(text(),'CALIFORNIA PRIVACY POLICY')]")
    WebElement cali;

    @FindBy(xpath = "//select[@id='defaultModels']")
    WebElement models;

    @FindBy (xpath = "//button[@id='QSIFeedbackButton-btn']")
    WebElement feedBack;

    @FindBy(xpath = "//a[@id='banner_0']//img[@class='banner-image img-fluid desktop d-block swiper-lazy m-auto']")
    WebElement rating;

    public void fdBack(){
        feedBack.click();
    }

    public void rating(){
        rating.click();
    }







    public void clrarItem(){ searchBar.clear();
    }


   public void searchInfo(String info){

       searchBar.sendKeys(info, Keys.ENTER);
       //searchBtn.click();
       }

       public void simpleHelp(){
        helpBar.click();
       }








}
