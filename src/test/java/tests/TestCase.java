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
/*
Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.

Ödeme ekranı doldurulmayacak. Aşağıdaki senaryoyu web ve mobil olmak üzere 2 çeşit oluşturabilirlerse çok iyi olur. En az Web’de yapmak zorunlu.
- Senaryoya üye kaydı oluşturmadan devam edilecek.
- Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
- Açılan ürünün siyah olduğu doğrulanır.
- Sepete ekle butonuna tıklanır.
- Sepeti Görüntüle butonuna tıklanır.
- Sepeti Onayla butonuna tıklanır.
- Üye olmadan devam et butonuna tıklanır.
- Mail ekranı gelir.
- Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
- Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.
 */
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        A101_page a101_page=new A101_page();
        a101_page.cerezi_kabul_et.sendKeys(Keys.ENTER);
        clickElementByJS(a101_page.giyim);
        //Thread.sleep(10);
        clickElementByJS(a101_page.ic_giyim);
        //Thread.sleep(10);
        clickElementByJS(a101_page.dizalti_corap);
        //Assert.assertTrue(a101_page.renk_secme.isDisplayed(),"siyah renk seçildi");
        a101_page.renk_secme.click();
        Thread.sleep(10);
        String actualUrl=Driver.driver.getCurrentUrl();
        String expectedUrl="https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/?attributes_integration_colour=S%C4%B0YAH";
        Assert.assertEquals(expectedUrl,actualUrl,"siyah renk seçildiği doğrulandı");

        clickElementByJS(a101_page.corap_secme);
        clickElementByJS(a101_page.sepete_ekle);
        clickElementByJS(a101_page.sepeti_goruntule);
        clickElementByJS(a101_page.sepeti_onayla);
        //clickElementByJS(a101_page.uyeOlmadanDevam);
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
        Thread.sleep(200);

        select  =new Select(a101_page.mahalle);
        select.selectByValue("35400");
Thread.sleep(200);
        actions=new Actions(Driver.driver);

        actions.click(a101_page.adres).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode()).perform();
                //.sendKeys(Keys.TAB)
                a101_page.kaydet.click();
        String actualUrl2=Driver.driver.getCurrentUrl();
        String expectedUrl2="https://www.a101.com.tr/orders/checkout/";
        Assert.assertEquals(expectedUrl,actualUrl,"ödeme sayfasına gidildi");


    }
    }

