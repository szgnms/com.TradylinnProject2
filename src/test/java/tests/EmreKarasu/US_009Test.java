package tests.EmreKarasu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.EmreKarasu.US_08_09_10_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_009Test extends Driver {
    US_08_09_10_Page page = new US_08_09_10_Page();

    @Test
    public void TC_001_ve_TC_002() throws InterruptedException {
                        //TC_001
        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.bekle();

        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver(); //sayfayı asagı kaydır
        js1.executeScript("window.scrollBy(0,250)");
        page.urun.click();
        Thread.sleep(5000);

        page.yeniEkle.click();
        Thread.sleep(5000);

        page.shipping.click();
        Thread.sleep(2000);

        page.weight.click();
        page.weight.sendKeys("10");

        page.length.click();
        page.length.sendKeys("15");

        page.width.click();
        page.width.sendKeys("20");

        page.height.click();
        page.height.sendKeys("25");

                        //TC_002
        Select select = new Select(page.ddPTime);
        List<WebElement> processingTime = select.getOptions();
        for (WebElement each : processingTime
        ) {
            each.click();
            System.out.println(each.getText());
        }
    }
}
