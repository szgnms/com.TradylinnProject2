package pages.EmreKarasu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Us_008Page {

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public static WebElement urun;

    @FindBy(xpath = "//span[@class='wcfmfa fa-database']")
    public static WebElement stockManager;



}
