package tests.ErenUstaoglu;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013test {


    TradylinnPage trd =new TradylinnPage();


    JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    public US_013test(){
    }

    @Test
    public void TC_001() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        //Vendor "Giriş yap" butonuna tiklar
        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu2)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //"Vendor ""Coupons Listing"" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder
        String actualCode = kuponKodu;
        String expectedCode =  trd.birinciSiradakiKupon.getText();
        Assert.assertEquals(actualCode, expectedCode);
        Driver.getDriver().close();
    }

    @Test
    public void TC_002() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        //Vendor "Giriş yap" butonuna tiklar
      ReusableMethods.tradylinnStoreManager();

        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Description" inputuna aciklama girer
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String tanim = faker.lorem().characters(50, 100);
         trd.descriptionInput.sendKeys(tanim);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Action'indaki "Düzenlemek" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        //"Vendor ""Edit Coupon"" bolumunde girmis oldugu Description'in görünüyor oldugunu test eder
        String actualTanim =  trd.descriptionInput.getText();
        String expectedTanim = tanim;
        Assert.assertEquals(actualTanim, expectedTanim);
        Driver.getDriver().close();
    }

    @Test
    public void TC_003() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Discount Type" ta bir Dropdown secer
        Select select = new Select( trd.discountTypeDropDown);
        select.selectByIndex(0);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Coupons Listing" bolumunde girmis oldugu Code'un Type'inin secmis oldugu Dropdown oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        String expectedDiscountType = "Percentage discount";
        String actualDiscountType = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDiscountType, expectedDiscountType);
        Driver.getDriver().close();
    }


    @Test
    public void TC_004() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Coupon Amount" satirina bir kupon tutari girer
        String kuponSayisi = "20";
        actions
                .click( trd.descriptionInput)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kuponSayisi)
                .perform();
        Thread.sleep(3000);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Amount'unun girdigi deger oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.couponAmount);
        String actualAmount =  trd.couponAmount.getAttribute("value");
        String expectedAmount = kuponSayisi;
        Assert.assertEquals(actualAmount, expectedAmount);
        Assert.assertTrue( trd.couponAmount.isDisplayed());
        Driver.getDriver().close();
    }

    @Test
    public void TC_005() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
       ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Coupon expiry date" satirina YYYY-MM-DD olacak sekilde gecerli bir tarih girer
         trd.expiryDateInput.sendKeys("2024-12-08");
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Expiry date'inin girdigi deger oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.expiryDateInput);
        String actualDate =  trd.expiryDateInput.getAttribute("value");
        String expectedDate = "2024-12-08";
        Assert.assertEquals(actualDate, expectedDate);
        Driver.getDriver().close();
    }

    @Test
    public void TC_006() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Allow free shipping" secenegini isaretler
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.allowFreeShippingButonu);
        je.executeScript("arguments[0].click();",  trd.allowFreeShippingButonu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un "Allow free shipping" seceneginin secili oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.allowFreeShippingButonu);
        Assert.assertTrue( trd.allowFreeShippingButonu.isSelected());
        Driver.getDriver().close();
    }

    @Test
    public void TC_007() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
         ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Show on store" secenegini isaretler
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.showOnStoreButonu);
        je.executeScript("arguments[0].click();",  trd.showOnStoreButonu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor girmis oldugu Code'un Action'indaki "Düzenlemek" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un "Show on store" seceneginin secili oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.showOnStoreButonu);
        Assert.assertTrue( trd.showOnStoreButonu.isSelected());
        Driver.getDriver().close();
    }
}
