package tests.SeckinKaraca;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_21test extends TestBaseRapor {
    
    TradylinnPage trd = new TradylinnPage();
    
    @Test
    public void testCase01() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
         trd.raporlar.click();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.yillikRapor.click();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        Assert.assertTrue( trd.yillikRapor.isEnabled());
        ReusableMethods.bekle(5);


        Driver.closeDriver();

    }

    @Test
    public void testCase02() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
         trd.raporlar.click();
        ReusableMethods.birAsagi(3);
         trd.enSonAy.click();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        Assert.assertTrue( trd.enSonAy.isEnabled());
        ReusableMethods.bekle(5);

        Driver.closeDriver();

    }
    @Test
    public void testCace03(){
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
         trd.raporlar.click();
        ReusableMethods.birAsagi(3);
         trd.buAy.click();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        Assert.assertTrue( trd.buAy.isEnabled());
        ReusableMethods.bekle(5);

        Driver.closeDriver();

    }
    @Test
    public void testCase04() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
         trd.raporlar.click();
        ReusableMethods.birAsagi(3);
         trd.sonYediGun.click();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        Assert.assertTrue( trd.sonYediGun.isEnabled());
        ReusableMethods.bekle(5);

        Driver.closeDriver();

    }

    @Test (groups = "smoketests")
    public void testCase05() {
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
         trd.raporlar.click();
        extentTest.info("Raporlar Butonuna Click Yapildi.");
        ReusableMethods.birAsagi(3);
        Assert.assertTrue( trd.birGunsec.isEnabled());
        ReusableMethods.bekle(5);
        // trd.birGunsec.click();
        ReusableMethods.bekle(5);
        extentTest.info("Son 7 Gunluk Satis Raporlari Alindi.");
        ReusableMethods.sayfaAlti();
       // ReusableMethods.bekle(5);
         //trd.ikiHaziran.click();
        // trd.onAltiHaziran.click();
      //  ReusableMethods.bekle(5);
       // String expectedYaziElementi="Sales by Date - From 2022-06-02 to 2022-07-02";
       // String actuelYaziElementi= trd.yaziElementi.getText();
       // SoftAssert sf = new SoftAssert();
        //sf.assertEquals(expectedYaziElementi, actuelYaziElementi);
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
