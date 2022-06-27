package pages.MuhammedSezgin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_002page {


    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountText;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-content col-md-9 pt-2']//p")
    public List<WebElement> accountELementList;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation col-md-3 mb-8']//li")
    public List<WebElement> dashboardList;

}