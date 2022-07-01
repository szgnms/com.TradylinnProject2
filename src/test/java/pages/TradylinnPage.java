package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class  TradylinnPage{

     public  TradylinnPage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

    //Muhammed SEZGIN

    @FindBy(xpath = "//span[normalize-space()='Üye Ol']")
    public WebElement uyeOlButton;

    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']//a")
    public WebElement vendorButton;

    //Vendor Registration
    @FindBy(xpath = "//h2[@class='trd-title']")
    public WebElement vendorRegisterPage;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailBlock;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement passwordBlock;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement confPasswordBlock;

    @FindBy(xpath = "//span[@class='wcicon-status-cancelled']")
    public WebElement registerEmailErrorBosMail;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement registerEmailErrorYanlisMail;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement registerEmailErrorExistsMail;

    @FindBy(xpath = "//input[@id='wcfm_membership_register_button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement registerPasswordErrorAtleastGood;

    @FindBy(xpath = "//div[@id='password_strength']")
    public WebElement registerPasswordVerifyGood;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']")
    public WebElement registerPasswordErrorNotSame;

    @FindBy(xpath = "//div[@class='wcfm-message wcfm-success']")
    public WebElement registerSuccess;

    @FindBy(xpath = "//strong[normalize-space()='Welcome,']")
    public WebElement registerWelcomeTable;

    @FindBy(xpath = "(//*[@class='banner-content t-m'])[2]")
    public WebElement bannerText;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-content col-md-9 pt-2']//p")
    public List<WebElement> accountELementList;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation col-md-3 mb-8']//li")
    public List<WebElement> dashboardList;

    //Habibe TURKUCU
    @FindBy(xpath = "//*[text()='Alışverişe Devam Et']")
    public WebElement alisVeriseDevam;

    @FindBy(xpath = "//img[@alt=\"Tilki T -shirt\"]")
    public WebElement tShirt;

    @FindBy(xpath = "//button[@class=\"single_add_to_cart_button button alt\"]")
    public WebElement sepeteEkleButon;

    @FindBy(xpath = "//a[@class='btn btn-success btn-md']")
    public WebElement sepet;

    @FindBy(xpath = "//a[@class=\"checkout-button button alt wc-forward\"]")
    public WebElement odemeSayfasi;

    @FindBy(xpath = "//input[@name=\"billing_first_name\"]")
    public WebElement isimKutusu;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public  WebElement soyIsimKutusu;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement firma;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement adres1;

    @FindBy (xpath = "//input[@id='billing_address_2']")
    public WebElement adres2;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public  WebElement postaKodu;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement ilce;

    @FindBy(xpath = "//select[@class=\"state_select select2-hidden-accessible\"]")
    public WebElement ddm;

    @FindBy (xpath = "//input[@id='billing_phone']")
    public WebElement telefon;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='wcfmmp_user_location']")
    public WebElement teslimat;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement siparisOnay;

    @FindBy(xpath = "//p[contains(text(),'Siparişler')]")
    public WebElement order1;

    @FindBy(xpath = "//*[text()='Teşekkür ederiz. Siparişiniz alınmıştır.']")
    public WebElement sipariOnayMetni;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement sepetim;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[3]")
    public WebElement urun2;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement urun3;

    @FindBy(xpath = "(//*[@href='https://tradylinn.com/checkout-2/'])[2]")
    public WebElement odemeButton;

    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement isim;

    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement syisim;

    @FindBy(xpath = "(//input[@class='input-text '])[4]")
    public WebElement sokakAdres;

    @FindBy(xpath = "(//input[@class='input-text '])[6]")
    public WebElement postaKodu1;

    @FindBy(xpath = "(//input[@class='input-text '])[7]")
    public WebElement ilce1;

    @FindBy(xpath = "//*[@class='input-text pac-target-input']")
    public WebElement teslimatAdresi;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement siparisOnayla;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement tesekkurYazisi;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//*[@class='widget_shopping_cart_content']")
    public WebElement sepetTablo;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]")
    public WebElement urun1;


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
    public WebElement urunArtirma;

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
    public WebElement varsayilanSiralama;

    @FindBy(xpath = "//tr[@class='woocommerce-shipping-totals shipping'][1]")
    public WebElement kargoBilgileri;

    @FindBy(xpath = "(//*[@class='cart-title'])[2]")
    public WebElement sepetToplamiYazisi;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement checkOut;

    @FindBy(xpath = "//*[@class='woocommerce-billing-fields__field-wrapper row gutter-sm']")
    public WebElement faturaTablosu;

    //TEAM34
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public  WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public  WebElement emailButon;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement passwordButon;

    @FindBy(xpath = "//button[@value='Giriş Yap']")
    public  WebElement girisYap2;

    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButon;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButon;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement urunButon;

    @FindBy(xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkleButon;

    @FindBy(xpath = "//*[@id='product_brand']")
    public List<WebElement> brands;

    @FindBy(xpath = "//input[@value='35']")
    public WebElement elegantAutoGroup;

    @FindBy(xpath = "//input[@value='41']")
    public WebElement greenGrass;

    @FindBy(xpath = "//input[@value='46']")
    public WebElement nodeJs;

    @FindBy(xpath = "//input[@value='47']")
    public WebElement ns8;

    @FindBy(xpath = "//input[@value='50']")
    public WebElement red;

    @FindBy(xpath = "//input[@value='52']")
    public WebElement skySuite;

    @FindBy(xpath = "//input[@value='55']")
    public WebElement sterling;

    @FindBy(xpath = "//input[@id='manage_stock']")
    public WebElement manageStock;

    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stockQty;

    @FindBy(xpath = "(//*[text()='Allow Backorders?'])[1]")
    public WebElement allowBackorders;

    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement dropDownBackorders;
    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement yapGiris;
    @FindBy(id = "menu-item-1074")
    public WebElement hesabimButonu;
    @FindBy(xpath = "//span[@class='text'][normalize-space()='Ürün:% s']")
    public WebElement urunButonn;
    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement yeniEkleButonu;
    @FindBy(id = "wcfm-products_wrapper")
    public WebElement listeGorunum;
    @FindBy(css = "tr[class='odd'] span[class='product-status product-status-publish']")
    public WebElement statusGorunum;
    @FindBy(css = "tr[class='odd'] span[class='instock']")
    public WebElement stockGorunum;
    @FindBy(css = "tr[class='odd'] td del")
    public WebElement priceGorunum;
    @FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'21 June 2022')]")
    public WebElement dateGorunum;
    @FindBy(xpath = "(//*[text()='Virtual'])[1]")
    public WebElement virtualGorunum;
    @FindBy(xpath = "(//*[text()='Downloadable'])[1]")
    public WebElement downGorunum;
    @FindBy(id = "pro_title")
    public WebElement titleGorunum;
    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement titleGiris;
    @FindBy(xpath = "(//*[text()='Price (₺)'])[1]")
    public WebElement priceeGorunum;
    @FindBy(xpath = "(//*[text()='Sale Price (₺)'])[1]")
    public WebElement salePriceGorunum;
    @FindBy(id = "featured_img_display")
    public WebElement img;
    @FindBy(xpath = "(//img[@class='placeHolder'])[1]")
    public WebElement dosyaYukle;
    @FindBy(id = "menu-item-browse")
    public WebElement ortamKutuphanesi;
    @FindBy(id = "__wp-uploader-id-1")
    public WebElement dosyaSecinButon;
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement sec;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement foto;
    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public WebElement categories;
    @FindBy(xpath = "//input[@value='235']")
    public WebElement besinTakviyeleri;
    @FindBy(xpath = "//input[@value='225']")
    public WebElement cokSatanlar;
    @FindBy(xpath = "//input[@value='230']")
    public WebElement elektrik;
    @FindBy(xpath = "//input[@value='228']")
    public WebElement evYasam;
    @FindBy(xpath = "//input[@value='227']")
    public WebElement indirimli;
    @FindBy(xpath = "//input[@value='232']")
    public WebElement kmf;
    @FindBy(xpath = "//input[@value='231']")
    public WebElement kozmetik;
    @FindBy(xpath = "//input[@value='234']")
    public WebElement modaGiyim;
    @FindBy(xpath = "//input[@value='233']")
    public WebElement oyuncak;
    @FindBy(xpath = "//input[@value='229']")
    public WebElement takiAksesuar;
    @FindBy(xpath = "//input[@value='226']")
    public WebElement yeniUrunler;
    @FindBy(xpath = "(//*[text()='Short Description'])[1]")
    public WebElement shortDescriptionGorunum;
    @FindBy(xpath = "//body[@data-id='excerpt']")
    public WebElement shortDescriptionText;
    @FindBy(xpath = "//body[@data-id='description']")
    public WebElement descriptionText;
    @FindBy(xpath = "(//*[text()='Description'])[1]")
    public WebElement descriptionGorunum;

    //Emre KARASU
    @FindBy(xpath = "(//span[@class='text'])[4]")
    public   WebElement urun;

    @FindBy(xpath = "<a href=\"(//span[@class='text'])[19]")
    public   WebElement yeniEkle;

    @FindBy(xpath = "//input[@name='manage_stock']")
    public   WebElement manageStockTik;

    @FindBy(xpath = "//input[@name='stock_qty']")
    public   WebElement manageStockKutu;

    @FindBy(xpath = "//select[@id='backorders']")
    public   WebElement AllowBlackorder;
    @FindBy(xpath = "(//select[@id='backorders'])//option[3]")
    public   WebElement Allow;
    @FindBy(xpath = "(//select[@id='backorders'])//option[2]")
    public   WebElement AllowButNotifyCustomer;
    @FindBy(xpath = "(//select[@id='backorders'])//option[1]")
    public   WebElement DoNotAllow;

    @FindBy(xpath = "//label[@class='wcfmfa fa-truck']")
    public   WebElement shipping;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[1]")
    public   WebElement weight;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[2]")
    public   WebElement length;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[3]")
    public   WebElement width;

    @FindBy(xpath = "(//input[@class='wcfm-text wcfm_ele simple variable booking'])[4]")
    public   WebElement height;


    @FindBy(xpath = "//select[@id=\"_wcfmmp_processing_time\"]")
    public WebElement ddPTime;

    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public   WebElement attributes;

    @FindBy(id = "attributes_value_1")
    public   WebElement ddColor;

    @FindBy(id = "attributes_value_2")
    public   WebElement ddSize;

    @FindBy(id = "attributes_is_active_1")
    public   WebElement attributes_Color;

    @FindBy(id = "attributes_is_active_2")
    public   WebElement attributes_Size;

    //Cem AYHAN

    @FindBy(xpath = "//span[normalize-space()='Üye Ol']")
    public WebElement uyeOlButonu;

    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']//a")
    public WebElement becomeWendorButonu;

    @FindBy(xpath = "//h2[@class='trd-title']")
    public WebElement wendorRegistrationYazisi;


    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/'][1]")
    public WebElement hesabimButonu1;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement hesabimEmailsekmesi;

    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordSekmesi;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement hesabimGirisButonu;

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
    public WebElement faturaTablosu1;

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

    //Eren USTAOGLU

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/coupons/']")
    public WebElement kuponlarButonu;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/coupons-manage/']")
    public WebElement yeniEkleButonu2;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement codeInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement kuponSubmitButonu;

    @FindBy(xpath = "//a[@class='wcfm_menu_item active']")
    public WebElement ikinciKuponlarButonu;

    @FindBy(xpath = "//a[@class='wcfm_dashboard_item_title']")
    public WebElement birinciSiradakiKupon;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "(//a[@class='wcfm-action-icon'])[1]")
    public WebElement ilkUrunDuzenlemek;

    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountTypeDropDown;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDateInput;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShippingButonu;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showOnStoreButonu;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendInput;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendInput;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnlyButonu;

    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement excludeCategoriesInput;

    @FindBy(xpath = "//li[@title='Clothing']")
    public WebElement clothingOption;

    @FindBy(xpath = "(//li[@class='select2-selection__choice'])[3]")
    public WebElement accessoriesOption;

    @FindBy(xpath = "(//li[@class='select2-selection__choice'])[4]")
    public WebElement hoodiesOption;

    @FindBy(xpath = "(//span[@class='img_tip wcfmfa fa-question'])[8]")
    public WebElement excludeCategories;

    @FindBy(xpath = "//select[@id='exclude_product_ids']")
    public WebElement excludeProductsSelect;

    @FindBy(xpath = "//*[text()='Exclude products']")
    public WebElement excludeCat;

    @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    public WebElement excludeProductsInput;

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[2]//li[1]")
    public WebElement sweetEla;

    // trd5-TEAM34


    // Ahmet TERZI

    @FindBy(xpath = "//input[@id='user_name']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailTextbox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameTextbox;

    @FindBy(xpath = "//input[@id='bfirst_name']")
    public WebElement billingFirstNameTextbox;

    @FindBy(xpath = "//input[@id='blast_name']")
    public WebElement billingLastNameTextbox;

    @FindBy(xpath = "//input[@id='bcompany_name']")
    public WebElement billingCompanyNameTextbox;

    @FindBy(xpath = "//input[@id='bphone']")
    public WebElement billingPhoneTextbox;

    @FindBy(xpath = "//input[@id='baddr_1']")
    public WebElement billingAdress1;

    @FindBy(xpath = "//input[@id='baddr_2']")
    public WebElement billingAdress2;

    @FindBy(xpath = "//span[@id='select2-bcountry-container']")
    public WebElement billingCountryddm;

    @FindBy(xpath = "//input[@id='bcity']")
    public WebElement billingCityTextBox;

    @FindBy(xpath = "//select[@id='bstate']")
    public WebElement billingStateddm;

    @FindBy(xpath = "//input[@id='bzip']")
    public WebElement billingPostcodeTextbox;

    @FindBy(xpath = "//input[@id='same_as_billing']")
    public WebElement sameAsBillingChechbox;

    @FindBy(xpath = "//input[@id='sfirst_name']")
    public WebElement shippingFirstNameTextbox;

    @FindBy(xpath = "//input[@id='slast_name']")
    public WebElement shippingLastNameTextbox;

    @FindBy(xpath = "//input[@id='scompany_name']")
    public WebElement shippingCompanyNameTextbox;

    @FindBy(xpath = "//input[@id='saddr_1']")
    public WebElement shippingAdress1;

    @FindBy(xpath = "//input[@id='saddr_2']")
    public WebElement shippingAdress2;

    @FindBy(xpath = "//span[@id='select2-scountry-container']")
    public WebElement shippingCountryddm;

    @FindBy(xpath = "//input[@id='scity']")
    public WebElement shippingCityTextBox;

    @FindBy(xpath = "//select[@id='sstate']")
    public WebElement shippingStateddm;

    @FindBy(xpath = "//input[@id='szip']")
    public WebElement shippingPostcodeTextbox;

    @FindBy(xpath = "//input[@id='wcfm_customer_submit_button']")
    public WebElement submitButonu;

    @FindBy(xpath = "//span[@class='text'][contains(text(),'müşteriler')]")
    public WebElement musterilerButonu;

    @FindBy(xpath = "//th[@aria-label='Name']")
    public WebElement nameYazisi;

    @FindBy(xpath = "//th[@aria-label='Email']")
    public WebElement emailYazisi;

    @FindBy(xpath = "//th[@aria-label='Username']")
    public WebElement usernameYazisi;

    @FindBy(xpath = "//th[@aria-label='Location']")
    public WebElement locationYazisi;

    @FindBy(xpath = "//th[@aria-label='Money Spent']")
    public WebElement moneySpentYazisi;

    @FindBy(xpath = "//th[@aria-label='Last Order']")
    public WebElement lastOrdeYazisi;

    @FindBy(xpath = "//span[contains(text(),'Yeni ekle')]")
    public WebElement yeniEkleButonu1;

    @FindBy(xpath = "//span[normalize-space()='PDF']")
    public WebElement downloadPDFbutonu;

    @FindBy(xpath = "//span[normalize-space()='Excel']")
    public WebElement downloadExcelbutonu;

    @FindBy(xpath = "//span[normalize-space()='CSV']")
    public WebElement downloadCSVbutonu;

// Sule YALCIN

    @FindBy(xpath = "(//*[@id='wcfm_menu']//div)[6]")
    public   WebElement emirlerLinki;

    @FindBy(xpath = "//textarea[@id='wcfm_refund_reason']")
    public   WebElement refundRequestReason;

    @FindBy(xpath = "//tbody//tr[1]//td[3]//select[1]")
    public   WebElement qty;

    @FindBy(xpath = "((//*[@id='wcfm-orders']//td)[9]//a)[2]")
    public   WebElement refundRequest;

    @FindBy(xpath = "(//*[@data-tip='Mark as Complete'])[1]")
    public   WebElement markAsComplete;

    @FindBy(xpath = "//input[@id='wcfm_refund_requests_submit_button']")
    public   WebElement submit;

    @FindBy(xpath = "//span[contains(text(),'Geri ödeme')]")
    public   WebElement geriOdemeButonu;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public   WebElement requestId;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public   WebElement orderId;

    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public   WebElement amount;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public   WebElement type;

    @FindBy(xpath = "//tbody//tr[1]//td[6]")
    public   WebElement reasonText;

    @FindBy(xpath = "(//*[@cellpadding='0']//tr)[1]//th")
    public   List<WebElement> refundRequestTable;

    @FindBy(xpath = "//span[normalize-space()='Takipçiler']")
    public   WebElement takipcilerButonu;

    @FindBy(xpath = "//th[@aria-label='Name']  ")
    public   WebElement name;

    @FindBy(xpath = "//th[@aria-label='E-posta']")
    public   WebElement eposta;

    @FindBy(xpath = "//th[@aria-label='İşlem']")
    public   WebElement islem;

    @FindBy(xpath = "//div[text()=' Showing 1 to 1 of 1 entries']")
    public   WebElement showingTexti;

    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[17]/a[1]/span[2]")
    public   WebElement incelemeler;

    @FindBy(xpath = "//thead//tr//th[3]")
    public   WebElement author;

    @FindBy(xpath = "//thead//tr//th[4]")
    public   WebElement comment;
    @FindBy(xpath = "//thead//tr//th[5]")
    public   WebElement rating;
    @FindBy(xpath = "//thead//tr//th[6]")
    public   WebElement dated;

    //Seckin KARACA
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[4]/a")
    public WebElement sonYediGun;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[5]/form/div/input[1]")
    public WebElement birGunsec;
    @FindBy(xpath = "//*[@class='day toMonth valid real-today']")
    public WebElement ikiHaziran;
    @FindBy(xpath = "(//*[@class='day toMonth valid'])[25]")
    public WebElement onAltiHaziran;
    @FindBy(xpath = "//*[@id=\"wcfm_report_details\"]/div[1]/span[2]")
    public WebElement yaziElementi;
    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reports']")
    public WebElement raporlar;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[1]/a")
    public WebElement yillikRapor;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[2]/a")
    public WebElement enSonAy;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[3]/a")
    public WebElement buAy;

    @FindBy(xpath = "//select[@class='orderby form-control']")
    public WebElement siralama;
    @FindBy(xpath = "//span[@class='woocommerce-Price-amount amount']")
    public List<WebElement> fiyatlar;
    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[1]")
    public WebElement enUcuz;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement tumunugor;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[18]")
    public WebElement onIkinci;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement enPahali;


}