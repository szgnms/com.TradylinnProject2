package tests.CemAyhan;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CemAyhan.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011TEST {

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

        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js.executeScript("window.scrollBy(0,300)");

        //6.Adım
        tradylinnPage.hesabimEmailsekmesi.sendKeys(ConfigReader.getProperty("tradEmail"));
        tradylinnPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("tradPass"));
        tradylinnPage.hesabimGirisButonu.click(); //mail ve parola gir girise tıkla
        Thread.sleep(2000);

        //7.Adım
        tradylinnPage.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        tradylinnPage.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        tradylinnPage.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor)Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1750)");
        Thread.sleep(2000);

        //10.Adım
        tradylinnPage.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        tradylinnPage.pieceTypeButonu.sendKeys("Piece"); //Piece yi seç
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
        tradylinnPage.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        tradylinnPage.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        tradylinnPage.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(2000);

        //10.Adım
        tradylinnPage.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        tradylinnPage.unitsPerPieceSekmesi.clear();
        Thread.sleep(2000);
        tradylinnPage.unitsPerPieceSekmesi.sendKeys("5");
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
        tradylinnPage.storeManagerButonu.click(); //store managera tıkla
        Thread.sleep(2000);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);

        //8.Adım
        tradylinnPage.urunSekmesi.click(); //urun sekmesine tıkla
        Thread.sleep(2000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,500)");

        //9.Adım
        tradylinnPage.yeniUrunEkleButonu.click(); //yeni ürün ekleye tıkla
        Thread.sleep(2000);

        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js3.executeScript("window.scrollBy(0,1700)");
        Thread.sleep(2000);

        //10.Adım
        tradylinnPage.toptanUrunGostermeSekmesi.click(); //toptanurungostermeye tıkla
        Thread.sleep(2000);

        //11.Adım
        tradylinnPage.minOrderQuantitySekmesi.clear();
        Thread.sleep(2000);
        tradylinnPage.minOrderQuantitySekmesi.sendKeys("2");
        Thread.sleep(2000);

        Driver.closeDriver();



    }
}
