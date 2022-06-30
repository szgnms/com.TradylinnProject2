package tests.Team34;

import org.openqa.selenium.*;
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
import utilities.TestBaseRapor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US_006test extends TestBaseRapor {

    TradylinnPage trd = new TradylinnPage();

    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();


    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("tradyLinnUrl"));
    }

    @Test
    public void TC01() throws InterruptedException {
        extentTest = extentReports.createTest("US006 TC01", "Secilen ürünlerin kategorileri belirlenebilmeli");
        trd.yapGiris.click();
        trd.emailButon.sendKeys(ConfigReader.getProperty("emailT"));
        trd.passwordButon.sendKeys(ConfigReader.getProperty("passwordT"));
        trd.girisYap2.click();
        ReusableMethods.waitFor(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        try {
            trd.hesabimButonu.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(trd.hesabimButon));
            trd.hesabimButonu.click();

        }

        trd.storeManagerButon.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        trd.urunButonn.click();
        ReusableMethods.waitFor(3);
        trd.yeniEkleButon.click();

        softAssert.assertTrue(trd.categories.isDisplayed());

        List<WebElement> categoriesList=new ArrayList<>();
        categoriesList.add(trd.besinTakviyeleri);
        Thread.sleep(2000);
        categoriesList.add(trd.cokSatanlar);
        Thread.sleep(2000);
        categoriesList.add(trd.elektrik);
        Thread.sleep(2000);
        categoriesList.add(trd.evYasam);
        Thread.sleep(2000);
        categoriesList.add(trd.indirimli);
        Thread.sleep(2000);
        categoriesList.add(trd.kmf);
        Thread.sleep(2000);
        categoriesList.add(trd.kozmetik);
        Thread.sleep(2000);
        categoriesList.add(trd.modaGiyim);
        Thread.sleep(2000);
        categoriesList.add(trd.oyuncak);
        Thread.sleep(2000);
        categoriesList.add(trd.takiAksesuar);
        Thread.sleep(2000);
        categoriesList.add(trd.yeniUrunler);

        ReusableMethods.waitFor(3);

        for (WebElement each:categoriesList) {

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", each);
            softAssert.assertTrue(each.isSelected());

        }
        extentTest.info("Kullanici secilen urunlerin kategorilerini belirleyebildi");
        extentTest.pass("US006 TC01 PASSED");

    }
    @AfterClass
    public void tearDown() {
        softAssert.assertAll();
        Driver.closeDriver();
    }


}
