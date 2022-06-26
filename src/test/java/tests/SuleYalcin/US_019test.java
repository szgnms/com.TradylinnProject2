package tests.SuleYalcin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SuleYalcin.US_019page;
import utilities.ReusableMethods;

import static pages.SuleYalcin.US_019page.*;
import static utilities.ReusableMethods.bekle;

public class US_019test {
   public  US_019test(){

   }

    @Test
    public void takipciler() {

       // ReusableMethods.tradylinnGiris();
        //ReusableMethods.tradylinnHesabim();
        ReusableMethods.tradylinnStoreManager();
        bekle();

        takipcilerButonu.click();
        bekle();

        Assert.assertTrue(Name.isDisplayed());
        bekle();
        Assert.assertTrue(Eposta.isDisplayed());
        bekle();
        Assert.assertTrue(islem.isDisplayed());


    }
}
