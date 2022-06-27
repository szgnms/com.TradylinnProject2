package pages.ErenUstaoglu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_013page {

    public US_013page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons/']")
    public WebElement kuponlarButonu;

    @FindBy (xpath = "//")
    public WebElement deneme;

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

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons-manage/']")
    public WebElement yeniEkleButonu;

}


