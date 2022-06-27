package tests.MuhammedSezgin;

import org.testng.annotations.Test;
import pages.MuhammedSezgin.US_001page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_001test extends TestBaseRapor {
    US_001page us1 = new US_001page();

    @Test
    public void yazdir() {

    ReusableMethods.tradylinnGiris();
        //ReusableMethods.tradylinnHesabim();
         //ReusableMethods.tradylinnStoreManager();


    }


}

