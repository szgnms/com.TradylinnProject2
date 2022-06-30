package tests.MuhammedSezgin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.bekle;

public class US_002test extends TestBaseRapor {
   TradylinnPage trd =new TradylinnPage();

    SoftAssert sf = new SoftAssert();

    //Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz
    @Test (groups = "smoketests")
    public void vendorLogin()  {
        TradylinnPage trd =new TradylinnPage();
       // extentTest=extentReports.createTest("vendorLogin","Gecerli username ve sifre ile giris yapabilmeli");
        ReusableMethods.tradylinnGiris();
      //  extentTest.info("vendor girisi yapildi");
        sf.assertTrue( trd.bannerText.isDisplayed());
        sf.assertAll();
    }

    @Test (groups = "end2end")
    public void purchase() {
        TradylinnPage trd =new TradylinnPage();
        extentTest=extentReports.createTest("Urun Satinalma","urun satin alma yapabilmeli");
        extentTest.info("urun satinalma yapildi");
        ReusableMethods.purchaseMethod();
        bekle(5);
    }
    @Test (groups = "smoketests")
    public void linkControl() {
        ReusableMethods.tradylinnHesabim();
        bekle(10);
        trd.accountELementList.stream().map(WebElement::getText).forEach(System.out::println);
        for (WebElement w :  trd.accountELementList
        ) {
            sf.assertTrue(w.isDisplayed());
            bekle(5);
        }
        sf.assertAll();
    }

    @Test (groups = "smoketests")
    public void dashboardControl() {
        ReusableMethods.tradylinnHesabim();
        bekle(10);
         trd.dashboardList.stream().map(WebElement::getText).forEach(System.out::println);
        for (WebElement w :  trd.dashboardList
        ) {
            sf.assertTrue(w.isDisplayed());
            bekle(5);
        }
        sf.assertAll();
    }


}