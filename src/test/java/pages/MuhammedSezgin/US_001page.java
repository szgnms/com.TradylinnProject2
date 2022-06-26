package pages.MuhammedSezgin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_001page {

    //US_001_Vendor olarak, güvenli bir registration yapmalıyım

    @FindBy(xpath = "//span[normalize-space()='Üye Ol']")
    public WebElement uyeOlButton;

    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']//a")
    public WebElement vendorButton;

    //Vendor Registration
    @FindBy(xpath = "//h2[@class='page-title']")
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





}