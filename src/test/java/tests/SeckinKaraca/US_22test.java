package tests.SeckinKaraca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeckinKaraca.US_22page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22test {
    US_22page us_22page=new US_22page();
    @Test
    public void testCase01() {
        ReusableMethods.tradylinnGiris();
        ReusableMethods.bekle();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_22page.tümünügör.click();
        ReusableMethods.bekle();
        Select select=new Select(us_22page.varsayılanSıralama);
        select.selectByIndex(0);
        System.out.println(select.getFirstSelectedOption().getText());//herhangi bir secim yapilmadan ilk siradaki (Default)
        String expectedİlkSira="Varsayılan Sıralama";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver();

    }

    @Test
    public void testCase02() {
        ReusableMethods.tradylinnGiris();
        ReusableMethods.bekle();
        ReusableMethods.bekle();
        ReusableMethods.sayfaAltı();
        ReusableMethods.bekle();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.birAsagi();
        ReusableMethods.bekle();
        us_22page.tümünügör.click();
        ReusableMethods.bekle();
        Select select=new Select(us_22page.varsayılanSıralama);
        select.selectByIndex(0);
        System.out.println(select.getFirstSelectedOption().getText());//herhangi bir secim yapilmadan ilk siradaki (Default)
        String expectedİlkSira="Varsayılan Sıralama";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver(); //devam ediyor

    }
}
