package tests.SuleYalcin;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TradylinnPage;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



import static utilities.ReusableMethods.bekle;

public class US_020test extends TestBaseRapor {

    TradylinnPage trd = new TradylinnPage();

    @Test
    public void commentRate() throws InterruptedException {
        ReusableMethods.tradylinnStoreManager();
        bekle(5);
        Thread.sleep(10000);

        ReusableMethods.hover( trd.incelemeler);
        bekle(5);

         trd.incelemeler.click();
        bekle(5);

        SoftAssert sf=new SoftAssert();
        sf.assertTrue( trd.author.isDisplayed());
        sf.assertTrue( trd.comment.isDisplayed());
        sf.assertTrue( trd.rating.isDisplayed());
        sf.assertTrue( trd.dated.isDisplayed());

        sf.assertAll();




    }
}
