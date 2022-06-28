package tests.EmreKarasu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.EmreKarasu.US_08_09_10_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class US_010Test {
    US_08_09_10_Page page = new US_08_09_10_Page();
    @Test
    public void TC_001_ve_TC_002() throws InterruptedException {

                        //TC_001
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,250)");
        page.urun.click();
        page.urun.clear();
        Thread.sleep(5000);

        page.yeniEkle.click();
        Thread.sleep(5000);

        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js2.executeScript("window.scrollBy(0,1100)");
        page.attributes.click();
        Thread.sleep(3000);

        page.attributes_Color.click();
        Thread.sleep(3000);

        Select select1=new Select(page.ddColor);
        List<WebElement> colors=select1.getOptions();
        for (WebElement each:colors
             ) {
            each.click();
            System.out.println(each.getText());



                        //TC_002
        page.attributes_Size.click();
        Thread.sleep(2000);

        Select select2 =new Select(page.ddSize);
        List<WebElement> size= select2.getOptions();
            for (WebElement each2:size) {
                each.click();
                System.out.println(each2.getText());
            }
        }
    }
}
