package tests.AhmetTerzi;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AhmetTerzi.US_016_017yeniMusteriEklePage;
import pages.AhmetTerzi.US_016_musterilerPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_017 {
    US_016_017yeniMusteriEklePage us_016_017_yeniMusteriEklePage = new US_016_017yeniMusteriEklePage();
    US_016_musterilerPage us_016_musterilerPage = new US_016_musterilerPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());




    @Test(priority = 1)//TC0002
    public void faturaAdresEklemeTest() throws InterruptedException {

        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        us_016_musterilerPage.musterilerButonu.click();
        us_016_musterilerPage.yeniEkleButonu.click();
        us_016_017_yeniMusteriEklePage.usernameTextbox.sendKeys(faker.name().username());
        us_016_017_yeniMusteriEklePage.emailTextbox.sendKeys(faker.internet().emailAddress());
        us_016_017_yeniMusteriEklePage.firstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.lastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.billingLastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingCompanyNameTextbox.sendKeys(faker.company().name());
        us_016_017_yeniMusteriEklePage.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        us_016_017_yeniMusteriEklePage.billingAdress1.sendKeys(faker.address().streetAddress());
        us_016_017_yeniMusteriEklePage.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        us_016_017_yeniMusteriEklePage.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(us_016_017_yeniMusteriEklePage.billingStateddm);
        selectBState.selectByIndex(3);
        us_016_017_yeniMusteriEklePage.billingPostcodeTextbox.sendKeys(faker.address().zipCode());
        ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.submitButonu);

        Driver.closeDriver();
    }

    @Test(priority = 2) //TC0002
    public void shippingCheckboxTest() throws InterruptedException {

        ReusableMethods.tradylinnStoreManager();
        Thread.sleep(5000);
        us_016_musterilerPage.musterilerButonu.click();
        us_016_musterilerPage.yeniEkleButonu.click();
        us_016_017_yeniMusteriEklePage.usernameTextbox.sendKeys(faker.name().username());
        us_016_017_yeniMusteriEklePage.emailTextbox.sendKeys(faker.internet().emailAddress());
        us_016_017_yeniMusteriEklePage.firstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.lastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.billingLastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingCompanyNameTextbox.sendKeys(faker.company().name());
        us_016_017_yeniMusteriEklePage.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        us_016_017_yeniMusteriEklePage.billingAdress1.sendKeys(faker.address().streetAddress());
        us_016_017_yeniMusteriEklePage.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        us_016_017_yeniMusteriEklePage.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(us_016_017_yeniMusteriEklePage.billingStateddm);
        selectBState.selectByIndex(3);
        us_016_017_yeniMusteriEklePage.billingPostcodeTextbox.sendKeys(faker.address().zipCode());
        if (us_016_017_yeniMusteriEklePage.sameAsBillingChechbox.isSelected()) {
            ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.submitButonu);
        } else {
            ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.sameAsBillingChechbox);
            ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.submitButonu);
        }

        Driver.closeDriver();
    }


    @Test(priority = 3) //TC0003
    public void shippingAdressTest() throws InterruptedException {

        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.waitForPageToLoad(15);
        us_016_musterilerPage.musterilerButonu.click();
        us_016_musterilerPage.yeniEkleButonu.click();
        us_016_017_yeniMusteriEklePage.usernameTextbox.sendKeys(faker.name().username());
        us_016_017_yeniMusteriEklePage.emailTextbox.sendKeys(faker.internet().emailAddress());
        us_016_017_yeniMusteriEklePage.firstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.lastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        us_016_017_yeniMusteriEklePage.billingLastNameTextbox.sendKeys(faker.name().lastName());
        us_016_017_yeniMusteriEklePage.billingCompanyNameTextbox.sendKeys(faker.company().name());
        us_016_017_yeniMusteriEklePage.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        us_016_017_yeniMusteriEklePage.billingAdress1.sendKeys(faker.address().streetAddress());
        us_016_017_yeniMusteriEklePage.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        us_016_017_yeniMusteriEklePage.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(us_016_017_yeniMusteriEklePage.billingStateddm);
        selectBState.selectByIndex(3);
        us_016_017_yeniMusteriEklePage.billingPostcodeTextbox.sendKeys(faker.address().zipCode());

        if (us_016_017_yeniMusteriEklePage.sameAsBillingChechbox.isSelected()) {
            ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.sameAsBillingChechbox);
            us_016_017_yeniMusteriEklePage.shippingFirstNameTextbox.sendKeys(faker.name().firstName());
            us_016_017_yeniMusteriEklePage.shippingLastNameTextbox.sendKeys(faker.name().lastName());
            us_016_017_yeniMusteriEklePage.shippingCompanyNameTextbox.sendKeys(faker.company().name());
            us_016_017_yeniMusteriEklePage.shippingAdress1.sendKeys(faker.address().streetAddress());
            us_016_017_yeniMusteriEklePage.shippingAdress2.sendKeys(faker.address().buildingNumber());
            actions.sendKeys(Keys.TAB)
                    .sendKeys(Keys.ENTER)
                    .sendKeys(Keys.ENTER)
                    .perform();
            us_016_017_yeniMusteriEklePage.shippingCityTextBox.sendKeys(faker.address().city());
            Select selectSCity = new Select(us_016_017_yeniMusteriEklePage.shippingStateddm);
            selectSCity.selectByIndex(3);
            us_016_017_yeniMusteriEklePage.shippingPostcodeTextbox.sendKeys(faker.address().zipCode());
            ReusableMethods.jsClick(us_016_017_yeniMusteriEklePage.submitButonu);
            Driver.closeDriver();

        }

    }
}
