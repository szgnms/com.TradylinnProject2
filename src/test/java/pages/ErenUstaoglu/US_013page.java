package pages.ErenUstaoglu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_013page {

    public US_013page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='Giriş Yap']")
    public WebElement anaSayfaGirisYapButonu;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement kullaniciAdiEmailInput;

    @FindBy (xpath = "(//input[@type='password'])[1]")
    public WebElement parolaInput;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement girisYapSubmitButonu;

    @FindBy (xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons/']")
    public WebElement kuponlarButonu;

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons-manage/']")
    public WebElement yeniEkleButonu;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement codeInput;

    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement kuponSubmitButonu;

    @FindBy (xpath = "//a[@class='wcfm_menu_item active']")
    public WebElement ikinciKuponlarButonu;

    @FindBy (xpath = "//a[@class='wcfm_dashboard_item_title']")
    public WebElement birinciSiradakiKupon;

    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement descriptionInput;

    @FindBy (xpath = "(//a[@class='wcfm-action-icon'])[1]")
    public WebElement ilkUrunDuzenlemek;

    @FindBy (xpath = "//select[@id='discount_type']")
    public WebElement discountTypeDropDown;

    @FindBy (xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmountInput;

    @FindBy (xpath = "//input[@value='20']")
    public WebElement ikinciCouponAmountInput;

    @FindBy (xpath = "//p[@class='coupon_amount wcfm_ele wcfm_title']")
    public WebElement couponAmount;

    @FindBy (xpath = "//input[@id='expiry_date']")
    public WebElement expiryDateInput;

    @FindBy (xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShippingButonu;

    @FindBy (xpath = "//input[@id='show_on_store']")
    public WebElement showOnStoreButonu;
}