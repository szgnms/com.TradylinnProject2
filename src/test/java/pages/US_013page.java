package pages;

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
}
