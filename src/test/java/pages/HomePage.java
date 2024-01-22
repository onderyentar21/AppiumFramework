package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

/**
 * @author Vidhi Chapanera  (efpyi@example.com)     <http://www.    vidhi.com>
 */

public class HomePage {

    public HomePage() {

        // find elements on the page and assign them to the page object (this) in the constructor.
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(35)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Acheter un titre\"]")
    public MobileElement title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"De\"]")
    public MobileElement gidis;

    @AndroidFindBy(xpath = "//android.widget.EditText/android.view.View/android.view.View")
    public MobileElement search;



    @AndroidFindBy(xpath = "(//android.view.View)[16]")
    public MobileElement telefon;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Accueil\"]")
    public MobileElement anasayfa;
    @AndroidFindBy(xpath = "(//android.widget.Button)[5]")
    public MobileElement tarih;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[33]/android.view.View/android.widget.Button")
    public MobileElement tarih2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Valider\"]")
    public MobileElement valider;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Trajet\"]")
    public MobileElement titles;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Ma position\"]")
    public MobileElement myLocation;

    @AndroidFindBy(xpath = "(//android.view.View)[8]")
    public MobileElement aramaYeri;

    @AndroidFindBy(xpath = "//android.widget.EditText/android.view.View")
    public MobileElement lastSearch;

}

