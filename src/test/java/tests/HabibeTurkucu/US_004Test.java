package tests.HabibeTurkucu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
 
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_004Test {

    TradylinnPage trd =new TradylinnPage();


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
    public void sepetteUrunlerGoruntulenir(){
       ReusableMethods.tradylinnHesabim();
        trd.urun1.click();
        trd.sepeteEkleButton.click();
        trd.sepetim.click();
       Assert.assertTrue( trd.sepetTablo.isDisplayed());
    }

    @Test
    public void urunSayisiArtirmaAzaltma(){
       ReusableMethods.tradylinnHesabim();
         trd.urun1.click();
         trd.sepeteEkleButton.click();
        trd.sepetim.click();
        trd.sepetiGoruntule.click();
        trd.urunArtirma.click();
       String urunSayisi= Driver.getDriver().findElement(By.xpath("//input[@type='number']")).getText();
       int urunAdedi=Integer.parseInt(urunSayisi);
       Assert.assertTrue(Boolean.parseBoolean(urunSayisi+1));
        trd.urunAzaltma.click();
       Assert.assertTrue(Boolean.parseBoolean(String.valueOf(urunAdedi-1)));

    }
    @Test
    public void clearCartileSepetiBosalt() throws InterruptedException {
        ReusableMethods.tradylinnGiris();
         trd.urun1.click();
         trd.sepeteEkleButton.click();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
         trd.temizleButton.click();
        Thread.sleep(4000);
        Assert.assertTrue( trd.sepetBosYazisi.isDisplayed());
    }

    @Test
    public void cupponSecenegiOlmali(){
        ReusableMethods.tradylinnGiris();
        alisverisSayfasi();

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
            ReusableMethods.bekle(5);
            if ( trd.sepeteEkleButton.isDisplayed()) {
                 trd.sepeteEkleButton.click();
                urunlerList.add(urnElemnt);
            }
            Driver.getDriver().navigate().back();
        }
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
        ReusableMethods.birAsagi(2);
      Assert.assertTrue( trd.kuponButton.isDisplayed());
       trd.kuponGir.sendKeys("123");
       trd.kuponButton.click();
    }

    @Test
    public void alisveriseDevamEt(){
        ReusableMethods.tradylinnHesabim();
        alisverisSayfasi();
         trd.urun1.click();
         trd.sepeteEkleButton.click();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
         trd.alisveriseDevamet.click();

    }

    @Test
    public void kargoBilgileri(){
        ReusableMethods.tradylinnHesabim();
        alisverisSayfasi();
         trd.urun1.click();
         trd.sepeteEkleButton.click();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
        ReusableMethods.bekle(5);
        Assert.assertTrue( trd.kargoBilgileri.isDisplayed());
        Assert.assertTrue( trd.sepetToplamiYazisi.isDisplayed());
    }

    @Test
    public void odemeSayfasi(){
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.tradylinnHesabim();
        alisverisSayfasi();
         trd.urun1.click();
         trd.sepeteEkleButton.click();
         trd.sepetim.click();
         trd.sepetiGoruntule.click();
         trd.checkOut.click();
        Assert.assertTrue( trd.faturaTablosu.isDisplayed());

    }
}
