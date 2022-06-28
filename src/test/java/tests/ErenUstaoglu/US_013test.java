package tests.ErenUstaoglu;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ErenUstaoglu.US_013page;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;


public class US_013test {


    US_013page us_013page = new US_013page();

    JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    Robot robot = new Robot();

    public US_013test() throws AWTException {
    }

    @Test
    public void TC_001() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(10000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(10000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //"Vendor ""Coupons Listing"" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder
        String actualCode = kuponKodu;
        String expectedCode = us_013page.birinciSiradakiKupon.getText();
        Assert.assertEquals(actualCode, expectedCode);
        Driver.getDriver().close();
    }

    @Test
    public void TC_002() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(10000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(10000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Description" inputuna aciklama girer
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String tanim = faker.lorem().characters(50, 100);
        us_013page.descriptionInput.sendKeys(tanim);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Action'indaki "Düzenlemek" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        //"Vendor ""Edit Coupon"" bolumunde girmis oldugu Description'in görünüyor oldugunu test eder
        String actualTanim = us_013page.descriptionInput.getText();
        String expectedTanim = tanim;
        Assert.assertEquals(actualTanim, expectedTanim);
        Driver.getDriver().close();
    }

    @Test
    public void TC_003() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(10000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(10000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Discount Type" ta bir Dropdown secer
        Select select = new Select(us_013page.discountTypeDropDown);
        select.selectByIndex(0);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Coupons Listing" bolumunde girmis oldugu Code'un Type'inin secmis oldugu Dropdown oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        String expectedDiscountType = "Percentage discount";
        String actualDiscountType = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDiscountType, expectedDiscountType);
        Driver.getDriver().close();
    }


    @Test
    public void TC_004() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(5000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(5000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Coupon Amount" satirina bir kupon tutari girer
        String kuponSayisi = "20";
        actions
                .click(us_013page.descriptionInput)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kuponSayisi)
                .perform();
        Thread.sleep(3000);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Amount'unun girdigi deger oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ikinciCouponAmountInput);
        String actualAmount = us_013page.couponAmount.getAttribute("value");
        String expectedAmount = kuponSayisi;
        Assert.assertEquals(actualAmount, expectedAmount);
        Assert.assertTrue(us_013page.couponAmount.isDisplayed());
        Driver.getDriver().close();
    }

    @Test
    public void TC_005() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(5000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(5000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Coupon expiry date" satirina YYYY-MM-DD olacak sekilde gecerli bir tarih girer
        us_013page.expiryDateInput.sendKeys("2024-12-08");
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Expiry date'inin girdigi deger oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.expiryDateInput);
        String actualDate = us_013page.expiryDateInput.getAttribute("value");
        String expectedDate = "2024-12-08";
        Assert.assertEquals(actualDate, expectedDate);
        Driver.getDriver().close();
    }

    @Test
    public void TC_006() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(5000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(5000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Allow free shipping" secenegini isaretler
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.allowFreeShippingButonu);
        je.executeScript("arguments[0].click();", us_013page.allowFreeShippingButonu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un "Allow free shipping" seceneginin secili oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.allowFreeShippingButonu);
        Assert.assertTrue(us_013page.allowFreeShippingButonu.isSelected());
        Driver.getDriver().close();
    }

    @Test
    public void TC_007() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(5000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradyEmailEren"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradyPasswordEren"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(10000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(5000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
        us_013page.codeInput.sendKeys(kuponKodu);
        //Vendor "Show on store" secenegini isaretler
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.showOnStoreButonu);
        je.executeScript("arguments[0].click();", us_013page.showOnStoreButonu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.kuponSubmitButonu);
        je.executeScript("arguments[0].click();", us_013page.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
        us_013page.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Action'indaki "Düzenlemek" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();", us_013page.ilkUrunDuzenlemek);
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un "Show on store" seceneginin secili oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);", us_013page.showOnStoreButonu);
        Assert.assertTrue(us_013page.showOnStoreButonu.isSelected());
        Driver.getDriver().close();
    }
}
