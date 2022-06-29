package tests.MustafaVarlik;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MustafaVarlik.US_005Page;
import utilities.ReusableMethods;

public class US_005Test {
US_005Page us05=new US_005Page();

@Test
    public void urunListesiTest(){
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();
        us05.urunSekmesi.click();
        Assert.assertTrue(us05.status.isDisplayed());
        Assert.assertTrue(us05.stock.isDisplayed());
        Assert.assertTrue(us05.price.isDisplayed());
    }



    @Test
    public void virtualAndDownloadable(){

    ReusableMethods.tradylinnStoreManager();
    us05.urunSekmesi.click();
    us05.addNewProduct.click();
    Assert.assertTrue(us05.virtual.isDisplayed());
    Assert.assertTrue(us05.downloadable.isDisplayed());

    }
}
