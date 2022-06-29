package pages.MustafaVarlik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_005Page {

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement urunSekmesi;


    @FindBy(xpath = "//th[@aria-label='Status']")
    public WebElement status;


    @FindBy(xpath = "//th[@aria-label='Stock']")
    public WebElement stock;


    @FindBy(xpath = "//th[@aria-label='Price: activate to sort column ascending']")
    public WebElement price;


    @FindBy(xpath = "//a[@data-tip='Add New Product']")
    public WebElement addNewProduct;

@FindBy(xpath = "//p[text()='Virtual']")
    public WebElement virtual;


@FindBy(xpath = "//p[text()='Downloadable']")
    public WebElement downloadable;

}
