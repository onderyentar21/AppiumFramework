package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import utils.Driver;

import java.util.regex.Matcher;

import static org.hamcrest.CoreMatchers.containsString;

public class MyStepdefs {

    HomePage element = new HomePage();
    @Given("Anasayfaya git ve kontrol et")
    public void anasayfaya_git_ve_kontrol_et() {
       // Driver.getAppiumDriver();


    }
    @Given("Oradaki yaziyi kontrol et")
    public void oradaki_yaziyi_kontrol_et() {
        Assert.assertEquals(element.title.getText(),"Acheter un titre");
    }
    @Given("Gidis yonu sec")
    public void gidis_yonu_sec() throws InterruptedException {
      //  element.de.click();

       // element.search.click();
       // Thread.sleep(4000);

     //   element.search.clear();
     //   Thread.sleep(4000);
     //  element.search.sendKeys("oradaki");

    }
    @Given("Telefon resmine tikla")
    public void telefon_resmine_tikla() {
        element.telefon.click();
    }
    @Given("anasayfaya geri don")
    public void anasayfaya_geri_don() {
      element.anasayfa.click();
    }
    @Given("tarihe tikla")
    public void tarihe_tikla() {
       element.tarih.click();
       element.tarih2.click();
    }
    @Then("click the valider")
    public void click_the_valider() {
       element.valider.click();
    }
    @Then("check the titles")
    public void check_the_titles() {
        String expectionTitle ="Trajet";
       String actualTitle = element.titles.getText();
        System.out.println("Baslik : "+ actualTitle);
        Assert.assertEquals(actualTitle,expectionTitle,"Hata var...");
        //Another way
        Assert.assertTrue(actualTitle.contains(expectionTitle));

        // buda matcher clası kullanarak yapılab
        MatcherAssert.assertThat(actualTitle,containsString(expectionTitle));
        System.out.println("Actual title :"+ actualTitle);



    }
    @Then("select deppacure place")
    public void select_deppacure_place() throws InterruptedException {
       element.gidis.click();

        TouchAction touchActionn = new TouchAction(Driver.getAppiumDriver());

        PointOption point = PointOption.point(940,1318);
        touchActionn.tap(point).perform();

        Thread.sleep(2000);
        element.aramaYeri.click();
        Thread.sleep(1000);

        element.myLocation.click();
        Thread.sleep(3000);
        PointOption point2 = PointOption.point(109,1167);
        touchActionn.tap(point2).perform();
        Thread.sleep(1000);
        touchActionn.tap(point).perform();
     //   Thread.sleep(1000);
      //  element.lastSearch.sendKeys("asd");
        Thread.sleep(1000);





    }




}
