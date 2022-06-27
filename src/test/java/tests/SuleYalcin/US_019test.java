package tests.SuleYalcin;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SuleYalcin.US_019page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static pages.SuleYalcin.US_018page.requestId;
import static pages.SuleYalcin.US_019page.*;
import static utilities.ReusableMethods.bekle;
import static utilities.ReusableMethods.hover;

public class US_019test extends TestBaseRapor {
   public  US_019test(){

   }

    @Test
    public void takipciler() throws InterruptedException {

       // ReusableMethods.tradylinnGiris();
        //ReusableMethods.tradylinnHesabim();
        ReusableMethods.tradylinnStoreManager();
     /*
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",takipcilerButonu);
        bekle();*/
       // Thread.sleep(15000);
        //hover(takipcilerButonu);
        takipcilerButonu.click();
        bekle();

        Assert.assertTrue(Name.isDisplayed());
        bekle();
        Assert.assertTrue(Eposta.isDisplayed());
        bekle();
        Assert.assertTrue(islem.isDisplayed());


    }
}
