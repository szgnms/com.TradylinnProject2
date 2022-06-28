package pages.SeckinKaraca;

import org.openqa.selenium.W3CCapabilityKeysValidator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_22page {
    public US_22page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement tümünügör;
    @FindBy(xpath = "//select[@class='orderby form-control']")
    public WebElement varsayılanSıralama;
    }
