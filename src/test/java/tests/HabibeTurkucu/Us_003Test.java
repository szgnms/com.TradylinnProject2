package tests.HabibeTurkucu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HabibeTurkucu.US_003Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_003Test {


    US_003Page usPage = new US_003Page();


    @Test
    public void ordersBrowse() throws InterruptedException {
        ReusableMethods.tradylinnHesabim();
        //ReusableMethods.tradylinnStoreManager();
        // ReusableMethods.tradylinnGiris();
        Thread.sleep(500);
        // siparişler butonuna click yapmayı executor ile yapmak gerekti.
        WebElement element = Driver.getDriver().findElement(By.xpath("(//*[@href='https://tradylinn.com/my-account-2/orders/'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);

        //aliseverise devam butonu gorunesiye kadar sayfa asağı insin,gorduğunde click yapsın.
        WebElement alisVeriseDevam = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", alisVeriseDevam);
        executor.executeScript("arguments[0].click();", alisVeriseDevam);


        WebElement vsSıralama = Driver.getDriver().findElement(By.xpath("//form[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']"));
        Assert.assertTrue(vsSıralama.isDisplayed());


    }
}