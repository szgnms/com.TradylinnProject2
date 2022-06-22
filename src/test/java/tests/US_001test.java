package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.US_001page;
import utilities.ReusableMethods;

public class US_001test {
    US_001page us1 = new US_001page();

    public void yazdir() {

        for (WebElement w : us1.category
        ) {
            w.click();
        }

    }


}

