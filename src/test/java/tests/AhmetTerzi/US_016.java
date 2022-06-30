package tests.AhmetTerzi;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US_016 {

    TradylinnPage trd =new TradylinnPage();

    Faker faker = new Faker();

    @Test(priority = 1) //TC0001
    public void musteriTableHeadGorunurlulukTesti()  {

        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.waitFortrdToLoad(10);
        trd.musterilerButonu.click();
        Assert.assertTrue(trd.nameYazisi.isDisplayed());
        Assert.assertTrue(trd.usernameYazisi.isDisplayed());
        Assert.assertTrue(trd.emailYazisi.isDisplayed());
        Assert.assertTrue(trd.locationYazisi.isDisplayed());
        Assert.assertTrue(trd.moneySpentYazisi.isDisplayed());
        Assert.assertTrue(trd.lastOrdeYazisi.isDisplayed());

        Driver.closeDriver();
    }

    @Test(priority = 2) // TC0002
    public void musteriListDownloadTest() throws InterruptedException {

        String farkliKisim = System.getProperty("user.home");
        String ortakKisimPDF = "\\Downloads\\Store Manager – Tradylinn.pdf";
        String ortakKisimExcel = "\\Downloads\\Store Manager – Tradylinn.xlsx";
        String ortakKisimCsv = "\\Downloads\\Store Manager – Tradylinn.csv";
        String pdfDosyaYolu = farkliKisim + ortakKisimPDF;
        String excelDosyaYolu = farkliKisim + ortakKisimExcel;
        String csvDosyaYolu = farkliKisim + ortakKisimCsv;

        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.waitFortrdToLoad(10);
        trd.musterilerButonu.click();
        trd.downloadPDFbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(pdfDosyaYolu)));
        trd.downloadExcelbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(excelDosyaYolu)));
        trd.downloadCSVbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(csvDosyaYolu)));

        Driver.closeDriver();
    }

    @Test(priority = 3)  //TC0003
    public void yeniMusteriEklemeTesti() throws InterruptedException {

        trd.yeniEkleButonu.click();
        ReusableMethods.waitFortrdToLoad(10);
        trd.usernameTextbox.sendKeys(faker.name().username());
        trd.emailTextbox.sendKeys(faker.internet().emailAddress());
        trd.firstNameTextbox.sendKeys(faker.name().firstName());
        trd.lastNameTextbox.sendKeys(faker.name().lastName());
        ReusableMethods.jsClick(trd.submitButonu);
        Thread.sleep(3000);

        Driver.closeDriver();
    }


}
