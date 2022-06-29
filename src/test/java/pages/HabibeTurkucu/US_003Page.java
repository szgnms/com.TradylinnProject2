package pages.HabibeTurkucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_003Page {

// ORDERS DA BROWSE PRODUCTS A GİDİLMELİ

    @FindBy(xpath = "(//*[@href='https://tradylinn.com/my-account-2/orders/'])[1]")
    public WebElement siparislerButton;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    public WebElement alisveriseDevamEtButton;

    @FindBy(xpath = "//form[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']")
    public WebElement varsayılanSıralama;

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "(//*[@class='product-wrap'])")
    public WebElement urunler;

    @FindBy(xpath = "//*[@class='stock out-of-stock']")
    public WebElement stoktaYok;

    @FindBy(xpath = "//*[@class='cart-count']")
    public WebElement sepettekiUrunSayisi;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement sepetim;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement checkOut;

    @FindBy(xpath = "//*[@class='woocommerce-billing-fields__field-wrapper row gutter-sm']")
    public WebElement faturaTablosu;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath="(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement urun1;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]")
    public  WebElement urun2;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement urun3;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[8]")
    public WebElement urun4;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[9]")
    public WebElement urun5;

    @FindBy(xpath = "(//*[@href='https://tradylinn.com/checkout-2/'])[2]")
    public WebElement odemeButton;

    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement isim;

    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement syisim;

    @FindBy(xpath = "(//input[@class='input-text '])[4]")
    public WebElement sokakAdres;

    @FindBy(xpath = "(//input[@class='input-text '])[6]")
    public WebElement postaKodu;

    @FindBy(xpath = "(//input[@class='input-text '])[7]")
    public WebElement ilce;

    @FindBy(xpath = "//*[@class='input-text pac-target-input']")
    public WebElement teslimatAdresi;

    @FindBy(xpath ="//button[@id='place_order']")
    public WebElement siparisOnayla;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement tesekkurYazisi;






    }

