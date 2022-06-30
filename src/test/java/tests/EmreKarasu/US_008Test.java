package tests.EmreKarasu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_008Test {
    TradylinnPage trd =new TradylinnPage();



    @Test
    public void TC_001_ve_TC_002() throws InterruptedException {
                        //TC_001
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle(5);

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,250)");

        trd.urun.click();
        trd.urun.clear();
        Thread.sleep(5000);

        trd.yeniEkle.click();
        Thread.sleep(5000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        trd.manageStockTik.click();
        Thread.sleep(5000);

        trd.manageStockKutu.click();
        trd.manageStockKutu.clear();
        Thread.sleep(5000);

        trd.manageStockKutu.sendKeys("20" + Keys.ENTER);
        Thread.sleep(3000);

        System.out.println(trd.manageStockKutu.getText());
        Assert.assertTrue(trd.manageStockKutu.getText().contains("20"));


                        //TC_002
        if (!trd.Allow.isSelected()) {
            trd.Allow.click();
        }

        if (!trd.AllowButNotifyCustomer.isSelected()) {
            trd.AllowButNotifyCustomer.click();
        }

        if (!trd.DoNotAllow.isSelected()) {
            trd.DoNotAllow.click();
        }

        Driver.closeDriver();

    }
}