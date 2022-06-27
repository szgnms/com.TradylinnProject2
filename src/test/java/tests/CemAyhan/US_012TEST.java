package tests.CemAyhan;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CemAyhan.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_012TEST {

    TradylinnPage tradylinnPage=new TradylinnPage();

    @Test

    public void Tc01() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        tradylinnPage.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        tradylinnPage.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(tradylinnPage.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        tradylinnPage.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        tradylinnPage.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        tradylinnPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        tradylinnPage.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        tradylinnPage.siparislerSekmesi.click();
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,450)");
        Thread.sleep(2000);

        //8.Adım
        tradylinnPage.goruntuleButonu.click(); //goruntule butonuna tıklanır
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(2000);

        //9.Adım
        Assert.assertTrue(tradylinnPage.siparisDetaylariYazisi.isDisplayed()); //siparis detayları dogrulanır
        Thread.sleep(2000);

        Driver.closeDriver();


    }

    @Test

    public void Tc02() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        tradylinnPage.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        tradylinnPage.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(tradylinnPage.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        tradylinnPage.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        tradylinnPage.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        tradylinnPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        tradylinnPage.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        tradylinnPage.indirmelerSekmesi.click();
        Thread.sleep(2000);

        //8.Adım
        Assert.assertTrue(tradylinnPage.indirmelerYazisi.isDisplayed());
        Thread.sleep(2000);

        Driver.closeDriver();

    }

    @Test

    public void Tc03() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        tradylinnPage.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        tradylinnPage.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(tradylinnPage.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        tradylinnPage.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        tradylinnPage.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        tradylinnPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        tradylinnPage.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        tradylinnPage.adresSekmesi.click();
        Thread.sleep(2000);

        //8.Adım
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //9.Adım
        Assert.assertTrue(tradylinnPage.faturaTablosu.isDisplayed());
        Thread.sleep(2000);

        //10.Adım
        Assert.assertTrue(tradylinnPage.gonderimAdresiTablosu.isDisplayed());
        Thread.sleep(2000);

        Driver.closeDriver();


    }

    @Test

    public void Tc04() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        tradylinnPage.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        tradylinnPage.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(tradylinnPage.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        tradylinnPage.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        tradylinnPage.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        tradylinnPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        tradylinnPage.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        tradylinnPage.hesapDetaylariSekmesi.click();
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

        //8.Adım
        tradylinnPage.adSekmesi.clear();
        Thread.sleep(2000);
        tradylinnPage.adSekmesi.sendKeys("Cem");
        Thread.sleep(2000);

        //9.Adım
        tradylinnPage.soyadSekmesi.clear();
        Thread.sleep(2000);
        tradylinnPage.soyadSekmesi.sendKeys("Ayhan");
        Thread.sleep(2000);

        //10.Adım
        tradylinnPage.gorunenAdSekmesi.clear();
        Thread.sleep(2000);
        tradylinnPage.gorunenAdSekmesi.sendKeys("Ayhan Store");
        Thread.sleep(2000);

        //11.Adım
        tradylinnPage.emailHesapDetayi.clear();
        Thread.sleep(2000);
        tradylinnPage.emailHesapDetayi.sendKeys("aycem@gmail.com");
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(2000);

        //12.Adım
        tradylinnPage.degisiklikleriKaydetButonu.click();
        Thread.sleep(2000);

        Driver.closeDriver();

    }
}
