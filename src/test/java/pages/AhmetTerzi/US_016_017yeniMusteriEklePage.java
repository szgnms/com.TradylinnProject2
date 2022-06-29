package pages.AhmetTerzi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_016_017yeniMusteriEklePage {

    public US_016_017yeniMusteriEklePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

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




}
