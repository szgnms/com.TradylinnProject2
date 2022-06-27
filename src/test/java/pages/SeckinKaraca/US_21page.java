package pages.SeckinKaraca;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_21page {
    public US_21page() {PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reports']")
    public static WebElement raporlar;

}
