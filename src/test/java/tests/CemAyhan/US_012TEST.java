package tests.CemAyhan;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;

import utilities.ConfigReader;
import utilities.Driver;

public class US_012TEST {

    TradylinnPage trd= new TradylinnPage();


    @Test

    public void Tc01() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        trd.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        trd.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(trd.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        trd.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        trd.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        trd.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        trd.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        trd.siparislerSekmesi.click();
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,450)");
        Thread.sleep(2000);

        //8.Adım
        trd.goruntuleButonu.click(); //goruntule butonuna tıklanır
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        Thread.sleep(2000);

        //9.Adım
        Assert.assertTrue(trd.siparisDetaylariYazisi.isDisplayed()); //siparis detayları dogrulanır
        Thread.sleep(2000);

        Driver.closeDriver();


    }

    @Test

    public void Tc02() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        trd.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        trd.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(trd.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        trd.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        trd.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        trd.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        trd.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        trd.indirmelerSekmesi.click();
        Thread.sleep(2000);

        //8.Adım
        Assert.assertTrue(trd.indirmelerYazisi.isDisplayed());
        Thread.sleep(2000);

        Driver.closeDriver();

    }

    @Test

    public void Tc03() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        trd.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        trd.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(trd.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        trd.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        trd.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        trd.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        trd.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        trd.adresSekmesi.click();
        Thread.sleep(2000);

        //8.Adım
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        //9.Adım
        Assert.assertTrue(trd.faturaTablosu1.isDisplayed());
        Thread.sleep(2000);

        //10.Adım
        Assert.assertTrue(trd.gonderimAdresiTablosu.isDisplayed());
        Thread.sleep(2000);

        Driver.closeDriver();


    }

    @Test

    public void Tc04() throws InterruptedException {

        //1.Adım
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl")); //urlye git

        //2.Adım
        trd.uyeOlButonu.click(); //uye ola tıkla
        Thread.sleep(2000);

        //3.Adım
        trd.becomeWendorButonu.click(); //satıcı ol a tıkla

        //4.Adım
        Assert.assertTrue(trd.wendorRegistrationYazisi.isDisplayed()); //wendorRegistration gorunur oldugunu dogrula
        Thread.sleep(2000);

        //5.Adım
        trd.hesabimButonu.click(); //hesabım butonuna tıklanır

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        trd.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        trd.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        trd.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        trd.hesapDetaylariSekmesi.click();
        Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);

        //8.Adım
        trd.adSekmesi.clear();
        Thread.sleep(2000);
        trd.adSekmesi.sendKeys("Cem");
        Thread.sleep(2000);

        //9.Adım
        trd.soyadSekmesi.clear();
        Thread.sleep(2000);
        trd.soyadSekmesi.sendKeys("Ayhan");
        Thread.sleep(2000);

        //10.Adım
        trd.gorunenAdSekmesi.clear();
        Thread.sleep(2000);
        trd.gorunenAdSekmesi.sendKeys("Ayhan Store");
        Thread.sleep(2000);

        //11.Adım
        trd.emailHesapDetayi.clear();
        Thread.sleep(2000);
        trd.emailHesapDetayi.sendKeys("aycem@gmail.com");
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(2000);

        //12.Adım
        trd.degisiklikleriKaydetButonu.click();
        Thread.sleep(2000);

        Driver.closeDriver();

    }
}
