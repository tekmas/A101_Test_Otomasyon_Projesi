# A101_Test_Otomasyon_Projesi
Case detail : Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyonu yapılacak.

Ödeme ekranı doldurulmayacak. 
- Senaryoya üye kaydı oluşturmadan devam edilecek.
- a101 web sitesine girilir.
- "çerezleri kabul et" butonu tıklanır.
- Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
- Siyah renk seçilir.
- Açılan ürünün siyah olduğu doğrulanır.
- Sepete ekle butonuna tıklanır.
- Sepeti Görüntüle butonuna tıklanır.
- Sepeti Onayla butonuna tıklanır.
- Üye olmadan devam et butonuna tıklanır.
- Mail ekranı gelir.
- Sonrasında adres ekranı gelir. Adres oluşturulur ve katdet butonuna basılır.
- ödeme ekranına gidildiği doğrulanır.
<html>
<hr>
</html>

- Driver.get metodu ile, configuration.properties dosyasından, ConfigReader classındaki metodu çağırarak, alınan url'ye gidildi.
- TestNG POM framework oluşturuldu.
- Selenium Webdriver java ile birlikte kullanıldı.
- Obje oluşturarak başka bir classtaki webelement çağrılıp click vs. metod uygulandı.
- Dropdown menüyü locate edebilmek için select classı kullanıldı.
- Actions class kullanılarak locate edilen etiketlere sendKeys metoduyla,faker class ile oluşturulan veriler gönderildi. 
- Webdriver'ın yetersiz kaldığı yerlerde JavascriptExecutor kullanılarak etiketlere click vs. yapıldı.
- Web öğeleri arası bekleme için webdriverwait class'ı ve thread.sleep kullanıldı
