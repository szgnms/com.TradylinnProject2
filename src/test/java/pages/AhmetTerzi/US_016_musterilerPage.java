package pages.AhmetTerzi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_016_musterilerPage {

    public US_016_musterilerPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

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
    public WebElement yeniEkleButonu;

    @FindBy(xpath = "//span[normalize-space()='PDF']")
    public WebElement downloadPDFbutonu;

    @FindBy(xpath = "//span[normalize-space()='Excel']")
    public WebElement downloadExcelbutonu;

    @FindBy(xpath = "//span[normalize-space()='CSV']")
    public WebElement downloadCSVbutonu;


}
