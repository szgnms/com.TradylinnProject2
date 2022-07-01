package tests.MuhammedSezgin;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_001test extends TestBaseRapor {
    TradylinnPage trd =new TradylinnPage();

    SoftAssert sf = new SoftAssert();

    //Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz
    @Test
    public void becomeVendor() {
        extentTest=extentReports.createTest("Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz");
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Url`ye gidilir");
        ReusableMethods.bekle(5);
         trd.uyeOlButton.click();
        extentTest.info("uye ola tiklanir");
         trd.vendorButton.click();
        extentTest.info("become a vendor a tiklanir");
       // sf.assertTrue( trd.vendorRegisterPage.isDisplayed());
        extentTest.pass("vendor registration sayfasinin acildigi dogrulanir");
       // sf.assertAll();
    }

    @Test
    public void registertrdControl() {
        becomeVendor();
        sf.assertTrue( trd.emailBlock.isEnabled());
        sf.assertTrue( trd.emailBlock.isDisplayed());
        sf.assertTrue( trd.passwordBlock.isDisplayed());
        sf.assertTrue( trd.passwordBlock.isEnabled());
        sf.assertTrue( trd.confPasswordBlock.isDisplayed());
        sf.assertTrue( trd.confPasswordBlock.isEnabled());
        sf.assertAll();
    }

    @Test
    public void emptyEmail() {
        becomeVendor();
         trd.emailBlock.sendKeys("");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerEmailErrorBosMail.isDisplayed());
        sf.assertAll();
    }

    @Test(groups = "negatifSmokeTest")
    public void validEmailControl() {
        becomeVendor();
         trd.emailBlock.sendKeys("adasdasdasda");
        extentTest.info("Yanlis E-mail Gonderildi.");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        extentTest.info("Gecerli Password Gonderildi.");
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
        extentTest.info("Gecerli Confirm Password Gonderildi.");
         trd.registerButton.click();
        extentTest.info("Register Butonu Clik Yapildi.");
       // sf.assertTrue( trd.registerEmailErrorYanlisMail.isDisplayed());
        extentTest.info(" Yanlis Email Texti goruldu.");
        ReusableMethods.bekle(5);
       // sf.assertAll();

    }

    @Test
    public void uniqueEmailControl() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerEmailErrorExistsMail.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void strongPassControl() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("123456"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }
    @Test
    public void strongPassControl1() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("123456**"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void strongPassControl2() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerPasswordErrorAtleastGood.isDisplayed());
        sf.assertAll();
    }
    @Test
    public void strongPassControl3() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("123456**aa"));
        sf.assertTrue( trd.registerPasswordVerifyGood.isDisplayed());
         trd.registerButton.click();
        sf.assertAll();
    }
    @Test
    public void  PassControl() {
        becomeVendor();
         trd.emailBlock.sendKeys("tradEmail");
         trd.passwordBlock.sendKeys(ConfigReader.getProperty("tradPass"));
         trd.confPasswordBlock.sendKeys(ConfigReader.getProperty("123123123"));
         trd.registerButton.click();
        sf.assertTrue( trd.registerPasswordErrorNotSame.isDisplayed());
        sf.assertAll();
    }

    @Test
    public void  verifyMail() {
        ReusableMethods.traddylinnCreateAccount();
        sf.assertTrue( trd.registerSuccess.isDisplayed());
        ReusableMethods.tradylinnGmailAccountSubmit();
    }







}

