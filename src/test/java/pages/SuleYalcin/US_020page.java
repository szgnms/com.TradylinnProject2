package pages.SuleYalcin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_020page {


    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[17]/a[1]/span[2]")
    public static WebElement incelemeler;

    @FindBy(xpath = "//thead//tr//th[3]")
    public static WebElement author;

    @FindBy(xpath = "//thead//tr//th[4]")
    public static WebElement comment;
    @FindBy(xpath = "//thead//tr//th[5]")
    public static WebElement rating;
    @FindBy(xpath = "//thead//tr//th[6]")
    public static WebElement dated;

}
