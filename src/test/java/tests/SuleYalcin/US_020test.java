package tests.SuleYalcin;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SuleYalcin.US_018page;
import pages.SuleYalcin.US_020page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static pages.SuleYalcin.US_018page.requestId;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.hover;

public class US_020test extends TestBaseRapor {
    @Test
    public void US_020test() {
    }

    @Test
    public void commentRate() throws InterruptedException {
        ReusableMethods.tradylinnStoreManager();
        bekle();
        Thread.sleep(10000);

        hover(US_020page.incelemeler);
        bekle();

        US_020page.incelemeler.click();
        bekle();

        SoftAssert sf=new SoftAssert();
        sf.assertTrue(US_020page.author.isDisplayed());
        sf.assertTrue(US_020page.comment.isDisplayed());
        sf.assertTrue(US_020page.rating.isDisplayed());
        sf.assertTrue(US_020page.dated.isDisplayed());

        sf.assertAll();




    }
}
