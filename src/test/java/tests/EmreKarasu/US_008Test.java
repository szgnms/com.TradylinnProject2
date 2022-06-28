package tests.EmreKarasu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmreKarasu.US_08_09_10_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;

public class US_008Test {
    US_08_09_10_Page page = new US_08_09_10_Page();

    @Test
    public void TC_001_ve_TC_002() throws InterruptedException, IOException {
                        //TC_001
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,250)");

        page.urun.click();
        page.urun.clear();
        Thread.sleep(5000);

        page.yeniEkle.click();
        Thread.sleep(5000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        page.manageStockTik.click();
        Thread.sleep(5000);

        page.manageStockKutu.click();
        page.manageStockKutu.clear();
        Thread.sleep(5000);

        page.manageStockKutu.sendKeys("20" + Keys.ENTER);
        Thread.sleep(3000);

        System.out.println(page.manageStockKutu.getText());
        Assert.assertTrue(page.manageStockKutu.getText().contains("20"));


                        //TC_002
        if (!page.Allow.isSelected()) {
            page.Allow.click();
        }

        if (!page.AllowButNotifyCustomer.isSelected()) {
            page.AllowButNotifyCustomer.click();
        }

        if (!page.DoNotAllow.isSelected()) {
            page.DoNotAllow.click();
        }

        Driver.closeDriver();

    }
}