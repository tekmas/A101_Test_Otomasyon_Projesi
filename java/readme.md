# A101_Test_Otomasyon_Projesi
Case detail : Uçtan uca ödeme ekranına kadar Selenium’da java dili ile chrome browser kullanarak test otomasyon ödevi yapılacak.

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
<html>
<hr>
</html>

- Driver.get metodu ile, configuration.properties dosyasından, ConfigReader classındaki metodu çağırarak, alınan url'ye gidildi.
- TestNG POM framework oluşturuldu.
- Selenium Webdriver java ile birlikte kullanıldı.
- Obje oluşturarak başka bir classtaki webelement çağrılıp click yapıldı.
- Dropdown menüyü locate eddebilmek için select classı kullanıldı.
- Actions class kullanılarak locate edilen etiketlere sendKeys metoduyla,faker class ile oluşturulan veriler gönderildi. 
- Webdriver'ın yetersiz kaldığı yerlerde JavascriptExecutor kullanılarak etiketlere click yapıldı.