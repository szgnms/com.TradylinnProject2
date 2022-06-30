package tests.CemAyhan;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011TEST {

     TradylinnPage trd = new TradylinnPage();

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

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        trd.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        trd.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        trd.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        trd.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        trd.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        trd.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1750)");
        Thread.sleep(2000);

        //10.Adım
        trd.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        trd.pieceTypeButonu.sendKeys("Piece"); //Piece yi seç
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
        trd.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        trd.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        trd.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(2000);

        //10.Adım
        trd.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        trd.unitsPerPieceSekmesi.clear();
        Thread.sleep(2000);
        trd.unitsPerPieceSekmesi.sendKeys("5");
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
        trd.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        trd.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        trd.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(2000);

        //10.Adım
        trd.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        trd.minOrderQuantitySekmesi.clear();
        Thread.sleep(2000);
        trd.minOrderQuantitySekmesi.sendKeys("2");
        Thread.sleep(2000);

        Driver.closeDriver();



    }
}
