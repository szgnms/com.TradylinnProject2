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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US_005Test extends TestBaseRapor {

     TradylinnPage trd = new TradylinnPage();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @BeforeClass

    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("tradyLinnUrl"));

         trd.yapGiris.click();
         trd.emailButon.sendKeys(ConfigReader.getProperty("emailT"));
         trd.passwordButon.sendKeys(ConfigReader.getProperty("passwordT"));
         trd.girisYap2.click();
        ReusableMethods.waitFor(3);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        try {
             trd.hesabimButonu.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf( trd.hesabimButon));
             trd.hesabimButonu.click();

        }

         trd.storeManagerButon.click();
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //  trd.urunButonn.click();
        js.executeScript("arguments[0].click();",  trd.urunButonn);
        ReusableMethods.waitFor(3);


    }

    @Test(priority = 1)
    public void TC01()  {
        extentTest = extentReports.createTest("US005 TC01", "Productsta urun listesi, status, stock, price, date gorulmeli");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue( trd.listeGorunum.isDisplayed());
        softAssert.assertTrue( trd.statusGorunum.isDisplayed());
        softAssert.assertTrue( trd.stockGorunum.isDisplayed());
        softAssert.assertTrue( trd.priceGorunum.isDisplayed());
        softAssert.assertTrue( trd.dateGorunum.isDisplayed());
        ReusableMethods.waitFor(3);
        extentTest.info("Kullanici productsta urun listesi, status, stock, price, date gordu ");
        extentTest.pass("US005 TC01 PASSED");
    }

    @Test(priority = 2)
    public void TC02(){
        extentTest = extentReports.createTest("US005 TC01", "Yeni eklenecek urun icin virtual veya downloadable secenegi gorulebilmeli");
         trd.yeniEkleButon.click();
        js.executeScript("arguments[0].click();",  trd.yeniEkleButon);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue( trd.virtualGorunum.isDisplayed());
        softAssert.assertTrue( trd.downGorunum.isDisplayed());
        extentTest.info("Kullanici urun icin virtual veya downloadable seceneklerini gordu");
        extentTest.pass("US005 TC02 PASSED");

    }

    @Test(priority = 3)
    public void TC03(){
        extentTest = extentReports.createTest("US005 TC03", "Urun  eklerken product title ve satis miktari bilgileri girilebilmeli");
        js.executeScript("arguments[0].click();",  trd.yeniEkleButon);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue( trd.titleGorunum.isDisplayed());
        softAssert.assertTrue( trd.priceeGorunum.isDisplayed());
        softAssert.assertTrue( trd.salePriceGorunum.isDisplayed());
        actions.click( trd.titleGorunum).sendKeys("Amigurumi Bebek").sendKeys(Keys.TAB).
                sendKeys("200").sendKeys(Keys.TAB).sendKeys("150").perform();
        softAssert.assertTrue( trd.titleGiris.isDisplayed());
        ReusableMethods.waitFor(3);
        extentTest.info("Kullanici urun icin product title ve satis miktari girdi");
        extentTest.pass("US005 TC03 PASSED");


    }
    @Test(priority = 4)
    public void TC04() throws InterruptedException, AWTException {
        extentTest = extentReports.createTest("US005 TC04", "Urun fotografi eklenebilmeli");
        js.executeScript("arguments[0].click();",  trd.yeniEkleButon);
         trd.dosyaYukle.click();
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();",  trd.dosyaYukle);
        js.executeScript("window.scrollBy(0,200)");
         trd.dosyaSecinButon.click();
        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\efetu\\Desktop\\amigurumi\\amigurumi harry poter.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
         trd.sec.click();
        softAssert.assertTrue( trd.foto.isDisplayed());
        // raporlama yapildi
        extentTest.info("Kullanici urun fotografi ekledi");
        extentTest.pass("US005 TC04 PASSED");
    }
    @Test(priority = 5)
    public void TC05()  {
        extentTest = extentReports.createTest("US005 TC05", "Short description, Description kisimlarina bilgi girilebilmeli");
        js.executeScript("arguments[0].click();",  trd.yeniEkleButon);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue( trd.shortDescriptionGorunum.isDisplayed());
        softAssert.assertTrue( trd.descriptionGorunum.isDisplayed());
        WebElement iframe= Driver.getDriver().findElement(By.id("excerpt_ifr"));
        Driver.getDriver().switchTo().frame(iframe);
        js.executeScript("arguments[0].click();",  trd.shortDescriptionText);
         trd.shortDescriptionText.sendKeys("Amigurumi Organik Bebek");
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement iframeIki=Driver.getDriver().findElement(By.id("description_ifr"));
        Driver.getDriver().switchTo().frame(iframeIki);
        js.executeScript("arguments[0].click();",  trd.descriptionText);
         trd.descriptionText.sendKeys("Amigurumi bebek organik iplerden uretilmistir");
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Kullanici short description, description kisimlarina bilgi girdi");
        extentTest.pass("US005 TC05 PASSED");


    }

    @AfterClass
    public void tearDown() {
        softAssert.assertAll();
        Driver.closeDriver();
    }

        
        }
