package pages.EmreKarasu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_08_09_10_Page {
    //@FindBy(xpath = "//span[normalize-space()='Ürün:% s']")
    //public static WebElement urun;

    //@FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
   // public static WebElement urun;


    //@FindBy (xpath = "(//*[@id='wcfm_menu']//div)[5]")
    //public static WebElement urun ;

    @FindBy (xpath = "(//span[@class='text'])[4]")
    public static WebElement urun ;

    @FindBy(xpath = "<a href=\"(//span[@class='text'])[19]")
    public static WebElement yeniEkle;

    @FindBy(xpath = "//input[@name='manage_stock']")
    public static WebElement manageStockTik;

    @FindBy(xpath = "//input[@name='stock_qty']")
    public static WebElement manageStockKutu;

    @FindBy(xpath = "//select[@id='backorders']")
    public static WebElement AllowBlackorder;
    @FindBy(xpath = "(//select[@id='backorders'])//option[3]")
    public static WebElement Allow;
    @FindBy(xpath = "(//select[@id='backorders'])//option[2]")
    public static WebElement AllowButNotifyCustomer;
    @FindBy(xpath = "(//select[@id='backorders'])//option[1]")
    public static WebElement DoNotAllow;

    @FindBy(xpath = "//label[@class='wcfmfa fa-truck']")
    public static WebElement shipping;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[1]")
    public static WebElement weight;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[2]")
    public static WebElement length;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[3]")
    public static WebElement width;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[4]")
    public static WebElement height;


    @FindBy (xpath = "//select[@id=\"_wcfmmp_processing_time\"]")
    public WebElement ddPTime;

    @FindBy (id = "wcfm_products_manage_form_attribute_head")
    public static WebElement attributes;

    @FindBy (id = "attributes_value_1")
    public static WebElement ddColor;

    @FindBy (id = "attributes_value_2")
    public static WebElement ddSize;

    @FindBy (id = "attributes_is_active_1")
    public static WebElement attributes_Color;

    @FindBy (id = "attributes_is_active_2")
    public static WebElement attributes_Size;


}
