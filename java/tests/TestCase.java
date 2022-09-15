package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A101_page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;

import static utilities.Driver.driver;
import static utilities.ReusableMethods.clickElementByJS;

public class TestCase {

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        A101_page a101_page=new A101_page();
        a101_page.cerezi_kabul_et.sendKeys(Keys.ENTER);
        clickElementByJS(a101_page.giyim);
        clickElementByJS(a101_page.ic_giyim);
        clickElementByJS(a101_page.dizalti_corap);
        a101_page.renk_secme.click();
        Thread.sleep(10);
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/?attributes_integration_colour=S%C4%B0YAH";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedUrl,actualUrl,"siyah renk seçildiği doğrulandı");
        softAssert.assertAll();
        clickElementByJS(a101_page.corap_secme);
        clickElementByJS(a101_page.sepete_ekle);
        clickElementByJS(a101_page.sepeti_goruntule);
        clickElementByJS(a101_page.sepeti_onayla);
        Thread.sleep(300);
        a101_page.uyeOlmadanDevam.click();
        Faker faker =new Faker(new Locale("en-US"));
        a101_page.email_kutusu.sendKeys(faker.internet().emailAddress());
        a101_page.email_onayla.click();
        a101_page.adres_olustur.click();
        a101_page.adres_basligi.sendKeys("ev");
        Actions actions=new Actions(driver);
        actions.click(a101_page.adres_basligi).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys("50555555555").perform();
        Thread.sleep(500);
        Select select  =new Select(a101_page.il);
        select.selectByIndex(1);
        select=new Select(a101_page.ilce);
        select.selectByIndex(2);
        Thread.sleep(300);
        select  =new Select(a101_page.mahalle);
        select.selectByValue("35400");
        Thread.sleep(300);
        actions=new Actions(driver);
        actions.click(a101_page.adres).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

    }
}
