package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.lang.model.element.Element;

public class A101_page {
    public A101_page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath ="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezi_kabul_et;
    @FindBy(xpath ="//a[text()='Dizaltı Çorap']")
    public WebElement dizalti_corap;
    @FindBy (xpath ="(//a [@href='/giyim-aksesuar/'])[1]" )
    public  WebElement giyim;
    @FindBy (xpath = "//a [@href='/giyim-aksesuar/kadin-ic-giyim/']")
    public WebElement ic_giyim;
    @FindBy(xpath = "//label [@for='attributes_integration_colourSİYAH']")
    public  WebElement renk_secme;
    @FindBy(xpath = "//a [@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/'] [@class='name-price'] [@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public WebElement corap_secme;
    @FindBy(xpath = "//button [@class='add-to-basket button green block with-icon js-add-basket']")
    public  WebElement sepete_ekle;
    @FindBy (xpath = "//a[text()='Sepeti Görüntüle'] [@class='go-to-shop']")
    public WebElement sepeti_goruntule;
    @FindBy (xpath = "//a [@href='/orders/checkout/'] [@class='button green checkout-button block js-checkout-button']")
    public WebElement sepeti_onayla;
    @FindBy (xpath = "//a [@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevam;
    @FindBy (xpath = "//input [@type='text'] [@name='user_email']")
    public WebElement email_kutusu;
    @FindBy (xpath = "//button [@type='submit'] [@class='button block green']")
    public WebElement email_onayla;
    @FindBy (xpath = "(//a[@class='new-address js-new-address'])[1]")
    public WebElement adres_olustur;
    @FindBy (xpath = "//input [@type='text'] [@name='title'] ")
    public WebElement adres_basligi;
    @FindBy (xpath = "//select [@type='text'] [@name='city'] ")
    public WebElement il;
    @FindBy (xpath = "//select [@type='text'] [@name='township'] ")
    public WebElement ilce;
    @FindBy (xpath = "//select [@type='text'] [@name='district']")
    public WebElement mahalle;
    @FindBy (xpath = "//textarea [@name='line']")
    public WebElement adres;
    @FindBy (xpath = "//button [@type='button'] [@class='button green js-set-country js-prevent-emoji'] ")
    public WebElement kaydet;
}