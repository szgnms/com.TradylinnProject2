package tests.ErenUstaoglu;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014test {
    TradylinnPage trd =new TradylinnPage();

    JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    public US_014test()   {
    }

    @Test
    public void TC_001() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
       ReusableMethods.tradylinnStoreManager();
        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu2)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Minimum spend" satirina random bir sayi girer
        String minimumSpendAmount = "19";
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.couponAmount);
        je.executeScript("arguments[0].click();",  trd.couponAmount);
         trd.minimumSpendInput.sendKeys(minimumSpendAmount);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un minimum spend değerinin görünüyor oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.minimumSpendInput);
        String actualSpendAmount =  trd.minimumSpendInput.getAttribute("value");
        String expectedSpendAmount = minimumSpendAmount;
        Assert.assertEquals(actualSpendAmount, expectedSpendAmount);
        Driver.getDriver().close();
    }

    @Test
    public void TC_002() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();

        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Maximum spend" satirina random bir sayi girer
        String maximumSpendAmount = "1903";
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.couponAmount);
        je.executeScript("arguments[0].click();",  trd.couponAmount);
         trd.maximumSpendInput.sendKeys(maximumSpendAmount);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un minimum spend değerinin görünüyor oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.maximumSpendInput);
        String actualSpendAmount =  trd.maximumSpendInput.getAttribute("value");
        String expectedSpendAmount = maximumSpendAmount;
        Assert.assertEquals(actualSpendAmount, expectedSpendAmount);
        Driver.getDriver().close();
    }

    @Test
    public void TC_003() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();

        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Individual use only" butonunu secer
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.individualUseOnlyButonu);
        je.executeScript("arguments[0].click();",  trd.individualUseOnlyButonu);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.individualUseOnlyButonu);
        Assert.assertTrue( trd.individualUseOnlyButonu.isSelected());
        Driver.getDriver().close();
    }

    @Test
    public void TC_004() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();

        Thread.sleep(5000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(5000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Exclude products" dropdown'dan urun secer
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.excludeProductsInput);
        je.executeScript("arguments[0].click();",  trd.excludeProductsInput);
         trd.excludeProductsInput.sendKeys("Sweet Ela 4");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//*[@class='select2-results']//li)[1]")).click();
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        Thread.sleep(5000);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.individualUseOnlyButonu);
        Assert.assertTrue( trd.sweetEla.isDisplayed());
        Driver.getDriver().close();
    }

        
    @Test
    public void TC_005() throws InterruptedException {
        //Vendor "https://tradylinn.com/" adresine gider
        ReusableMethods.tradylinnStoreManager();

        Thread.sleep(10000);
        //Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions
                .moveToElement( trd.kuponlarButonu)
                .click( trd.yeniEkleButonu)
                .perform();
        Thread.sleep(10000);
        //Vendor "Code" satirina unique bir deger girer
        String kuponKodu = faker.lorem().characters(8, 10);
         trd.codeInput.sendKeys(kuponKodu);
        //Vendor "Exclude categories" dropdown'dan kategori secer
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.excludeCategoriesInput);
        je.executeScript("arguments[0].click();",  trd.excludeCategoriesInput);
        Select select2 = new Select( trd.excludeCategoriesInput);
        select2.selectByIndex(1);
        select2.selectByIndex(2);
        select2.selectByIndex(3);
        //Vendor "SUBMİT" butonuna tiklar
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.kuponSubmitButonu);
        je.executeScript("arguments[0].click();",  trd.kuponSubmitButonu);
        Thread.sleep(5000);
        //Vendor "Kuponlar" butonuna tiklar
        je.executeScript("scroll(0, -250);");
        Thread.sleep(5000);
         trd.ikinciKuponlarButonu.click();
        Thread.sleep(5000);
        //Vendor "Edit Coupon" bolumunde girmis oldugu Code'un görünüyor oldugunu test eder
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.ilkUrunDuzenlemek);
        je.executeScript("arguments[0].click();",  trd.ilkUrunDuzenlemek);
        Thread.sleep(5000);
        je.executeScript("arguments[0].scrollIntoView(true);",  trd.excludeCat);
        Assert.assertTrue( trd.excludeCat.isDisplayed());
        Driver.getDriver().close();
    }
}
