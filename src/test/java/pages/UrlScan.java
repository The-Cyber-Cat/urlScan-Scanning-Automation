package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UrlScan {

    public  UrlScan(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "input[id='url']")
    public WebElement urlScanInpt;

    @FindBy(css = "button[id='submitbtn']")
    public WebElement privateScanBtn;

    @FindBy(css = "a[data-target='#options']")
    public WebElement optionsBtn;

    @FindBy(css = "#visprivate")
    public WebElement visPrivate;

    @FindBy(css = ".loggedout")
    public WebElement loggedOut;

    @FindBy(css = "input[name='email']")
    public WebElement email_Inpt;

    @FindBy(css = "input[name='password']")
    public WebElement password_Inpt;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;




}
