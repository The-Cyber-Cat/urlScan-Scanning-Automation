package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class Login extends TestBase {
    @And("UrlScan - Login Olunur")
    public void urlscanLoginOlunur() {
        urlScan.loggedOut.click();
        ReusableMethods.bekle(1);
        urlScan.email_Inpt.sendKeys(ConfigReader.getProperty("email"));
        urlScan.password_Inpt.sendKeys(ConfigReader.getProperty("password"));
        urlScan.loginBtn.click();
        ReusableMethods.bekle(2);

    }
}
