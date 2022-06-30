package tests.MuhammedSezgin;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_002test extends TestBaseRapor {
   TradylinnPage trd =new TradylinnPage();

    SoftAssert sf = new SoftAssert();

    //Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz
    @Test (testName = "smoketests")
    public void vendorLogin() {
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        ReusableMethods.tradylinnGiris();
        extentTest.info("vendor girisi yapildi");
        sf.assertTrue( trd.bannerText.isDisplayed());
        sf.assertAll();
    }
    @Test (testName = "smoketests")
    public void purchase() {
        extentTest=extentReports.createTest("Urun Satinalma","urun satin alma yapabilmeli");
        extentTest.info("urun satinalma yapildi");
        ReusableMethods.purchaseMethod();
        ReusableMethods.bekle(5);
    }
    @Test
    public void linkControl() {
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.bekle(5);
        for (WebElement w :  trd.accountELementList
        ) {
            sf.assertTrue(w.isDisplayed());
            ReusableMethods.bekle(5);
        }
        sf.assertAll();
    }

    @Test
    public void dashboardControl() {
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.bekle(5);
         trd.dashboardList.stream().map(WebElement::getText).forEach(System.out::println);
        for (WebElement w :  trd.dashboardList
        ) {
            sf.assertTrue(w.isDisplayed());
            ReusableMethods.bekle(5);
        }
        sf.assertAll();
    }


}