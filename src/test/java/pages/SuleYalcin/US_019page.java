package pages.SuleYalcin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_019page {

    @FindBy(xpath = "//span[@class='text'][normalize-space()='Takipçiler']")
    public static WebElement takipcilerButonu;

    @FindBy(xpath = "//th[@aria-label='Name']  ")
    public static WebElement Name;

    @FindBy(xpath = "//th[@aria-label='E-posta']")
    public static WebElement Eposta;

    @FindBy(xpath = "//th[@aria-label='İşlem']")
    public static WebElement islem;

    @FindBy(xpath = "//div[text()=' Showing 1 to 1 of 1 entries']")
    public static WebElement showingTexti;


}
