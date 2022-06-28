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

    @FindBy(xpath = "//*[@class='cart-toggle']")
    public WebElement sepetim;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement checkOut;

    @FindBy(xpath = "//*[@class='woocommerce-billing-fields__field-wrapper row gutter-sm']")
    public WebElement faturaTablosu;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement sepetiGoruntule;


    }

