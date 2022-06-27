package tests.ErenUstaoglu;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ErenUstaoglu.US_013page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_013test {


    US_013page us_013page = new US_013page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Test
    public void TC_001() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        Thread.sleep(15000);
        //Vendor "Giriş yap" butonuna tiklar
        us_013page.anaSayfaGirisYapButonu.click();
        Thread.sleep(15000);
        //Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer
        us_013page.kullaniciAdiEmailInput.sendKeys(ConfigReader.getProperty("tradEmail"));
        //Vendor "Parola" inputuna gecerli parolayi girer
        us_013page.parolaInput.sendKeys(ConfigReader.getProperty("tradPass"));
        //Vendor "GİRİŞ YAP" butonuna tiklar
        us_013page.girisYapSubmitButonu.click();
        Thread.sleep(15000);
        //Vendor "Hesabım" butonuna tiklar
        us_013page.hesabimButonu.click();
        Thread.sleep(15000);
        us_013page.storeManagerButonu.click();
        Thread.sleep(15000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement(us_013page.kuponlarButonu)
                .click(us_013page.yeniEkleButonu)
                .perform();
        Thread.sleep(15000);
        //Vendor "Code" satirina unique bir deger girer

        //Vendor "SUBMİT" butonuna tiklar
        //Vendor "Kuponlar" butonuna tiklar
        //"Vendor ""Coupons Listing"" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder"
    }
}
