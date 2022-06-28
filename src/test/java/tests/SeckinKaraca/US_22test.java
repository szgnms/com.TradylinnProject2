package tests.SeckinKaraca;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class US_22test {
    @Test
    public void urunListelemeSıralama() {
        ReusableMethods.tradylinnGiris();
        ReusableMethods.bekle();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
    }
}
