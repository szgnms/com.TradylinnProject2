package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_001page {


    @FindBy(xpath = " //*[@id='product_cats_checklist']//li")
    public List<WebElement> category;



}