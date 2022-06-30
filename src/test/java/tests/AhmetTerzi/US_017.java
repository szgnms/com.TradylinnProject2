package tests.AhmetTerzi;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.TradylinnPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_017 {
    TradylinnPage trd =new TradylinnPage();

    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @Test //TC0001
    public void faturaAdresEklemeTest() throws InterruptedException {

        ReusableMethods.tradylinnStoreManager();
        trd.musterilerButonu.click();
        Thread.sleep(5000);
        trd.yeniEkleButonu.click();
        trd.usernameTextbox.sendKeys(faker.name().username());
        trd.emailTextbox.sendKeys(faker.internet().emailAddress());
        trd.firstNameTextbox.sendKeys(faker.name().firstName());
        trd.lastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        trd.billingLastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingCompanyNameTextbox.sendKeys(faker.company().name());
        trd.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        trd.billingAdress1.sendKeys(faker.address().streetAddress());
        trd.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        trd.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(trd.billingStateddm);
        selectBState.selectByIndex(3);
        trd.billingPostcodeTextbox.sendKeys(faker.address().zipCode());
        ReusableMethods.jsClick(trd.submitButonu);

        Driver.closeDriver();
    }

    @Test //TC0002
    public void shippingCheckboxTest()  {

        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.waitFortrdToLoad(15);
        trd.musterilerButonu.click();
        trd.yeniEkleButonu.click();
        trd.usernameTextbox.sendKeys(faker.name().username());
        trd.emailTextbox.sendKeys(faker.internet().emailAddress());
        trd.firstNameTextbox.sendKeys(faker.name().firstName());
        trd.lastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        trd.billingLastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingCompanyNameTextbox.sendKeys(faker.company().name());
        trd.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        trd.billingAdress1.sendKeys(faker.address().streetAddress());
        trd.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        trd.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(trd.billingStateddm);
        selectBState.selectByIndex(3);
        trd.billingPostcodeTextbox.sendKeys(faker.address().zipCode());
        if (trd.sameAsBillingChechbox.isSelected()) {
            ReusableMethods.jsClick(trd.submitButonu);
        } else {
            ReusableMethods.jsClick(trd.sameAsBillingChechbox);
            ReusableMethods.jsClick(trd.submitButonu);
        }

        Driver.closeDriver();
    }


    @Test //TC0003
    public void shippingAdressTest(){

        ReusableMethods.tradylinnStoreManager();
        ReusableMethods.waitFortrdToLoad(10);
        trd.musterilerButonu.click();
        trd.yeniEkleButonu.click();
        trd.usernameTextbox.sendKeys(faker.name().username());
        trd.emailTextbox.sendKeys(faker.internet().emailAddress());
        trd.firstNameTextbox.sendKeys(faker.name().firstName());
        trd.lastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingFirstNameTextbox.sendKeys(faker.name().firstName());
        trd.billingLastNameTextbox.sendKeys(faker.name().lastName());
        trd.billingCompanyNameTextbox.sendKeys(faker.company().name());
        trd.billingPhoneTextbox.sendKeys(faker.phoneNumber().cellPhone());
        trd.billingAdress1.sendKeys(faker.address().streetAddress());
        trd.billingAdress2.sendKeys(faker.address().buildingNumber());
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.ENTER)
                .perform();

        trd.billingCityTextBox.sendKeys(faker.address().city());
        Select selectBState = new Select(trd.billingStateddm);
        selectBState.selectByIndex(3);
        trd.billingPostcodeTextbox.sendKeys(faker.address().zipCode());

        if (trd.sameAsBillingChechbox.isSelected()) {
            ReusableMethods.jsClick(trd.sameAsBillingChechbox);
            trd.shippingFirstNameTextbox.sendKeys(faker.name().firstName());
            trd.shippingLastNameTextbox.sendKeys(faker.name().lastName());
            trd.shippingCompanyNameTextbox.sendKeys(faker.company().name());
            trd.shippingAdress1.sendKeys(faker.address().streetAddress());
            trd.shippingAdress2.sendKeys(faker.address().buildingNumber());
            actions.sendKeys(Keys.TAB)
                    .sendKeys(Keys.ENTER)
                    .sendKeys(Keys.ENTER)
                    .perform();
            trd.shippingCityTextBox.sendKeys(faker.address().city());
            Select selectSCity = new Select(trd.shippingStateddm);
            selectSCity.selectByIndex(3);
            trd.shippingPostcodeTextbox.sendKeys(faker.address().zipCode());
            ReusableMethods.jsClick(trd.submitButonu);
            Driver.closeDriver();

        }

    }
}
