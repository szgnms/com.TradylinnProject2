package tests.SuleYalcin;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;

import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.bekle;


public class US_019test extends TestBaseRapor {

    TradylinnPage trd = new TradylinnPage();

    @Test
    public void takipciler()  {


        ReusableMethods.tradylinnStoreManager();

        trd.takipcilerButonu.click();
        bekle(5);

        Assert.assertTrue(trd.name.isDisplayed());
        bekle(5);
        Assert.assertTrue(trd.eposta.isDisplayed());
        bekle(5);
        Assert.assertTrue(trd.islem.isDisplayed());


    }
}
