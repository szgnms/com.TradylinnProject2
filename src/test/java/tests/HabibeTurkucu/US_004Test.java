package tests.HabibeTurkucu;

import org.asynchttpclient.request.body.generator.ReactiveStreamsBodyGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HabibeTurkucu.US_004Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_004Test {

    US_004Page us_004Page= new US_004Page();

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
    public void sepetteUrunlerGoruntulenir(){
       ReusableMethods.tradylinnHesabim();
       us_004Page.urun1.click();
       us_004Page.sepeteEkleButton.click();
       us_004Page.sepetim.click();
       Assert.assertTrue(us_004Page.sepetTablo.isDisplayed());
    }

    @Test
    public void urunSayisiArtırmaAzaltma(){
       ReusableMethods.tradylinnHesabim();
        us_004Page.urun1.click();
        us_004Page.sepeteEkleButton.click();
       us_004Page.sepetim.click();
       us_004Page.sepetiGoruntule.click();
       us_004Page.urunArtırma.click();
       String urunSayisi= Driver.getDriver().findElement(By.xpath("//input[@type='number']")).getText();
       int urunAdedi=Integer.parseInt(urunSayisi);
       Assert.assertTrue(Boolean.parseBoolean(urunSayisi+1));
       us_004Page.urunAzaltma.click();
       Assert.assertTrue(Boolean.parseBoolean(String.valueOf(urunAdedi-1)));

    }
    @Test
    public void clearCartileSepetiBosalt() throws InterruptedException {
        ReusableMethods.tradylinnGiris();
        us_004Page.urun1.click();
        us_004Page.sepeteEkleButton.click();
        us_004Page.sepetim.click();
        us_004Page.sepetiGoruntule.click();
        us_004Page.temizleButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(us_004Page.sepetBosYazisi.isDisplayed());
    }

    @Test
    public void cupponSecenegiOlmali(){
        ReusableMethods.tradylinnGiris();
        alisverisSayfası();

        List<WebElement> urunlerList = Driver.getDriver().findElements(By.xpath("(//*[@class='product-wrap'])"));
        int urunSayisi = urunlerList.size();
        int urunAdedi = Integer.parseInt(Driver.getDriver().findElement(By.xpath("//*[@class='cart-count']")).getText());

        while (urunAdedi <= 5) {
            Random rastgele = new Random();
            int kacinciUrun = rastgele.nextInt(urunSayisi);
            String urn = "(//*[@class='product-wrap'])" + "[" + kacinciUrun + "]";
            System.out.println(urn);
            WebElement urnElemnt = Driver.getDriver().findElement(By.xpath("(//*[@class='product-wrap'])" + "[" + kacinciUrun + "]/div"));
            urnElemnt.click();
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", urnElemnt);
            executor.executeScript("arguments[0].click();", urnElemnt);
            urnElemnt.click();
            ReusableMethods.bekle();
            if (us_004Page.sepeteEkleButton.isDisplayed()) {
                us_004Page.sepeteEkleButton.click();
                urunlerList.add(urnElemnt);
            }
            Driver.getDriver().navigate().back();
        }
        us_004Page.sepetim.click();
        us_004Page.sepetiGoruntule.click();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
      Assert.assertTrue(us_004Page.kuponButton.isDisplayed());
      us_004Page.kuponGir.sendKeys("123");
      us_004Page.kuponButton.click();
    }

    @Test
    public void alisveriseDevamEt(){
        ReusableMethods.tradylinnHesabim();
        alisverisSayfası();
        us_004Page.urun1.click();
        us_004Page.sepeteEkleButton.click();
        us_004Page.sepetim.click();
        us_004Page.sepetiGoruntule.click();
        us_004Page.alisveriseDevamet.click();
        Assert.assertTrue(us_004Page.varsayılanSıralama.isDisplayed());
    }

    @Test
    public void kargoBilgileri(){
        ReusableMethods.tradylinnHesabim();
        alisverisSayfası();
        us_004Page.urun1.click();
        us_004Page.sepeteEkleButton.click();
        us_004Page.sepetim.click();
        us_004Page.sepetiGoruntule.click();
        ReusableMethods.bekle();
        Assert.assertTrue(us_004Page.kargoBilgileri.isDisplayed());
        Assert.assertTrue(us_004Page.sepetToplamiYazisi.isDisplayed());
    }

    @Test
    public void odemeSayfasi(){
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.tradylinnHesabim();
        alisverisSayfası();
        us_004Page.urun1.click();
        us_004Page.sepeteEkleButton.click();
        us_004Page.sepetim.click();
        us_004Page.sepetiGoruntule.click();
        us_004Page.checkOut.click();
        Assert.assertTrue(us_004Page.faturaTablosu.isDisplayed());

    }
}
