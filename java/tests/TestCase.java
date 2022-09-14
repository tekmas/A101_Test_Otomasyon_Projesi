package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A101_page;
import utilities.ConfigReader;
import utilities.Driver;

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
        String actualUrl=Driver.driver.getCurrentUrl();
        String expectedUrl="https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/?attributes_integration_colour=S%C4%B0YAH";
        Assert.assertEquals(expectedUrl,actualUrl,"siyah renk seçildiği doğrulandı");
        clickElementByJS(a101_page.corap_secme);
        clickElementByJS(a101_page.sepete_ekle);
        clickElementByJS(a101_page.sepeti_goruntule);
        clickElementByJS(a101_page.sepeti_onayla);
        a101_page.uyeOlmadanDevam.click();
        Faker faker =new Faker();
        a101_page.email_kutusu.sendKeys(faker.internet().emailAddress());
        a101_page.email_onayla.click();
        a101_page.adres_olustur.click();
        a101_page.adres_basligi.sendKeys("ev");
        Actions actions=new Actions(Driver.driver);
        actions.click(a101_page.adres_basligi).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).perform();
        Thread.sleep(200);
        Select select  =new Select(a101_page.il);
        select.selectByIndex(1);
        select=new Select(a101_page.ilce);
        select.selectByIndex(2);
        Thread.sleep(300);
        select  =new Select(a101_page.mahalle);
        select.selectByValue("35400");
        Thread.sleep(200);
        actions=new Actions(Driver.driver);
        actions.click(a101_page.adres).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode()).perform();
                a101_page.kaydet.click();
        String actualUrl2=Driver.driver.getCurrentUrl();
        String expectedUrl2="https://www.a101.com.tr/orders/checkout/";
        Assert.assertEquals(expectedUrl,actualUrl,"ödeme sayfasına gidildi");
    }
    }

