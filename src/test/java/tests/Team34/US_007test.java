package tests.Team34;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class US_007test {
    TradylinnPage trd = new TradylinnPage();

    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("tradyLinnUrl"));
    }

    @Test
    public void test001() throws  IOException {

        trd.girisYap.click();
        trd.emailButon.sendKeys(ConfigReader.getProperty("email"));
        trd.passwordButon.sendKeys(ConfigReader.getProperty("password"));
        trd.girisYap2.click();
        ReusableMethods.waitFor(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        try {
            trd.hesabimButon.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(trd.hesabimButon));
            trd.hesabimButon.click();
        }
        trd.storeManagerButon.click();
        trd.urunButon.click();
        trd.yeniEkleButon.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        List<WebElement> brands = new ArrayList<>();
        brands.add(trd.elegantAutoGroup);
        brands.add(trd.greenGrass);
        brands.add(trd.nodeJs);
        brands.add(trd.ns8);
        brands.add(trd.red);
        brands.add(trd.skySuite);
        brands.add(trd.sterling);
        ReusableMethods.waitFor(3);

        for (WebElement w:brands
        ) {
            w.click();
            softAssert.assertTrue(w.isSelected());
        }
        ReusableMethods.getScreenshot("brands");
    }
    @AfterClass
    public void tearDown() {
        softAssert.assertAll();
        Driver.closeDriver();
    }

}
