package tests.SuleYalcin;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;

import static utilities.ReusableMethods.bekle;

public class US_018test extends TestBaseRapor{

Actions act = new Actions(Driver.getDriver());


    @Test
    public void geriIade() throws InterruptedException {
        ReusableMethods.tradylinnStoreManager();
        bekle(5);
        Thread.sleep(10000);
        ReusableMethods.sendKeysTab(20);
        act.sendKeys(Keys.ENTER).perform();
        bekle(50);

        ArrayList <WebElement> refreq =new ArrayList<>(Driver.getDriver().findElements(By.xpath("(//*[@id='wcfm-orders']//td)//a")));
       if (refreq.get(3).isDisplayed()){
           refreq.get(3).click();
            Driver.getDriver().switchTo().alert().accept();
            bekle(50);

        }

        refreq.get(3).click();
        bekle(10);

        ArrayList <WebElement> qty =new ArrayList<>(Driver.getDriver().findElements(By.xpath("//tbody//tr[1]//td[3]//select[1]//option")));
        qty.get(1).click();
        act.sendKeys(Keys.TAB).
        sendKeys(Keys.TAB)
       .sendKeys("Begenmedim");
        bekle(10);

        act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();

        bekle(25);

        ReusableMethods.sendKeysTab(22);
        act.sendKeys(Keys.ENTER).perform();
        bekle(15);

        ArrayList<WebElement>refRegTable = new ArrayList<>(Driver.getDriver().findElements(By.xpath("(//*[@id='wcfm-refund-requests']//tr)[1]//th")));
        SoftAssert sf=new SoftAssert();
        for (WebElement w:refRegTable
             ) {
            sf.assertTrue(w.isDisplayed());
        }

        sf.assertAll();



    }
}