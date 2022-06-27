package pages.CemAyhan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {

    public TradylinnPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath= "//span[normalize-space()='Üye Ol']")
    public WebElement uyeOlButonu;

    @FindBy(xpath= "//*[@class='wcfmmp_become_vendor_link']//a")
    public WebElement becomeWendorButonu;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement wendorRegistrationYazisi;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/'][1]")
    public WebElement hesabimButonu;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement hesabimEmailsekmesi;

    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordSekmesi;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement hesabimGirisButonu;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement urunSekmesi;

    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement yeniUrunEkleButonu;

    @FindBy(xpath = "//label[@class='wcfmfa fa-certificate']")
    public WebElement toptanUrunGostermeSekmesi;

    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement pieceTypeButonu;

    @FindBy(xpath = "//input[@id='unitpercart']")
    public WebElement unitsPerPieceSekmesi;

    @FindBy(xpath = "//input[@id='minorderqtytr']")
    public WebElement minOrderQuantitySekmesi;

    @FindBy(xpath = "//p[@class='text-uppercase text-center mb-0'][1]")
    public WebElement siparislerSekmesi;

    @FindBy(xpath = "//a[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view']")
    public WebElement goruntuleButonu;

    @FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
    public WebElement siparisDetaylariYazisi;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/downloads/'][1]")
    public WebElement indirmelerSekmesi;

    @FindBy(xpath = "//h4[@class='icon-box-title text-normal']")
    public WebElement indirmelerYazisi;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/edit-address/'][1]")
    public WebElement adresSekmesi;

    @FindBy(xpath = "//table[@class='address-table'][1]")
    public WebElement faturaTablosu;

    @FindBy(xpath = "//div[@class='col-lg-6 mb-4'][2]")
    public WebElement gonderimAdresiTablosu;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/edit-account/'][1]")
    public WebElement hesapDetaylariSekmesi;

    @FindBy(xpath = "//input[@id='account_first_name']")
    public WebElement adSekmesi;

    @FindBy(xpath = "//input[@id='account_last_name']")
    public WebElement soyadSekmesi;

    @FindBy(xpath = "//input[@id='account_display_name']")
    public WebElement gorunenAdSekmesi;

    @FindBy(xpath = "//input[@id='account_email']")
    public WebElement emailHesapDetayi;

    @FindBy(xpath = "//button[@value='Değişiklikleri kaydet']")
    public WebElement degisiklikleriKaydetButonu;


















}
