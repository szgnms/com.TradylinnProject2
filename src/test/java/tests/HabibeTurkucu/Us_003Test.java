package tests.HabibeTurkucu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HabibeTurkucu.US_003Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Us_003Test {


    US_003Page usPage3 = new US_003Page();

    public void alisverisSayfası() {
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
        //ReusableMethods.tradylinnStoreManager();
        // ReusableMethods.tradylinnGiris();
        Thread.sleep(500);
        // siparişler butonuna click yapmayı executor ile yapmak gerekti.
        WebElement element = Driver.getDriver().findElement(By.xpath("(//*[@href='https://tradylinn.com/my-account-2/orders/'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);

        //aliseverise devam butonu gorunesiye kadar sayfa asağı insin,gorduğunde click yapsın.
        WebElement alisVeriseDevam = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", alisVeriseDevam);
        executor.executeScript("arguments[0].click();", alisVeriseDevam);


        WebElement vsSıralama = Driver.getDriver().findElement(By.xpath("//form[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']"));
        Assert.assertTrue(vsSıralama.isDisplayed());

    }


    //5 urun secilmeli ve secilen urunler sepete atılmalı

    @Test
    public void sepeteUrunEkle() throws InterruptedException {
        alisverisSayfası();
        // urunleri liste atadık. Urun sayı degismesine tedbiren size olarak aldık.
        List<WebElement> urunlerList = Driver.getDriver().findElements(By.xpath("(//*[@class='product-wrap'])"));
        int urunSayisi = urunlerList.size();
        int urunAdedi = Integer.parseInt(Driver.getDriver().findElement(By.xpath("//*[@class='cart-count']")).getText());


        //sepete 5 urun ekleyelim
        while (urunAdedi <= 5) {
            Random rastgele = new Random();
            int kacinciUrun = rastgele.nextInt(urunSayisi);
            String urn = "(//*[@class='product-wrap'])" + "[" + kacinciUrun + "]";
            System.out.println(urn);
           WebElement urnElemnt=Driver.getDriver().findElement(By.xpath("(//*[@class='product-wrap'])" + "[" + kacinciUrun + "]/div"));
            urnElemnt.click();
                        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", urnElemnt);
//            executor.executeScript("arguments[0].click();", urnElemnt);
//            urnElemnt.click();
            ReusableMethods.bekle();
            if (usPage3.sepeteEkleButton.isDisplayed()) {
                usPage3.sepeteEkleButton.click();
                urunlerList.add(urnElemnt);
            }
            Driver.getDriver().navigate().back();
        }

        //sepette 5 urun oldugunu doğruyalim
        Assert.assertTrue(urunAdedi == 5);

    }


    //sepete ve oradan checkouta gidilmeli
    @Test
    public void checkOut(){
//       sepeteUrunEkle();
       usPage3.sepetim.click();
       usPage3.sepetiGoruntule.click();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", usPage3.checkOut);
        executor.executeScript("arguments[0].click();",usPage3.checkOut);

        Assert.assertTrue(usPage3.faturaTablosu.isDisplayed());


    }


}