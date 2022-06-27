package pages.SuleYalcin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_018page {
    public US_018page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[text()='Emirler'])[1]")
    public static WebElement emirlerLinki;

    @FindBy(xpath = "(//span[@data-tip='Refund Request'])[1]")
    public static WebElement refundRequest;

    @FindBy(xpath = "//tbody//tr[1]//td[3]//select[1]")
    public static WebElement qty;

    @FindBy(xpath = "//textarea[@id='wcfm_refund_reason']")
    public static WebElement refundRequestReason;


    @FindBy(xpath = "//input[@id='wcfm_refund_requests_submit_button']")
    public static WebElement submit;



    @FindBy(xpath = "//span[contains(text(),'Geri ödeme')]")
    public  static WebElement geriOdemeButonu;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public static WebElement requestId;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public static WebElement orderId;

    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public static WebElement amount;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public static WebElement type;

    @FindBy(xpath = "//tbody//tr[1]//td[6]")
    public static WebElement reasonText;

    @FindBy(xpath = "(//*[@cellpadding='0']//tr)[1]//th")
    public static List<WebElement> refundRequestTable;

}
