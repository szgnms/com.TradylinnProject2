package tests.MuhammedSezgin;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MuhammedSezgin.US_001page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_001test extends TestBaseRapor {
    US_001page us1 = new US_001page();

    SoftAssert sf = new SoftAssert();

    //Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz
    @Test
    public void becomeVendor() {
        extentTest=extentReports.createTest("Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz");
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Url`ye gidilir");
        ReusableMethods.bekle();
        us1.uyeOlButton.click();
        extentTest.info("uye ola tiklanir");
        us1.vendorButton.click();
        extentTest.info("become a vendor a tiklanir");
        sf.assertTrue(us1.vendorRegisterPage.isDisplayed());
        extentTest.pass("vendor registration sayfasinin acildigi dogrulanir");
        sf.assertAll();
    }

    @Test
    public void registerPageControl() {
        becomeVendor();
        sf.assertTrue(us1.emailBlock.isEnabled());
        sf.assertTrue(us1.emailBlock.isDisplayed());
        sf.assertTrue(us1.passwordBlock.isDisplayed());
        sf.assertTrue(us1.passwordBlock.isEnabled());
        sf.assertTrue(us1.confPasswordBlock.isDisplayed());
        sf.assertTrue(us1.confPasswordBlock.isEnabled());
        sf.assertAll();
    }

    @Test
    public void emptyEmail() {
        becomeVendor();
        us1.emailBlock.sendKeys("");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerEmailErrorBosMail.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void validEmailControl() {
        becomeVendor();
        us1.emailBlock.sendKeys("adasdasdasda");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerEmailErrorYanlisMail.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void uniqueEmailControl() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerEmailErrorExistsMail.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void strongPassControl() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("123456"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }
    @Test
    public void strongPassControl1() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("123456**"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void strongPassControl2() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }
    @Test
    public void strongPassControl3() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
        sf.assertTrue(us1.registerPasswordVerifyGood.isDisplayed());
        us1.registerButton.click();
        sf.assertAll();
    }
    @Test
    public void  PassControl() {
        becomeVendor();
        us1.emailBlock.sendKeys("tradEmail");
        us1.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        us1.confPasswordBlock.sendKeys(ConfigReader.getProperty("123123123"));
        us1.registerButton.click();
        sf.assertTrue(us1.registerPasswordErrorNotSame.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void  verifyMail() {
        ReusableMethods.traddylinnCreateAccount();
        sf.assertTrue(us1.registerSuccess.isDisplayed());
        ReusableMethods.tradylinnGmailAccountSubmit();
    }







}

