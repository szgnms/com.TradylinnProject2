package tests.SeckinKaraca;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22test {
    TradylinnPage trd =new TradylinnPage();
    @Test
    public void testCase01() {
     
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        System.out.println(select.getFirstSelectedOption().getText());//index belirtmediğim halde ilk çıkan sıralama
                                                                     //(default) varsayılan sıralama oluyor
        String expectedIlkSira="Varsayılan Sıralama";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);

        Driver.closeDriver();

    }

    @Test
    public void testCase02() {
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(5);
        String expectedIlkSira="En çok incelenene göre sırala";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);

        Driver.closeDriver();

    }

    @Test
    public void testCase03() {
        //ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(5);
        String expectedIlkSira="En çok oy alana göre sırala";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);

        Driver.closeDriver();


    }

    @Test
    public void testCase04() {
       // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(5);
        String expectedIlkSira="En yeniye göre sırala";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);

        Driver.closeDriver();

    }

    @Test
    public void testCase05() {
        // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        String expectedIlkSiradakiFiyat="Masa";
        String actuelIlkSiradakiFiyat= trd.enUcuz.getText();
        System.out.println(actuelIlkSiradakiFiyat);
        Assert.assertEquals(expectedIlkSiradakiFiyat, actuelIlkSiradakiFiyat);


        String expectedonikinci="19.00₺";
        String actuelonIkinci= trd.onIkinci.getText();
        System.out.println(actuelonIkinci);
        Assert.assertEquals(expectedonikinci, actuelonIkinci);


        String expectedIlkSira="Fiyata göre sırala: Düşükten yükseğe";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);


        Driver.closeDriver();
    }

    @Test
    public void testCase06() {
        // ReusableMethods.tradylinnGiris();
        Driver.getDriver().get("https://tradylinn.com/");
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);
        ReusableMethods.sayfaAlti();
        ReusableMethods.bekle(5);
        ReusableMethods.birAsagi(3);
        ReusableMethods.bekle(5);
         trd.tumunugor.click();
        ReusableMethods.bekle(5);
        Select select=new Select( trd.siralama);
        select.selectByIndex(5);
        System.out.println(select.getFirstSelectedOption().getText());
        ReusableMethods.bekle(5);
        ReusableMethods.bekle(5);

        String expectedEnpahali="9,999.00₺";
        String actuelEnPahali= trd.enPahali.getText();
        System.out.println(actuelEnPahali);
        Assert.assertEquals(expectedEnpahali, actuelEnPahali);

        String expectedIlkSira="Fiyata göre sırala: Yüksekten düşüğe";
        String actuelIlkSira=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedIlkSira, actuelIlkSira);

        Driver.closeDriver();
    }
}
