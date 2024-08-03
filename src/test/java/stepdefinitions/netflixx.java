package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class netflixx extends TestBase {
    @Given("UrlScan sayfasina gidilir")
    public void urlscanSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlScan"));
    }

    @And("Input alanina netflix girilir")
    public void ınputAlaninaNetflixGirilir() {
        urlScan.urlScanInpt.sendKeys(ConfigReader.getProperty("netflix"));

    }


}
