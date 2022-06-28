package pages.SeckinKaraca;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_21page {
    public US_21page() {PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reports']")
    public WebElement raporlar;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[1]/a")
    public WebElement yillikRapor;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[2]/a")
    public WebElement enSonAy;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[3]/a")
    public WebElement buAy;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[4]/a")
    public WebElement sonYediGün;
    @FindBy(xpath = "//*[@id=\"poststuff\"]/div/div[1]/ul/li[5]/form/div/input[1]")
    public WebElement birGünsec;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table[1]/tbody/tr[1]/td[5]/div")
    public WebElement ikiHaziran;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table[1]/tbody/tr[3]/td[5]/div")
    public WebElement onAltiHaziran;
    @FindBy(xpath = "//*[@id=\"wcfm_report_details\"]/div[1]/span[2]")
    public WebElement yazıElementi;



}
