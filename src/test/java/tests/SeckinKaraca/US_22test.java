package tests.SeckinKaraca;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeckinKaraca.US_22page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US_22test {
    US_22page us_22page;
    @Test
    public void testCase01() {
        us_22page=new US_22page();
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        System.out.println(select.getFirstSelectedOption().getText());//index belirtmediğim halde ilk çıkan sıralama
                                                                     //(default) varsayılan sıralama oluyor
        String expectedİlkSira="Varsayılan Sıralama";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver();

    }

    @Test
    public void testCase02() {
        us_22page=new US_22page();
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle();
        String expectedİlkSira="En çok incelenene göre sırala";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver();

    }

    @Test
    public void testCase03() {
        us_22page=new US_22page();
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle();
        String expectedİlkSira="En çok oy alana göre sırala";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver();


    }

    @Test
    public void testCase04() {
        us_22page=new US_22page();
       // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle();
        String expectedİlkSira="En yeniye göre sırala";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

        Driver.closeDriver();

    }

    @Test
    public void testCase05() {
        us_22page=new US_22page();
        // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle();
        ReusableMethods.bekle();
        ReusableMethods.bekle();
        String expectedİlkSıradakiFiyat="Masa";
        String actuelİlkSiradakiFiyat=us_22page.enUcuz.getText();
        System.out.println(actuelİlkSiradakiFiyat);
        Assert.assertTrue(actuelİlkSiradakiFiyat.equals(expectedİlkSıradakiFiyat));


        String expectedonikinci="19.00₺";
        String actuelonİkinci=us_22page.onİkinci.getText();
        System.out.println(actuelonİkinci);
        Assert.assertTrue(actuelonİkinci.equals(expectedonikinci));


        String expectedİlkSira="Fiyata göre sırala: Düşükten yükseğe";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));

       /* ArrayList<Double> urunlerDouble = new ArrayList<>();

        for (WebElement each: us_22page.fiyatlar){
            // String fiyatStr = each.getText().replaceAll("$", "");
            String fiyatStr = each.getText().replaceAll("^\\D", "");
            urunlerDouble.add(Double.parseDouble(fiyatStr));
        }

        ArrayList<Double> kontrolListe = new ArrayList<>(urunlerDouble);
        Collections.sort(kontrolListe);

        Assert.assertEquals(kontrolListe,urunlerDouble);

        */


        Driver.closeDriver();
    }

    @Test
    public void testCase06() {
        us_22page=new US_22page();
        // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
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
        Select select=new Select(us_22page.siralama);
        select.selectByIndex(5);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle();
        ReusableMethods.bekle();

        String expectedEnpahali="9,999.00₺";
        String actuelEnPahali=us_22page.enPahali.getText();
        System.out.println(actuelEnPahali);
        Assert.assertTrue(actuelEnPahali.equals(expectedEnpahali));

        String expectedİlkSira="Fiyata göre sırala: Yüksekten düşüğe";
        String actuelİlkSira=select.getFirstSelectedOption().getText();
        Assert.assertTrue(actuelİlkSira.equals(expectedİlkSira));
         /* ArrayList<Double> urunlerDouble = new ArrayList<>();

        for (WebElement each: us_22page.fiyatlar){
            // String fiyatStr = each.getText().replaceAll("$", "");
            String fiyatStr = each.getText().replaceAll("^\\D", "");
            urunlerDouble.add(Double.parseDouble(fiyatStr));
        }

        ArrayList<Double> kontrolListe = new ArrayList<>(urunlerDouble);
        Collections.sort(kontrolListe);

        Assert.assertEquals(kontrolListe,urunlerDouble);

        */


        Driver.closeDriver();
    }
}
