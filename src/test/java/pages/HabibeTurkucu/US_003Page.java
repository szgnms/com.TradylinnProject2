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





}
