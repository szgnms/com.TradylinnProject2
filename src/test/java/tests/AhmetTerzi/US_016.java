package tests.AhmetTerzi;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AhmetTerzi.US_016_musterilerPage;
import pages.AhmetTerzi.US_016_017yeniMusteriEklePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class US_016 {

    US_016_musterilerPage us_016_musterilerPage = new US_016_musterilerPage();
    US_016_017yeniMusteriEklePage us_016_yeniMusteriEklePage = new US_016_017yeniMusteriEklePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Test (priority = 1) //TC0001
    public void musteriTableHeadGorunurlulukTesti() throws InterruptedException {

        ReusableMethods.tradylinnStoreManager();
        us_016_musterilerPage.musterilerButonu.click();
        Assert.assertTrue(us_016_musterilerPage.nameYazisi.isDisplayed());
        Assert.assertTrue(us_016_musterilerPage.usernameYazisi.isDisplayed());
        Assert.assertTrue(us_016_musterilerPage.emailYazisi.isDisplayed());
        Assert.assertTrue(us_016_musterilerPage.locationYazisi.isDisplayed());
        Assert.assertTrue(us_016_musterilerPage.moneySpentYazisi.isDisplayed());
        Assert.assertTrue(us_016_musterilerPage.lastOrdeYazisi.isDisplayed());
    }

    @Test (priority = 2) // TC0002
    public void musteriListDownloadTest() throws InterruptedException {

        String farkliKisim= System.getProperty("user.home");
        String ortakKisimPDF="\\Downloads\\Store Manager – Tradylinn.pdf";
        String ortakKisimExcel="\\Downloads\\Store Manager – Tradylinn.xlsx";
        String ortakKisimCsv="\\Downloads\\Store Manager – Tradylinn.csv";



        String pdfDosyaYolu = farkliKisim + ortakKisimPDF;
        String excelDosyaYolu = farkliKisim + ortakKisimExcel;
        String csvDosyaYolu = farkliKisim + ortakKisimCsv;


        us_016_musterilerPage.downloadPDFbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(pdfDosyaYolu)));
        us_016_musterilerPage.downloadExcelbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(excelDosyaYolu)));
        us_016_musterilerPage.downloadCSVbutonu.click();
        Thread.sleep(2000);
        Assert.assertTrue(Files.exists(Paths.get(csvDosyaYolu)));
    }

    @Test (priority = 3)  //TC0003
    public void yeniMusteriEklemeTesti() throws InterruptedException {

        us_016_musterilerPage.yeniEkleButonu.click();
        us_016_yeniMusteriEklePage.usernameTextbox.sendKeys(faker.name().username());
        us_016_yeniMusteriEklePage.emailTextbox.sendKeys(faker.internet().emailAddress());
        us_016_yeniMusteriEklePage.firstNameTextbox.sendKeys(faker.name().firstName());
        us_016_yeniMusteriEklePage.lastNameTextbox.sendKeys(faker.name().lastName());
        actions.moveToElement(us_016_yeniMusteriEklePage.usernameTextbox).click()
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .perform();
        Thread.sleep(3000);

        Driver.closeDriver();
    }




}
