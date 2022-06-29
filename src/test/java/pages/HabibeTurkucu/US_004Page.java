package pages.HabibeTurkucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_004Page {


    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement sepetim;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//*[@class='widget_shopping_cart_content']")
    public WebElement sepetTablo;

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

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "//button[@name='apply_coupon']")
    public WebElement kuponButton;

    @FindBy(xpath = "//input[@name='coupon_code']")
    public WebElement kuponGir;

    @FindBy(xpath = "//button[@title='Artı']")
    public WebElement urunArtırma;

    @FindBy(xpath = "//button[@title='Eksi']")
    public WebElement urunAzaltma;

    @FindBy(xpath = "(//td[@data-title='Ara Toplam'])[1]")
    public WebElement urunTutari;

    @FindBy(xpath = "//button[@value='Temizle']")
    public WebElement temizleButton;

    @FindBy(xpath = "//*[@class='cart-empty woocommerce-info']")
    public WebElement sepetBosYazisi;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alisveriseDevamet;

    @FindBy(xpath = "//form[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']")
    public WebElement varsayılanSıralama;

    @FindBy(xpath = "//tr[@class='woocommerce-shipping-totals shipping'][1]")
    public WebElement kargoBilgileri;

    @FindBy(xpath = "(//*[@class='cart-title'])[2]")
    public WebElement sepetToplamiYazisi;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement checkOut;

    @FindBy(xpath = "//*[@class='woocommerce-billing-fields__field-wrapper row gutter-sm']")
    public WebElement faturaTablosu;









}
