package tests.MuhammedSezgin;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MuhammedSezgin.US_002page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_002test extends TestBaseRapor {
    US_002page us2 = new US_002page();

    SoftAssert sf = new SoftAssert();

    //Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz
    @Test (groups = "smoketests")
    public void vendorLogin() {
        extentTest.info("vendor girisi yapildi");
        ReusableMethods.tradylinnHesabim();
        //sf.assertTrue(us2.myAccountText.isDisplayed());
        //sf.assertAll();
    }
    @Test (groups = "smoketests")
    public void purchase() {
        extentTest.info("urun satinalma yapildi");
        ReusableMethods.purchaseMethod();
        //sf.assertTrue(us2.myAccountText.isDisplayed());
        //sf.assertAll();
    }
    @Test
    public void linkControl() {
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.bekle();
        for (WebElement w : us2.accountELementList
        ) {
            sf.assertTrue(w.isDisplayed());
            ReusableMethods.bekle();
        }
        sf.assertAll();
    }

    @Test
    public void dashboardControl() {
        ReusableMethods.tradylinnHesabim();
        ReusableMethods.bekle();
        us2.dashboardList.stream().map(WebElement::getText).forEach(System.out::println);
        for (WebElement w : us2.dashboardList
        ) {
            sf.assertTrue(w.isDisplayed());
            ReusableMethods.bekle();
        }
        sf.assertAll();
    }


}