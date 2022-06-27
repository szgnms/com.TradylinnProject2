package pages.SeckinKaraca;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_21page {
    public US_21page() {PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='text'])[14]")
    public static WebElement raporlar;

}
