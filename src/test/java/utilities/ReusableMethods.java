package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ReusableMethods extends TestBaseRapor{

    public static void sendKeysTab(int sayi) {
        Actions action = new Actions(Driver.getDriver());
        for (int i = 0; i <= sayi; i++) {
            action.sendKeys(Keys.TAB);
            i++;
        }
    }

    public static void purchaseMethod() {
        tradylinnGiris();
        bekle(15);
        Driver.getDriver().findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys("sweet" + Keys.ENTER);
        extentTest.info("Arama TextBox`ina Urun Ismi Gonderildi.");
        hover(Driver.getDriver().findElement(By.xpath("//*[@class='product-archive']//figure")));
        Driver.getDriver().findElement(By.xpath("(//*[@class='product-action-vertical']//a)[1]")).click();
        extentTest.info("Sepete Ekle Butonuna Clicklendi.");
        Driver.getDriver().findElement(By.xpath("//*[@class='cart-toggle']")).click();
        extentTest.info("Sepet Butonuna Clicklendi.");
        bekle(10);
        Driver.getDriver().findElement(By.xpath("//*[@class='button checkout wc-forward']")).click();
        extentTest.info("Odeme Yap Butonu Cliklendi.");
        scroolDowntoPixel(700);
        bekle(15);
        Driver.getDriver().findElement(By.xpath("//*[@id='wcfmmp_user_location']")).sendKeys("Istanbul");
        extentTest.info("Adres Bilgileri Girildi.");
        bekle(15);
        Driver.getDriver().findElement(By.xpath("//button[@id='place_order']")).click();
        extentTest.info("Place Order Butonuna Cliklendi.");
    }

    public static void scroolDowntoPixel(int pixel) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("scroll(0, " + pixel + ");");
    }


    public static void traddylinnCreateAccount() {
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Üye Ol']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@class='wcfmmp_become_vendor_link']//a")).click();
        Driver.getDriver().findElement(By.xpath("//input[@id='user_email']")).sendKeys(ConfigReader.getProperty("tradEmail"));
        Driver.getDriver().findElement(By.xpath("//input[@id='passoword']")).sendKeys(ConfigReader.getProperty("tradPass"));
        Driver.getDriver().findElement(By.xpath("//input[@id='confirm_pwd']")).sendKeys(ConfigReader.getProperty("tradPass"));
        bekle(5);
        Driver.getDriver().findElement(By.xpath("//input[@id='wcfm_membership_register_button']")).click();
    }

    public static void tradylinnGmailAccountSubmit() {
        Driver.getDriver().get(ConfigReader.getProperty("mailUrl"));
        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Oturum açın')]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@id='identifierId']")).sendKeys(ConfigReader.getProperty("tradEmail"));
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'İleri')]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigReader.getProperty("tradPass"));
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'İleri')]")).click();
        ArrayList<WebElement> mailList = new ArrayList<>(Driver.getDriver().findElements(By.xpath("//div[@class='yW']")));
        for (WebElement w : mailList
        ) {
            if (w.getText().contains("Tradylinn")) {
                w.click();
            }
        }
        Driver.getDriver().findElement(By.xpath("//a[normalize-space()='click here']")).click();
        ArrayList<String> handles = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(handles.get(1));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[@class='trd-title']")).isDisplayed());

    }

    public static void anasayfaDogrula() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(" https://tradylinn.com"));
    }


    public static void bekle(int sayi) {
        try {
            Thread.sleep(sayi* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void tradylinnGiris() {
        extentTest=extentReports.createTest("Vendor Olarak Giris Testi.","Kullanici Vendor Olarak Siteye Giris Yapabilmeli.");
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Url` ye gidildi.");
        bekle(5);
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Giriş Yap')]")).click();
        extentTest.info("Girisyap Butonuna Click Yapildi.");
        bekle(5);
        Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys(ConfigReader.getProperty("tradEmail"));
        extentTest.info("Gecerli E-mail Bilgileri Girildi.");
        Driver.getDriver().findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys(ConfigReader.getProperty("tradPass"));
        extentTest.info("Gecerli Password Girildi.");
        Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        extentTest.info("Beni Hatirla Checkbox`ina Tiklandi.");
        Driver.getDriver().findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        extentTest.pass("Submit Butonuna Click Yapildi.");
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", element);
    }

    public static void tradylinnStoreManager() {
        extentTest=extentReports.createTest("Vendor Olarak Store Manager Giris Testi.","Kullanici Vendor Olarak Store Manager `a Giris Yapabilmeli.");
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Url`ye Gidildi.");
        bekle(5);
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Giriş Yap')]")).click();
        extentTest.info("Girisyap Butonuna Click Yapildi.");
        bekle(15);
        Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys(ConfigReader.getProperty("tradEmail"));
        extentTest.info("Gecerli E-mail Bilgileri Girildi.");
        Driver.getDriver().findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys(ConfigReader.getProperty("tradPass"));
        extentTest.info("Gecerli Password Girildi.");
        Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        extentTest.info("Beni Hatirla Checkbox`ina Tiklandi.");
        Driver.getDriver().findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        extentTest.pass("Submit Butonuna Click Yapildi.");
        bekle(15);
        Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-1074']")).click();
        extentTest.pass("Hesabim Butonuna Click Yapildi.");
        bekle(5);
        Driver.getDriver().findElement(By.xpath("(//*[@class='woocommerce-MyAccount-navigation col-md-3 mb-8']//li)[2]")).click();
        extentTest.pass("Store Manager Butonuna Click Yapildi.");

    }

    public static void clickWithJS(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
        js.executeScript("arguments[0].click();", webElement);

    }

    public static void tradylinnHesabim() {
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        bekle(5);
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Giriş Yap')]")).click();
        bekle(5);
        Driver.getDriver().findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys(ConfigReader.getProperty("tradEmail"));
        Driver.getDriver().findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys(ConfigReader.getProperty("tradPass"));
        Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        bekle(10);
        Driver.getDriver().findElement(By.xpath("//*[@id='menu-item-1074']")).click();
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void getScreenshotWebElement(String name, WebElement element) throws IOException {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        File source = element.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + date + ".png";
        File finalDestination = new File(wElementSS);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
    }

    //========Switching Window=====//
    public void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void waitFortrdToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation =
                driver -> {
                    assert driver != null;
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                };
        try {
            System.out.println("Waiting for trd to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for trd Load Request to complete after " + timeout + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second
        return wait.until(driver -> webElement);
    }

    //seckin
    public static void sayfaAlti() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public static void birAsagi(int num) {
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 1; i <=num ; i++) {
            actions.sendKeys(Keys.DOWN).perform();
            i++;
        }

    }
}