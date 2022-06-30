package tests.HabibeTurkucu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.*;

public class Us_003Test {


    TradylinnPage trd =new TradylinnPage();


    Select select ;


    public void alisverisSayfasi() {
        ReusableMethods.tradylinnHesabim();
        WebElement element = Driver.getDriver().findElement(By.xpath("(//*[@href='https://tradylinn.com/my-account-2/orders/'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);
        WebElement alisVeriseDevam = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", alisVeriseDevam);
        executor.executeScript("arguments[0].click();", alisVeriseDevam);

    }


    @Test
    public void ordersBrowse() throws InterruptedException {

        // TC001
        ReusableMethods.tradylinnHesabim();
        Thread.sleep(500);
        // siparişler butonuna click yapmayı executor ile yapmak gerekti.
        WebElement element = Driver.getDriver().findElement(By.xpath("(//*[@href='https://tradylinn.com/my-account-2/orders/'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);

        //aliseverise devam butonu gorunesiye kadar sayfa asağı insin,gorduğunde click yapsın.
        WebElement alisVeriseDevam = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", alisVeriseDevam);
        executor.executeScript("arguments[0].click();", alisVeriseDevam);


        WebElement vsSiralama = Driver.getDriver().findElement(By.xpath("//form[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']"));
        Assert.assertTrue(vsSiralama.isDisplayed());

    }


    //5 urun secilmeli ve secilen urunler sepete atılmalı


    @Test
    public void test001() throws InterruptedException {
        //Kullanici www.tradylinn.com adresine gider
        ReusableMethods.tradylinnGiris();


        //Orders a tiklar
        trd.order1.click();

        //Browse products a tiklar
        ReusableMethods.clickWithJS(trd.alisVeriseDevam);
        //stogu olan urun uzerine tiklar
        trd.tShirt.click();
        //Sepete ekle butonuna tiklar
        for (int i = 0; i < 5; i++) {
            ReusableMethods.clickWithJS(trd.sepeteEkleButon);
            Thread.sleep(2000);
        }
        //Sepete tiklar
        ReusableMethods.clickWithJS(trd.sepet);
        //Go to payment page e tiklanir
        ReusableMethods.clickWithJS(trd.odemeSayfasi);
        trd.isimKutusu.clear();
        //Ad  kutusu tiklanir ve doldurulur
        trd.isimKutusu.sendKeys("Emir");
        trd.soyIsimKutusu.clear();
        //Soyad kutusu tiklanir ve doldurulur
        trd.soyIsimKutusu.sendKeys("Ercik");
        trd.firma.clear();
        //Firma adi  kutusu tiklanir ve doldurulur
        trd.firma.sendKeys("TechPro");
        trd.adres1.clear();
        //sokak adresi  kutusu tiklanir ve doldurulur
        trd.adres1.sendKeys("Tradylinn sok.");
        trd.adres2.clear();
        //ikinci sokak adresi  kutusu tiklanir ve doldurulur
        trd.adres2.sendKeys("Vip konut");
        trd.postaKodu.clear();
        //Posta kodu  kutusu tiklanir ve doldurulur
        trd.postaKodu.sendKeys("01000");
        trd.ilce.clear();
        //Ilce / semt  kutusu tiklanir ve doldurulur
        trd.ilce.sendKeys("Mezitli");
        select = new Select(trd.ddm);
        select.selectByVisibleText("Mersin");
        trd.telefon.clear();
        //Telefon  kutusu tiklanir ve doldurulur
        trd.telefon.sendKeys("05305425698");
        trd.eMail.clear();
        //E posta  kutusu tiklanir ve doldurulur
        trd.eMail.sendKeys("team33@gmail.com");
        //Teslimat  kutusu tiklanir ve doldurulur
        trd.teslimat.sendKeys("Adana");
        //Place (Confirm) Order a tiklanir
        ReusableMethods.clickWithJS(trd.siparisOnay);
        //Siparisin onaylandigi gorulur
        Assert.assertTrue(trd.sipariOnayMetni.isDisplayed());
        //sepete ve oradan checkouta gidilmeli

    }
    @Test
    public void checkOut() throws InterruptedException {
        ReusableMethods.tradylinnGiris();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
        Thread.sleep(10000);
        List<WebElement> sepettekiUrunler = new ArrayList<>();
        sepettekiUrunler.add( trd.urun1);
        sepettekiUrunler.add( trd.urun2);
        sepettekiUrunler.add( trd.urun3);
        sepettekiUrunler.add( trd.urun4);
        sepettekiUrunler.add( trd.urun5);


        for (int i = 0; i < 5; i++) {
            Assert.assertTrue(sepettekiUrunler.get(i).isDisplayed());
            ReusableMethods.birAsagi(1);
        }

         trd.odemeButton.click();
        Assert.assertTrue( trd.faturaTablosu.isDisplayed());


    }


    @Test
    public void siparisOnaylama() {
        ReusableMethods.tradylinnStoreManager();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
         trd.checkOut.click();
        Assert.assertTrue( trd.faturaTablosu.isDisplayed());
         trd.isim.sendKeys("ayse");
         trd.syisim.sendKeys("akca");
         trd.sokakAdres.sendKeys("123 sok no 25");
        ReusableMethods.birAsagi(1);
         trd.postaKodu.sendKeys("1020");
         trd.ilce.sendKeys("baglar");
        ReusableMethods.birAsagi(1);
         trd.teslimatAdresi.sendKeys("1525 sok no 21");
         trd.siparisOnayla.click();
        Assert.assertTrue( trd.tesekkurYazisi.isDisplayed());

    }


}


